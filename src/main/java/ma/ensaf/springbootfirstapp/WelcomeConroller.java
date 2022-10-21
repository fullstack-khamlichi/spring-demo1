package ma.ensaf.springbootfirstapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeConroller {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to spkring boot world !";
    }
}
