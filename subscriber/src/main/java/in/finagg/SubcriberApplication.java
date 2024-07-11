package in.finagg;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages = {"in.finagg.configuration", "in.finagg.listener","in.finagg.client"})
@EnableScheduling
@EnableFeignClients(basePackages = {"in.finagg"})
public class SubcriberApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubcriberApplication.class, args);
	}

}