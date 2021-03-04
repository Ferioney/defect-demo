package com.defect.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        name = "demoClient"
)
public interface TestOpenFeignClient {

    @GetMapping("/")
    String getResource();
}
