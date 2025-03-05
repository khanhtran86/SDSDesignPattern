package com.samsung.firstspringboot.Models.DataModels;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private int id;
    private String email;
    private String first_name;
    private String last_name;
    private String avatar;
}
