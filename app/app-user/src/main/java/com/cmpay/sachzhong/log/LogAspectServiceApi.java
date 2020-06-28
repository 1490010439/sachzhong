package com.cmpay.sachzhong.log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @classname LogAspectServiceApi
 * @author SachZhong 钟盛勤
 * @date 2020/6/23 14:30
 * 请求拦截器
 */
@Aspect
@Component
public class LogAspectServiceApi {

	/**
	 * @author SachZhong 钟盛勤
	 * @date 2020/6/23 14:29
	 * @info :申明一个切点 里面是 execution表达式
	 */
	@Pointcut("execution(public * com.cmpay.sachzhong.controller.*.*(..))")
	private void controllerAspect() {
	}

	/**
	 * @author SachZhong 钟盛勤
	 * @date 2020/6/23 14:29
	 * @info :请求method前打印内容
	 */
	@Before(value = "controllerAspect()")
	public void methodBefore(JoinPoint joinPoint) {
		ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder
				.getRequestAttributes();
		HttpServletRequest request = requestAttributes.getRequest();
		System.out.println("\n--------------请求开始----------------");
		System.out.println("请求内容》》》");
		try {
			// 打印请求内容
			System.out.println("请求地址:" + request.getRequestURL().toString());
			System.out.println("请求方式:" + request.getMethod());
			System.out.println("请求类方法:" + joinPoint.getSignature());
			System.out.println("请求类方法参数:" + Arrays.toString(joinPoint.getArgs()));
		} catch (Exception e) {
			System.out.println("###LogAspectServiceApi.class methodBefore() ### ERROR:"+e);
		}
	}


	/**
	 * @author SachZhong 钟盛勤
	 * @date 2020/6/23 14:29
	 * @info :在方法执行完结后打印返回内容
	 */
	@AfterReturning(returning = "o", pointcut = "controllerAspect()")
	public void methodAfterReturing(Object o) {
		System.out.println("返回内容》》》");
		try {
			System.out.println("Response内容:" + o);
		} catch (Exception e) {
			System.out.println("###LogAspectServiceApi.class methodAfterReturing() ### ERROR:"+e);
		}
		System.out.println("--------------请求结束----------------\n");
	}
}
