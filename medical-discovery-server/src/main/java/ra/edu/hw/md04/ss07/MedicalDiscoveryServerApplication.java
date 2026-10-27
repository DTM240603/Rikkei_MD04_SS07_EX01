package ra.edu.hw.md04.ss07;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MedicalDiscoveryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedicalDiscoveryServerApplication.class, args);
    }

}
