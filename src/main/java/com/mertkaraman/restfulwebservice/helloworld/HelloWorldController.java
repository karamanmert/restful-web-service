package com.mertkaraman.restfulwebservice.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:4200/")
public class HelloWorldController {
    //GET
    //URI - /hello-world
    //method- "hello world"
    //@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    @GetMapping("/hello-world")
    public String helloWorld() {
        return "hello world!";
    }

    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World!!");
    }

    ///hello-world-path/mert
    @GetMapping("/hello-world-path/{name}")
    public HelloWorldBean helloWorldBeanPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World %s",name));
        //throw new IllegalStateException("Something went wrong!");
    }

}
