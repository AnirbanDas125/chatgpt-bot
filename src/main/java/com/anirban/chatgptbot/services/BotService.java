package com.anirban.chatgptbot.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.theokanning.openai.completion.CompletionResult;

@Service
public class BotService {

	public ResponseEntity<CompletionResult> getChat(String prompt) {
		
		return null;
	}

}
