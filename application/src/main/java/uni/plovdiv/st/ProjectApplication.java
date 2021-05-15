package uni.plovdiv.st;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class ProjectApplication {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Software tools :)";
    }

    public static void main(String[] args) {
        SpringApplication.run(ProjectApplication.class, args);
    }

}
