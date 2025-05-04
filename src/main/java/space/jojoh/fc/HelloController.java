package space.jojoh.fc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
        @GetMapping("/hello")
        public String hello() {
            return "Hello, Spring Boot!";
        }
    
        public static void main(String[] args) {
            HelloController controller = new HelloController();
            System.out.println(controller.hello());
        }
    
}
