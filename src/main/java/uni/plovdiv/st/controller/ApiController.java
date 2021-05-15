package uni.plovdiv.st.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ApiController {

    @GetMapping("/")
    public ResponseEntity<String> getAllAgencies() {
        return new ResponseEntity<>("Software tools :)  ", HttpStatus.OK);
    }
}
