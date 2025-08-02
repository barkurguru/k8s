package com.k8s;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;


@ExtendWith(MockitoExtension.class)
class K8sApplicationTests {

	@InjectMocks
	private K8sApplication k8sApplication;

	@Test
	void testHome() {
		String response = k8sApplication.home();
		assertNotNull(response, "Response should not be null");
	}
}
