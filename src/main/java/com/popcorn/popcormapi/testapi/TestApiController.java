package com.popcorn.popcormapi.testapi;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Vue와 같이 사용할 Test 작업환경

@RestController
public class TestApiController {


    @GetMapping("test")
    public String test(){
        return "hi";
    }


}
