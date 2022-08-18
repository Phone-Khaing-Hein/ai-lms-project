package com.example.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AssignmentController {

    @GetMapping("/assignment-list")
    public ModelAndView assignmentList(){
        return new ModelAndView("STU05","assignment-list",null);
    }

    @GetMapping("/assignment-load")
    public ModelAndView assignmentView(){
        return new ModelAndView("STU06","assignment-load",null);
    }
}
