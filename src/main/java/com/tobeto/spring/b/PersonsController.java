package com.tobeto.spring.b;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/person") //
public class PersonsController {

    @GetMapping("/get")
    public String get(){
        return "Persons List";
    }

    @PostMapping("/add")
    public String add(){
        return "Added New Person";
    }

    @PutMapping("/update")
    public String update(){
        return "Updated Person";
    }

    @DeleteMapping("/delete")
    public String delete(){
        return "Deleted Person";
    }
}
