package com.tuobuxie.interface1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 服务接口
 * 服务提供者和调用者需要继承这个接口
 * @author: lishaofeng
 **/
public interface HelloInterface {

	/**
	 *
	 * @param name
	 * @return
	 */

    @GetMapping("/test/hello/")
    String hello(@RequestParam(value = "name") String name);

}
