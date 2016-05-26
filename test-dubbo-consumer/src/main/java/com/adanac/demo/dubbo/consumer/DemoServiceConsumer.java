package com.adanac.demo.dubbo.consumer;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adanac.demo.dubbo.intf.DemoService;
import com.adanac.demo.dubbo.intf.User;

public class DemoServiceConsumer {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring.xml" });
		context.start();

		DemoService demoService = (DemoService) context.getBean("demoService"); //
		String hello = demoService.sayHello("tom"); // ִ
		System.out.println(hello); //

		//
		List<User> list = demoService.getUsers();
		if (list != null && list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		}
		// System.out.println(demoService.hehe());
		System.in.read();
	}
}