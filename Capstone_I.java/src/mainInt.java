/**
 *  <h>Capstone_I.java</h>
 *
 * <p>
 *     The function of this project is to manage build projects for the company called Poise and this program uses
 *     SQL coding to manage the project and the contact details in each database.
 *
 *     This is the main class.
 *     This class is used to hold method like the user created menu method and the main interface method that allows
 *     the user to do all of the work.
 *     This program uses a database and tables to store the data so it can be modified by the user.
 * </p>
 *
 * @see package.java.text.*
 * @see package.java.until.*
 * @see package.java.io.*
 * @extends Thread
 *
 * @author Shaakir Caroto
 * @version 2.00
 * @since 27-07-2020
 */


// Imported packages that is used in the processing of data
import java.text.*;
import java.util.*;
import java.sql.*;
import java.util.Date;

public class mainInt extends Thread{

    /**
     * mainMenu()
     *
     *  The method mainMenu displays the option to the user in a user-friendly manner
     *
     *  The method allow uses the delay() void method above
     *
     *  This method displays a list of options and that the user used to pick the option they will like to use
     *  it also has a number system for easy option selection
     *
     * @see mainInt
     * @throws InterruptedException This is used to make the program sleep for a short period of time so the user can
     *                              read a message or a menu
     */

    public static void mainMenu() throws InterruptedException {

        // Calling the delay method to slow down the speed of the menu presentation
        delay();

        //Displaying the menu options by using the system out method
        System.out.println("Menu Main: \n");
        System.out.println("1 - Create a project");
        System.out.println("2 - View projects");
        System.out.println("3 - Completed projects");
        System.out.println("4 - Customer information");
        System.out.println("5 - Architect information");
        System.out.println("6 - Project Manager Information");
        System.out.println("7 - Structural Engineer Information");
        System.out.println("8 - Past Due projects\n");
        System.out.println("0 - Exit\n");
    }

    /**
     * cusMain()
     *
     * This method show the user option to continue
     * This method displays a list of options and that the user used to pick the option they will like to use
     * it also has a number system for easy option selection
     *
     *   @see mainInt
     */

    public static void cusMain(){

        //Displaying the menu options by using the system out method
        System.out.println("1 - Create a new Customer Profile");
        System.out.println("2 - Search for Customer Profile\n");

        System.out.println("0 - Continue");
    }

    /**
     * archMain()
     *
     * This method show the user option to continue
     * This method displays a list of options and that the user used to pick the option they will like to use
     * it also has a number system for easy option selection
     *
     *   @see mainInt
     */

    public static void archMain(){

        //Displaying the menu options by using the system out method
        System.out.println("1 - Create a new Architect Profile");
        System.out.println("2 - Search for Architect Profile\n");

        System.out.println("0 - Continue");
    }

    /**
     * proManMain()
     *
     * This method show the user option to continue
     * This method displays a list of options and that the user used to pick the option they will like to use
     * it also has a number system for easy option selection
     *
     *   @see mainInt
     */

    public static void proManMain(){

        //Displaying the menu options by using the system out method
        System.out.println("1 - Create a new Project Manager Profile");
        System.out.println("2 - Search for Project Manager Profile\n");

        System.out.println("0 - Continue");
    }

    /**
     * structEMain()
     *
     * This method show the user option to continue
     * This method displays a list of options and that the user used to pick the option they will like to use
     * it also has a number system for easy option selection
     *
     *   @see mainInt
     */

    public static void structEMain(){

        //Displaying the menu options by using the system out method
        System.out.println("1 - Create a new Structural Engineer Profile");
        System.out.println("2 - Search for Structural Engineer Profile\n");

        System.out.println("0 - Continue");
    }

    /**
     * projectUpMenu()
     *
     * This method show the user option to continue
     * This method displays a list of options and that the user used to pick the option they will like to use
     * it also has a number system for easy option selection
     *
     *   @see mainInt
     */

    public static void projectUpMenu(){

        //Displaying the menu options by using the system out method
        System.out.println("1 - Deadline date");
        System.out.println("2 - Payment toward the outstanding balance");
        System.out.println("3 - Finalized project");
        System.out.println("4 - Completed project\n");

        System.out.println("0 - To continue to the main menu\n");


        System.out.print("Enter the number of the option you pick: ");
    }

    /**
     * customerUpMenu()
     *
     * This method show the user option to continue
     * This method displays a list of options and that the user used to pick the option they will like to use
     * it also has a number system for easy option selection
     *
     *   @see mainInt
     */

    public static void customerUpMenu(){

        //Displaying the menu options by using the system out method
        System.out.println("1 - Would you like to view all of the customers");
        System.out.println("2 - Would you like to search for a customer's information");
        System.out.println("3 - Adding a new customer's details\n");

        System.out.println("0 - Back to main menu\n");
    }

    /**
     * architectUpMenu()
     *
     * This method show the user option to continue
     * This method displays a list of options and that the user used to pick the option they will like to use
     * it also has a number system for easy option selection
     *
     *   @see mainInt
     */

    public static void architectUpMenu(){

        //Displaying the menu options by using the system out method
        System.out.println("1 - Would you like to view all of the architects");
        System.out.println("2 - Would you like to search for a architect's information");
        System.out.println("3 - Adding a new architect's details\n");

        System.out.println("0 - Back to main menu\n");
    }

    /**
     *  proManagerUpMenu()
     *
     * This method show the user option to continue
     * This method displays a list of options and that the user used to pick the option they will like to use
     * it also has a number system for easy option selection
     *
     *   @see mainInt
     */

    public static void proManagerUpMenu(){

        //Displaying the menu options by using the system out method
        System.out.println("1 - Would you like to view all of the Project Manager's Information");
        System.out.println("2 - Would you like to search for a Project Manager's information");
        System.out.println("3 - Adding a new Project Manager's details\n");

        System.out.println("0 - Back to main menu\n");
    }

    /**
     *  structEngineerUpMenu()
     *
     * This method show the user option to continue
     * This method displays a list of options and that the user used to pick the option they will like to use
     * it also has a number system for easy option selection
     *
     *   @see mainInt
     */

    public static void structEngineerUpMenu(){

        //Displaying the menu options by using the system out method
        System.out.println("1 - Would you like to view all of the Structural Engineer's Information");
        System.out.println("2 - Would you like to search for a Structural Engineer's Information");
        System.out.println("3 - Adding a new Structural Engineer's Information\n");

        System.out.println("0 - Back to main menu\n");
    }

    /**
     * delay()
     * <br>
     *  The method is used it delay the program so the user of the program can read some information before the next
     *  thing pops-up
     *  The method needs to be call in the program and the method that it is being used in must have an InterruptedException
     *
     *  This is a delay method that freeze that program for a couple of milliseconds so the user can read a message
     *  or an option menu without the program jumping to the next dialog process
     *
     * @see mainInt
     * @deprecated
     * @throws InterruptedException This is used to make the program sleep for a short period of time so the user can
     *                              read a message or a menu
     */

    public static void delay() throws InterruptedException {
        // This is the sleep thread method that makes the program sleep
        // for a program amount of milliseconds to slow down the program
        Thread.sleep(1500);
    }

    /**
     * main
     * <br>
     *
     * This is the main method where the methods and classes are used to make the program work and function
     * to preform the tasks that are needed
     *
     * This is the interface that the user will see and interact with to complete task and manage the data
     * receive and/or save to a text file
     *
     * It has its own set of variable and functions to complete tasks
     *
     * This is the main interface method that the user will be working with.
     * This has all of the classes and methods to complete the tasks that the user will need to do
     *
     * @param args      It is used in the main void that store arguments of the method to help the program to
     *                  work correctly
     *
     * @throws InterruptedException This is used to make the program sleep for a short period of time so the user can
     *                              read a message or a menu
     */

