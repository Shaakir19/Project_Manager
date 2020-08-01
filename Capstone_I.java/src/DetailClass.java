/**
 * <h>DetailsClass.java</h>
 * <p>
 *     This class is used to get the information of the customers,contractors and the architects
 *     And display the information in a user-friendly manner
 * </p>
 *
 * <p1>
 *   The main class called DetailsClass is the class that has all of the method and the other class are an extension of
 *   this class
 *
 *   The method in the class receives inputs from the user and has while loop to check if the inputs are correct
 *
 *   The is a toString method the displays the information in a user friendly manner
 * </p1>
 *
 *  @param id this is integer attribute used to store the id number for the database
 *
 *  @param name this is a String attribute used to store the name inputted by the user
 *
 *  @param surname  this is a String attribute used to store the surname  inputted by the user
 *
 *  @param telNo this is a String attribute used to store the telephone number inputted by the user
 *
 *  @param email this is a String attribute used to store the email address inputted by the user
 *
 *  @param phyAddress this is a String attribute used to store the physical address inputted by the user
 *
 *  @param output this is apart of the toString method that returns the information in a user_friendly manner
 *
 *  @param name2 this is used in a setter method that is used to set a variable to an attribute
 *
 *  @param telNo2 this is used in a setter method that is used to set a variable to an attribute
 *
 *  @param email2 this is used in a setter method that is used to set a variable to an attribute
 *
 *  @param phyAddress2 this is used in a setter method that is used to set a variable to an attribute
 *
 *  @see DetailClass
 *  @see DetailClass#field
 *  @see DetailClass#id
 *  @see DetailClass#name
 *  @see DetailClass#surname
 *  @see DetailClass#telNo
 *  @see DetailClass#email
 *  @see DetailClass#phyAddress
 *
 *  @see DetailClass#DetailsClass()
 *  @see DetailClass#setId(Integer)
 *  @see DetailClass#getId()
 *  @see DetailClass#setName()
 *  @see DetailClass#setName(String)
 *  @see DetailClass#getName()
 *  @see DetailClass#setSurname()
 *  @see DetailClass#setSurname(String)
 *  @see DetailClass#getSurname()
 *  @see DetailClass#setTelNo()
 *  @see DetailClass#setTelNo2(String)
 *  @see DetailClass#getTelNo()
 *  @see DetailClass#setEmail()
 *  @see DetailClass#setEmail2(String)
 *  @see DetailClass#getEmail()
 *  @see DetailClass#setPhyAddress()
 *  @see DetailClass#setPhyAddress2(String)
 *  @see DetailClass#getPhyAddress()
 *  @see DetailClass#toString()
 *
 *  @see package.java.util.*
 *
 *
 * @author Shaakir Caroto
 * @version 2.00
 * @since 28-07-2020
 */

// Imported package that is used in the processing of data
import java.util.*;

public class DetailClass {

    // The classes attributes
    // This attributes are share by the below classes
    int id;
    String name, surname,telNo, email, phyAddress;

    /**
     * DetailsClass
     *
     * The classes constructor method used to initialize the attributes declared in the class
     * This is also used to create a link between the mainInt the main class so that it is able to used it methods
     * to process inputted data by the user of database
     *
     * This is the class that is inherit by the other class to reduce the amount of lines of code and number of class
     * for better readability
     *
     * @see #DetailClass()
     *
     */

    public DetailClass(){
        // Initializing the attributes with a variable of making it a place holder so it can be worked with
        this.id = 0;
        this.name = "";
        this.surname = "";
        this.telNo = "";
        this.email = "";
        this.phyAddress = "";
    }

    /**
     * setId
     *
     * This setter function get the id number for the main class and stores the value in the attributes
     *
     * @see DetailClass#setId(int)
     * @param id this is integer attribute used to store the id number for the database
     */

    public void setId(int id) {
        // Setting the variable to the attribute without the uses of a scanner
        this.id = id;
    }

    /**
     * getId
     *
     * This is the getter string method that return the value the attribute is set too and returns it to the user
     *
     * @see #getId()
     * @return id
     */

    public int getId() {
        // Will return the value of the attribute
        return id;
    }

