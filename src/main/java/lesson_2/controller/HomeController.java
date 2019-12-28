package lesson_2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/hello")
public class HomeController {
    @RequestMapping("/")
    public String hello(Model uiModel) {
        uiModel.addAttribute("name", "мир!");
        return "index";
    }
}