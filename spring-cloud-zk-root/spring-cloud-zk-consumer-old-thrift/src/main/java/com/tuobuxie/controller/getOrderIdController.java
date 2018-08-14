package com.tuobuxie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jlpay.commons.rpc.thrift.referer.service.SequenceRpcService;

/**
 * @author: lishaofeng
 **/
@RestController
public class getOrderIdController {

	@Autowired
	SequenceRpcService SequenceRpcService;

	@GetMapping("/getOrderId")
	public String getOrderId() {
		String  orderId ="";
		try {
			orderId = SequenceRpcService.send("/global_sequence", "9001", "9004");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "orderId:"+orderId;
	}

}
