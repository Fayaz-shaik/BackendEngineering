package com.Backend.week1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
public class Apple {

    void setApple(){
        System.out.println("I'm in apple.");
    }
}
