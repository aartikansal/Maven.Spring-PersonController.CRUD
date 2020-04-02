package io.zipcoder.crudapp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service
    public class PersonService {

        private PersonRepository personRepository;

        @Autowired
        public PersonService(PersonRepository personRepository) {
            this.personRepository = personRepository;
        }

        public Person createPerson(Person p){
            return personRepository.save(p);
        }

        public Person getPerson(int id){
            return personRepository.findOne(id);
        }

        public List<Person> getPersonList(){
            return (List<Person>) personRepository.findAll();
        }

        public Person updatePerson(int id, Person p){
            Person person = personRepository.findOne(id);
            person.setFirstName(p.getFirstName());
            person.setLastName(p.getLastName());
            return personRepository.save(person);
        }

        public Boolean deletePerson(int id){
            Person person = getPerson(id);
            personRepository.delete(id);
            return person != null;
        }
    }