    /**
     * setName
     *
     * This void method set the name that the user inputs by using a scanner for the java.util.*
     * package and the method has a while true loop to make sure the input and the variable is not
     * empty or does not equal nothing
     *
     * If the variable has a value then the method will set the value to the attribute and break the while loop
     *
     * There is no return method as the method is a void
     *
     * @see #setName()
     * @see package.java #java.until.*
     */

    public void setName() {
        // String variable used to store the users input
        String name;

        // A while true loop to repeat going through the lines of code
        while (true) {
            // The scanner object to get an input for the user
            Scanner sc = new Scanner(System.in);

            // Storing the input in the string variable
            name = sc.nextLine();

            //Checks if the input is correct if the user input something and the variable is not empty
            if (name.equals("") | name.isEmpty()) {

                // Displays the following messages to the user to inform the user what happened
                System.out.println("Please try again");
                System.out.print("Please re-enter the name: ");
            } else {
                // Else if the variable has a input that is correct the value of the variable will be stored in the
                // Attribute and break the while loop
                this.name = name;
                break;
            }
        }
    }

    /**
     * setName2
     *
     * This void method is a  setter that is used to receive an input from the user and set the input to the correct
     * class attribute.
     *
     * This is not scanner used in this method and therefore the method needs a parameter to set the variable, this
     * will be uses to receive a data variable from a database of if the user wish to change a specific part of the
     * information displayed to the user
     *
     * This used in the alternative naming method in the ProClass class to create a project name
     *
     *
     * @param name2  this is used to store the user input went the user wants to update an aspect of the information
     *               found by the search method in the class mainInt
     *
     * @see ProjectClass#setName2(String, String)
     * @see #setName2(String)
     */

    public void setName2(String name2){
        // Setting the variable to the attribute without the uses of a scanner
        this.name = name2;
    }

    /**
     * getName
     *
     * This is the getter string method that return the value the attribute is set too and returns it to the user
     *
     * @see #getName()
     * @return name
     */

    public String getName() {
        // This method is a getter method and just returns the value that is storing the attribute
        return name;
    }

    /**
     * setSurname
     *
     * This void method set the surname that the user inputs by using a scanner for the java.util.*
     * package and the method has a while true loop to make sure the input and the variable is not
     * empty or does not equal nothing
     *
     * If the variable has a value then the method will set the value to the attribute and break the while loop
     *
     * There is no return method as the method is a void
     *
     * @see #setSurname()
     * @see package.java #java.until.*
     */

    public void setSurname(){

        // String variable used to store the users input
        String surname;

        // A while true loop to repeat going through the lines of code
        while (true) {
            // The scanner object to get an input for the user
            Scanner sc = new Scanner(System.in);

            // Storing the input in the string variable
            surname = sc.nextLine();

            //Checks if the input is correct if the user input something and the variable is not empty
            if(surname.equals("") | surname.isEmpty()){
                // Displays the following messages to the user to inform the user what happened
                System.out.println("Please try again");
                System.out.print("Please re-enter the surname: ");
            }
            else{
                // Else if the variable has a input that is correct the value of the variable will be stored in the
                // Attribute and break the while loop
                this.surname = surname;
                break;
            }
        }
    }

    /**
     * setSurname2
     *
     * This void method is a  setter that is used to receive an input from the user and set the input to the correct
     * class attribute.
     *
     * This is not scanner used in this method and therefore the method needs a parameter to set the variable,this
     * will be uses to receive a data variable from a database of if the user wish to change a specific part of the
     * information displayed to the user
     *
     * @param surname2 this is used to store the user input went the user wants to update an aspect of the information
     *               found by the search method in the class mainInt
     *
     * @see #setSurname2(String)
     */
    public void setSurname2(String surname2) {
        // Setting the variable to the attribute without the uses of a scanner
        this.surname = surname2;
    }

    /**
     * getSurname
     *
     * This is the getter string method that return the value the attribute is set too and returns it to the user
     *
     * @see #getSurname()
     * @return surname
     */
    public String getSurname() {
        // This method is a getter method and just returns the value that is storing the attribute
        return surname;
    }

