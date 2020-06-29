package com.cmpay.sachzhong;

import com.cmpay.lemon.common.LemonFramework;
import com.cmpay.lemon.framework.LemonBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.servlet.MultipartConfigElement;

/**
 * @classname UserApplication
 * @author SachZhong 钟盛勤
 * @date 2020/6/22 8:31
 */
//@GatewayApi
@LemonBootApplication(exclude = {RabbitAutoConfiguration.class}, value = {"com.cmpay.sachzhong"})
public class UserApplication {
	public static void main(String[] args) {
		LemonFramework.run(UserApplication.class, args);
	}

	@Configuration
	public class CorsConfig extends WebMvcConfigurerAdapter
	{
		@Override
		public void addCorsMappings(CorsRegistry registry)
		{
			registry.addMapping("/**").allowedOrigins("*")
					.allowedMethods("GET","HEAD","POST","PUT","DELETE","OPTIONS")
					.allowCredentials(true).maxAge(3600);

		}
	}


	@Bean
	public CorsFilter corsFilter() {
		final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		final CorsConfiguration config = new CorsConfiguration();
		// 允许cookies跨域
		config.setAllowCredentials(true);
		// 允许向该服务器提交请求的URI，*表示全部允许。。这里尽量限制来源域，比如http://xxxx:8080 ,以降低安全风险。。
		config.addAllowedOrigin("*");
		// 允许访问的头信息,*表示全部
		config.addAllowedHeader("*");
		// 预检请求的缓存时间（秒），即在这个时间段里，对于相同的跨域请求不会再预检了
		config.setMaxAge(18000L);
		// 允许提交请求的方法，*表示全部允许，也可以单独设置GET、PUT等
		config.addAllowedMethod("*");
		config.addAllowedMethod("HEAD");
		// 允许Get的请求方法
		config.addAllowedMethod("GET");
		config.addAllowedMethod("PUT");
		config.addAllowedMethod("POST");
		config.addAllowedMethod("DELETE");
		config.addAllowedMethod("PATCH");
		source.registerCorsConfiguration("/**", config);
		return new CorsFilter(source);
	}

	@Bean
	public MultipartConfigElement multipartConfigElement()
	{
		MultipartConfigFactory factory=new MultipartConfigFactory();
		factory.setMaxFileSize("20480KB");
		factory.setMaxRequestSize("20480KB");
		return  factory.createMultipartConfig();
	}

}