    public static void main (String [] args)throws InterruptedException{

        // Creating the scanner object to receive the user inputs
        Scanner input = new Scanner(System.in);

        // First message the user will when the program starts up
        System.out.println("Welcome");

        // Requesting the users input to access the program by using this login to access the database
        System.out.println("You will need to enter your username and password to access the program (Check readme file)");

        // Requesting the username and the password and storing them in the
        // variables called username and password
        System.out.print("Username: ");
        String username = input.nextLine();
        System.out.print("Password: ");
        String password = input.nextLine();

        // This try catch will catch any of the errors found when the user inputs the username and password
        try {

            // Variables that are used for storage and data manipulation
            int customerID = 0, structID = 0, proManID = 0, archID = 0, projectID;
            String name = "",surname = "",telNo = "",email = "",phyAddress = "";
            String proName,proBuild,proPhyAddress,ERF,dateDeadLine = "";
            float totalFee = 0,dateToFee,outstandingBal;


            // Creating the connection to the SQL database and using the user input to access the database
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/poisepms_db?useSSL=false ",
                    username, password);

            // Creating SQL object to process the queries used in the computing of the data
            Statement statement = connection.createStatement();
            ResultSet results;
            int rowsAffected;

            // Displaying a welcome message to the user
            System.out.println("Welcome " + username + "\n");

            // Creating the class object to be able access the constructor and the methods in the classes
            DetailClass customerInfo = new DetailClass();

            // This two three inherit their methods for the above DetailsClass
            ArchClass arch = new ArchClass();
            StrutClass struct = new StrutClass();
            ProManClass proManager = new ProManClass();

            // This is the project class
            ProjectClass projectInfo = new ProjectClass();

            // A while true loop to repeat going through the lines of code
            // So the program will continue you running until the user want to end the program
            while (true) {

                // Calling the menu method
                // So the user can see their options
                mainMenu();

                // Calling the delay method to slow down the speed of the menu presentation
                delay();

                // Telling the user what they will need to input to select an option
                System.out.print("Enter one of the numbers to select the option: ");

                // Creating a integer variable to store the users input
                int noInput = input.nextInt();

                // Creating a switch statement that will call a case based on the user input and allow them to
                // do a task
                // the switch statement is used due to the number of option that can be called
                switch (noInput) {

                    // if the user wants to end the program and displays the follow messages
                    // and breaks the while true loop
                    case 0:
                        System.out.print("You have chosen to exit the program \n");
                        System.out.print("Goodbye \n");
                        break;


                    // If the user entered 1 into the input variable
                    // This case will be called
                    // This is the option if the user wants to create a new project
                    case 1:

                        // informing the user what they have selected
                        System.out.println("You have chosen to create a new project\n");

                        System.out.println("You will need to enter the customers database id number or "
                                        + "Create a new record for the customer database." );

                        // A while true loop to repeat going through the lines of code
                        // So the program will continue you running until the user want to end the program
                        while(true){

                            // Calling the subMenu method
                            // This menu is check if the user is going to create a new customer profile
                            // Or if they are going to search a the text file for the information
                            cusMain();

                            // Telling the user want to input
                            // And creating the store integer variable to be used in the switch statement below
                            System.out.print("Enter the input option: ");
                            int customer = input.nextInt();

                            // the switch statement is used due to the number of option that can be called
                            switch (customer){

                                // This is used if the user wants to create a new customer profile
                                case 1:

                                    // creating a variable to store the last id number in the database
                                    int id = 0;

                                    // Creating a SQL query to go though all of the id stored in the table
                                    results = statement.executeQuery("Select Customer_id from customer");

                                    // The while loop go though result the match the query
                                    while (results.next()){
                                        // the last query will be stored in the variable id
                                        id = results.getInt("Customer_id");
                                    }

                                    // id will be increased by one
                                    id++;


                                    // Displaying to the user what option they have picked and what they will need to do
                                    System.out.println("You have chosen to create a new customer profile");
                                    System.out.println("Fill in all the information");


                                    // Telling the user what they will need to input
                                    // And calling the setter methods from the DetailsClass to get the inputs for the user
                                    // And checking if the inputs are correct
                                    // Storing the id variable in the class
                                    customerInfo.setId(id);
                                    System.out.print("Enter the Customer's  Name: ");
                                    customerInfo.setName();
                                    System.out.print("Enter the Customer's Surname: ");
                                    customerInfo.setSurname();
                                    System.out.print("Enter the Customer's Telephone Number: ");
                                    customerInfo.setTelNo();
                                    System.out.print("Enter the Customer's Email Address: ");
                                    customerInfo.setEmail();
                                    System.out.print("Enter the Customer's Physical Address: ");
                                    customerInfo.setPhyAddress();


                                    // Using the getter method to store the values of the attributes from the DetailsClass
                                    // This variable declared in this class
                                    customerID = customerInfo.getId();
                                    name = customerInfo.getName();
                                    surname = customerInfo.getSurname();
                                    telNo = customerInfo.getTelNo();
                                    email = customerInfo.getEmail();
                                    phyAddress = customerInfo.getPhyAddress();

                                    // creating a query to insert the new information into the table that is called customer
                                    rowsAffected = statement.executeUpdate("insert into customer" +
                                            " values(" + customerID +", '" + name + "', '" + surname + "', '" + telNo + "', '" + email + "', '" + phyAddress + "')" );

                                    // telling the user the number of lines that have been affected by the query
                                    System.out.println("The action is complete\nThe number of rows affected : " + rowsAffected + "\n");

                                    // This break function is so the case end and does not continue to the next case
                                    break;

                                // This case is if the user want to search for the customer and get the information
                                case 2:

                                    // Displaying to the user what option they have picked
                                    System.out.println("You have chosen to search for the information.");

                                  /*
                                    Telling the user what they need to do
                                    the "input.nextLine" is so the program doesn't skip the line below it
                                    And creating a string variable that will store the user input to be used in the
                                    Search method

                                    Telling the what they need to input and their options
                                   */
                                    System.out.println("How would you like to search for the customer \n 1) name \n 2) Surname \n 3) ID number");
                                    System.out.print("\nPlease enter input: ");
                                    input.nextLine();
                                    int option = input.nextInt();

                                    // the switch statement is used due to the number of option that can be called
                                    switch (option){

                                        // If the used wants to search by the customers name
                                        case 1:

                                            // Telling the user what they have chosen
                                            System.out.println("You have chosen to search using the name of the customer");

                                            /*
                                              Telling the user what to input
                                               the "input.nextLine" is so the program doesn't skip the line below it
                                               And creating a string variable that will store the user input to be used

                                            */
                                            System.out.print("Enter the customer first name : ");
                                            input.nextLine();
                                            String sName = input.nextLine();

                                            // Creating a search query to look for the customers name
                                            results = statement.executeQuery("Select * from customer where f_name = '" +
                                                    sName + "'");

                                            // The while loop go though result the match the query
                                            while (results.next()){
                                                // Storing the data that the query found in the following the data in variables
                                                customerID = results.getInt("Customer_id");
                                                name = results.getString("f_name");
                                                surname = results.getString("surname");
                                                telNo = results.getString("Tele_No");
                                                email = results.getString("email");
                                                phyAddress = results.getString("phy_address");

                                            }

                                            /*
                                             Using the alternative setter method to set the found variable to
                                             the attribute in the DetailsClass
                                            */
                                            customerInfo.setId(customerID);
                                            customerInfo.setName2(name);
                                            customerInfo.setSurname2(surname);
                                            customerInfo.setTelNo2(telNo);
                                            customerInfo.setEmail2(email);
                                            customerInfo.setPhyAddress2(phyAddress);

                                            // Using the toString method to display all of the input data
                                            System.out.println(customerInfo.toString() + "\n");
                                            break;

                                        // If the used wants to search by the customers surname
                                        case 2:

                                            // Telling the user what they have chosen
                                            System.out.println("You have chosen to search using the surname of the customer");

                                           /*
                                            Telling the user what to input
                                            the "input.nextLine" is so the program doesn't skip the line below it
                                            And creating a string variable that will store the user input to be used
                                            */
                                            System.out.print("Enter the customer first name : ");
                                            input.nextLine();
                                            String sSurname = input.nextLine();

                                            // Creating a search query to look for the customers surname
                                            results = statement.executeQuery("Select * from customer where surname = '" +
                                                    sSurname + "'");

                                            // The while loop go though result the match the query
                                            while (results.next()){

                                                // Storing the data that the query found in the following the data in variables
                                                customerID = results.getInt("Customer_id");
                                                name = results.getString("f_name");
                                                surname = results.getString("surname");
                                                telNo = results.getString("Tele_No");
                                                email = results.getString("email");
                                                phyAddress = results.getString("phy_address");

                                            }

                                            /*
                                             Using the alternative setter method to set the found variable to
                                             the attribute in the DetailsClass
                                            */
                                            customerInfo.setId(customerID);
                                            customerInfo.setName2(name);
                                            customerInfo.setSurname2(surname);
                                            customerInfo.setTelNo2(telNo);
                                            customerInfo.setEmail2(email);
                                            customerInfo.setPhyAddress2(phyAddress);

                                            // Using the toString method to display all of the input data
                                            System.out.println(customerInfo.toString() + "\n");
                                            break;

                                        // If the used wants to search by the customers id number
                                        case 3:

                                            // Telling the user what they have chosen
                                            System.out.println("You have chosen to search using the ID number of the customer");

                                            /*
                                            Telling the user what to input
                                            the "input.nextLine" is so the program doesn't skip the line below it
                                            And creating a string variable that will store the user input to be used
                                            */
                                            System.out.print("Enter the customer ID Number : ");
                                            input.nextLine();
                                            int sID = input.nextInt();

                                            // Creating a search query to look for the customers id number
                                            results = statement.executeQuery("Select * from customer where Customer_id = " +
                                                    sID + "");

                                            // The while loop go though result the match the query
                                            while (results.next()){

                                                // Storing the data that the query found in the following the data in variables
                                                customerID = results.getInt("Customer_id");
                                                name = results.getString("f_name");
                                                surname = results.getString("surname");
                                                telNo = results.getString("Tele_No");
                                                email = results.getString("email");
                                                phyAddress = results.getString("phy_address");

                                            }

                                            /*
                                             Using the alternative setter method to set the found variable to
                                             the attribute in the DetailsClass
                                            */
                                            customerInfo.setId(customerID);
                                            customerInfo.setName2(name);
                                            customerInfo.setSurname2(surname);
                                            customerInfo.setTelNo2(telNo);
                                            customerInfo.setEmail2(email);
                                            customerInfo.setPhyAddress2(phyAddress);

                                            // Using the toString method to display all of the input data
                                            System.out.println(customerInfo.toString() + "\n");
                                            break;

                                    }

                                    // This break function is so the case end and does not continue to the next case
                                    break;

                                // This is so the user will be able to end the switch statement
                                case 0 :
                                    break;

                                // If the user inputs something that is not parts of the options this method will display
                                default:
                                    System.out.println("Option not found\n Please try again");
                            }

                            //if the variable customer equals 0
                            if(customer == 0){
                                // Display the following method and the while loop will break so the user can continue
                                System.out.println("You have chosen to continue.");
                                break;
                            }
                        }

                        // A while true loop to repeat going through the lines of code
                        // So the program will continue you running until the user want to end the program
                        while(true){

                            // Calling the subMenu method
                            // This menu is check if the user is going to create a new Structural Engineer profile
                            // Or if they are going to search a the text file for the information
                            structEMain();

                            // Telling the user want to input
                            // And creating the store integer variable to be used in the switch statement below
                            System.out.print("Enter the input option: ");
                            int structE = input.nextInt();

                            // the switch statement is used due to the number of option that can be called
                            switch (structE){

                                // This is used if the user wants to create a new Structural Engineer profile
                                case 1:

                                    // creating a variable to store the last id number in the database
                                    int id = 0;

                                    // Creating a SQL query to go though all of the id stored in the table
                                    results = statement.executeQuery("Select StEng_id from structeng");

                                    // The while loop go though result the match the query
                                    while (results.next()){
                                        // the last query will be stored in the variable id
                                        id = results.getInt("StEng_id");
                                    }

                                    // id will be increased by one
                                    id++;

                                    // Displaying to the user what option they have picked and what they will need to do
                                    System.out.println("You have chosen to create a new Structural Engineer profile");
                                    System.out.println("Fill in all the information");


                                    // Telling the user what they will need to input
                                    // And calling the setter methods from the struct to get the inputs for the user
                                    // And checking if the inputs are correct
                                    // Storing the id variable in the class
                                    struct.setId(id);
                                    System.out.print("Enter the Structural Engineer's  Name: ");
                                    struct.setName();
                                    System.out.print("Enter the Structural Engineer's Surname: ");
                                    struct.setSurname();
                                    System.out.print("Enter the Structural Engineer's Telephone Number: ");
                                    struct.setTelNo();
                                    System.out.print("Enter the Structural Engineer's Email Address: ");
                                    struct.setEmail();
                                    System.out.print("Enter the Structural Engineer's Physical Address: ");
                                    struct.setPhyAddress();

                                    // Using the getter method to store the values of the attributes from the struct
                                    // This variable declared in this class
                                    structID = struct.getId();
                                    name = struct.getName();
                                    surname = struct.getSurname();
                                    telNo = struct.getTelNo();
                                    email = struct.getEmail();
                                    phyAddress = struct.getPhyAddress();

                                    // creating a query to insert the new information into the table that is called Structural Engineer
                                    rowsAffected = statement.executeUpdate("insert into structeng" +
                                            " values(" + structID +", '" + name + "', '" + surname + "', '" + telNo + "', '" + email + "', '" + phyAddress + "')" );

                                    // telling the user the number of lines that have been affected by the query
                                    System.out.println("The action is complete\nThe number of rows affected : " + rowsAffected + "\n");

                                    // This break function is so the case end and does not continue to the next case
                                    break;

                                // This case is if the user want to search for the Structural Engineer and get the information
                                case 2:

                                    // Displaying to the user what option they have picked
                                    System.out.println("You have chosen to search for the information.");

                                  /*
                                    Telling the user what they need to do
                                    the "input.nextLine" is so the program doesn't skip the line below it
                                    And creating a string variable that will store the user input to be used in the
                                    Search method

                                    Telling the what they need to input and their options
                                   */
                                    System.out.println("How would you like to search for the Structural Engineer \n 1) name \n 2) Surname \n 3) ID number");
                                    System.out.print("\nPlease enter input: ");
                                    int option = input.nextInt();

                                    // the switch statement is used due to the number of option that can be called
                                    switch (option){

                                        // If the used wants to search by the Structural Engineer name
                                        case 1:

                                            // Telling the user what they have chosen
                                            System.out.println("You have chosen to search using the first name of the Structural Engineer");

                                             /*
                                            Telling the user what to input
                                            the "input.nextLine" is so the program doesn't skip the line below it
                                            And creating a string variable that will store the user input to be used
                                            */
                                            System.out.print("Enter the Structural Engineer first name : ");
                                            input.nextLine();
                                            String sName = input.nextLine();

                                            // Creating a search query to look for the Structural Engineer name
                                            results = statement.executeQuery("Select * from structeng where f_name = '" +
                                                    sName + "'");

                                            // The while loop go though result the match the query
                                            while (results.next()){

                                                // Storing the data that the query found in the following the data in variables
                                                structID = results.getInt("StEng_id");
                                                name = results.getString("f_name");
                                                surname = results.getString("surname");
                                                telNo = results.getString("Tele_No");
                                                email = results.getString("email");
                                                phyAddress = results.getString("phy_address");

                                            }

                                            /*
                                             Using the alternative setter method to set the found variable to
                                             the attribute in the struct
                                            */
                                            struct.setId(structID);
                                            struct.setName2(name);
                                            struct.setSurname2(surname);
                                            struct.setTelNo2(telNo);
                                            struct.setEmail2(email);
                                            struct.setPhyAddress2(phyAddress);

                                            // Using the toString method to display all of the input data
                                            System.out.println( struct.toString() + "\n");
                                            break;

                                        // If the used wants to search by the Structural Engineer surname
                                        case 2:

                                            // Telling the user what they have chosen
                                            System.out.println("You have chosen to search using the surname of the Structural Engineer");

                                            /*
                                            Telling the user what to input
                                            the "input.nextLine" is so the program doesn't skip the line below it
                                            And creating a string variable that will store the user input to be used
                                            */
                                            System.out.print("Enter the Structural Engineer surname : ");
                                            input.nextLine();
                                            String sSurname = input.nextLine();

                                            // Creating a search query to look for the Structural Engineer surname
                                            results = statement.executeQuery("Select * from structeng where surname = '" +
                                                    sSurname + "'");

                                            // The while loop go though result the match the query
                                            while (results.next()){

                                                // Storing the data that the query found in the following the data in variables
                                                structID = results.getInt("StEng_id");
                                                name = results.getString("f_name");
                                                surname = results.getString("surname");
                                                telNo = results.getString("Tele_No");
                                                email = results.getString("email");
                                                phyAddress = results.getString("phy_address");

                                            }

                                            /*
                                             Using the alternative setter method to set the found variable to
                                             the attribute in the struct
                                            */
                                            struct.setId(structID);
                                            struct.setName2(name);
                                            struct.setSurname2(surname);
                                            struct.setTelNo2(telNo);
                                            struct.setEmail2(email);
                                            struct.setPhyAddress2(phyAddress);

                                            // Using the toString method to display all of the input data
                                            System.out.println( struct.toString() + "\n");
                                            break;

                                        // If the used wants to search by the Structural Engineer id number
                                        case 3:

                                            // Telling the user what they have chosen
                                            System.out.println("You have chosen to search using the ID NUmber of the Structural Engineer");

                                            /*
                                            Telling the user what to input
                                            the "input.nextLine" is so the program doesn't skip the line below it
                                            And creating a string variable that will store the user input to be used
                                            */
                                            System.out.print("Enter the Structural Engineer ID number : ");
                                            input.nextLine();
                                            int sID = input.nextInt();

                                            // Creating a search query to look for the Structural Engineer surname
                                            results = statement.executeQuery("Select * from structeng where Struct_id = " +
                                                    sID + "");

                                            // The while loop go though result the match the query
                                            while (results.next()){

                                                // Storing the data that the query found in the following the data in variables
                                                structID = results.getInt("StEng_id");
                                                name = results.getString("f_name");
                                                surname = results.getString("surname");
                                                telNo = results.getString("Tele_No");
                                                email = results.getString("email");
                                                phyAddress = results.getString("phy_address");

                                            }

                                            /*
                                             Using the alternative setter method to set the found variable to
                                             the attribute in the struct
                                            */
                                            struct.setId(structID);
                                            struct.setName2(name);
                                            struct.setSurname2(surname);
                                            struct.setTelNo2(telNo);
                                            struct.setEmail2(email);
                                            struct.setPhyAddress2(phyAddress);

                                            // Using the toString method to display all of the input data
                                            System.out.println( struct.toString() + "\n");
                                            break;

                                    }

                                    // This break function is so the case end and does not continue to the next case
                                    break;

                                // This is so the user will be able to end the switch statement
                                case 0 :
                                    break;

                                // If the user inputs something that is not parts of the options this method will display
                                default:
                                    System.out.println("Option not found\n Please try again");
                            }

                            //if the variable structE equals 0
                            if(structE == 0){
                                // Display the following method and the while loop will break so the user can continue
                                System.out.println("You have chosen to continue.");
                                break;
                            }
                        }

                        // A while true loop to repeat going through the lines of code
                        // So the program will continue you running until the user want to end the program
                        while (true){

                            // Calling the subMenu method
                            // This menu is check if the user is going to create a new Project Manager profile
                            // Or if they are going to search a the text file for the information
                            proManMain();


                            // Telling the user want to input
                            // And creating the store integer variable to be used in the switch statement below
                            System.out.print("Enter the input option: ");
                            int proMan = input.nextInt();

                            // the switch statement is used due to the number of option that can be called
                            switch(proMan){

                                // This is used if the user wants to create a new Project Manager profile
                                case 1:

                                    // creating a variable to store the last id number in the database
                                    int id = 0;

                                    // Creating a SQL query to go though all of the id stored in the table
                                    results = statement.executeQuery("Select ProMan_id from promanager");

                                    // The while loop go though result the match the query
                                    while (results.next()){
                                        // the last query will be stored in the variable id
                                        id = results.getInt("ProMan_id");
                                    }

                                    // id will be increased by one
                                    id++;

                                    // Displaying to the user what option they have picked and what they will need to do
                                    System.out.println("You have chosen to create a new Project Manager profile");
                                    System.out.println("Fill in all the information");


                                    // Telling the user what they will need to input
                                    // And calling the setter methods from the struct to get the inputs for the user
                                    // And checking if the inputs are correct
                                    // Storing the id variable in the class
                                    proManager.setId(id);
                                    System.out.print("Enter the Project Manager's  Name: ");
                                    proManager.setName();
                                    System.out.print("Enter the Project Manager's Surname: ");
                                    proManager.setSurname();
                                    System.out.print("Enter the Project Manager's Telephone Number: ");
                                    proManager.setTelNo();
                                    System.out.print("Enter the Project Manager's Email Address: ");
                                    proManager.setEmail();
                                    System.out.print("Enter the Project Manager's Physical Address: ");
                                    proManager.setPhyAddress();

                                    // Using the getter method to store the values of the attributes from the struct
                                    // This variable declared in this class
                                    proManID = proManager.getId();
                                    name = proManager.getName();
                                    surname = proManager.getSurname();
                                    telNo = proManager.getTelNo();
                                    email = proManager.getEmail();
                                    phyAddress = proManager.getPhyAddress();

                                    // creating a query to insert the new information into the table that is called Project Manager
                                    rowsAffected = statement.executeUpdate("insert into promanager" +
                                            " values(" + proManID +", '" + name + "', '" + surname + "', '" + telNo + "', '" + email + "', '" + phyAddress + "')" );

                                    // telling the user the number of lines that have been affected by the query
                                    System.out.println("The action is complete\nThe number of rows affected : " + rowsAffected + "\n");

                                    // This break function is so the case end and does not continue to the next case
                                    break;

                                // This case is if the user want to search for the Project Manager and get the information
                                case 2:

                                    // Displaying to the user what option they have picked
                                    System.out.println("You have chosen to search for the information.");

                                    /*
                                    Telling the user what they need to do
                                    the "input.nextLine" is so the program doesn't skip the line below it
                                    And creating a string variable that will store the user input to be used in the
                                    Search method

                                    Telling the what they need to input and their options
                                    */
                                    System.out.println("How would you like to search for the Project Manager \n 1) name \n 2) Surname \n 3) ID number");
                                    System.out.print("\nPlease enter input: ");
                                    int option = input.nextInt();

                                    // the switch statement is used due to the number of option that can be called
                                    switch (option){

                                        // If the used wants to search by the Project Manager name
                                        case 1:

                                            // Telling the user what they have chosen
                                            System.out.println("You have chosen to search using the first name of the Project Manager");

                                            /*
                                            Telling the user what to input
                                            the "input.nextLine" is so the program doesn't skip the line below it
                                            And creating a string variable that will store the user input to be used
                                            */
                                            System.out.print("Enter the Project Manager first name : ");
                                            input.nextLine();
                                            String sName = input.nextLine();

                                            // Creating a search query to look for the Project Manager name
                                            results = statement.executeQuery("Select * from promanager where f_name = '" +
                                                    sName + "'");

                                            // The while loop go though result the match the query
                                            while (results.next()){
                                                // Storing the data that the query found in the following the data in variables
                                                proManID = results.getInt("ProMan_id");
                                                name = results.getString("f_name");
                                                surname = results.getString("surname");
                                                telNo = results.getString("Tele_No");
                                                email = results.getString("email");
                                                phyAddress = results.getString("phy_address");

                                            }

                                             /*
                                             Using the alternative setter method to set the found variable to
                                             the attribute in the proManager
                                            */
                                            proManager.setId(proManID);
                                            proManager.setName2(name);
                                            proManager.setSurname2(surname);
                                            proManager.setTelNo2(telNo);
                                            proManager.setEmail2(email);
                                            proManager.setPhyAddress2(phyAddress);

                                            // Using the toString method to display all of the input data
                                            System.out.println( struct.toString() + "\n");
                                            break;

                                        // If the used wants to search by the Project Manager surname
                                        case 2:

                                            // Telling the user what they have chosen
                                            System.out.println("You have chosen to search using the surname of the Project Manager");

                                            /*
                                            Telling the user what to input
                                            the "input.nextLine" is so the program doesn't skip the line below it
                                            And creating a string variable that will store the user input to be used
                                            */
                                            System.out.print("Enter the Project Manager surname : ");
                                            input.nextLine();
                                            String sSurname = input.nextLine();

                                            // Creating a search query to look for the Project Manager surname
                                            results = statement.executeQuery("Select * from promanager where surname = '" +
                                                    sSurname + "'");

                                            // The while loop go though result the match the query
                                            while (results.next()){

                                                // Storing the data that the query found in the following the data in variables
                                                proManID = results.getInt("ProMan_id");
                                                name = results.getString("f_name");
                                                surname = results.getString("surname");
                                                telNo = results.getString("Tele_No");
                                                email = results.getString("email");
                                                phyAddress = results.getString("phy_address");

                                            }

                                             /*
                                             Using the alternative setter method to set the found variable to
                                             the attribute in the  proManager
                                            */
                                            proManager.setId(proManID);
                                            proManager.setName2(name);
                                            proManager.setSurname2(surname);
                                            proManager.setTelNo2(telNo);
                                            proManager.setEmail2(email);
                                            proManager.setPhyAddress2(phyAddress);

                                            // Using the toString method to display all of the input data
                                            System.out.println( struct.toString() + "\n");
                                            break;

                                        // If the used wants to search by the Project Manager id number
                                        case 3:

                                            // Telling the user what they have chosen
                                            System.out.println("You have chosen to search using the ID NUmber of the Project Manager");

                                            /*
                                            Telling the user what to input
                                            the "input.nextLine" is so the program doesn't skip the line below it
                                            And creating a string variable that will store the user input to be used
                                            */
                                            System.out.print("Enter the Project Manager ID number : ");
                                            input.nextLine();
                                            int sID = input.nextInt();

                                            // Creating a search query to look for the Project Manager ID Number
                                            results = statement.executeQuery("Select * from promanager where ProMan_id = " +
                                                    sID + "");

                                            // The while loop go though result the match the query
                                            while (results.next()){

                                                // Storing the data that the query found in the following the data in variables
                                                proManID = results.getInt("ProMan_id");
                                                name = results.getString("f_name");
                                                surname = results.getString("surname");
                                                telNo = results.getString("Tele_No");
                                                email = results.getString("email");
                                                phyAddress = results.getString("phy_address");

                                            }

                                              /*
                                             Using the alternative setter method to set the found variable to
                                             the attribute in the  proManager
                                            */
                                            proManager.setId( proManID);
                                            proManager.setName2(name);
                                            proManager.setSurname2(surname);
                                            proManager.setTelNo2(telNo);
                                            proManager.setEmail2(email);
                                            proManager.setPhyAddress2(phyAddress);

                                            // Using the toString method to display all of the input data
                                            System.out.println( proManager.toString() + "\n");
                                            break;

                                    }

                                    // This break function is so the case end and does not continue to the next case
                                    break;

                                // This is so the user will be able to end the switch statement
                                case 0 :
                                    break;

                                // If the user inputs something that is not parts of the options this method will display
                                default:
                                    System.out.println("Option not found\n Please try again");
                            }

                            //if the variable proMan equals 0
                            if(proMan == 0){
                                // Display the following method and the while loop will break so the user can continue
                                System.out.println("You have chosen to continue.");
                                break;
                            }
                        }

                        // A while true loop to repeat going through the lines of code
                        // So the program will continue you running until the user want to end the program
                        while (true){

                            // Calling the subMenu method
                            // This menu is check if the user is going to create a new Architect profile
                            // Or if they are going to search a the text file for the information
                            archMain();

                            // Telling the user want to input
                            // And creating the store integer variable to be used in the switch statement below
                            System.out.print("Enter the input option: ");
                            int archOp = input.nextInt();

                            // the switch statement is used due to the number of option that can be called
                            switch (archOp){

                                // This is used if the user wants to create a new Architect profile
                                case 1:
                                    // creating a variable to store the last id number in the database
                                    int id = 0;

                                    // Creating a SQL query to go though all of the id stored in the table
                                    results = statement.executeQuery("Select Arch_id from arch");

                                    // The while loop go though result the match the query
                                    while (results.next()){
                                        // the last query will be stored in the variable id
                                        id = results.getInt(" Arch_id");
                                    }

                                    // id will be increased by one
                                    id++;

                                    // Displaying to the user what option they have picked and what they will need to do
                                    System.out.println("You have chosen to create a new Architect profile");
                                    System.out.println("Fill in all the information");

                                    // Telling the user what they will need to input
                                    // And calling the setter methods from the struct to get the inputs for the user
                                    // And checking if the inputs are correct
                                    // Storing the id variable in the class
                                    arch.setId(id);
                                    System.out.print("Enter the Architect's  Name: ");
                                    arch.setName();
                                    System.out.print("Enter the Architect's Surname: ");
                                    arch.setSurname();
                                    System.out.print("Enter the Architect's Telephone Number: ");
                                    arch.setTelNo();
                                    System.out.print("Enter the Architect's Email Address: ");
                                    arch.setEmail();
                                    System.out.print("Enter the Architect's Physical Address: ");
                                    arch.setPhyAddress();

                                    // Using the getter method to store the values of the attributes from the arch
                                    // This variable declared in this class
                                    archID = arch.getId();
                                    name = arch.getName();
                                    surname = arch.getSurname();
                                    telNo = arch.getTelNo();
                                    email = arch.getEmail();
                                    phyAddress = arch.getPhyAddress();

                                    // creating a query to insert the new information into the table that is called Architect
                                    rowsAffected = statement.executeUpdate("insert into arch" +
                                            " values(" + archID +", '" + name + "', '" + surname + "', '" + telNo + "', '" + email + "', '" + phyAddress + "')" );

                                    // telling the user the number of lines that have been affected by the query
                                    System.out.println("The action is complete\nThe number of rows affected : " + rowsAffected + "\n");

                                    // This break function is so the case end and does not continue to the next case
                                    break;

                                // This case is if the user want to search for the Structural Engineer and get the information
                                case 2:

                                    // Displaying to the user what option they have picked
                                    System.out.println("You have chosen to search for the information.");

                                    /*
                                    Telling the user what they need to do
                                    the "input.nextLine" is so the program doesn't skip the line below it
                                    And creating a string variable that will store the user input to be used in the
                                    Search method

                                    Telling the what they need to input and their options
                                    */
                                    System.out.println("How would you like to search for the Architect \n 1) name \n 2) Surname \n 3) ID number");
                                    System.out.print("\nPlease enter input: ");
                                    int option = input.nextInt();

                                    // the switch statement is used due to the number of option that can be called
                                    switch (option){

                                        // If the used wants to search by the Architect name
                                        case 1:
                                            // Telling the user what they have chosen
                                            System.out.println("You have chosen to search using the first name of the Architect");

                                           /*
                                            Telling the user what to input
                                            the "input.nextLine" is so the program doesn't skip the line below it
                                            And creating a string variable that will store the user input to be used
                                            */
                                            System.out.print("Enter the Architect first name : ");
                                            input.nextLine();
                                            String sName = input.nextLine();

                                            // Creating a search query to look for the Architect name
                                            results = statement.executeQuery("Select * from arch where f_name = '" +
                                                    sName + "'");

                                            // The while loop go though result the match the query
                                            while (results.next()){
                                                // Storing the data that the query found in the following the data in variables
                                                archID = results.getInt("Arch_id");
                                                name = results.getString("f_name");
                                                surname = results.getString("surname");
                                                telNo = results.getString("Tele_No");
                                                email = results.getString("email");
                                                phyAddress = results.getString("phy_address");

                                            }

                                             /*
                                             Using the alternative setter method to set the found variable to
                                             the attribute in the arch
                                            */
                                            arch.setId(archID);
                                            arch.setName2(name);
                                            arch.setSurname2(surname);
                                            arch.setTelNo2(telNo);
                                            arch.setEmail2(email);
                                            arch.setPhyAddress2(phyAddress);

                                            // Using the toString method to display all of the input data
                                            System.out.println( struct.toString() + "\n");
                                            break;

                                        // If the used wants to search by the Architect surname
                                        case 2:

                                            // Telling the user what they have chosen
                                            System.out.println("You have chosen to search using the surname of the Architect");

                                            /*
                                            Telling the user what to input
                                            the "input.nextLine" is so the program doesn't skip the line below it
                                            And creating a string variable that will store the user input to be used
                                            */
                                            System.out.print("Enter the Architect surname : ");
                                            input.nextLine();
                                            String sSurname = input.nextLine();

                                            // Creating a search query to look for the Architect surname
                                            results = statement.executeQuery("Select * from arch where surname = '" +
                                                    sSurname + "'");

                                            // The while loop go though result the match the query
                                            while (results.next()){

                                                // Storing the data that the query found in the following the data in variables
                                                archID = results.getInt("Arch_id");
                                                name = results.getString("f_name");
                                                surname = results.getString("surname");
                                                telNo = results.getString("Tele_No");
                                                email = results.getString("email");
                                                phyAddress = results.getString("phy_address");

                                            }

                                                /*
                                             Using the alternative setter method to set the found variable to
                                             the attribute in the arch
                                            */
                                            arch.setId(archID);
                                            arch.setName2(name);
                                            arch.setSurname2(surname);
                                            arch.setTelNo2(telNo);
                                            arch.setEmail2(email);
                                            arch.setPhyAddress2(phyAddress);

                                            // Using the toString method to display all of the input data
                                            System.out.println( struct.toString() + "\n");
                                            break;

                                        // If the used wants to search by the Architect id number
                                        case 3:

                                            // Telling the user what they have chosen
                                            System.out.println("You have chosen to search using the ID NUmber of the Architect");

                                            /*
                                            Telling the user what to input
                                            the "input.nextLine" is so the program doesn't skip the line below it
                                            And creating a string variable that will store the user input to be used
                                            */
                                            System.out.print("Enter the Architect ID number : ");
                                            input.nextLine();
                                            int sID = input.nextInt();

                                            // Creating a search query to look for the Structural Engineer surname
                                            results = statement.executeQuery("Select * from arch where Arch_id = " +
                                                    sID + "");

                                            // The while loop go though result the match the query
                                            while (results.next()){

                                                // Storing the data that the query found in the following the data in variables
                                                archID = results.getInt("Arch_ID");
                                                name = results.getString("f_name");
                                                surname = results.getString("surname");
                                                telNo = results.getString("Tele_No");
                                                email = results.getString("email");
                                                phyAddress = results.getString("phy_address");

                                            }

                                             /*
                                             Using the alternative setter method to set the found variable to
                                             the attribute in the arch
                                            */
                                            arch.setId(archID);
                                            arch.setName2(name);
                                            arch.setSurname2(surname);
                                            arch.setTelNo2(telNo);
                                            arch.setEmail2(email);
                                            arch.setPhyAddress2(phyAddress);

                                            // Using the toString method to display all of the input data
                                            System.out.println( arch.toString() + "\n");
                                            break;

                                    }
                                    // This break function is so the case end and does not continue to the next case
                                    break;

                                // This is so the user will be able to end the switch statement
                                case 0 :
                                    break;

                                // If the user inputs something that is not parts of the options this method will display
                                default:
                                    System.out.println("Option not found\n Please try again");
                            }

                            //if the variable archOp equals 0
                            if(archOp == 0){
                                // Display the following method and the while loop will break so the user can continue
                                System.out.println("You have chosen to continue.");
                                break;
                            }
                        }

                         /*
                        Telling the user that the information is found and received
                        And telling the user what is next
                       */
                        System.out.println("The customer's information have been received");
                        System.out.println("The Structural Engineer's information have been received");
                        System.out.println("The Project Manager's information have been received");
                        System.out.println("The Architect's information have been received");
                        System.out.println("Now you are able to input the details of the project: \n");

                        // creating a variable to store the last id number in the database
                        int id = 0;

                        // Creating a SQL query to go though all of the id stored in the table
                        results = statement.executeQuery("Select project_id from project");

                        // The while loop go though result the match the query
                        while (results.next()){
                            // the last query will be stored in the variable id
                            id = results.getInt("project_id");
                        }

                        // id will be increased by one
                        id++;

                        // Setting the new id number to the ID variable
                        projectID = id;

                        // Setting all of the id that were found or received as set to the attribute in the ProjectClass
                        projectInfo.setId(projectID);
                        projectInfo.setCustomerId(customerID);
                        projectInfo.setStructId(structID);
                        projectInfo.setProManId(proManID);
                        projectInfo.setArchId(archID);


                        // Telling the user what to input and using the setter method from the ProjectClass to get the
                        // user's inputs
                        System.out.print("If you don't have specific project name one will be generated\nEnter the project name: ");
                        projectInfo.setName();
                        System.out.print("Enter the type of building design: ");
                        projectInfo.setBuildType();
                        System.out.print("Enter the physical address: ");
                        projectInfo.setPhyAddress();
                        System.out.print("Enter the 21 digit ERF number: ");
                        projectInfo.setERF();
                        System.out.print("Enter the deadline date of the project: ");
                        projectInfo.setDateDeadLine();
                        System.out.print("Enter the total fee amount of the project: ");
                        projectInfo.setTotalFee();
                        System.out.print("Enter the date to fee amount: ");
                        projectInfo.setDateToFee();

                        // Telling the user that the input have been received
                        System.out.print("Thank you all of the information have been collected");

                        // Storing the values of the attribute in the variable created in this class
                        projectID = projectInfo.getId();
                        proName = projectInfo.getName();

                        /*
                        Checking the value of the string variable proName
                        if the variable equal nothing of has a dash in it

                        The name getter function from the DetailsClass will be called and the BuildType
                        getter function will also be called to use the alternative naming
                        setter function

                        Then the variable proName will be assigned with the new name
                       */
                        if (proName.equals(" ") | proName.isEmpty() | proName.equals("-")){
                            name = customerInfo.getName();
                            projectInfo.setName2(projectInfo.getBuildType(),surname);
                            proName = projectInfo.getName();
                        }

                        // Storing the values of the attribute in the variable created in this class
                        proBuild = projectInfo.getBuildType();
                        proPhyAddress = projectInfo.getPhyAddress();
                        ERF = projectInfo.getERF();
                        dateDeadLine = projectInfo.getDateDeadLine();
                        totalFee = projectInfo.getTotalFee();
                        dateToFee = projectInfo.getDateToFee();

                        /*
                        Calculating the outstanding balance for the totalFee and dateToFee variable to
                        see if the customer will still need an invoice due to there being an oustanding amount
                        left

                        And assign to a variable called outstandingBal
                        */
                        projectInfo.setOutstandingBal(totalFee,dateToFee);
                        outstandingBal = projectInfo.getOutstandingBal();

                        // Storing the id number that have been collected by the user on the top and storing them in the
                        // correct variable
                        customerID = projectInfo.getCustomerId();
                        structID =  projectInfo.getStructId();
                        proManID = projectInfo.getProManId();
                        archID =   projectInfo.getArchId();

                        // Telling the user that the information is collected
                        System.out.println("\nThe information have been collected");

                        // creating a SQL query that will insert all of the information collected in the above variables
                        rowsAffected = statement.executeUpdate("insert into project" +
                                " values(" + projectID +", '" + proName + "', '" + proBuild + "', '" + proPhyAddress + "', '" + ERF + "', '" + dateDeadLine + "',"+ totalFee +"," +
                                  outstandingBal + ", " + structID +"," +proManID + "," + archID + "," + customerID + ")"  );

                        // Telling the user the number of lines in the table affected
                        System.out.println("The action is complete\nThe number of rows affected : " + rowsAffected + "\n");


                         /*
                         Checking if the customer will need a invoice based on the calculating that is done
                         in the setter method outstandingBal
                        */
                        if(outstandingBal == 0 | outstandingBal < 0){
                            // if outstandingBal equals or is less than 0
                            // this message will display
                            System.out.println("The customer has paid in full no invoice needs to be generated.");
                        }
                        else{
                            // Else if the value is greater than 0
                            // The following message and the two classes toString functions will be called
                            System.out.println("The customers invoice: ");
                            System.out.println(projectInfo.toString());
                            System.out.println(customerInfo.toString());
                        }


                        // Telling the user that the information is stored and that they will go back to the menu
                        System.out.println("The information has been stored\nYou will return to the main menu");

                        // Calling the delay function
                        delay();

                        // This break function is so the case end and does not continue to the next case
                        break;

                    /*
                    this case is if the user wants to view all the projects and if they want to update any aspect of the
                    projects
                   */
                    case 2:

                        // Telling the user what option they have picked
                        System.out.println("You have chosen to view all of the projects\n");

                        // Creating a query to call of the items stored in the tables
                        results = statement.executeQuery("Select * from project");

                        // The while loop go though result the match the query
                        while (results.next()){
                            // Storing the data that the query found in the following the data in variables and displaying the data
                            System.out.println("The project id: " + results.getInt("project_id"));
                            System.out.println("The project name: " + results.getString("project_name"));
                            System.out.println("The type of project: " + results.getString("project_type"));
                            System.out.println("The physical address of the project: " + results.getString("project_address"));
                            System.out.println("The ERF number of the project: " + results.getString("ERF_No"));
                            System.out.println("The deadline of the project: " + results.getDate("Deadline"));
                            System.out.println("The total fee of the project: " + results.getFloat("Total_fee"));
                            System.out.println("The total amount of the project: " + results.getFloat("total_amount"));
                            System.out.println("The Structural Engineer's ID number: " + results.getInt("steng_id"));
                            System.out.println("The Project Manager's ID number: " + results.getInt("proman_id"));
                            System.out.println("The Architect's ID Number : " + results.getInt("arch_id"));
                            System.out.println("The Customer's ID number: " + results.getInt("customer_id"));
                            System.out.println("\n");
                        }

                        // This is so the program doesn't skip the input line below
                        input.nextLine();

                        //Telling the user what to do
                        System.out.println("Please answer with yes or no");
                        System.out.print("Would you like to update any of the projects: ");

                        // Storing the input for the user and change the input to lowercase
                        String strAns = input.nextLine();
                        strAns = strAns.toLowerCase();

                        // If the user's input is equal to "yes"
                        if (strAns.equals("yes")){

                            // This message will pop up telling the user what to do next
                            System.out.print("Which would you like to search by 1 (the number) or 2 (the name):  ");

                            // Storing the user's integer input for the if statement below
                            int searchOp  = input.nextInt();

                            // If the user inputs 1 and wants to search by number
                            if(searchOp == 1 ){

                                //This message will tell the user what option they have picked
                                System.out.println("You have chosen to search by the number of the project\n");

                                // Telling the user what they need to input
                                System.out.print("Enter the number of the project you would like to edit: ");

                                // Storing the user input in the variable
                                int numPro = input.nextInt();

                                // Creating a query to call of the items stored in the tables where the id numbers match
                                results = statement.executeQuery("Select * from project where project_id = " + numPro);


                                // The while loop go though result the match the query
                                while (results.next()){
                                    // Storing the data that the query found in the following the data in variables and displaying the data
                                    // and storing the information in variables
                                    System.out.println("The project id: " + results.getInt("project_id"));
                                    projectID = results.getInt("project_id");
                                    System.out.println("The project name: " + results.getString("project_name"));
                                    proName = results.getString("project_name");
                                    System.out.println("The type of project: " + results.getString("project_type"));
                                    proBuild = results.getString("project_type");
                                    System.out.println("The physical address of the project: " + results.getString("project_address"));
                                    proPhyAddress = results.getString("project_address");
                                    System.out.println("The ERF number of the project: " + results.getString("ERF_No"));
                                    ERF = results.getString("ERF_No");
                                    System.out.println("The deadline of the project: " + results.getDate("Deadline"));
                                    dateDeadLine = String.valueOf(results.getDate("Deadline"));
                                    System.out.println("The total fee of the project: " + results.getFloat("Total_fee"));
                                    dateToFee = results.getFloat("Total_fee");
                                    System.out.println("The total amount of the project: " + results.getFloat("total_amount"));
                                    totalFee = results.getFloat("total_amount");
                                    System.out.println("The Structural Engineer's ID number: " + results.getInt("steng_id"));
                                    structID = results.getInt("steng_id");
                                    System.out.println("The Project Manager's ID number: " + results.getInt("proman_id"));
                                    proManID = results.getInt("proman_id");
                                    System.out.println("The Architect's ID Number : " + results.getInt("arch_id"));
                                    archID = results.getInt("arch_id");
                                    System.out.println("The Customer's ID number: " + results.getInt("customer_id"));
                                    customerID = results.getInt("customer_id");
                                    System.out.println("\n");

                                }

                                // A while true loop to repeat going through the lines of code
                                // So the program will continue you running until the user want to end the program
                                while(true) {

                                    // Calling the menu method for the user
                                    projectUpMenu();

                                    // receiving the users input
                                    int option = input.nextInt();

                                    // Creating a switch statement that will call a case based on the user input and allow them to
                                    // do a task
                                    // the switch statement is used due to the number of option that can be called
                                    switch(option){

                                        // This case is for the user if they want to change the deadline of the selected project
                                        case 1:

                                            // Telling the user what option they have selected
                                            System.out.println("You have chosen to change the deadline date.");

                                            // Displaying the old deadline date to the user
                                            System.out.println("The current date saved: " + dateDeadLine);

                                            //Telling the user what they would need to input
                                            System.out.print("Enter what you would like to change the date to: \n");

                                            // Calling a method from the ProClass to check the date the user inputs
                                            projectInfo.setDateDeadLine();

                                            // Displaying what the user input for the new deadline date
                                            System.out.println("The new date you have entered is : " + projectInfo.getDateDeadLine());

                                            // Creating an update query that will change the date where the id numbers equals the record
                                            rowsAffected = statement.executeUpdate("Update project " +
                                                    "Set Deadline = " + projectInfo.getDateDeadLine() + " where project_id = " + numPro);

                                            // Telling the user the number of line affected
                                            System.out.println("The number of line affected : " + rowsAffected);

                                            // This break function is so the case end and does not continue to the next case
                                            break;


                                        // This case is for the user if the customer makes another payment and cause the project
                                        // to be finalized
                                        case 2 :

                                            // Telling the user what option they have selected
                                            System.out.println("You have chosen to assign a payment from a customer");

                                            // Telling the user what to input and storing the user's input in the string variable
                                            System.out.print("Enter the customer's name: ");
                                            String cusName = input.nextLine();

                                            // Telling the user what to input and storing the user's input in the string variable
                                            System.out.println("Enter the customer's surname : ");
                                            String cusSurname = input.nextLine();

                                            // Displaying the old balance of the project
                                            System.out.println("The current balance is " + totalFee);

                                            // Displaying the old balance of the project
                                            float balance = totalFee;

                                            // Telling the user what to input
                                            System.out.println("Enter the amount the customer has paid : ");

                                            // Calling a method from the ProClass to check the payment the user inputs
                                            projectInfo.setDateToFee();

                                            // Storing the input in a newly created variable for the outstanding balance
                                            // calculation
                                            float newPayment = projectInfo.getDateToFee();
                                            // Displaying the users input
                                            System.out.println("The amount the customer has paid is R" + newPayment);

                                            // Calling a method from the ProClass to do the outstanding balance calculation
                                            projectInfo.setOutstandingBal(balance,newPayment);

                                            // if the answer from the calculation is equal to 0
                                            if (projectInfo.getOutstandingBal() == 0){

                                                // Telling the user that the customer have fully paid
                                                System.out.println("The project is fully paid and the project can be set as finalized\n");

                                                // Creating an update query to change the total amount data
                                                rowsAffected = statement.executeUpdate("Update project " +
                                                        "Set total_amount = 0 where project_id = " + numPro);

                                                // telling the user the number of line affected
                                                System.out.println("The number of line affected : " + rowsAffected);

                                                // Creating an update query to change the finalise variable to true
                                                rowsAffected = statement.executeUpdate("Update project " +
                                                        "Set Finalise = true where project_id = " + numPro + " and total_amount = 0");

                                                // telling the user the number of line affected
                                                System.out.println("The number of line affected : " + rowsAffected);
                                            }
                                            else{
                                                // Else if the user has not fully paid
                                                // the project will display the balance left over
                                                System.out.println("The customer still owes: " + projectInfo.getOutstandingBal());

                                                // The project will create a new invoice for the customer
                                                System.out.println("The customer's new invoice: \n");

                                                // Creating an update query to change the total amount data
                                                rowsAffected = statement.executeUpdate("Update project " +
                                                        "Set total_amount =  "+ projectInfo.getOutstandingBal() + " where project_id = " + numPro);

                                                // telling the user the number of line affected
                                                System.out.println("The number of line affected : " + rowsAffected);

                                                // Creating a query to call of the items stored in the tables where the id numbers match
                                                results = statement.executeQuery("Select * from project where project_id = " + numPro);

                                                // The while loop go though result the match the query
                                                while (results.next()){
                                                    // Storing the data that the query found in the following the data in variables and displaying the data
                                                    System.out.println("The project id: " + results.getInt("project_id"));
                                                    System.out.println("The project name: " + results.getString("project_name"));
                                                    System.out.println("The type of project: " + results.getString("project_type"));
                                                    System.out.println("The physical address of the project: " + results.getString("project_address"));
                                                    System.out.println("The ERF number of the project: " + results.getString("ERF_No"));
                                                    System.out.println("The deadline of the project: " + results.getDate("Deadline"));
                                                    System.out.println("The total fee of the project: " + results.getFloat("Total_fee"));
                                                    System.out.println("The total amount of the project: " + results.getFloat("total_amount"));
                                                    System.out.println("The Structural Engineer's ID number: " + results.getInt("steng_id"));
                                                    System.out.println("The Project Manager's ID number: " + results.getInt("proman_id"));
                                                    System.out.println("The Architect's ID Number : " + results.getInt("arch_id"));
                                                    System.out.println("The Customer's ID number: " + results.getInt("customer_id"));
                                                    System.out.println("Finalise : "  + results.getBoolean("Finalise"));
                                                    System.out.println("\n");
                                                }

                                                // Creating a query to call of the items stored in the tables where the name and surname match
                                                results = statement.executeQuery("Select * from customer where f_name = '" + cusName + "' and surname = '"
                                                 + cusSurname + "'");

                                                // The while loop go though result the match the query
                                                while (results.next()){
                                                    // Storing the data that the query found in the following the data in variables and displaying the data
                                                    System.out.println("The Customer's ID number: "+results.getInt("Customer_id"));
                                                    System.out.println("The customer's first name: "+results.getString("f_name"));
                                                    System.out.println("The customer's surname: "+results.getString("surname"));
                                                    System.out.println("The customer's telephone number: "+results.getString("Tele_No"));
                                                    System.out.println("The customer's email address: "+results.getString("email"));
                                                    System.out.println("The customer's physical address: "+results.getString("phy_address"));
                                                    System.out.println("\n");
                                                }

                                            }
                                            // This break function is so the case end and does not continue to the next case
                                            break;

                                        // This is the case if the user wants to set the project as finalized
                                        case 3:
                                            // Telling the user what option they have selected
                                            System.out.println("You have chosen to finalised the project.");

                                            // Creating an update query to change the finalise variable to true
                                            rowsAffected = statement.executeUpdate("Update project " +
                                                    "Set Finalise = true where project_id = " + numPro);

                                            // telling the user the number of line affected
                                            System.out.println("The number of line affected : " + rowsAffected);

                                            // Telling the user that the update is done
                                            System.out.println("The project has been finalised");

                                            // This break function is so the case end and does not continue to the next case
                                            break;

                                        // This case is so the user can set that the project is complete and
                                        // check the inputted date
                                        case 4:

                                            // Telling the user what option they have selected
                                            System.out.println("You have chosen to set a project as completed\n");

                                            // Creating a Search query to get the finalise variable that matches the id number
                                            results = statement.executeQuery("Select Finalise from project where project_id = " + numPro);

                                            // Creating a boolean variable that will store the variable
                                            boolean finalise = false;

                                            // The while loop go though result the match the query
                                            while (results.next()){
                                                // Storing the data in the variable
                                                finalise = results.getBoolean("Finalise");
                                            }

                                            // if the variable equals true
                                            if(finalise == true){

                                                // Asking the user to input the completion date
                                                System.out.println("Enter the date of the projects completion: \n");

                                                // Checking if the date is correct
                                                projectInfo.setCompleted();

                                                // using an update query to change the completion date and the complete to true
                                                rowsAffected = statement.executeUpdate("Update project " +
                                                        "Set Completion_Date = " + projectInfo.getCompleted() + " and " +
                                                        "Complete = true where project_id = " + numPro);

                                                // Telling the user the number of lines affected
                                                System.out.println("The number of line affected : " + rowsAffected);

                                            }else{
                                                // if finalise is still false
                                                // this message will be displayed
                                                System.out.println("The project needs to be finalised first to be set to completed");
                                            }
                                            // This break function is so the case end and does not continue to the next case
                                            break;


                                        // When the user wants to continue to another function
                                        case 0:
                                            break;

                                        // If the user inputs something that is not one of the above cases
                                        default:
                                            System.out.println("The option selected was not found.");
                                    }

                                    //if the variable option equals 0
                                    if(option == 0){
                                        // Display the following method and the while loop will break so the user can continue
                                        System.out.println("You have chosen to continue.");
                                        break;
                                    }
                                }

                            }

                            // if the user want to search for the project by the name and inputs 2
                            else if (searchOp == 2){

                                //This message will tell the user what option they have picked
                                System.out.println("You have chosen to search by the name of the project\n");

                                // Telling the user what they need to input
                                System.out.print("Enter the project name : ");

                                // Storing the user input in the variable
                                String idName = input.nextLine();

                                // Creating a query to call of the items stored in the tables where the name match
                                results = statement.executeQuery("Select * from project where project_name = " + idName);

                                // The while loop go though result the match the query
                                while (results.next()){
                                    // Storing the data that the query found in the following the data in variables and displaying the data
                                    // and storing the information in variables
                                    System.out.println("The project id: " + results.getInt("project_id"));
                                    projectID = results.getInt("project_id");
                                    System.out.println("The project name: " + results.getString("project_name"));
                                    proName = results.getString("project_name");
                                    System.out.println("The type of project: " + results.getString("project_type"));
                                    proBuild = results.getString("project_type");
                                    System.out.println("The physical address of the project: " + results.getString("project_address"));
                                    proPhyAddress = results.getString("project_address");
                                    System.out.println("The ERF number of the project: " + results.getString("ERF_No"));
                                    ERF = results.getString("ERF_No");
                                    System.out.println("The deadline of the project: " + results.getDate("Deadline"));
                                    dateDeadLine = String.valueOf(results.getDate("Deadline"));
                                    System.out.println("The total fee of the project: " + results.getFloat("Total_fee"));
                                    dateToFee = results.getFloat("Total_fee");
                                    System.out.println("The total amount of the project: " + results.getFloat("total_amount"));
                                    totalFee = results.getFloat("total_amount");
                                    System.out.println("The Structural Engineer's ID number: " + results.getInt("steng_id"));
                                    structID = results.getInt("steng_id");
                                    System.out.println("The Project Manager's ID number: " + results.getInt("proman_id"));
                                    proManID = results.getInt("proman_id");
                                    System.out.println("The Architect's ID Number : " + results.getInt("arch_id"));
                                    archID = results.getInt("arch_id");
                                    System.out.println("The Customer's ID number: " + results.getInt("customer_id"));
                                    customerID = results.getInt("customer_id");
                                    System.out.println("\n");

                                }


                                // A while true loop to repeat going through the lines of code
                                // So the program will continue you running until the user want to end the program
                                while(true) {

                                    // Calling the menu method for the user
                                    projectUpMenu();

                                    // receiving the users input
                                    int option = input.nextInt();

                                    // Creating a switch statement that will call a case based on the user input and allow them to
                                    // do a task
                                    // the switch statement is used due to the number of option that can be called
                                    switch(option){

                                        // This case is for the user if they want to change the deadline of the selected project
                                        case 1:

                                            // Telling the user what option they have selected
                                            System.out.println("You have chosen to change the deadline date.");

                                            // Displaying the old deadline date to the user
                                            System.out.println("The current date saved: " + dateDeadLine);

                                            //Telling the user what they would need to input
                                            System.out.print("Enter what you would like to change the date to: \n");

                                            // Calling a method from the ProClass to check the date the user inputs
                                            projectInfo.setDateDeadLine();

                                            // Displaying what the user input for the new deadline date
                                            System.out.println("The new date you have entered is : " + projectInfo.getDateDeadLine());

                                            // Creating an update query that will change the date where the name equals the record
                                            rowsAffected = statement.executeUpdate("Update project " +
                                                    "Set Deadline = " + projectInfo.getDateDeadLine() + " where project_name = " + idName);

                                            // Telling the user the number of line affected
                                            System.out.println("The number of line affected : " + rowsAffected);

                                            // This break function is so the case end and does not continue to the next case
                                            break;


                                        // This case is for the user if the customer makes another payment and cause the project
                                        // to be finalized
                                        case 2 :

                                            // Telling the user what option they have selected
                                            System.out.println("You have chosen to assign a payment from a customer");

                                            // Telling the user what to input and storing the user's input in the string variable
                                            System.out.print("Enter the customer's name: ");
                                            String cusName = input.nextLine();

                                            // Telling the user what to input and storing the user's input in the string variable
                                            System.out.println("Enter the customer's surname : ");
                                            String cusSurname = input.nextLine();

                                            // Displaying the old balance of the project
                                            System.out.println("The current balance is " + totalFee);

                                            // Displaying the old balance of the project
                                            float balance = totalFee;

                                            // Telling the user what to input
                                            System.out.println("Enter the amount the customer has paid : ");

                                            // Calling a method from the ProClass to check the payment the user inputs
                                            projectInfo.setDateToFee();

                                            // Storing the input in a newly created variable for the outstanding balance
                                            // calculation
                                            float newPayment = projectInfo.getDateToFee();
                                            // Displaying the users input
                                            System.out.println("The amount the customer has paid is R" + newPayment);

                                            // Calling a method from the ProClass to do the outstanding balance calculation
                                            projectInfo.setOutstandingBal(balance,newPayment);

                                            // if the answer from the calculation is equal to 0
                                            if (projectInfo.getOutstandingBal() == 0){

                                                // Telling the user that the customer have fully paid
                                                System.out.println("The project is fully paid and the project can be set as finalized\n");

                                                // Creating an update query to change the total amount data
                                                rowsAffected = statement.executeUpdate("Update project " +
                                                        "Set total_amount = 0 where project_name = " + idName);

                                                // telling the user the number of line affected
                                                System.out.println("The number of line affected : " + rowsAffected);

                                                // Creating an update query to change the finalise variable to true
                                                rowsAffected = statement.executeUpdate("Update project " +
                                                        "Set Finalise = true where project_name = " + idName + " and total_amount = 0");
                                                // telling the user the number of line affected
                                                System.out.println("The number of line affected : " + rowsAffected);
                                            }
                                            else{
                                                // Else if the user has not fully paid
                                                // the project will display the balance left over
                                                System.out.println("The customer still owes: " + projectInfo.getOutstandingBal());

                                                // The project will create a new invoice for the customer
                                                System.out.println("The customer's new invoice: \n");

                                                // Creating an update query to change the total amount data
                                                rowsAffected = statement.executeUpdate("Update project " +
                                                        "Set total_amount =  "+ projectInfo.getOutstandingBal() + " where project_name = " + idName);

                                                // telling the user the number of line affected
                                                System.out.println("The number of line affected : " + rowsAffected);

                                                // Creating a query to call of the items stored in the tables where the name match
                                                results = statement.executeQuery("Select * from project where project_name = " + idName);

                                                // The while loop go though result the match the query
                                                while (results.next()){
                                                    // Storing the data that the query found in the following the data in variables and displaying the data
                                                    System.out.println("The project id: " + results.getInt("project_id"));
                                                    System.out.println("The project name: " + results.getString("project_name"));
                                                    System.out.println("The type of project: " + results.getString("project_type"));
                                                    System.out.println("The physical address of the project: " + results.getString("project_address"));
                                                    System.out.println("The ERF number of the project: " + results.getString("ERF_No"));
                                                    System.out.println("The deadline of the project: " + results.getDate("Deadline"));
                                                    System.out.println("The total fee of the project: " + results.getFloat("Total_fee"));
                                                    System.out.println("The total amount of the project: " + results.getFloat("total_amount"));
                                                    System.out.println("The Structural Engineer's ID number: " + results.getInt("steng_id"));
                                                    System.out.println("The Project Manager's ID number: " + results.getInt("proman_id"));
                                                    System.out.println("The Architect's ID Number : " + results.getInt("arch_id"));
                                                    System.out.println("The Customer's ID number: " + results.getInt("customer_id"));
                                                    System.out.println("Finalise : "  + results.getBoolean("Finalise"));
                                                    System.out.println("\n");
                                                }

                                                // Creating a query to call of the items stored in the tables where the name and surname match
                                                results = statement.executeQuery("Select * from customer where f_name = '" + cusName + "' and surname = '"
                                                        + cusSurname + "'");

                                                // The while loop go though result the match the query
                                                while (results.next()){
                                                    // Storing the data that the query found in the following the data in variables and displaying the data
                                                    System.out.println("The Customer's ID number: "+results.getInt("Customer_id"));
                                                    System.out.println("The customer's first name: "+results.getString("f_name"));
                                                    System.out.println("The customer's surname: "+results.getString("surname"));
                                                    System.out.println("The customer's telephone number: "+results.getString("Tele_No"));
                                                    System.out.println("The customer's email address: "+results.getString("email"));
                                                    System.out.println("The customer's physical address: "+results.getString("phy_address"));
                                                    System.out.println("\n");
                                                }

                                            }
                                            // This break function is so the case end and does not continue to the next case
                                            break;

                                        // This is the case if the user wants to set the project as finalized
                                        case 3:
                                            // Telling the user what option they have selected
                                            System.out.println("You have chosen to finalised the project.");

                                            // Creating an update query to change the finalise variable to true
                                            rowsAffected = statement.executeUpdate("Update project " +
                                                    "Set Finalise = true where project_name = " + idName);

                                            // telling the user the number of line affected
                                            System.out.println("The number of line affected : " + rowsAffected);

                                            // Telling the user that the update is done
                                            System.out.println("The project has been finalised");

                                            // This break function is so the case end and does not continue to the next case
                                            break;

                                        // This case is so the user can set that the project is complete and
                                        // check the inputted date
                                        case 4:
                                            // Telling the user what option they have selected
                                            System.out.println("You have chosen to set a project as completed\n");

                                            // Creating a Search query to get the finalise variable that matches the name
                                            results = statement.executeQuery("Select Finalise from project where project_name = " + idName);

                                            // Creating a boolean variable that will store the variable
                                            boolean finalise = false;

                                            // The while loop go though result the match the query
                                            while (results.next()){
                                                // Storing the data in the variable
                                                finalise = results.getBoolean("Finalise");
                                            }

                                            // if the variable equals true
                                            if(finalise == true){

                                                // Asking the user to input the completion date
                                                System.out.println("Enter the date of the projects completion: \n");

                                                // Checking if the date is correct
                                                projectInfo.setCompleted();

                                                // using an update query to change the completion date and the complete to true
                                                rowsAffected = statement.executeUpdate("Update project " +
                                                        "Set Completion_Date = " + projectInfo.getCompleted() + " and " +
                                                        "Complete = true where project_name = " + idName);

                                                // Telling the user the number of lines affected
                                                System.out.println("The number of line affected : " + rowsAffected);

                                            }else{
                                                // if finalise is still false
                                                // this message will be displayed
                                                System.out.println("The project needs to be finalised first to be set to completed");
                                            }
                                            // This break function is so the case end and does not continue to the next case
                                            break;


                                        // When the user wants to continue to another function
                                        case 0:
                                            break;

                                        // If the user inputs something that is not one of the above cases
                                        default:
                                            System.out.println("The option selected was not found.");
                                    }

                                    //if the variable option equals 0
                                    if(option == 0){
                                        // Display the following method and the while loop will break so the user can continue
                                        System.out.println("You have chosen to continue.");
                                        break;
                                    }
                                }

                            }
                        }
                        else{
                            // if the user inputs the wrong input
                            System.out.println("You will go back to the main menu");
                        }

                        // This break function is so the case end and does not continue to the next case
                        break;

                    // This case is if the user wants to view all of the complete tasks
                    case 3:

                        // Telling the user want they have selected
                        System.out.println("You have chosen to view all of the completed projects.");

                        // using a select function that will show of the records that has a complete data as true
                        results = statement.executeQuery("Select * from project where complete = true");

                        // The while loop go though result the match the query
                        while (results.next()){
                            // Storing the data that the query found in the following the data in variables and displaying the data
                            System.out.println("The project id: " + results.getInt("project_id"));
                            System.out.println("The project name: " + results.getString("project_name"));
                            System.out.println("The type of project: " + results.getString("project_type"));
                            System.out.println("The physical address of the project: " + results.getString("project_address"));
                            System.out.println("The ERF number of the project: " + results.getString("ERF_No"));
                            System.out.println("The deadline of the project: " + results.getDate("Deadline"));
                            System.out.println("The total fee of the project: " + results.getFloat("Total_fee"));
                            System.out.println("The total amount of the project: " + results.getFloat("total_amount"));
                            System.out.println("The Structural Engineer's ID number: " + results.getInt("steng_id"));
                            System.out.println("The Project Manager's ID number: " + results.getInt("proman_id"));
                            System.out.println("The Architect's ID Number : " + results.getInt("arch_id"));
                            System.out.println("The Customer's ID number: " + results.getInt("customer_id"));
                            System.out.println("Finalise : "  + results.getBoolean("Finalise"));
                            System.out.println("Completion Date : " + results.getDate("Completion_Date"));
                            System.out.println("Complete: " + results.getBoolean("Complete"));
                            System.out.println("\n");

                            delay();
                        }

                        // This break function is so the case end and does not continue to the next case
                        break;

                    // This case is if the user wants to view all of the customer details or add or update information
                    case 4:

                        // Telling the user want they have selected
                        System.out.println("You have chosen the customer's information option.\n");

                       /*
                        A while true loop to repeat going through the lines of code
                        So the program will continue you running until the user want to end the program
                       */
                        while(true){

                            // Calling the menu method
                            customerUpMenu();

                            // Telling the user what to input
                            // And storing the input in a new created integer variable
                            System.out.print("Enter the option number: ");
                            int option4in = input.nextInt();

                            // Creating a switch statement that will call a case based on the user input and allow them to
                            // do a task
                            // the switch statement is used due to the number of option that can be called
                            switch (option4in) {

                                // This case is if the user wants to view all of the customer details in a user-friendly manner
                                case 1:

                                    // Telling the user what option they have chosen
                                    System.out.println("You have chosen to view all of the customers.");

                                    // A select SQL query that will select all of the record in the table
                                    results = statement.executeQuery("Select * from customer");

                                    // The while loop go though result the match the query
                                    while (results.next()){
                                        // Storing the data that the query found in the following the data in variables and displaying the data
                                        System.out.println("The Customer's ID number: "+results.getInt("Customer_id"));
                                        System.out.println("The customer's first name: "+results.getString("f_name"));
                                        System.out.println("The customer's surname: "+results.getString("surname"));
                                        System.out.println("The customer's telephone number: "+results.getString("Tele_No"));
                                        System.out.println("The customer's email address: "+results.getString("email"));
                                        System.out.println("The customer's physical address: "+results.getString("phy_address"));
                                        System.out.println("\n");
                                    }

                                    // Telling the user what to do next
                                    System.out.println("If you wish to change a Customer's information\n Search for the customers full name in option 2.");

                                    // This break function is so the case end and does not continue to the next case
                                    break;

                                // This case is if the user wants to edit the information of the searched for customer
                                case 2:

                                    // Telling the user what option they have chosen
                                    System.out.println("You have chosen to search for a customer details");

                                    // this is so the program doesn't skip the line below it
                                    input.nextLine();

                                    // Telling the user what to do
                                    // And storing the input in a String variable
                                    System.out.print("Enter the customer first name : ");
                                    String f_name = input.nextLine();

                                    // Telling the user what to do
                                    // And storing the input in a String variable
                                    System.out.println("Enter the customer surname: ");
                                    String s_Surname = input.nextLine();

                                    // Select query that will match the name and surname to a record
                                    results = statement.executeQuery("Select * from customer where f_name = '"+ f_name +"' and " +
                                            "surname = '" + s_Surname+ "'");

                                    // The while loop go though result the match the query
                                    while (results.next()){
                                        // Storing the data that the query found in the following the data in variables and displaying the data
                                        System.out.println("The Customer's ID number: "+results.getInt("Customer_id"));
                                        System.out.println("The customer's first name: "+results.getString("f_name"));
                                        System.out.println("The customer's surname: "+results.getString("surname"));
                                        System.out.println("The customer's telephone number: "+results.getString("Tele_No"));
                                        System.out.println("The customer's email address: "+results.getString("email"));
                                        System.out.println("The customer's physical address: "+results.getString("phy_address"));
                                        System.out.println("\n");
                                    }

                                    // Telling the user what to input
                                    System.out.println("Please answer Yes or no");

                                    // Asking the user for input
                                    System.out.print("Would you like to update " + f_name +" "+ s_Surname + " information: ");

                                    // Storing the input and changing it to lowercase
                                    String ans = input.nextLine();
                                    ans = ans.toLowerCase();

                                    // If the user inputs "yes"
                                    if(ans.equals("yes")){

                                        /*
                                            Asking the user for input and telling them what to input
                                        */
                                        System.out.println("Enter the correct information for the following details.");
                                        System.out.print("The new telephone number: ");
                                        customerInfo.setTelNo();
                                        System.out.print("The new email address: ");
                                        customerInfo.setEmail();
                                        System.out.print("The new physical address: ");
                                        customerInfo.setPhyAddress();

                                        // Display the newly input information to the user
                                        System.out.println("The information changed : \n");
                                        System.out.println("The telephone number : " + customerInfo.getTelNo());
                                        System.out.println("The email address : " + customerInfo.getEmail());
                                        System.out.println("The physical address : " + customerInfo.getPhyAddress());

                                        // using an update SQL query to change the old information to the new information
                                        rowsAffected = statement.executeUpdate("Update customer Set Tele_No = '" + customerInfo.getTelNo() + "'"
                                                + ",  email = '" + customerInfo.getEmail() + "' , phy_address = '" + customerInfo.getPhyAddress() +
                                                "' where f_name = '" + f_name + "' and surname = '" +s_Surname+"'");

                                        //Telling the user the number of the line affected
                                        System.out.println("The number of rows affected : " + rowsAffected);

                                    }else{
                                        // if the answer is no
                                        // the following message will be displayed
                                        System.out.println("Enter 0 if you wish to go back to the main menu\n");
                                    }

                                    // This break function is so the case end and does not continue to the next case
                                    break;

                                // This case is if the user wants to add a new customer
                                case 3:

                                    // creating a variable to store the last id number in the database
                                    id = 0;

                                    // Creating a SQL query to go though all of the id stored in the table
                                    results = statement.executeQuery("Select Customer_id from customer");

                                    // The while loop go though result the match the query
                                    while (results.next()){
                                        // the last query will be stored in the variable id
                                        id = results.getInt("Customer_id");
                                    }

                                    // id will be increased by one
                                    id++;

                                    // Displaying to the user what option they have picked and what they will need to do
                                    System.out.println("You have chosen to create a new customer profile");
                                    System.out.println("Fill in all the information");

                                    /*
                                    Telling the user what they will need to input
                                    And calling the setter methods from the DetailsClass to get the inputs for the user
                                    And checking if the inputs are correct
                                    */
                                    customerInfo.setId(id);
                                    System.out.print("Enter the Customer's  Name: ");
                                    customerInfo.setName();
                                    System.out.print("Enter the Customer's Surname: ");
                                    customerInfo.setSurname();
                                    System.out.print("Enter the Customer's Telephone Number: ");
                                    customerInfo.setTelNo();
                                    System.out.print("Enter the Customer's Email Address: ");
                                    customerInfo.setEmail();
                                    System.out.print("Enter the Customer's Physical Address: ");
                                    customerInfo.setPhyAddress();

                                    /*
                                    Using the getter method to store the values of the attributes from the DetailsClass
                                    This variable declared in this class
                                     */
                                    customerID = customerInfo.getId();
                                    name = customerInfo.getName();
                                    surname = customerInfo.getSurname();
                                    telNo = customerInfo.getTelNo();
                                    email = customerInfo.getEmail();
                                    phyAddress = customerInfo.getPhyAddress();

                                    // Using an SQl insert query to add the new information into the table
                                    rowsAffected = statement.executeUpdate("insert into customer" +
                                            " values(" + customerID +", '" + name + "', '" + surname + "', '" + telNo + "', '" + email + "', '" + phyAddress + "')" );

                                    //Telling the user the number of the line affected
                                    System.out.println("The action is complete\nThe number of rows affected : " + rowsAffected + "\n");

                                    // telling the user that the information is saved and what they need to do next
                                    System.out.println("The information have been saved");
                                    System.out.println("Enter 0 if you wish to go back to the main menu\n");

                                    // This break function is so the case end and does not continue to the next case
                                    break;

                                // if the user wants to end the program
                                case 0:
                                    break;

                                //This is if the user input something that is not seen as an option
                                default:

                                    // Displaying messages to the user
                                    System.out.println("The option you have input is incorrect");
                                    System.out.println("Please try again\n");
                            }

                            //if the variable option4in equals 0
                            if (option4in == 0) {

                                // Display the following method and the while loop will break so the user can continue
                                System.out.println("You will go back to the main menu.");
                                break;
                            }
                        }

                        // This break function is so the case end and does not continue to the next case
                        break;

                    // This case is if the user wants to view all of the architect details or add or update information
                    case 5:

                        // Telling the user want they have selected
                        System.out.println("You have chosen the architect's information option.\n");

                         /*
                        A while true loop to repeat going through the lines of code
                        So the program will continue you running until the user want to end the program
                        */
                        while(true){

                            // Calling the menu method
                            architectUpMenu();

                            // Telling the user what to input
                            // And storing the input in a new created integer variable
                            System.out.print("Enter the option number: ");
                            int option5in = input.nextInt();

                            // Creating a switch statement that will call a case based on the user input and allow them to
                            // do a task
                            // the switch statement is used due to the number of option that can be called
                            switch (option5in){

                                // This case is if the user wants to view all of the architect details in a user-friendly manner
                                case 1:

                                    // Telling the user what option they have chosen
                                    System.out.println("You have chosen to view all of the architects.");

                                    // A select SQL query that will select all of the record in the table
                                    results = statement.executeQuery("Select * from arch");

                                    // The while loop go though result the match the query
                                    while (results.next()){
                                        // Storing the data that the query found in the following the data in variables and displaying the data
                                        System.out.println("The architect's ID number: "+results.getInt("Arch_id"));
                                        System.out.println("The architect's first name: "+results.getString("f_name"));
                                        System.out.println("The architect's surname: "+results.getString("surname"));
                                        System.out.println("The architect's telephone number: "+results.getString("Tele_No"));
                                        System.out.println("The architect's email address: "+results.getString("email"));
                                        System.out.println("The architect's physical address: "+results.getString("phy_address"));
                                        System.out.println("\n");
                                    }

                                    // Telling the user what to do next
                                    System.out.println("If you wish to change a architect's information\n Search for the architects full name in option 2.");

                                    // This break function is so the case end and does not continue to the next case
                                    break;

                                // This case is if the user wants to edit the information of the searched for architect
                                case 2:

                                    // Telling the user what option they have chosen
                                    System.out.println("You have chosen to search for a architect details");

                                    // this is so the program doesn't skip the line below it
                                    input.nextLine();

                                    // Telling the user what to do
                                    // And storing the input in a String variable
                                    System.out.print("Enter the architect first name : ");
                                    String f_name = input.nextLine();

                                    // Telling the user what to do
                                    // And storing the input in a String variable
                                    System.out.println("Enter the architect surname: ");
                                    String s_Surname = input.nextLine();

                                    // Select query that will match the name and surname to a record
                                    results = statement.executeQuery("Select * from arch where f_name = '"+ f_name +"' and " +
                                            "surname = '" + s_Surname+ "'");

                                    // The while loop go though result the match the query
                                    while (results.next()){
                                        // Storing the data that the query found in the following the data in variables and displaying the data
                                        System.out.println("The architect's ID number: "+results.getInt("Arch_id"));
                                        System.out.println("The architect's first name: "+results.getString("f_name"));
                                        System.out.println("The architect's surname: "+results.getString("surname"));
                                        System.out.println("The architect's telephone number: "+results.getString("Tele_No"));
                                        System.out.println("The architect's email address: "+results.getString("email"));
                                        System.out.println("The architect's physical address: "+results.getString("phy_address"));
                                        System.out.println("\n");
                                    }

                                    // Telling the user what to input
                                    System.out.println("Please answer Yes or no");

                                    // Asking the user for input
                                    System.out.print("Would you like to update " + f_name +" "+ s_Surname + " information: ");

                                    // Storing the input and changing it to lowercase
                                    String ans = input.nextLine();
                                    ans = ans.toLowerCase();

                                    // If the user inputs "yes"
                                    if(ans.equals("yes")){
                                        /*
                                            Asking the user for input and telling them what to input
                                        */
                                        System.out.println("Enter the correct information for the following details.");
                                        System.out.print("The new telephone number: ");
                                        arch.setTelNo();
                                        System.out.print("The new email address: ");
                                        arch.setEmail();
                                        System.out.print("The new physical address: ");
                                        arch.setPhyAddress();

                                        // Display the newly input information to the user
                                        System.out.println("The information changed : \n");
                                        System.out.println("The telephone number : " + arch.getTelNo());
                                        System.out.println("The email address : " + arch.getEmail());
                                        System.out.println("The physical address : " + arch.getPhyAddress());

                                        // using an update SQL query to change the old information to the new information
                                        rowsAffected = statement.executeUpdate("Update arch Set Tele_No = '" + arch.getTelNo() + "'"
                                                + ",  email = '" + arch.getEmail() + "' , phy_address = '" + arch.getEmail() +
                                                "' where f_name = '" + f_name + "' and surname = '" +s_Surname+"'");

                                        //Telling the user the number of the line affected
                                        System.out.println("The number of rows affected : " + rowsAffected);

                                    }else{
                                        // if the answer is no
                                        // the following message will be displayed
                                        System.out.println("Enter 0 if you wish to go back to the main menu\n");
                                    }

                                    // This break function is so the case end and does not continue to the next case
                                    break;

                                // This case is if the user wants to add a new architect
                                case 3:
                                    // creating a variable to store the last id number in the database
                                    id = 0;

                                    // Creating a SQL query to go though all of the id stored in the table
                                    results = statement.executeQuery("Select Arch_id from arch");

                                    // The while loop go though result the match the query
                                    while (results.next()){
                                        // the last query will be stored in the variable id
                                        id = results.getInt("Arch_id");
                                    }

                                    // id will be increased by one
                                    id++;

                                    // Displaying to the user what option they have picked and what they will need to do
                                    System.out.println("You have chosen to create a new architect profile");
                                    System.out.println("Fill in all the information");

                                   /*
                                    Telling the user what they will need to input
                                    And calling the setter methods from the DetailsClass to get the inputs for the user
                                    And checking if the inputs are correct
                                    */
                                    arch.setId(id);
                                    System.out.print("Enter the architect's  Name: ");
                                    arch.setName();
                                    System.out.print("Enter the architect's Surname: ");
                                    arch.setSurname();
                                    System.out.print("Enter the architect's Telephone Number: ");
                                    arch.setTelNo();
                                    System.out.print("Enter the architect's Email Address: ");
                                    arch.setEmail();
                                    System.out.print("Enter the architect's Physical Address: ");
                                    arch.setPhyAddress();

                                     /*
                                    Using the getter method to store the values of the attributes from the DetailsClass
                                    This variable declared in this class
                                     */
                                    archID = arch.getId();
                                    name = arch.getName();
                                    surname = arch.getSurname();
                                    telNo = arch.getTelNo();
                                    email = arch.getEmail();
                                    phyAddress = arch.getPhyAddress();

                                    // Using an SQl insert query to add the new information into the table
                                    rowsAffected = statement.executeUpdate("insert into arch" +
                                            " values(" + archID +", '" + name + "', '" + surname + "', '" + telNo + "', '" + email + "', '" + phyAddress + "')" );

                                    //Telling the user the number of the line affected
                                    System.out.println("The action is complete\nThe number of rows affected : " + rowsAffected + "\n");

                                    // telling the user that the information is saved and what they need to do next
                                    System.out.println("The information have been saved");
                                    System.out.println("Enter 0 if you wish to go back to the main menu\n");

                                    // This break function is so the case end and does not continue to the next case
                                    break;

                                // if the user wants to end the program
                                case 0:
                                    break;

                                //This is if the user input something that is not seen as an option
                                default:

                                    // Displaying messages to the user
                                    System.out.println("The option you have input is incorrect");
                                    System.out.println("Please try again\n");
                            }

                            //if the variable option5in equals 0
                            if (option5in == 0) {

                                // Display the following method and the while loop will break so the user can continue
                                System.out.println("You will go back to the main menu.");
                                break;
                            }
                        }

                        // This break function is so the case end and does not continue to the next case
                        break;

                    // This case is if the user wants to view all of the Project Manager details or add or update information
                    case 6:

                        // Telling the user want they have selected
                        System.out.println("You have chosen the Project Manager's information option.\n");

                          /*
                        A while true loop to repeat going through the lines of code
                        So the program will continue you running until the user want to end the program
                        */
                        while(true){
                            // Calling the menu method
                            proManagerUpMenu();

                            // Telling the user what to input
                            // And storing the input in a new created integer variable
                            System.out.print("Enter the option number: ");
                            int option6in = input.nextInt();

                            // Creating a switch statement that will call a case based on the user input and allow them to
                            // do a task
                            // the switch statement is used due to the number of option that can be called
                            switch (option6in){

                                // This case is if the user wants to view all of the Project Manager details in a user-friendly manner
                                case 1:
                                    // Telling the user what option they have chosen
                                    System.out.println("You have chosen to view all of the Project Managers.");

                                    // A select SQL query that will select all of the record in the table
                                    results = statement.executeQuery("Select * from promanager");

                                    // The while loop go though result the match the query
                                    while (results.next()){
                                        // Storing the data that the query found in the following the data in variables and displaying the data
                                        System.out.println("The Project Manager's ID number: "+results.getInt("ProMan_id"));
                                        System.out.println("The Project Manager's first name: "+results.getString("f_name"));
                                        System.out.println("The Project Manager's surname: "+results.getString("surname"));
                                        System.out.println("The Project Manager's telephone number: "+results.getString("Tele_No"));
                                        System.out.println("The Project Manager's email address: "+results.getString("email"));
                                        System.out.println("The Project Manager's physical address: "+results.getString("phy_address"));
                                        System.out.println("\n");
                                    }

                                    // Telling the user what to do next
                                    System.out.println("If you wish to change a  Project Managers's information\n Search for the  Project Managers full name in option 2.");

                                    // This break function is so the case end and does not continue to the next case
                                    break;

                                // This case is if the user wants to edit the information of the searched for customer
                                case 2:
                                    // Telling the user what option they have chosen
                                    System.out.println("You have chosen to search for a Project Manager details");

                                    // this is so the program doesn't skip the line below it
                                    input.nextLine();

                                    // Telling the user what to do
                                    // And storing the input in a String variable
                                    System.out.print("Enter the Project Manager first name : ");
                                    String f_name = input.nextLine();

                                    // Telling the user what to do
                                    // And storing the input in a String variable
                                    System.out.println("Enter the Project Manager surname: ");
                                    String s_Surname = input.nextLine();

                                    // Select query that will match the name and surname to a record
                                    results = statement.executeQuery("Select * from promanager where f_name = '"+ f_name +"' and " +
                                            "surname = '" + s_Surname+ "'");


                                    // The while loop go though result the match the query
                                    while (results.next()){
                                        // Storing the data that the query found in the following the data in variables and displaying the data
                                        System.out.println("The Project Manager's ID number: "+results.getInt("ProMan_id"));
                                        System.out.println("The Project Manager's first name: "+results.getString("f_name"));
                                        System.out.println("The Project Manager's surname: "+results.getString("surname"));
                                        System.out.println("The Project Manager's telephone number: "+results.getString("Tele_No"));
                                        System.out.println("The Project Manager's email address: "+results.getString("email"));
                                        System.out.println("The Project Manager's physical address: "+results.getString("phy_address"));
                                        System.out.println("\n");
                                    }

                                    // Telling the user what to input
                                    System.out.println("Please answer Yes or no");

                                    // Asking the user for input
                                    System.out.print("Would you like to update " + f_name +" "+ s_Surname + " information: ");

                                    // Storing the input and changing it to lowercase
                                    String ans = input.nextLine();
                                    ans = ans.toLowerCase();

                                    // If the user inputs "yes"
                                    if(ans.equals("yes")){

                                         /*
                                            Asking the user for input and telling them what to input
                                        */
                                        System.out.println("Enter the correct information for the following details.");
                                        System.out.print("The new telephone number: ");
                                        proManager.setTelNo();
                                        System.out.print("The new email address: ");
                                        proManager.setEmail();
                                        System.out.print("The new physical address: ");
                                        proManager.setPhyAddress();

                                        // Display the newly input information to the user
                                        System.out.println("The information changed : \n");
                                        System.out.println("The telephone number : " + proManager.getTelNo());
                                        System.out.println("The email address : " + proManager.getEmail());
                                        System.out.println("The physical address : " + proManager.getPhyAddress());

                                        // using an update SQL query to change the old information to the new information
                                        rowsAffected = statement.executeUpdate("Update promanager Set Tele_No = '" + proManager.getTelNo() + "'"
                                                + ",  email = '" + proManager.getEmail() + "' , phy_address = '" + proManager.getEmail() +
                                                "' where f_name = '" + f_name + "' and surname = '" +s_Surname+"'");

                                        //Telling the user the number of the line affected
                                        System.out.println("The number of rows affected : " + rowsAffected);

                                    }else{
                                        // if the answer is no
                                        // the following message will be displayed
                                        System.out.println("Enter 0 if you wish to go back to the main menu\n");
                                    }

                                    // This break function is so the case end and does not continue to the next case
                                    break;

                                // This case is if the user wants to add a new customer to the text file
                                case 3:

                                    // creating a variable to store the last id number in the database
                                    id = 0;

                                    // Creating a SQL query to go though all of the id stored in the table
                                    results = statement.executeQuery("Select ProMan_id from promanager");

                                    // The while loop go though result the match the query
                                    while (results.next()){
                                        // the last query will be stored in the variable id
                                        id = results.getInt("ProMan_id");
                                    }

                                    // id will be increased by one
                                    id++;

                                    // Displaying to the user what option they have picked and what they will need to do
                                    System.out.println("You have chosen to create a new Project Manager profile");
                                    System.out.println("Fill in all the information");

                                      /*
                                    Telling the user what they will need to input
                                    And calling the setter methods from the DetailsClass to get the inputs for the user
                                    And checking if the inputs are correct
                                    */
                                    proManager.setId(id);
                                    System.out.print("Enter the Project Manager's  Name: ");
                                    proManager.setName();
                                    System.out.print("Enter the Project Manager's Surname: ");
                                    proManager.setSurname();
                                    System.out.print("Enter the Project Manager's Telephone Number: ");
                                    proManager.setTelNo();
                                    System.out.print("Enter the Project Manager's Email Address: ");
                                    proManager.setEmail();
                                    System.out.print("Enter the Project Manager's Physical Address: ");
                                    proManager.setPhyAddress();

                                       /*
                                    Using the getter method to store the values of the attributes from the DetailsClass
                                    This variable declared in this class
                                     */
                                    proManID = proManager.getId();
                                    name = proManager.getName();
                                    surname = proManager.getSurname();
                                    telNo = proManager.getTelNo();
                                    email = proManager.getEmail();
                                    phyAddress = proManager.getPhyAddress();

                                    // Using an SQl insert query to add the new information into the table
                                    rowsAffected = statement.executeUpdate("insert into promanager" +
                                            " values(" + proManID +", '" + name + "', '" + surname + "', '" + telNo + "', '" + email + "', '" + phyAddress + "')" );

                                    //Telling the user the number of the line affected
                                    System.out.println("The action is complete\nThe number of rows affected : " + rowsAffected + "\n");

                                    // telling the user that the information is saved and what they need to do next
                                    System.out.println("The information have been saved");
                                    System.out.println("Enter 0 if you wish to go back to the main menu\n");

                                    // This break function is so the case end and does not continue to the next case
                                    break;

                                // if the user wants to end the program
                                case 0:
                                    break;

                                //This is if the user input something that is not seen as an option
                                default:

                                    // Displaying messages to the user
                                    System.out.println("The option you have input is incorrect");
                                    System.out.println("Please try again\n");
                            }

                            //if the variable option6in equals 0
                            if (option6in == 0) {

                                // Display the following method and the while loop will break so the user can continue
                                System.out.println("You will go back to the main menu.");
                                break;
                            }
                        }

                        // This break function is so the case end and does not continue to the next case
                        break;

                    // This case is if the user wants to view all of the Structural Engineer details or add or update information
                    case 7:
                        System.out.println("You have chosen the Structural Engineer's information option.\n");

                        /*
                        A while true loop to repeat going through the lines of code
                        So the program will continue you running until the user want to end the program
                        */
                        while(true){
                            // Calling the menu method
                            structEngineerUpMenu();

                            // Telling the user what to input
                            // And storing the input in a new created integer variable
                            System.out.print("Enter the option number: ");
                            int option7in = input.nextInt();

                            // Creating a switch statement that will call a case based on the user input and allow them to
                            // do a task
                            // the switch statement is used due to the number of option that can be called
                            switch (option7in) {

                                // This case is if the user wants to view all of the customer details in a user-friendly manner
                                case 1:

                                    // Telling the user what option they have chosen
                                    System.out.println("You have chosen to view all of the customers.");

                                    // A select SQL query that will select all of the record in the table
                                    results = statement.executeQuery("Select * from structeng");

                                    // The while loop go though result the match the query
                                    while (results.next()){
                                        // Storing the data that the query found in the following the data in variables and displaying the data
                                        System.out.println("The Structural Engineer's ID number: "+results.getInt("StEng_id"));
                                        System.out.println("The Structural Engineer's first name: "+results.getString("f_name"));
                                        System.out.println("The Structural Engineer's surname: "+results.getString("surname"));
                                        System.out.println("The Structural Engineer's telephone number: "+results.getString("Tele_No"));
                                        System.out.println("The Structural Engineer's email address: "+results.getString("email"));
                                        System.out.println("The Structural Engineer's physical address: "+results.getString("phy_address"));
                                        System.out.println("\n");
                                    }

                                    // Telling the user what to do next
                                    System.out.println("If you wish to change a Structural Engineer's information\n Search for the Structural Engineers full name in option 2.");

                                    // This break function is so the case end and does not continue to the next case
                                    break;

                                // This case is if the user wants to edit the information of the searched for Structural Engineer
                                case 2:
                                    // Telling the user what option they have chosen
                                    System.out.println("You have chosen to search for a Structural Engineer details");

                                    // this is so the program doesn't skip the line below it
                                    input.nextLine();

                                    // Telling the user what to do
                                    // And storing the input in a String variable
                                    System.out.print("Enter the Structural Engineer first name : ");
                                    String f_name = input.nextLine();

                                    // Telling the user what to do
                                    // And storing the input in a String variable
                                    System.out.println("Enter the Structural Engineer surname: ");
                                    String s_Surname = input.nextLine();

                                    // Select query that will match the name and surname to a record
                                    results = statement.executeQuery("Select * from structeng where f_name = '"+ f_name +"' and " +
                                            "surname = '" + s_Surname+ "'");


                                    // The while loop go though result the match the query
                                    while (results.next()){
                                        // Storing the data that the query found in the following the data in variables and displaying the data
                                        System.out.println("The Structural Engineer's ID number: "+results.getInt("StEng_id"));
                                        System.out.println("The Structural Engineer's first name: "+results.getString("f_name"));
                                        System.out.println("The Structural Engineer's surname: "+results.getString("surname"));
                                        System.out.println("The Structural Engineer's telephone number: "+results.getString("Tele_No"));
                                        System.out.println("The Structural Engineer's email address: "+results.getString("email"));
                                        System.out.println("The Structural Engineer's physical address: "+results.getString("phy_address"));
                                        System.out.println("\n");
                                    }

                                    // Telling the user what to input
                                    System.out.println("Please answer Yes or no");

                                    // Asking the user for input
                                    System.out.print("Would you like to update " + f_name +" "+ s_Surname + " information: ");

                                    // Storing the input and changing it to lowercase
                                    String ans = input.nextLine();
                                    ans = ans.toLowerCase();

                                    // If the user inputs "yes"
                                    if(ans.equals("yes")){

                                        /*
                                            Asking the user for input and telling them what to input
                                        */
                                        System.out.println("Enter the correct information for the following details.");
                                        System.out.print("The new telephone number: ");
                                        struct.setTelNo();
                                        System.out.print("The new email address: ");
                                        struct.setEmail();
                                        System.out.print("The new physical address: ");
                                        struct.setPhyAddress();

                                        // Display the newly input information to the user
                                        System.out.println("The information changed : \n");
                                        System.out.println("The telephone number : " + struct.getTelNo());
                                        System.out.println("The email address : " + struct.getEmail());
                                        System.out.println("The physical address : " + struct.getPhyAddress());

                                        // using an update SQL query to change the oild information to the new information
                                        rowsAffected = statement.executeUpdate("Update structeng Set Tele_No = '" + struct.getTelNo() + "'"
                                                + ",  email = '" + struct.getEmail() + "' , phy_address = '" + struct.getEmail() +
                                                "' where f_name = '" + f_name + "' and surname = '" +s_Surname+"'");


                                        //Telling the user the number of the line affected
                                        System.out.println("The number of rows affected : " + rowsAffected);

                                    }else{
                                        // if the answer is no
                                        // the following message will be displayed
                                        System.out.println("Enter 0 if you wish to go back to the main menu\n");
                                    }

                                    // This break function is so the case end and does not continue to the next case
                                    break;

                                // This case is if the user wants to add a new Structural Engineer
                                case 3:
                                    // creating a variable to store the last id number in the database
                                    id = 0;

                                    // Creating a SQL query to go though all of the id stored in the table
                                    results = statement.executeQuery("Select StEng_id from structeng");

                                    // The while loop go though result the match the query
                                    while (results.next()){
                                        // the last query will be stored in the variable id
                                        id = results.getInt("StEng_id");
                                    }

                                    // id will be increased by one
                                    id++;

                                    // Displaying to the user what option they have picked and what they will need to do
                                    System.out.println("You have chosen to create a new Structural Engineer profile");
                                    System.out.println("Fill in all the information");

                                    /*
                                    Telling the user what they will need to input
                                    And calling the setter methods from the DetailsClass to get the inputs for the user
                                    And checking if the inputs are correct
                                    */
                                    struct.setId(id);
                                    System.out.print("Enter the Structural Engineer's  Name: ");
                                    struct.setName();
                                    System.out.print("Enter the Structural Engineer's Surname: ");
                                    struct.setSurname();
                                    System.out.print("Enter the Structural Engineer's Telephone Number: ");
                                    struct.setTelNo();
                                    System.out.print("Enter the Structural Engineer's Email Address: ");
                                    struct.setEmail();
                                    System.out.print("Enter the Structural Engineer's Physical Address: ");
                                    struct.setPhyAddress();

                                    /*
                                    Using the getter method to store the values of the attributes from the DetailsClass
                                    This variable declared in this class
                                     */
                                    structID = struct.getId();
                                    name = struct.getName();
                                    surname = struct.getSurname();
                                    telNo = struct.getTelNo();
                                    email = struct.getEmail();
                                    phyAddress = struct.getPhyAddress();

                                    // Using an SQl insert query to add the new information into the table
                                    rowsAffected = statement.executeUpdate("insert into structeng" +
                                            " values(" + structID +", '" + name + "', '" + surname + "', '" + telNo + "', '" + email + "', '" + phyAddress + "')" );

                                    //Telling the user the number of the line affected
                                    System.out.println("The action is complete\nThe number of rows affected : " + rowsAffected + "\n");

                                    // telling the user that the information is saved and what they need to do next
                                    System.out.println("The information have been saved");
                                    System.out.println("Enter 0 if you wish to go back to the main menu\n");

                                    // This break function is so the case end and does not continue to the next case
                                    break;

                                // if the user wants to end the program
                                case 0:
                                    break;

                                //This is if the user input something that is not seen as an option
                                default:

                                    // Displaying messages to the user
                                    System.out.println("The option you have input is incorrect");
                                    System.out.println("Please try again\n");
                            }

                            //if the variable option7in equals 0
                            if (option7in == 0) {

                                // Display the following method and the while loop will break so the user can continue
                                System.out.println("You will go back to the main menu.");
                                break;
                            }
                        }

                        // This break function is so the case end and does not continue to the next case
                        break;

                    // this case will display all the projects that are past due
                    case 8:

                        // telling the user what they have chosen
                        System.out.println("View all of the past due projects");

                        // If there is a valid input then the program will continue
                        // Creating a SimpleDateFormat object
                        // This is used to set a date pattern for the input
                        SimpleDateFormat dtf = new SimpleDateFormat("yyyy-MM-dd");

                        // Giving the current date to be compare to the project set date
                        Date now = new Date();

                        // Setting the date to the dft pattern set above
                        String current = dtf.format(now);

                        // Select Query that will display all of the past due records
                        results = statement.executeQuery("Select * from project where Deadline < '" + current + "'");

                        // The while loop go though result the match the query
                        while (results.next()){
                            // Storing the data that the query found in the following the data in variables and displaying the data
                            System.out.println("The project id: " + results.getInt("project_id"));
                            System.out.println("The project name: " + results.getString("project_name"));
                            System.out.println("The type of project: " + results.getString("project_type"));
                            System.out.println("The physical address of the project: " + results.getString("project_address"));
                            System.out.println("The ERF number of the project: " + results.getString("ERF_No"));
                            System.out.println("The deadline of the project: " + results.getDate("Deadline"));
                            System.out.println("The total fee of the project: " + results.getFloat("Total_fee"));
                            System.out.println("The total amount of the project: " + results.getFloat("total_amount"));
                            System.out.println("The Structural Engineer's ID number: " + results.getInt("steng_id"));
                            System.out.println("The Project Manager's ID number: " + results.getInt("proman_id"));
                            System.out.println("The Architect's ID Number : " + results.getInt("arch_id"));
                            System.out.println("The Customer's ID number: " + results.getInt("customer_id"));
                            System.out.println("Finalise : "  + results.getBoolean("Finalise"));
                            System.out.println("Completion Date : " + results.getDate("Completion_Date"));
                            System.out.println("Complete: " + results.getBoolean("Complete"));
                            System.out.println("\n");

                            delay();
                        }

                        // This break function is so the case end and does not continue to the next case
                        break;

                    //This is if the user input something that is not seen as an option
                    default:

                        // Displaying messages to the user
                        System.out.println("Option not found");
                        System.out.println("Please try again\nYou will go back to the main menu");
                        break;
                }

                /*
                if the user inputs 0
                following message will display and the program will end
               */
                if (noInput == 0){
                    // The program will end
                    break;
                }
            }


        }
         /*
           This is the catch part of the try catch statement
           if any of these errors are found the program will display the follows messages
           And what error was found
         */
        catch (SQLException e){
            System.out.println("There has been an error with the input of the input of the username and password");
            System.out.println("Please try again");

        }
        catch (ParseException e){
            System.out.println("An error has been found with the input of the date for the project");
            System.out.println("Please try again");

        }
    }
}

