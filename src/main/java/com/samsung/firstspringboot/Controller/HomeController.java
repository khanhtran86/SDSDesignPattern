package com.samsung.firstspringboot.Controller;

import com.samsung.firstspringboot.Models.ViewModels.LoginUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/home") //Define route cho controller
public class HomeController {
    @GetMapping("/") //Define route cho action
    public String Index(final Model model) {
        String helloText = "Hello Samsung Developer from IPMac. This is text from controller";
        model.addAttribute("helloText", helloText); //Return to view

        LoginUser user = new LoginUser();
        user.setEmail("samsung@gmail.com");
        user.setPassword("Abc1234");
        user.setAdmin(true);

        model.addAttribute("user", user); //Return to view. Object


        //List object
        List<LoginUser> lstUsers = new ArrayList<LoginUser>();
        lstUsers.add(user);
        lstUsers.add(LoginUser.builder().email("khanh.tx@live.com").password("Abc1234").build());
        lstUsers.add(LoginUser.builder().email("TXK2601@gmail.com").password("Abc1234").build());

        model.addAttribute("users", lstUsers);

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
