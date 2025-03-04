package com.samsung.firstspringboot.Models.ViewModels;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class LoginUser {
    @Email(message = "Email Khong hop le")
    @NotBlank(message = "Email khong dc de trong")
    private String email;

    @NotBlank(message = "Password khong dc de trong")
    @Size(min = 6, message = "Mat khau phai nhieu hon 6 ky tu")
    private String password;
}
