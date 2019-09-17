package gr1.test1.aws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/Hello")
@RestController
public class HelloController {
    public String hello(){
        return "Hello welcome";
    }
}
