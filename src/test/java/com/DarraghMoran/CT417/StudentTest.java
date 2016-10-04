package com.DarraghMoran.CT417;

import junit.framework.TestCase;
import org.joda.time.LocalDate;


public class StudentTest extends TestCase
{
    public void testCheckUsername()
    {
        LocalDate dob = new LocalDate(1995, 01, 25);
        Student student = new Student("Darragh Moran", 21, dob, 13508087);
        assertEquals("Darragh Moran21", student.getUsername());
    }

    public void testCheckName()
    {
        LocalDate dob = new LocalDate(1995, 01, 25);
        Student student = new Student("Darragh Moran", 21, dob, 1350808);
        assertEquals(student.getName(), "Darragh Moran");
    }

    public void testCheckID()
    {
        LocalDate dob = new LocalDate(1995, 01, 25);
        Student student = new Student("Darragh Moran", 21, dob, 13508087);
        assertEquals(student.getId(), 13508087);
    }

}