    /**
     * setTelNo
     *
     * This void method set the Telephone number that the user inputs by using a scanner for the java.util.*
     * package and the method has a while true loop to make sure the input and the variable is not
     * empty or does not equal nothing
     *
     * If the variable has a value then the method will set the value to the attribute and break the while loop
     *
     * There is no return method as the method is a void
     *
     * @see #setTelNo()
     * @see package.java #java.until.*
     */

    public void setTelNo() {

        // String variable used to store the users input
        String telNo;

        // A while true loop to repeat going through the lines of code
        while (true) {
            // The scanner object to get an input for the user
            Scanner sc = new Scanner(System.in);

            // Storing the input in the string variable
            telNo = sc.nextLine();

            //Checks if the input is correct if the user input something and the variable is not empty
            // And if the length of the input is not more or less the 10
            if (telNo.equals("") | telNo.isEmpty() | telNo.length() < 10 | telNo.length() > 10) {

                // Displays the following messages to the user to inform the user what happened
                System.out.println("Please try again");
                System.out.print("Please re-enter the telephone number: ");
            } else {

                // Else if the variable has a input that is correct the value of the variable will be stored in the
                // Attribute and break the while loop
                this.telNo = telNo;
                break;
            }
        }
    }

    /**
     * setTelNo2
     *
     * This void method is a  setter that is used to receive an input from the user and set the input to the correct
     * class attribute.
     *
     * This is not scanner used in this method and therefore the method needs a parameter to set the variable,this
     * will be uses to receive a data variable from a database of if the user wish to change a specific part of the
     * information displayed to the user
     *
     * @param telNo2 this is used to store the user input went the user wants to update an aspect of the information
     *               found by the search method in the class mainInt
     *
     * @see #setTelNo2(String)
     */

    public void setTelNo2(String telNo2){
        // Setting the variable to the attribute without the uses of a scanner
        this.telNo = telNo2;
    }

    /**
     * getTelNo
     *
     * This is the getter string method that return the value the attribute is set too and returns it to the user
     *
     * @see #getTelNo()
     * @return telNo
     */

    public String getTelNo() {
        // This method is a getter method and just returns the value that is storing the attribute
        return telNo;
    }
    /**
     * setEmail
     *
     * This void method set the email address that the user inputs by using a scanner for the java.util.*
     * package and the method has a while true loop to make sure the input and the variable is not
     * empty or does not equal nothing
     *
     * If the variable has a value then the method will set the value to the attribute and break the while loop
     *
     * There is no return method as the method is a void
     *
     * @see #setEmail()
     * @see package.java #java.until.*
     */

    public void setEmail(){
        // String variable used to store the users input
        String email;

        // A while true loop to repeat going through the lines of code
        while(true){
            // The scanner object to get an input for the user
            Scanner sc = new Scanner(System.in);

            // Storing the input in the string variable

            email = sc.nextLine();

            //Checks if the input is correct if the user input something and the variable is not empty
            if (email.equals("") | email.isEmpty()) {
                // Displays the following messages to the user to inform the user what happened
                System.out.println("Please try again");
                System.out.print("Please re-enter the email: ");
            } else {
                // Else if the variable has a input that is correct the value of the variable will be stored in the
                // Attribute and break the while loop
                this.email = email;
                break;
            }
        }
    }

    /**
     * setEmail2
     *
     * This void method is a  setter that is used to receive an input from the user and set the input to the correct
     * class attribute.
     *
     * This is not scanner used in this method and therefore the method needs a parameter to set the variable, this
     * will be uses to receive a data variable from a database of if the user wish to change a specific part of the
     * information displayed to the user
     *
     * @param email2 this is used to store the user input went the user wants to update an aspect of the information
     *               found by the search method in the class mainInt
     *
     * @see #setEmail2(String)
     */

    public void setEmail2(String email2) {
        // Setting the variable to the attribute without the uses of a scanner
        this.email = email2;
    }

    /**
     * getEmail
     *
     * This is the getter string method that return the value the attribute is set too and returns it to the user
     *
     * @see #getEmail()
     * @return email
     */

