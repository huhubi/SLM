package at.technikum.SLM.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
    String status = "Everything works as expected";

    @RequestMapping("/status")
    public String showStatus(){
        return status;
    }
}
