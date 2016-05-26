package com.adanac.demo.dubbo.provider;

import org.springframework.stereotype.Service;

import com.adanac.demo.dubbo.intf.RegistryService;

@Service("registryService")
public class RegistryServiceImpl implements RegistryService {
	public String hello(String name) {
		return "hello" + name;
	}
}