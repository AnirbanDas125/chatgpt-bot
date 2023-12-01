package com.anirban.chatgptbot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anirban.chatgptbot.services.BotService;
import com.theokanning.openai.completion.CompletionResult;

@RestController
@RequestMapping("/chat")
public class BotController {
	
	@Autowired
	private BotService service;
	
	@GetMapping("/get-chat/{prompt}")
	public ResponseEntity<CompletionResult> getChat(@PathVariable String prompt){
		
		return service.getChat(prompt);
	}

}
