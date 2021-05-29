package uni.plovdiv.st;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public Map<String, String> getCurrentTime() {

        HashMap<String, String> map = new HashMap<>();
        map.put("name", "Vitali Atias");
        map.put("id", "1901727007");
        map.put("date", Instant.now().toString());
        return map;
    }
}