package se.sigmatechnology.registration.entity;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by pke on 2017-10-09.
 */
public class CourseTest {
    private static Course courseSetAll;
    private static Course courseSetSome;

    @BeforeClass
    public static void setUp(){
        courseSetAll = new Course
                .CourseBuilder("MA2012")
                .setName("Algebra")
                .setDescription("A basic level mathematics")
                .build();

        courseSetSome = new Course
                .CourseBuilder("MA2012")
                .setName("Algebra")
                .build();
    }

    @Test
    public void testSettersGetters(){
        Assert.assertEquals("MA2012", courseSetAll.getId());

        Assert.assertEquals("Algebra", courseSetAll.getName());

        Assert.assertEquals("A basic level mathematics", courseSetAll.getDescription());

        Assert.assertEquals("MA2012", courseSetSome.getId());

        Assert.assertEquals("Algebra", courseSetSome.getName());

        Assert.assertEquals("", courseSetSome.getDescription());
    }
}
