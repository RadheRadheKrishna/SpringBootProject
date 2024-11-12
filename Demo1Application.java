package demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {
	
	@GetMapping("/redirect")
	public String redirectToNewFile() {
		return "redirect:/index.html";
	}

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

}
