package core;

import java.util.ArrayList;

/**
 * The Model class encaspsulate the student, course, and registration data 
 * models for manipulation by the Controller class.
 * 
 * @author Reece Younger
 */
public class Model
{
    ArrayList<Student> students = new ArrayList<>(); 
    ArrayList<Course> courses = new ArrayList<>(); 
    ArrayList<Registration> registrations = new ArrayList<>(); 

    /**
     * Returns a model containing student, course, and registration lists.
     */
    public Model()
    {
        importModel();
    }

    public ArrayList<Student> getStudents() 
    {
        return this.students;
    }

    public ArrayList<Course> getCourses()
    {
        return this.courses;
    }

    public ArrayList<Registration> getRegistrations()
    {
        return this.registrations;
    }

    public void setStudents(ArrayList<Student> students) 
    {
        this.students = students;
        exportModel();
    }

    public void setCourses(ArrayList<Course> courses)
    {
        this.courses = courses;
        exportModel();
    }

    public void setRegistrations(ArrayList<Registration> registrations)
    {
        this.registrations = registrations;
        exportModel();
    }

    /**
     * Populates students, courses, and registrations lists with data from
     * students.csv, courses.csv, and registrations.csv.
     */
    protected void importModel()
    {
        // TODO import students
        // TODO import courses
        // TODO import registrations
    }

    /**
     * Writes students, courses, and registrations lists to their
     * corresponding data files.
     */
    protected void exportModel()
    {
        // TODO export students
        // TODO export courses
        // TODO export registrations

    }
}