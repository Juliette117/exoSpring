package com.example.springapirest.helloWorld;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping // GET http://localhost:8080/hello
    public String hello() {
        return "GET sur Hello World";
    }

//    @PostMapping // POST http://localhost:8080/hello
//    public String helloPost() {
//        return "POST sur Hello World";
//    }
//    @PostMapping("/{name}")
//    public String helloPostWithName(@PathVariable String name) {
//        return "Hello " + name;
//    }
//    @PostMapping
//    public String helloPostWithRequestParam(@RequestParam(defaultValue = "Juliette") String name) {
//        return "Hello " + name;
//    }
    @PostMapping
    public String helloPostWithBody(@RequestBody String name) {
        return "Hello " + name;
    }

    @PutMapping // PUT http://localhost:8080/hello
    public String helloPut() {
        return "PUT sur Hello World";
    }

    @DeleteMapping // POST http://localhost:8080/hello
    public String helloDelete() {
        return "DELETE sur Hello World";
    }

    @PatchMapping // POST http://localhost:8080/hello
    public String helloPatch() {
        return "PATCH sur Hello World";
    }


}
