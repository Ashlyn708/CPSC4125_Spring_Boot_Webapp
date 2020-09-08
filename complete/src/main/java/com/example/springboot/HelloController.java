package com.example.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.springboot.Contact;

Press Shift + Tab to navigate to chat history.

@Controller
public class HelloController {

	// @GetMapping("/")
	// public String index() {
	// 	return "Greetings from Spring Boot!";
    // }
    
    @GetMapping("/")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}
    @GetMapping("/contact")
	public String contact( Model model) {
		return "contact";
    }
    @GetMapping("/contact")
    public String postContact(Model,model,@RequestBody Contact contact){
        System.out.printIn(contact.getEmail());
        return "contact"
    }
    @GetMapping("/about")
	public String about( Model model) {
		return "about";
	}

}
