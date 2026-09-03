import java.util.Scanner;
import java.util.ArrayList;

class Task {
    int id;
    String title;
    boolean status;
}

public class ToDoList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<Task>();
        System.out.println("=== TO DO LIST ===\n");
        int choice;
        do {
            System.out.println("\nPress 0 to Quit");
            System.out.println("Press 1 to CREATE-LIST");
            System.out.println("Press 2 to READ-LIST");
            System.out.println("Press 3 to UPDATE-LIST");
            System.out.println("Press 4 to DELETE-LIST");
            System.out.println("Press 5 to MARKS TASK AS DONE\n");

            System.out.print("ENTER YOUR CHOICE: ");
            choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                case 0:
                    break;
                case 1:
                    createList(sc, tasks);
                    break;
                case 2:
                    readList(tasks);
                    break;
                case 3:
                    updateList(sc, tasks);
                    break;
                case 4:
                    deleteList(sc, tasks);
                    break;
                case 5:
                    markTaskAsDone(sc, tasks);
                    break;
                default:
                    System.out.println("INVALID INPUT!, Choose again:-");
            }
        } while (choice != 0);
        System.out.println("--Program Executed Successfully--");
        sc.close();
    }

    public static void createList(Scanner sc, ArrayList<Task> tasks) {
        Task task = new Task();
        task.id = tasks.size() + 1;
        sc.nextLine();
        System.out.print("Enter Your Task: ");
        task.title = sc.nextLine();
        task.status = false;
        tasks.add(task);
        System.out.println(tasks.size() + " Task Added Successfully !\n");
    }

    public static void readList(ArrayList<Task> tasks) {
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            System.out.println("\n--------------");
            System.out.println("ID: " + task.id);
            System.out.println("TASK: " + task.title);
            System.out.println("Status: " + task.status);
            System.out.println("--------------");
        }
    }

    public static void updateList(Scanner sc, ArrayList<Task> tasks) {
        System.out.print("\nEnter Id to Update List: ");
        int id = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            if (task.id == id) {
                sc.nextLine();
                System.out.print("Enter New Title: ");
                task.title = sc.nextLine();
                found = true;
                break;
            }
        }
        if (found == true) {
            System.out.println("\nUpdation of List Successful");
        } else {
            System.out.println("\nList Not Found !");
        }
    }

    public static void deleteList(Scanner sc, ArrayList<Task> tasks) {
        System.out.print("\nEnter Id to Delete List: ");
        int id = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            if (task.id == id) {
                tasks.remove(i);
                found = true;
                break;
            }
        }
        if (found == true) {
            System.out.println("\nDeletion of List Successful");
        } else {
            System.out.println("\nList Not Found !");
        }
    }

    public static void markTaskAsDone(Scanner sc, ArrayList<Task> tasks) {
        System.out.print("\nEnter Id to Update List Status: ");
        int ch, id = sc.nextInt();
        boolean found = false;
        boolean updated = false;
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            if (task.id == id) {
                found = true;
                System.out.println("\n\nEnter 1 to Set as true");
                System.out.println("Enter 2 to Set as false");
                ch = sc.nextInt();
                if (ch == 1) {
                    updated = true;
                    task.status = true;
                } else if (ch == 2) {
                    updated = true;
                    task.status = false;
                } else {
                    updated = false;
                    System.out.println("\nInvalid Status Input, Try Again !\n");
                }
                break;
            }
        }
        if (found == false) {
            System.out.println("\nList Status Not Changed !");
        } else if (updated == true) {
            System.out.println("\nList Status Changed Successful");
        } else {
            System.out.println("\nList Found But Status Doesn't Changed! ");
        }

    }
}