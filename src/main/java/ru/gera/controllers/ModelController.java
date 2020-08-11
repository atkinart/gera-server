package ru.gera.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "model")
public class ModelController {

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/")
    public void create(){

    }
}
