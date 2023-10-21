package ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AccountManagement{

    @RequestMapping("/index")
    public String processForm(@RequestParam("page") String page, @RequestParam("email") String email, @RequestParam("password") String password) {
        if ("login".equals(page)) {
            System.out.println();
        } else if ("signup".equals(page)) {
            System.out.println();
        }
        return page;
    }
}
