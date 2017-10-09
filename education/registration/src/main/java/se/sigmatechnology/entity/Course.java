package se.sigmatechnology.entity;

import javax.validation.constraints.NotNull;

/**
 * Created by pke on 2017-10-09.
 */
public class Course {
    @NotNull
    private String id;
    private String name;
    private String description;

    /**
     * @param courseId
     */
    private Course(final String courseId){
        this.id = courseId;
        this.name = "";
        this.description = "";
    }

    private Course(final String id, final String name, final String description) {
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
