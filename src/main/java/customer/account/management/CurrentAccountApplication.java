package customer.account.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class CurrentAccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrentAccountApplication.class, args);
	}
}
