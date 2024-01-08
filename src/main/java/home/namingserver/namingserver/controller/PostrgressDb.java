package home.namingserver.namingserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostrgressDb {

    @Value("${postgress_db_ip}")
    private String postressIP;

    @GetMapping("/postgress")
    public String greeting() {
        return postressIP;
    }
}