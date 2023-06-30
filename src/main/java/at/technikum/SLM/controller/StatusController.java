package at.technikum.SLM.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class StatusController {
    private String status = "Everything works as expected";

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @GetMapping("/message")
    public String showStatus() {
        return getStatus();
    }
    @GetMapping("/message/set")
    public String setMessage(@RequestParam(required = false, name = "m") String message) {
        if (message != null) {
            setStatus(message);
        }
        return "ok";
    }

    @GetMapping("/message/reset")
    public String resetMessage() {
        setStatus("Everything works as expected");
        return "ok";
    }
}
