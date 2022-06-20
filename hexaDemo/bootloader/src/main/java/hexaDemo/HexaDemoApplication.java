package hexaDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "hexaDemo.*" })
public class HexaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HexaDemoApplication.class, args);
	}

}
