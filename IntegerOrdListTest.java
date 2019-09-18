import java.util.InputMismatchException;
import java.util.Scanner;

public class IntegerOrdListTest {

    public static void testIntegerOrdList(){
        int choice = 0;
        Scanner input = new Scanner(System.in);
        IntegerOrdList myList = new IntegerOrdList();

        while (choice != 4) {

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

            int newData;
            switch (choice) {
                case 1:
                    System.out.println("Please insert an integer");
                    newData = input.nextInt();
                    boolean notExists = myList.insert(newData);
                    if(notExists){
                        System.out.println("Number " + newData + " not in list. Successfully added.");
                    }
                    else{
                        System.out.println("Number " + newData + " already in list");
                    }
                    break;

                case 2:
                    System.out.println("Please insert an integer");
                    newData = input.nextInt();
                    ListNode result = myList.remove(newData);
                    if(result == null){
                        System.out.println("Number not found. None removed.");
                    }
                    else{
                        System.out.println("Number " + newData + " has been removed.");
                    }
                    break;
                case 3:
                    System.out.println(myList.toString());
                    break;
                case 4:
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
        System.out.println("1. Add a number");
        System.out.println("2. Remove a number");
        System.out.println("3. Print the list");
        System.out.println("4. Exit");
        System.out.println();
    }
}