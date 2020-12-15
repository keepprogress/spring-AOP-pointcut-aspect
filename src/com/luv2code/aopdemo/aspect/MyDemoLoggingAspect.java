package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
		
	@Before("forDaoPackageNoGetterSetter()")
	public void AddAccountAdvice() {		
		System.out.println("\n=====>>> Excuting @Before advice on addAccount()");
	}

}
