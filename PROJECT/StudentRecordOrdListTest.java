import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentRecordOrdListTest {

    public static void testStudentRecordList(){
        int choice = -1;
        Scanner input = new Scanner(System.in);
        StudentRecordOrdList myList = new StudentRecordOrdList();

        while (choice != 0) {

            while (true) {
                try {
                    printOptions();
                    choice = input.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.printf("Exception: %s\n", e);
                    System.out.printf("Enter only valid number!!!");
                    input.nextLine();
                }

            }

            String surname;
            String first_name;
            int id;
            StudentRecord newStudent;
            ListNode result;
            int grade;
            switch (choice) {
                case 1:
                    System.out.println("Please insert surname");

                    surname = input.nextLine();
                    surname = input.nextLine();
                    System.out.println("Please insert first name");
                    first_name = input.nextLine();
                    System.out.println("Please insert student id");
                    id = input.nextInt();

                    newStudent = new StudentRecord(surname,first_name,id);

                    boolean notExists = myList.insert(newStudent);

                    if(notExists){
                        System.out.println("Student " + newStudent.toString() + " not in list. Successfully added.");
                    }
                    else{
                        System.out.println("Student " + newStudent.toString() + " already in list");
                    }
                    break;

                case 2:
                    System.out.println("Please insert surname");

                    surname = input.nextLine();
                    surname = input.nextLine();
                    System.out.println("Please insert first name");
                    first_name = input.nextLine();

                    newStudent = new StudentRecord(surname,first_name,-1);

                    result = myList.remove(newStudent);

                    if(result == null){
                        System.out.println("Student not found. None removed.");
                    }
                    else{
                        System.out.println("Student " + newStudent.getName() + " has been removed.");
                    }
                    break;
                case 3:
                    System.out.println("Please insert surname");

                    surname = input.nextLine();
                    surname = input.nextLine();
                    System.out.println("Please insert first name");
                    first_name = input.nextLine();

                    newStudent = new StudentRecord(surname,first_name,-1);

                    result = myList.find(newStudent);

                    if(result == null){
                        System.out.println("Student not found.");
                    }
                    else{
                        System.out.println("Student " + newStudent.getName() + " found. Insert grade:");
                        grade = input.nextInt();
                        ((StudentRecord) result.getData()).averageMark = grade;
                    }
                    break;
                case 4:
                    System.out.println("Please insert surname");

                    surname = input.nextLine();
                    surname = input.nextLine();
                    System.out.println("Please insert first name");
                    first_name = input.nextLine();

                    newStudent = new StudentRecord(surname,first_name,-1);

                    result = myList.find(newStudent);

                    if(result == null){
                        System.out.println("Student not found.");
                    }
                    else{
                        System.out.println("Student Found.");
                        System.out.println(result.getData().toString());
                    }
                    break;
                case 5:
                    System.out.println(myList.toString());
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Not a valid option. Try again.");
                    break;

            }
            System.out.println("");
        }
    }

    private static void printOptions(){
        System.out.println("Choose an option:");
        System.out.println("1. Add a Student");
        System.out.println("2. Remove a Student");
        System.out.println("3. Add Average Mark");
        System.out.println("4. Find Student Record");
        System.out.println("5. Print the list");
        System.out.println("0. Exit");
        System.out.println();
    }

}
