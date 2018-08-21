/**
 * Project - Assignment 1 - course Comp-1409-0 Intro Software Development 1 - 55053
 * 
 * @author  Andrew Hewitson 
 * 
 * @version 2017/04/29
 */
public class Course
{
    private String department;
    private int number;
    private String name;
    private double price;
    private boolean isFull;
    private String SCHOOL_NAME;
    private String motto;

    /**
     * Constructor for objects of class Course
     * @param   department must be "COMP", "COMM" or "MATH
     * @param   number must be between 1000 - 6000 inclusive
     * @param   name must be "Intro To Java"
     * @param   price must be between 500-500 inclusive
     * @param   isFull must be true or false
     */
    public Course(String theDepartment, int theNumber, String courseName, double coursePrice, boolean isCourseFull, String schoolMotto, String schoolName)
    {
        if (theDepartment == "COMP" || theDepartment == "COMM" || theDepartment =="MATH")
        {
            department = theDepartment; 
        }
        else
        {
            department = "ECOM is not a valid department";
        }

        if (theNumber >= 1000 && theNumber <= 6000)
        {
            number = theNumber;
        }

        if (courseName == "Intro to Java")
        {
            name = courseName;
        }
        else
        {
            name = "A Course name was not provided";
        }

        if (isCourseFull = true || false)
        {
            isFull = isCourseFull;
        }
        {
            price = coursePrice;
        }
    }

    /**
     * @param   getName
     * @return  course Name 
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param   getDepartment
     * @return  Department Name
     */
    public String getDepartment()
    {
        return department;
    }

    /**
     * @param   getNumber
     * @return  Course Number 
     */
    public int getNumber()
    {
        return number;
    }

    /**
     * @param   getPrice
     * @return  Course Price if price is between 400 and 500 inclusive
     */
    public double getIsPriceOK()
    {
        if 
        (price <= 400)
        {
            System.out.print(price + " for the price is too low.");
        }
        else if
        (price >= 500)
        {
            System.out.print(price + " for the price is too high.");
        }
        return price;
    }

    /**
     * @param   isFull
     * @return  Is Course Full?
     */
    public boolean getFull()
    {
        return isFull;
    }

    /**
     * @param   getMotto
     * @return  School Motto
     */
    public String getMotto()
    {
        return motto;
    }

    /**
     * @param   getSCHOOL()
     * @return  School Name
     */
    public String getSCHOOL()
    {
        return SCHOOL_NAME;
    }

    /**
     * Mutators
     * @param Change Department
     */

    public void setDepartment(String newDepartment)
    {
        if (newDepartment == "COMP" || newDepartment == "COMM" || newDepartment =="MATH")
        {
            department = newDepartment; 
        }
        else
        {
            department = "ECOM is not a valid department";
        }
    }
    
    public void setNumber (int newNumber)
    {
    if (newNumber >= 1000 && newNumber <= 6000)
        {
            number = newNumber;
        }
    }
    

    /**@param Change Number
     * @param Change Name
     * @param Change Price
     * @param Change Course Is Full
     * @param Change School Motto
     */

    
}
