package core;

/**
 * The Registration class creates a unique relationship between a student
 * and a course, effectively registering that student to the course.
 * 
 * @author Reece Younger
 */
public class Registration
{
    protected int studentUID;
    protected int courseUID;

    /**
     * Attempts to register a student to the given course.
     * 
     * @return true if course is available, false otherwise.
     */
    public boolean create()
    {
        return false;
    }

    /**
     * Attempts to read the student count and course availablity for the 
     * given course.
     * 
     * @return true if course is found, false otherwise.
     */
    public boolean read()
    {
        return false;
    }

    /**
     * Attempts to update a student UID or course UID.
     * 
     * @return true if update is successful, false otherwise.
     */
    public boolean update()
    {
        return false;
    }

    /**
     * Attempts to delete a student-course registration.
     * 
     * @return true if successful, false otherwise.
     */
    public boolean delete()
    {
        return false;
    }

    /**
     * Returns the number of students enrolled in the given course.
     */
    public int getStudentCount(String department, int number, String section, String term)
    {
        return 0;
    }

    /**
     * Returns true if the course capacity has not been met.
     * @param courseUID
     * @return true if course capacity is not met, false otherwise.
     */
    public boolean isAvailable(int courseUID)
    {
        return false;
    }

}

