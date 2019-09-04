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

    /**
     * Returns the student with the specified UID
     *
     * @param serachUID student UID
     * @return Student object
     */
    public Student getStudent(int searchUID)
    {
        for (Student student : students) {
            if (student.getUID() == searchUID) {
                return student;
            }
        }
        return null; // if a student is not found
    }

    /**
     * Sets the student with the given UID to the updated information
     * specified by the update student.
     *
     * @param searchUID uid of student
     * @param updateStudent student with updated information
     */
    public void setStudent(int searchUID, Student updateStudent)
    {
        for (Student modelStudent : students) {
            if (modelStudent.getUID() == searchUID) {
                modelStudent.update(updateStudent);
                break;
            }
        }
    }

    public Course getCourse(int searchUID)
    {
        return null;
    }

    public void setCourse(int searchUID, Course updateCourse)
    {
        
    }

    public Registration getRegistration(int searchUID)
    {
        return null; // if a registration is not found
    }

    public void setRegistration(int searchUID, Registration updateRegistration)
    {

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
