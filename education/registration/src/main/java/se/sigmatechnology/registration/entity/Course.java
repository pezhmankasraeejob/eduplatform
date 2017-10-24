package se.sigmatechnology.registration.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by pke on 2017-10-09.
 */
@Entity
@Table(name = "tblCourse")
public class Course {
    @NotNull
    @Id
    private String id;
    private String name;
    private String description;

    public Course(){
        // default constructor
    }

    /**
     * @param courseId
     */
    private Course(final String courseId){
        this.id = courseId;
        this.name = "";
        this.description = "";
    }

    private Course(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static class CourseBuilder{

        @NotNull
        private String nestedId;
        private String nestedName;
        private String nestedDescription;

        public CourseBuilder(final String courseId){
            this.nestedId = courseId;
            this.nestedName = "";
            this.nestedDescription = "";
        }

        public CourseBuilder setName(final String courseName){
            this.nestedName = courseName;
            return this;
        }

        public CourseBuilder setDescription(final String courseDescription){
            this.nestedDescription = courseDescription;
            return this;
        }

        public Course build(){
            return new Course(nestedId, nestedName, nestedDescription);
        }
    }
}
