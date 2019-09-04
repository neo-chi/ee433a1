package core;

/**
 * The Course class maintains all information related to a college course.
 * 
 * @author Reece Younger
 */
public class Course
{
    private int UID;
    protected String department = "";
    protected int number;
    protected String section = "";
    protected String term = "";
    protected String title = "";
    protected int capacity;
    protected int actual;

    public Course()
    {

    } 

    /**
     * Attempts to create the course and submit to database.
     * @return true if successful, false otherwise.
     */
    public boolean create()
    {
        return false;
    }

    /**
     * Attempts to read the course and submit to database.
     * @return true if successful, false otherwise.
     */
    public boolean read()
    {
        return false;
    }

    /**
     * Attempts to update the course and submit to database.
     * @return true if successful, false otherwise.
     */
    public boolean update()
    {
        return false;
    }

    /**
     * Attempts to delete the course and submit to database.
     * @return true if successful, false otherwise.
     */
    public boolean delete()
    {
        return false;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    } 

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the section
     */
    public String getSection() {
        return section;
    }

    /**
     * @param section the section to set
     */
    public void setSection(String section) {
        this.section = section;
    }

    /**
     * @return the term
     */
    public String getTerm() {
        return term;
    }

    /**
     * @param term the term to set
     */
    public void setTerm(String term) {
        this.term = term;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the uID
     */
    public int getUID() {
        return UID;
    }

    /**
     * @param uID the uID to set
     */
    private void setUID(int uID) {
        UID = uID;
    }
}