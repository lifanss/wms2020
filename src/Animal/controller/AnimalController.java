package Animal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AnimalController {
    @RequestMapping("/query")
    public  String view(){
        return "showAll";
    }
}
