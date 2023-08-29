package controller;

public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    public  List<Person> getAllPerson() {
        return personService.getAllPerson();
    }
}
