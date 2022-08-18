package com.ace.lms.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teacher")
public class TeacherHomeController {

    @GetMapping("/home")
    public String home(){
        return "TCH01";
    }

    @GetMapping("/chat")
    public String chat(){
        return "TCH02";
    }
}
