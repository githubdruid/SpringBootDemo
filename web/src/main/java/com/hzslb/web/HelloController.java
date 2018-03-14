package com.hzslb.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import springfox.documentation.annotations.ApiIgnore;

@ApiIgnore
@Controller
public class HelloController {
    @GetMapping("/")
    public String index(){
        return "redirect:/user/list";
    }
}
