package oop_intro;

import java.util.*;

public class Student {
    //Member Variables
    private int ID;
    private String name;
    private Map<Integer, Double> grades;
    private List<Course> enrolledCourses;

    //Constructor
    public Student(int ID, String name) {
        this.ID = ID;
        this.name = name;
        this.grades = new HashMap<Integer, Double>();
        this.enrolledCourses = new ArrayList<Course>();
    }

    //Member Methods
    public void displayCourses() {
        for (Course c : enrolledCourses) {
            System.out.println(c);
        }
    }

    public double calculateGPA() {
        double GPA = 0;
        int totalCredits = 0;
        double counter = 0.0;
        for (Course c : this.enrolledCourses) {
            GPA = GPA + (this.grades.get(c.getID())*c.getCredit());
            totalCredits = totalCredits + c.getCredit();
            counter = counter + 1.0;
        }
        GPA = GPA/counter;
        GPA = GPA*totalCredits;
        return GPA;

    }

    public void enrollCourse(Course course) {
        this.enrolledCourses.add(course);
    }

    public boolean setGrade(Course course, double grade) {
        if (enrolledCourses.contains(course)) {
            this.grades.put(course.getID(), grade);
            return true;
        } else {
            return false;
        }
    }

    public List<Course> getEnrolledCourses () {
        return this.enrolledCourses;
    }

    //Main Method
    public static void main(String[] args) {
        Course advancedProgramming = new Course(222,00001,"Advanced Programming","Study of advanced software development practices.",3);
        Course designAlgorithms = new Course(224,00010,"Design and Analysis of Algorithms","Introduction to algorithms.",3);
        Course computerArchitecture = new Course(230,00011,"Computer Organization and Architecture","Explore computer system architecure.",3);
        Student Payton = new Student(901208314,"Payton");
        Payton.enrollCourse(advancedProgramming);
        Payton.enrollCourse(designAlgorithms);
        Payton.enrollCourse(computerArchitecture);
        Payton.displayCourses();
    }

}
