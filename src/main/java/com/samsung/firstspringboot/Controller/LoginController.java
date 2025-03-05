package com.samsung.firstspringboot.Controller;

import ch.qos.logback.core.model.Model;
import com.samsung.firstspringboot.Models.ViewModels.LoginUser;
import jakarta.validation.Valid;
import org.apache.coyote.Request;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("auth")
public class LoginController {
    @PostMapping("/")
    @ResponseBody
    public String Login(@Valid @RequestBody LoginUser loginUser, BindingResult result) {
        if(result.hasErrors()) {
            return result.getAllErrors().get(0).getDefaultMessage();
        }

        return "Login Username: "+ loginUser.getEmail() + " Password: "+ loginUser.getPassword();
    }

    @PostMapping("/register")
    @ResponseBody
    public ResponseEntity<List<LoginUser>> Register(@RequestBody List<LoginUser> loginUser) {
        return ResponseEntity.ok(loginUser);
    }

    @GetMapping("/info")
    @ResponseBody
    public String GetUserInfo(@RequestHeader("User-Agent")String token)
    {
        return token;
    }



}
