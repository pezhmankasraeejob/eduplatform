package se.sigmatechnology.registration.service;

import org.springframework.stereotype.Service;
import se.sigmatechnology.entity.Course;
import se.sigmatechnology.entity.Student;

import java.util.*;

/**
 * Created by pke on 2017-10-10.
 */

@Service
public class ServiceRegistration {

    ArrayList<Student> studentArrayList = new ArrayList<Student>();
    ArrayList<Course> courseArrayList = new ArrayList<Course>();

    public ServiceRegistration() {
        Student studentA = new Student
                .StudentBuilder("jd19661009-1234",
                "John Doe",
                "john.doe@sigma.se")
                .setFieldOfStudy("Maths")
                .build();

        Student studentB = new Student
                .StudentBuilder("ah19761022-4321",
                "Alice Hamilton",
                "alice.hamilton@sigma.se")
                .setFieldOfStudy("Phsyics")
                .build();

        Student studentC = new Student
                .StudentBuilder("rd19861109-0987",
                "Ruddy Donson",
                "ruddy.donson@sigma.se")
                .setFieldOfStudy("Astronomy")
                .build();

        this.studentArrayList.add(studentA);
        this.studentArrayList.add(studentB);
        this.studentArrayList.add(studentC);

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

    public ArrayList<Student> getAllStudents() {
        return this.studentArrayList;
    }

    public ArrayList<Course> getAllCourses(){
        return this.courseArrayList;
    }
}
