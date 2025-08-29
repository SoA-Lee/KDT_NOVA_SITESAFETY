package org.example.nova.message.controller;

import org.example.nova.message.dto.MessageResponse;
import org.example.nova.message.service.MessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController2 {

    private final MessageService messageService;

    public MessageController2(MessageService messageService) {
        this.messageService = messageService;
    }

    // http://localhost:8080/message2/{id}
    @GetMapping("/message2/{id}")
    public MessageResponse getMessage(@PathVariable Long id) {
        MessageResponse messageResponse = messageService.getMessage(id);
        return messageResponse;
    }
}
