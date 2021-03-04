package com.defect.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@SpringBootTest(
		classes = DemoApplicationTests.TestConfiguration.class,
		properties = {
				"spring.cloud.loadbalancer.ribbon.enabled=false",
				"spring.cloud.discovery.client.simple.instances.demoClient[0].uri=http://localhost:8080"
		}
)
class DemoApplicationTests {

	@Autowired
	private TestOpenFeignClient client;

	@Test
	void applicationContextDoesNotLoaded() {
	}

	@Configuration
	@EnableAutoConfiguration
	@EnableFeignClients
	public static class TestConfiguration {
	}

}
