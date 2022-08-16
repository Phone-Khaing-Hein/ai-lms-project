package com.example.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExamController {

    @GetMapping("/exam")
    public ModelAndView exam(){
        return new ModelAndView("STU03","exams",null);
    }
}
