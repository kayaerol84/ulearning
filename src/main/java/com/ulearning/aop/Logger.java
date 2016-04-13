package com.ulearning.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logger {
	
	@After("execution")
	public void trace() {
		
	}
	@Around("execution")
	public void tracker(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("tracker first. @Before");
		Object[] callerArgs = pjp.getArgs();
		
		int speed = (Integer) callerArgs[0];
		
		try {
			pjp.proceed();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception in method" + e.getMessage());
		}
	}

}
