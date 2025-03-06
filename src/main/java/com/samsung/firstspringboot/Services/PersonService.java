package com.samsung.firstspringboot.Services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.samsung.firstspringboot.Models.DataModels.Person;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class PersonService implements IPersonService {

    private ObjectMapper objectMapper = new ObjectMapper(); //Map json to object

    public List<Person> readPersonsFromJson(){
        InputStream inputStream = null;
        try {
            inputStream = new ClassPathResource("data/persons.json").getInputStream();
            return objectMapper.readValue(inputStream, new TypeReference<List<Person>>() {});
        } catch (IOException e) {
            return null;
        }
    }

    @Override
    public void savePerson(Person person) {

    }


}
