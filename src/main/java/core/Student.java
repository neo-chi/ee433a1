package core;

/**
 * The Student class maintains all of the information related to a student.
 * 
 * @author Reece Younger
 */
public class Student
{
    private int UID;
    protected String firstName = "";
    protected String lastName = "";

    public Student(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Attempts to create the student and submit to database.
     * @return true if successful, false otherwise.
     */
    public boolean create()
    {
        return false;
    }

    /**
     * Attempts to read the student and submit to database.
     * @return true if successful, false otherwise.
     */
    public boolean read()
    {
        return false;
    }

    /**
     * Attempts to update the student and submit to database.
     * @return true if successful, false otherwise.
     */
    public boolean update(Student student)
    {
        return false;
    }

    /**
     * Attempts to delete the student and submit to database.
     * @return true if successful, false otherwise.
     */
    public boolean delete()
    {
        return false;
    }

    /**
     * Returns the number of credit hours the student enrolled in for the
     * given term.
     * 
     * @param term name of the term
     * 
     * @return number of enrolled hours
     */
    protected int getEnrolledHours(String term)
    {
        return 0;
    }

    public int getUID()
    {
        return this.UID;
    }

    /**
     * Sets the student's UID based upon the maximum UID found in the 
     * students.csv data file.
     * 
     * @param UID unique user id
     */
    private void setUID(int UID)
    {
        this.UID = UID;
    }
}