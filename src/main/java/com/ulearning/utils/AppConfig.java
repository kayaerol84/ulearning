package com.ulearning.utils;

import java.util.Locale;
import java.util.Properties;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.hibernate.ejb.HibernatePersistence;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@ComponentScan(basePackages = "com.ulearning")
@Configuration
@EnableAspectJAutoProxy
@PropertySource("WEB-INF/application.properties")
@EnableJpaRepositories("com.ulearning.model")
@EnableTransactionManagement

public class AppConfig extends WebMvcConfigurerAdapter {

	private static final String PROPERTY_NAME_DATABASE_DRIVER = "jdbc.driverClassName";// "db.driver";
	private static final String PROPERTY_NAME_DATABASE_PASSWORD = "jdbc.password"; // "db.password";
	private static final String PROPERTY_NAME_DATABASE_URL = "jdbc.url"; //"db.url";
	private static final String PROPERTY_NAME_DATABASE_USERNAME = "jdbc.username"; //"db.username";
	private static final String PROPERTY_NAME_HIBERNATE_DIALECT = "hibernate.dialect";
	private static final String PROPERTY_NAME_HIBERNATE_SHOW_SQL = "hibernate.show_sql";
	private static final String PROPERTY_NAME_ENTITYMANAGER_PACKAGES_TO_SCAN = "entitymanager.packages.to.scan";

	@Resource
	private Environment env;

	@Bean
	public InternalResourceViewResolver getIRVR() {
		System.out.println("setting up view resolver");
		InternalResourceViewResolver irvr = new InternalResourceViewResolver();
		irvr.setPrefix("WEB-INF/view/");
		irvr.setSuffix(".jsp");
		return irvr;
	}
	// TODO 
	/*@Bean
	public UrlBasedViewResolver setupViewResolver() {
		UrlBasedViewResolver resolver = new UrlBasedViewResolver();
		resolver.setPrefix("/WEB-INF/pages/");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(JstlView.class);
		return resolver;
	}*/
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		System.out.println("setting up resources");
		registry.addResourceHandler("/myResources/**").addResourceLocations("/resources/");
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getRequiredProperty(PROPERTY_NAME_DATABASE_DRIVER));
		dataSource.setUrl(env.getRequiredProperty(PROPERTY_NAME_DATABASE_URL));
		dataSource.setUsername(env.getRequiredProperty(PROPERTY_NAME_DATABASE_USERNAME));
		dataSource.setPassword(env.getRequiredProperty(PROPERTY_NAME_DATABASE_PASSWORD));

		return (DataSource) dataSource;
	}
	@Bean  
	public LocalSessionFactoryBean sessionFactory() {  
	     LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();  
	     sessionFactory.setDataSource(dataSource());  
	     sessionFactory.setPackagesToScan(new String[] { "com.ulearning" });  
	     sessionFactory.setHibernateProperties(hibernateProperties());  
	  
	     return sessionFactory;  
	} 

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
		entityManagerFactoryBean.setDataSource(dataSource());
		entityManagerFactoryBean.setPersistenceProviderClass(HibernatePersistence.class);
		entityManagerFactoryBean
				.setPackagesToScan(env.getRequiredProperty(PROPERTY_NAME_ENTITYMANAGER_PACKAGES_TO_SCAN));

		entityManagerFactoryBean.setJpaProperties(hibernateProperties());

		return entityManagerFactoryBean;
	} 

	private Properties hibernateProperties() {
		Properties properties = new Properties();
		properties.put(PROPERTY_NAME_HIBERNATE_DIALECT, env.getRequiredProperty(PROPERTY_NAME_HIBERNATE_DIALECT));
		properties.put(PROPERTY_NAME_HIBERNATE_SHOW_SQL, env.getRequiredProperty(PROPERTY_NAME_HIBERNATE_SHOW_SQL));
		return properties;
	}

	@Bean
	public JpaTransactionManager transactionManager() {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
		return transactionManager;
	}
	 
	@Bean
	public ResourceBundleMessageSource messageSource() {
		ResourceBundleMessageSource source = new ResourceBundleMessageSource();
		source.setBasename(env.getRequiredProperty("message.source.basename"));
		source.setUseCodeAsDefaultMessage(true);
		return source;
	}

	@Bean(name = "firstBeanWhichIncludesControllers")
	public MainBean getMainBean() {
		return new MainBean();
	}
	@Bean
    public LocaleResolver localeResolver() {
        final CookieLocaleResolver cookieLocaleResolver = new CookieLocaleResolver();
        cookieLocaleResolver.setDefaultLocale(Locale.ENGLISH);
        return cookieLocaleResolver;
    }
}
