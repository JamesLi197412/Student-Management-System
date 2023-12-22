package studentDatabaseApp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 10000;

    // Constructor: prompt user to enter student's name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter Student last name: ");
        this.lastName = in.nextLine();

        System.out.println("Enter student class level:");
        this.gradeYear = in.nextInt();

        setStudentID();
    }
    // Generate an ID
    private void setStudentID(){
        // Grade level + ID
        id ++;
        this.studentID = gradeYear + " " + id;
    }

    // enroll in courset's name and year
    public void enroll(){
        // Get inside a loop, user hits 0
        System.out.println("Enter course to enroll (0 to quit): ");
        Scanner in = new Scanner(System.in);
        String course = in.nextLine();
        if (course == "Q") {
            courses = courses + '\n' + course;
            tuitionBalance = tuitionBalance + costOfCourse;
        }
        System.out.println("Tuition Balance: " + tuitionBalance);


    }


    // View course balance
    public void viewBalance(){
        System.out.println("Your Balance is : $" + tuitionBalance);
    }

    // Pay Tuition
    public void tuitionPayment(int payment){
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $ " + payment );
        viewBalance();

    }
    // Show status
    public void showInfo(){
        System.out.println("Name :" + firstName + " " + lastName);
    }


}
