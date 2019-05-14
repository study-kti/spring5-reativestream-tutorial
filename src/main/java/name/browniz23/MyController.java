package name.browniz23;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {
    @GetMapping("/")
    public String welcome(){
        return "Hello Webflux";
    }
}

