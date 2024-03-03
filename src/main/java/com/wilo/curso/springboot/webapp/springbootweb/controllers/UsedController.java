package com.wilo.curso.springboot.webapp.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class UsedController {
  @GetMapping("/electry")
  public String electry(Model modelia){
   modelia.addAttribute("ttitle", "Say hello");
    modelia.addAttribute("name", "William");
    modelia.addAttribute("lastname", "Boyacá");

    return "electry";

  }
}

