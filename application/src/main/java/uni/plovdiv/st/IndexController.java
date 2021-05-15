package uni.plovdiv.st;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
public class IndexController {

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public String getCurrentTime() {

        return Instant.now().toString();
    }
}