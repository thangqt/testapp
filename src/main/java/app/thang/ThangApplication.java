package app.thang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ThangApplication {
	
		@RequestMapping("/hello")
	public String helloDocker() {
		return "Hello Docker!";
	}

	public static void main(String[] args) {
		SpringApplication.run(ThangApplication.class, args);
	}

}
