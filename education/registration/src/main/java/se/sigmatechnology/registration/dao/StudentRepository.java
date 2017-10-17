package se.sigmatechnology.registration.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.sigmatechnology.registration.entity.Student;

/**
 * Created by pke on 2017-10-17.
 */
@Repository
public interface StudentRepository extends CrudRepository<Student, String>{
}
