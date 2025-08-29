package org.example.nova.message.controller;

import org.example.nova.message.dto.MessageCreateRequest;
import org.example.nova.message.dto.MessageResponse;
import org.example.nova.message.service.MessageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/messages/{id}")
    public MessageResponse getMessage(@PathVariable Long id) {
        MessageResponse messageResponse = messageService.getMessage(id);
        return messageResponse;
    }

    @PostMapping("/messages")
    public void createMessage(@RequestBody MessageCreateRequest messageCreateRequest) {
        messageService.createMessage(messageCreateRequest);
    }
}

