package joe.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.system.ApplicationPidFileWriter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // (or @EnableEurekaClient)
public class NotificationMicroService {

  public static void main(String[] args) {
    SpringApplication notificationMicroService = new SpringApplication(NotificationMicroService.class);
    notificationMicroService.addListeners(new ApplicationPidFileWriter("notification-micro-service.pid"));
    notificationMicroService.run(args);
  }
}
