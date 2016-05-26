package com.adanac.demo.dubbo.consumer;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adanac.demo.dubbo.intf.RegistryService;

public class RegistryServiceConsumer {

	@Test
	public void test() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring.xml" });
		context.start();
		RegistryService registryService = (RegistryService) context.getBean("registryService"); //
		String res = registryService.hello("allen");
		System.out.println(res);
	}

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring.xml" });
		context.start();

		RegistryService registryService = (RegistryService) context.getBean("registryService"); //
		String res = registryService.hello("allen");
		System.out.println(res);
	}

}
