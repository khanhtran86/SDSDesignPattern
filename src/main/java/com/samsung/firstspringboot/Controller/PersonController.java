package com.samsung.firstspringboot.Controller;

import com.samsung.firstspringboot.Common.Utilities;
import com.samsung.firstspringboot.Models.DataModels.Person;
import com.samsung.firstspringboot.Services.IPersonService;
import com.samsung.firstspringboot.Services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class PersonController {
    @Autowired
    IPersonService personService;

    @Autowired
    Utilities utility;

    //@RequestMapping(value = {"/", "/persons"}, method = RequestMethod.GET)
    @GetMapping({"/", "/persons"})
    public String ListPerson(final Model model, @RequestParam(defaultValue = "") String keyword) throws IOException {
        List<Person> lstPersons = personService.readPersonsFromJson();
        if(keyword!="")
        {
            lstPersons = lstPersons.stream().filter((s)->(s.getFirstName() + s.getLastName()).contains(keyword)).collect(Collectors.toList())
                    .stream().toList();
        }
        model.addAttribute("keyword", keyword);
        model.addAttribute("persons", lstPersons);
        model.addAttribute("utils", utility);
        return "ListPersons";
    }

    @GetMapping("newperson")
    public String NewPerson(final Model model)
    {
        //Create empty model to build form
        Person person = new Person();

        model.addAttribute("person", person);
        return "NewPerson";
    }

    @PostMapping("/saveperson")
    public String saveperson(final Model model, Person person)
    {
        //Save User

        //Redirect sang list Person
        return "redirect:/persons";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam(defaultValue = "") int id)
    {
        return "";
    }
}
