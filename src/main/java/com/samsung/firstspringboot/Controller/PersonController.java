package com.samsung.firstspringboot.Controller;

import com.samsung.firstspringboot.Models.DataModels.Person;
import com.samsung.firstspringboot.Services.IPersonService;
import com.samsung.firstspringboot.Services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.util.List;

@Controller
public class PersonController {
    @Autowired
    IPersonService personService;

//    public PersonController(PersonService personService) {
//        this.personService = personService;
//    }

    @GetMapping("persons")
    public String ListPerson(final Model model) throws IOException {
        List<Person> lstPersons = personService.readPersonsFromJson();

        model.addAttribute("persons", lstPersons);
        return "ListPersons";
    }
}
