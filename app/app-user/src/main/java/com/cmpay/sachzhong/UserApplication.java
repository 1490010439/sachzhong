package com.cmpay.sachzhong;

import com.cmpay.lemon.common.LemonFramework;
import com.cmpay.lemon.framework.LemonBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;

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
}


