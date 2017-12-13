package cn.itcast.bos.utils;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter;

/**
 *CREATE BY LIGANG
 *2017-11-20
 */
public class MyStruts2Filter extends StrutsPrepareAndExecuteFilter{
	
		
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		//如果我的请求地址里面有/services ---   放行
//		System.out.println(req.getRequestURL());
//		System.out.println(req.getRequestURI());
//		System.out.println(req.getContextPath());
//		System.out.println(req.getServletPath());
//		System.out.println(req.getQueryString());
		String temp = req.getServletPath();
		if(temp.startsWith("/services")){
			chain.doFilter(request, response);
		}else{
			//如果没有  执行父类的拦截操作
			super.doFilter(request, response, chain);
		}
	}
}
