package se.sigmatechnology.registration.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.sigmatechnology.registration.entity.Course;

/**
 * Created by pke on 2017-10-16.
 */
@Repository
public interface CourseRepository extends CrudRepository<Course, String> {
    //void deleteById(String courseId);
}
