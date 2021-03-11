package com.universityAPI.universityAPI.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Aspect
@Component
public class UniversityAPILoggingAdvice {
	Logger logger = LoggerFactory.getLogger(UniversityAPILoggingAdvice.class);
	
	@Pointcut(value="execution(* com.universityAPI.universityAPI.*.*.*(..) )")
	public void universityAPIPointcut() {
		
	}
	
	
	@Around("universityAPIPointcut()")
	public Object universityAPILogger(ProceedingJoinPoint pjp) {
		ObjectMapper mapper = new ObjectMapper();
		String methodName = pjp.getSignature().getName();
		String className = pjp.getTarget().getClass().toString();
		Object[] array = pjp.getArgs();
		try {
			logger.info("Method invoke: "+className+": "+"Method Name: "+methodName+"()"+"With arguments: "
			+mapper.writeValueAsString(array));
		} catch (JsonProcessingException e) {
			System.out.println("Some operation has no body. Like: DELETE");
		}
		Object obj = null;
		try {
			obj = pjp.proceed();
			logger.info(className+" "+"Method Name: "+methodName+"()"+"with response: "+
					mapper.writeValueAsString(obj));
		} catch (Throwable e) {
			System.out.println("Some operation has no body. Like: DELETE");
		}
		return obj;
	}
}
