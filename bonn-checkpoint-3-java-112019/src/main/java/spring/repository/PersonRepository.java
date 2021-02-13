package spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
