package ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AccountManagement extends Application{

    @PostMapping("/submit")
    public String signUp(@RequestParam("username") String username, @RequestParam("email") String email, @RequestParam("password") String password) {
        //store inside database
        return null;
    }

    @PostMapping("/submit")
    public String login(@RequestParam("email") String email, @RequestParam("password") String password) {
        //check
        return null;
    }
}
