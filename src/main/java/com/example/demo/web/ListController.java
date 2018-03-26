package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ListController {

    @RequestMapping(value={"/guest/bowlingList"}, method = RequestMethod.GET)
    public ModelAndView bowlingList(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/guest/game/bowlingList");
        return modelAndView;
    }
}
