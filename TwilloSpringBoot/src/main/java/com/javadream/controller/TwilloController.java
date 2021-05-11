package com.javadream.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javadream.model.MessageModel;
import com.javadream.service.TwilloMessageSenderService;

@RestController
@RequestMapping("/twillo")
public class TwilloController {

	
	@Autowired
	private TwilloMessageSenderService twilloService;
	
	@PostMapping("/sendSMS")
	public String sendSMSByTwillo(@RequestBody MessageModel messageRequest) {
		String sendMessageResponse = twilloService.sendMessage(messageRequest);
		return sendMessageResponse;
	}
}
