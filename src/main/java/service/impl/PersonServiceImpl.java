package service.impl;

public class PersonServiceImpl {
    private final PersonDao personDao;

    public PersonServiceImpl(PersonDao personDao) {
        this.personDao = personDao;
    }

    @Override
    public List<Person> getAllPerson() {
        return personDao.getAllPerson();
    }
}
