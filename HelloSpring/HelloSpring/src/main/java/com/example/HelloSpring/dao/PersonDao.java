package com.example.HelloSpring.dao;

import com.example.HelloSpring.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {
    int insertPerson(UUID id, Person name);

    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();

    Optional<Person> selectPersonByID(UUID id);
    int deletePersonByID(UUID id);

    int updatePersonByID(UUID id, Person person);


}
