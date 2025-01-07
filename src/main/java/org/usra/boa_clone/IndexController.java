package org.usra.boa_clone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boa")
public class IndexController {

    @GetMapping("/welcome")
    public String getMessage(){
        return "welcome!";
    }
}
