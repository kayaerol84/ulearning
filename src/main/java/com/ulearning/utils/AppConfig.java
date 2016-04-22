package com.ulearning.utils;

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
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

import com.ulearning.controller.FollowerController;
import com.ulearning.controller.LearnerController;
import com.ulearning.controller.LearningSessionController;
import com.ulearning.controller.PaymentController;
import com.ulearning.controller.TeacherController;
import com.ulearning.controller.TrainingController;
import com.ulearning.controller.UserController;
import com.ulearning.dao.IFollowerDao;
import com.ulearning.dao.ILearnerDao;
import com.ulearning.dao.ILearningSessionDao;
import com.ulearning.dao.IPaymentDao;
import com.ulearning.dao.IRequestDao;
import com.ulearning.dao.ISkillDao;
import com.ulearning.dao.ITeacherDao;
import com.ulearning.dao.ITrainingDao;
import com.ulearning.dao.IUserDao;
import com.ulearning.dao.impl.FollowerDaoImpl;
import com.ulearning.dao.impl.LearnerDaoImpl;
import com.ulearning.dao.impl.LearningSessionDaoImpl;
import com.ulearning.dao.impl.PaymentDaoImpl;
import com.ulearning.dao.impl.RequestDaoImpl;
import com.ulearning.dao.impl.SkillDaoImpl;
import com.ulearning.dao.impl.TeacherDaoImpl;
import com.ulearning.dao.impl.TrainingDaoImpl;
import com.ulearning.dao.impl.UserDaoImpl;
import com.ulearning.delegate.LoginDelegate;
import com.ulearning.model.Field;
import com.ulearning.model.Follower;
import com.ulearning.service.IFollowerService;
import com.ulearning.service.ILearnerService;
import com.ulearning.service.ILearningSessionService;
import com.ulearning.service.IPaymentService;
import com.ulearning.service.IRequestService;
import com.ulearning.service.ISkillService;
import com.ulearning.service.ITeacherService;
import com.ulearning.service.ITrainingService;
import com.ulearning.service.IUserService;
import com.ulearning.service.impl.FollowerServiceImpl;
import com.ulearning.service.impl.LearnerServiceImpl;
import com.ulearning.service.impl.LearningSessionServiceImpl;
import com.ulearning.service.impl.PaymentServiceImpl;
import com.ulearning.service.impl.RequestServiceImpl;
import com.ulearning.service.impl.SkillServiceImpl;
import com.ulearning.service.impl.TeacherServiceImpl;
import com.ulearning.service.impl.TrainingServiceImpl;
import com.ulearning.service.impl.UserServiceImpl;

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
}
