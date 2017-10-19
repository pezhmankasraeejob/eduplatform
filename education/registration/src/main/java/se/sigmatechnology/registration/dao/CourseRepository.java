package se.sigmatechnology.registration.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.sigmatechnology.registration.entity.Course;
import se.sigmatechnology.registration.entity.Student;

/**
 * Created by pke on 2017-10-16.
 */
/*@Repository
public interface CourseRepository extends CrudRepository<Course, String> {
    //void deleteById(String courseId);
}*/

@Repository
public interface CourseRepository extends MongoRepository<Course, String>{
}
