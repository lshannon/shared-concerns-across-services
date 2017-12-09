package com.example.demo.security;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.http.ResponseEntity;

@Aspect
public class LogScrapperAspect {
	
	@Pointcut("@within(org.springframework.web.bind.annotation.RestController)")
	private void anyRestControllerAnnotated() { }// NOSONAR
	
	@Pointcut("@within(org.springframework.stereotype.Controller)")
	private void anyControllerAnnotated() { } // NOSONAR
	
	@Pointcut("execution (@org.springframework.web.bind.annotation.GetMapping  org.springframework.http.ResponseEntity *.*(..))")
	private void anyGetMapping() { } // NOSONAR
	
	@Pointcut("(anyRestControllerAnnotated() || anyControllerAnnotated()) && anyGetMapping()")
	private void anyControllerOrRestControllerWithGetMapping() { } // NOSONAR

	@Around("anyControllerOrRestControllerWithGetMapping()")
	@SuppressWarnings("unchecked")
	public Object obfuscate(ProceedingJoinPoint pjp) throws Throwable {
		ResponseEntity<Object> responseEntity = (ResponseEntity<Object>) pjp.proceed();
		String body = responseEntity.getBody().toString();
		return new ResponseEntity(new LogScrapper().scrapLog(body), responseEntity.getHeaders(), responseEntity.getStatusCode());
	}

}