    public String getEmail() {
        // This method is a getter method and just returns the value that is storing the attribute
        return email;
    }
    /**
     * setPhyAddress
     *
     * This void method set the physical address that the user inputs by using a scanner for the java.util.*
     * package and the method has a while true loop to make sure the input and the variable is not
     * empty or does not equal nothing
     *
     * If the variable has a value then the method will set the value to the attribute and break the while loop
     *
     * There is no return method as the method is a void
     *
     * @see #setPhyAddress()
     * @see package.java #java.until.*
     */

    public void setPhyAddress(){

        // String variable used to store the users input
        String phyAddress;

        // A while true loop to repeat going through the lines of code
        while (true) {

            // The scanner object to get an input for the user
            Scanner sc = new Scanner(System.in);

            // Storing the input in the string variable
            phyAddress = sc.nextLine();

            //Checks if the input is correct if the user input something and the variable is not empty
            if (phyAddress.equals("") | phyAddress.isEmpty() ) {
                // Displays the following messages to the user to inform the user what happened
                System.out.println("Please try again");
                System.out.print("Please re-enter the physical address: ");
            } else {
                // Else if the variable has a input that is correct the value of the variable will be stored in the
                // Attribute and break the while loop
                this.phyAddress = phyAddress;
                break;
            }
        }
    }

    /**
     * setPhyAddress2
     *
     * This void method is a  setter that is used to receive an input from the user and set the input to the correct
     * class attribute.
     *
     * This is not scanner used in this method and therefore the method needs a parameter to set the variable, this
     * will be uses to receive a data variable from a database of if the user wish to change a specific part of the
     * information displayed to the user
     *
     * @param phyAddress2 this is used to store the user input went the user wants to update an aspect of the information
     *                    found by the search method in the class mainInt
     *
     * @see #setPhyAddress2(String)
     */

    public void setPhyAddress2(String phyAddress2) {
        // Setting the variable to the attribute without the uses of a scanner
        this.phyAddress = phyAddress2;
    }

    /**
     * getPhyAddress
     *
     * This is the getter string method that return the value the attribute is set too and returns it to the user
     *
     * @see #getPhyAddress()
     * @return phyAddress
     */

    public String getPhyAddress() {
        // This method is a getter method and just returns the value that is storing the attribute
        return phyAddress;
    }

    /**
     * toString
     *
     * This is a toString method that has all of the information collected for the above methods and displays them in
     * a user-friendly and neat manner
     *
     * This method uses the getter method above to get the information that is needed to be displayed
     *
     * @return output
     * @see #toString()
     */

    public String toString() {
        // This is the toString method that displays all of the information gathered from the above methods
        // To display a user-friendly summary of all the information received
        String output = "The customer's information: \n";
        output += "The ID number: " + getId() + "\n";
        output += "Full Name : " + getName() + " " + getSurname()+ "\n";
        output += "Telephone Number : " + getTelNo() + "\n";
        output += "Email Address: " + getEmail() + "\n";
        output += "Physical Address: " + getPhyAddress();

        // Return the information stored in the string variable
        return output;
    }
}

/**
 * ArchClass
 *
 * This class inherit the methods for DetailClass above
 * but the class has its own toString method that uses the inherited get methods to collect the information needed
 *
 * The class inherits all of the attributes, getter and setter methods to collect and store the information inputted
 * by the user
 *
 * @see ArchClass
 * @see ArchClass#ArchClass()
 * @see ArchClass#toString()
 *
 * @extends DetailClass
 */

class ArchClass extends DetailClass {

    /**
     * ArchClass
     *
     * This constructor is created to link mainInt class with ArchClass and to create the inheritance link between
     * ArchClass and DetailClass by using the super function
     *
     * This doesn't have any methods as it shares the methods with the DetailClass and therefore has most of its
     * function above
     *
     * The classes constructor method used establish the inherited link between the class called DetailClass
     * This is also used to create a link between the mainInt the main class so that it is able to used it methods
     * to process inputted data by the user of database
     *
     * @see #ArchClass()
     * @see super()
     */

    public ArchClass(){
        // "super()" is used to link the attributes in the inherited class above
        super();
    }

    /**
     * toString
     *
     * This method uses the method that were inherited by the DetailClass and displays everything in a user-friendly
     * manner
     *
     * @see #toString()
     * @return output
     */

