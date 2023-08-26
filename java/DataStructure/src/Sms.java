import java.util.LinkedList;
import java.util.Scanner;

public class Sms {
    LinkedList<Employee> employeeLinkedList;       //used because  we want to store our records in Linked-list

    Scanner scanner;         //create object of employee and scanner class globally
    Employee employee;

    Sms() {    //create constructors

        //create object of employee and scanner class
        employeeLinkedList = new LinkedList<Employee>();
        scanner=new Scanner(System.in);
    }

    public void sms() {    //create method of sms
        int choice;   //variable

        while (true) {  //create infinite because we want to run our program continuously. don't needs to run every entry
          //  System.out.println(" 1: Add record\n 2: Display record\n 3. Find created record\n 4. Modify record\n 5. Delete record\n 6. Delete all records\n 0. Exit");

            System.out.println("Enter your choice : ");
            choice = scanner.nextInt(); //storing choice data from user

            switch (choice) {
                case 1:  //add record
                        System.out.println("enter name and salary of employee");
                        employee=new Employee(scanner.next(),scanner.nextInt());        //we write this type of data lik3e .next()=string type, nextInt()=int type salary
                        employeeLinkedList.add(employee);          //add employee data in the linked list
                        break;
                case 2:  //display record
                        for (Employee e:employeeLinkedList      //create for each loop in that loop create object of employee class and in that object store linked list data because all employee data stored in linked list object
                         ) {
                        System.out.println(e.getName() + ", " + e.getSalary());
                        }
                        break;
                case 3:  //find record
                    System.out.println("Enter the number which records you want");
                    int n=scanner.nextInt();
                    System.out.println(employeeLinkedList.get(n));

                case 4:   //modify
                    System.out.println("Enter the number which records you want modify ");
                    int rn=scanner.nextInt();
                    System.out.print("Enter name and marks ");
                    employeeLinkedList.set(rn,new Employee(scanner.next(),scanner.nextInt()));
                    break;

                case 5:  //delete record
                        employeeLinkedList.remove(1);
                    System.out.println(employeeLinkedList);
                        break;
                case 6:  //delete all
                    employeeLinkedList.clear();
                    System.out.println(employeeLinkedList);
                    break;

                 case 0:
                            return;
            }
        }
    }
}


