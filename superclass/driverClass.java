package superclass;

import java.util.Scanner;

public class driverClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Choose one");
        System.out.println("1. Student\n2 Teacher ");
        String pilihan = input.nextLine();

        if (pilihan.equals("1")) {
            System.out.println("Student Details");
            System.out.println("Name");
            String name = input.nextLine();
            System.out.println("Major");
            String Major = input.nextLine();
            System.out.println("Age");
            int Age = input.nextInt();
            System.out.println("Student Number");
            int StudentNumber = input.nextInt();
            System.out.println("Score");
            int Score = input.nextInt();
            Student student = new Student(name, Age, Major, StudentNumber, Score);
            student.print();
        } else if (pilihan.equals("2")) {
            System.out.println("choose one");
            System.out.println("1. parttime\n2. fulltime");
            String pilihan2 = input.nextLine();

            if (pilihan2.equals("1")) {
                System.out.println("Parttime Details");
                System.out.println("Name");
                String name = input.nextLine();

                System.out.println("Subject");
                String subject = input.nextLine();

                System.out.println("Age");
                int Age = input.nextInt();

                System.out.println("Hours Worked");
                int HoursWorked = input.nextInt();

                System.out.println("Salary");
                int Salary = input.nextInt();
                
                PartTime parttime = new PartTime(name, Age, subject, HoursWorked, Salary );
                parttime.print();
        }

        else if (pilihan2.equals("2")) {
            System.out.println("Fulltime Details");
            System.out.println("Name");
            String name = input.nextLine();

            System.out.println("Subject");
            String subject = input.nextLine();

            
            System.out.println("Unit");
            String Unit = input.nextLine();

            System.out.println("Age");
            int Age = input.nextInt();


            System.out.println("Anual salary");
            int Anualsalary = input.nextInt();

            FullTime fulltime = new FullTime(name, Age, subject, Unit, Anualsalary);
            fulltime.print();
    }
    }
}
}
