package spring.graphql.api.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import spring.graphql.api.entity.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer>{

    Person findByEmail(String email);

}
