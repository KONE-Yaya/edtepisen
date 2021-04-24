package edtepisen.upec.fr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class EdtEpisenApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdtEpisenApplication.class, args);
	}

}
