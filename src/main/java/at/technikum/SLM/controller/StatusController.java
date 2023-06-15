package at.technikum.SLM.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
     private String status = "Everything works as expected";

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @RequestMapping("/status")
    public String showStatus(){
        return getStatus();
    }
}
