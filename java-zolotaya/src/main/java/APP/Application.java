package APP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
@EntityScan("APP")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}