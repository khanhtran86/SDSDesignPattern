package com.samsung.firstspringboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/home") //Define route cho controller
public class HomeController {
    @GetMapping("/hello") //Define route cho action
    public String Index(){
        return "Hello";
    }

    @GetMapping("/data")
    @ResponseBody
    public String Data(@RequestParam List<String> name)
    {
        return "Hello "+ name;
    }

    @GetMapping("/path/{title}.{id}.html")
    @ResponseBody
    public String Hello(@PathVariable("id") int user_id,
                        @PathVariable String title){
        return "Hello " + user_id;
    }

    @GetMapping("/combine/{category}")
    @ResponseBody
    public String Combine(@PathVariable String category,
                          @RequestParam(required = false) String sort)
    {
        return "Danh muc: " + category +", sap xep: " +(sort == null ? "Ma dinh" : sort);
    }
}
