package com.anirban.chatgptbot.services;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.theokanning.openai.OpenAiHttpException;
import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.completion.CompletionResult;
import com.theokanning.openai.service.OpenAiService;

@Service
public class BotService {

	public ResponseEntity<CompletionResult> getChat(String prompt) {
		
		try {
		OpenAiService service = new OpenAiService("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");
		CompletionRequest request = CompletionRequest.builder()
				.prompt(prompt)
				.model("text-davinci-003")
				.echo(true)
				.build();
		
		return new ResponseEntity<>(service.createCompletion(request),HttpStatus.OK);
		}catch(OpenAiHttpException e) {
		  e.printStackTrace();
          throw new RuntimeException(e.getMessage(),e);		 
		}
		
	}

}
