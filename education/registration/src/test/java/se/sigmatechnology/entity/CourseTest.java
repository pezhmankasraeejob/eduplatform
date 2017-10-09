package se.sigmatechnology.entity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by pke on 2017-10-09.
 */
public class CourseTest {
    private Course courseSetAll;
    private Course courseSetSome;

    @Before
    public void setUp(){
        this.courseSetAll = new Course
                .CourseBuilder("MA2012")
                .setName("Algebra")
                .setDescription("A basic level mathematics")
                .build();

        this.courseSetSome = new Course
                .CourseBuilder("MA2012")
                .setName("Algebra")
                .build();
    }

    @Test
    public void testSettersGetters(){
        Assert.assertEquals("MA2012", this.courseSetAll.getId());

        Assert.assertEquals("Algebra", this.courseSetAll.getName());

        Assert.assertEquals("A basic level mathematics", this.courseSetAll.getDescription());

        Assert.assertEquals("MA2012", this.courseSetSome.getId());

        Assert.assertEquals("Algebra", this.courseSetSome.getName());

        Assert.assertEquals("", this.courseSetSome.getDescription());
    }
}
