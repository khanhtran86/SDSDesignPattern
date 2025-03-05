package com.samsung.firstspringboot.Services;

import com.samsung.firstspringboot.Models.DataModels.Person;

import java.util.List;

public interface IPersonService {
    List<Person> readPersonsFromJson();
}
