package se.sigmatechnology.registration.service;

import org.springframework.stereotype.Service;
import se.sigmatechnology.entity.Course;
import se.sigmatechnology.entity.Student;

import java.util.*;

/**
 * Created by pke on 2017-10-10.
 */

@Service
public class ServiceCourseRegistration {

    ArrayList<Course> courseArrayList = new ArrayList<Course>();

    public ServiceCourseRegistration() {

        Course courseA = new Course
                .CourseBuilder("MA001")
                .setName("Maths I")
                .setDescription("Basic Algebra")
                .build();

        Course courseB = new Course
                .CourseBuilder("PH001")
                .setName("Astro II")
                .setDescription("Advanced Astronomy")
                .build();

        this.courseArrayList.add(courseA);
        this.courseArrayList.add(courseB);
    }

    // Course-related services
    public ArrayList<Course> getAllCourses() {
        return this.courseArrayList;
    }

    public Course getCourse(String courseId) {
        Course answer = new Course
                .CourseBuilder("xx000")
                .setName("NOT_SET")
                .setDescription("NOT_SET")
                .build();

        for (Course tempCourse : courseArrayList) {
            if (tempCourse.getId().equals(courseId)) {
                answer.setId(tempCourse.getId());
                answer.setName(tempCourse.getName());
                answer.setDescription(tempCourse.getDescription());
            }
        }
        return answer;
    }

    public void deleteCourse(String id) {
        this.courseArrayList.removeIf(t -> t.getId().equals(id));
    }

    public void addCourse(Course course) {
        this.courseArrayList.add(course);
    }
}
