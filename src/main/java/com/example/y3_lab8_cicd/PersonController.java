package com.example.y3_lab8_cicd;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/person")
@RestController
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService){
        this.personService = personService;
    }

    @PostMapping("/savePerson")
    public void savePerson(Person person){
        personService.savePerson(person);
    }

    @GetMapping("/{employeeId}")
    public ResponseEntity<?> getPerson(@Valid @PathVariable String employeeId){
        if (employeeId.length() > 5 || employeeId.isBlank()){
            return ResponseEntity.badRequest().body("Employee is invalid");
        }

        Person person = personService.getPersonByEmployeeId(employeeId);

        if(person == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(person);
    }
}
