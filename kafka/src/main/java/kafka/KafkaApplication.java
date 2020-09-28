package kafka;
import java.text.ParseException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaApplication {

	public static void main(String[] args) throws ParseException {
		SpringApplication.run(KafkaApplication.class, args);

	}
	
}
