package ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class moodManagement {
    @GetMapping("/main")
    public String showForm() {
        return "form";
    }

    @PostMapping("/submit")
    public String submitForm(@RequestParam String name, @RequestParam String email, Model model) {
        // Process the data (e.g., save to a database, perform some logic)
        // Here, we just display the data in the response
        model.addAttribute("name", name);
        model.addAttribute("email", email);
        return "result";
    }
}
