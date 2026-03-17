
package main;

import java.util.Scanner;

import dao.StudentDAO;
import model.Student;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {

            System.out.println("\nCOLLEGE EVENT REGISTRATION");
            System.out.println("1 Register Student");
            System.out.println("2 View Registrations");
            System.out.println("3 Delete Registration");
            System.out.println("4 Exit");

            System.out.print("Enter Choice: ");
            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter Name: ");
                    String name = sc.next();

                    System.out.print("Enter Event: ");
                    String event = sc.next();

                    Student s = new Student(id, name, event);
                    dao.registerStudent(s);
                    break;

                case 2:
                    dao.viewRegistrations();
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    int did = sc.nextInt();
                    dao.deleteRegistration(did);
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}
