package oop_intro;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void enrollCourse() {
        Course advancedProgramming = new Course(222,00001,"Advanced Programming","Study of advanced software development practices.",3);
        Student Payton = new Student(901208314,"Payton");
        Payton.enrollCourse(advancedProgramming);
        assertEquals(1,Payton.getEnrolledCourses().size());

    }

    @Test
    void setGradeTestTrue() {
        Course advancedProgramming = new Course(222,00001,"Advanced Programming","Study of advanced software development practices.",3);
        Student Payton = new Student(901208314,"Payton");
        Payton.enrollCourse(advancedProgramming);
        assertTrue(Payton.setGrade(advancedProgramming,100.00));
    }

    @Test
    void setGradeTestFalse() {
        Course advancedProgramming = new Course(222,00001,"Advanced Programming","Study of advanced software development practices.",3);
        Student Payton = new Student(901208314,"Payton");
        assertFalse(Payton.setGrade(advancedProgramming,100.00));
    }

    @Test
    void calculateGPA() {
        Course advancedProgramming = new Course(222,00001,"Advanced Programming","Study of advanced software development practices.",3);
        Course designAlgorithms = new Course(224,00010,"Design and Analysis of Algorithms","Introduction to algorithms.",3);
        Course computerArchitecture = new Course(230,00011,"Computer Organization and Architecture","Explore computer system architecure.",3);
        Student Payton = new Student(901208314,"Payton");
        Payton.enrollCourse(advancedProgramming);
        Payton.enrollCourse(designAlgorithms);
        Payton.enrollCourse(computerArchitecture);
        Payton.setGrade(advancedProgramming,100.00);
        Payton.setGrade(designAlgorithms,25.00);
        Payton.setGrade(computerArchitecture,85.00);
        assertEquals(1890,Payton.calculateGPA());


    }
}