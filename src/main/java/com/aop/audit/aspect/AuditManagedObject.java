package com.aop.audit.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuditManagedObject {

	private Logger logger = Logger.getLogger(getClass().getName());
	
    @Before("execution(void com.aop.audit.model.*.*())")
    public void callWithOutArgs(JoinPoint joinPoint) {
        logger.info("-------------");
    	logger.info("callWithOutArgs");
        logger.info("Method Invoked: " + joinPoint.getSignature().getName());
    }
    
    @Before("execution(* com.aop.audit.model.*.*(*))")
    public void callWithArgs(JoinPoint joinPoint) {
        logger.info("-------------");
    	logger.info("callWithArgs");
        logger.info("Method Invoked: " + joinPoint.getSignature().getName());
        logger.info("Value Passed: " + joinPoint.getArgs()[0]);
    }    
	
}
