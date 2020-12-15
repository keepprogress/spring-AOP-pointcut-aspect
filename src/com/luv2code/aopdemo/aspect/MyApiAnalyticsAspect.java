package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order
public class MyApiAnalyticsAspect {
	
	@Before("forDaoPackageNoGetterSetter()")
	public void performApiAnalytic() {
		System.out.println("\n=====>>> Peforming API analytics");
	}

}
