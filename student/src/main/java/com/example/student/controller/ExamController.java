package com.example.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/exam")
public class ExamController {

    @GetMapping("/exam/exam-table")
    public ModelAndView exam(){
        return new ModelAndView("STU03","exam",null);
    }


    @GetMapping("/exam/exam-form")
    public ModelAndView examform(){
        return new ModelAndView("STU04","exam-form",null);
    }
}
