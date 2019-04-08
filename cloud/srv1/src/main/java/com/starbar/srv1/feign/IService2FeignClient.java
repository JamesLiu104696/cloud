package com.starbar.srv1.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Component
@FeignClient(name = "srv2")
public interface IService2FeignClient {

	@RequestMapping(value="/v2/test", method=RequestMethod.GET)
	public String test();
}
