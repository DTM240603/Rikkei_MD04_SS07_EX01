package ra.edu.hw.md04.ss07.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/welcome")
public class WelcomeController {
    @Value("${app.welcome}")
    private String welcome;

    @GetMapping
    public String welcome(){
        return welcome;
    }
}
