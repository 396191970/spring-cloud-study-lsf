package com.tuobuxie.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

import com.tuobuxie.interface1.HelloInterface;

/**
 * @author: lishaofeng
 **/
@Component
@FeignClient(name = "spring-cloud-eureka-producer", fallback = HelloRemoteHystrix.class)
public interface HelloRemote extends HelloInterface {



}