    public String toString() {
        // This is the toString method that displays all of the information gathered from the above methods
        // To display a user-friendly summary of all the information received
        String output = "The Architect's information: \n";
        output += "The ID number: " + getId() + "\n";
        output += "Full Name : " + getName() + " " + getSurname()+ "\n";
        output += "Telephone Number : " + getTelNo() + "\n";
        output += "Email Address: " + getEmail() + "\n";
        output += "Physical Address: " + getPhyAddress();

        // Return the information stored in the string variable
        return output;
    }
}

/**
 * StrutClass
 *
 * This class inherit the methods for DetailsClass above
 * but the class has its own toString method that uses the inherited get methods to collect the information needed
 *
 * The class inherits all of the attributes, getter and setter methods to collect and store the information inputted
 * by the user
 *
 * @see StrutClass
 * @see StrutClass#StrutClass()
 * @see StrutClass#toString()
 *
 * @extends DetailClass
 */

class StrutClass extends DetailClass{

    /**
     * StrutClass
     *
     * This constructor is created to link mainInt class with StrutClass and to create the inheritance link between
     * StrutClass and DetailClass by using the super function
     *
     * This doesn't have any methods as it shares the methods with the DetailClass and therefore has most of its
     * function above
     *
     * The classes constructor method used establish the inherited link between the class called DetailClass
     * This is also used to create a link between the mainInt the main class so that it is able to used it methods
     * to process inputted data by the user of database
     *
     * @see #StrutClass()
     * @see super()
     */
    public StrutClass(){
        // "super()" is used to link the attributes in the inherited class above
        super();
    }

    /**
     * toString
     *
     * This method uses the method that were inherited by the DetailClass and displays everything in a user-friendly
     * manner
     *
     * @see #toString()
     * @return output
     */

    public String toString() {
        // This is the toString method that displays all of the information gathered from the above methods
        // To display a user-friendly summary of all the information received
        String output = "The Structural Engineer's information: \n";
        output += "The ID number: " + getId() + "\n";
        output += "Full Name : " + getName() + " " + getSurname()+ "\n";
        output += "Telephone Number : " + getTelNo() + "\n";
        output += "Email Address: " + getEmail() + "\n";
        output += "Physical Address: " + getPhyAddress();

        // Return the information stored in the string variable
        return output;
    }

}

/**
 *  ProManClass
 *
 * This class inherit the methods for DetailClass above
 * but the class has its own toString method that uses the inherited get methods to collect the information needed
 *
 * The class inherits all of the attributes, getter and setter methods to collect and store the information inputted
 * by the user
 *
 * @see  ProManClass
 * @see  ProManClass# ProManClass()
 * @see  ProManClass#toString()
 *
 * @extends DetailClass
 */

class ProManClass extends DetailClass{

    /**
     * ProManClass
     *
     * This constructor is created to link mainInt class with ProManClass and to create the inheritance link between
     * ProManClass and DetailClass by using the super function
     *
     * This doesn't have any methods as it shares the methods with the DetailClass and therefore has most of its
     * function above
     *
     * The classes constructor method used establish the inherited link between the class called DetailClass
     * This is also used to create a link between the mainInt the main class so that it is able to used it methods
     * to process inputted data by the user of database
     *
     * @see #ProManClass()
     * @see super()
     */

    public ProManClass(){
        // "super()" is used to link the attributes in the inherited class above
        super();
    }

    /**
     * toString
     *
     * This method uses the method that were inherited by the DetailClass and displays everything in a user-friendly
     * manner
     *
     * @see #toString()
     * @return output
     */

    public String toString() {
        // This is the toString method that displays all of the information gathered from the above methods
        // To display a user-friendly summary of all the information received
        String output = "The Project Manager's information: \n";
        output += "The ID number: " + getId() + "\n";
        output += "Full Name : " + getName() + " " + getSurname()+ "\n";
        output += "Telephone Number : " + getTelNo() + "\n";
        output += "Email Address: " + getEmail() + "\n";
        output += "Physical Address: " + getPhyAddress();

        // Return the information stored in the string variable
        return output;
    }

}