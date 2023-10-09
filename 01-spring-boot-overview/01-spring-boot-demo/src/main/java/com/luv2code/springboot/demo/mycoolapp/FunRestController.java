package com.luv2code.springboot.demo.mycoolapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${team.name}")
    private String teamName;
}
