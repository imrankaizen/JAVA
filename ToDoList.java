import java.util.Scanner;

public class ToDoList 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== TO DO LIST ===\n");
        int choice;
        do
        {
            System.out.println("Press 0 to Quit");
            System.out.println("Press 1 to CREATE-LIST");
            System.out.println("Press 2 to READ-LIST");
            System.out.println("Press 3 to UPDATE-LIST");
            System.out.println("Press 4 to DELETE-LIST");
            System.out.println("Press 5 to MARKS TASK AS DONE\n");
            
            System.out.print("ENTER YOUR CHOICE: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 0: break;
                case 1: createList(); break;  
                case 2: readList(); break;
                case 3: updateList(); break;
                case 4: deleteList(); break;
                case 5: markTaskAsDone(); break;
                default: System.out.println("INVALID INPUT!, Choose again:-");
            }
        }while(choice !=0);
        System.out.println("--Program Executed Successfully--");
        sc.close();
    }

    public static void createList(){ System.out.println("Create List"); }
    public static void readList(){ System.out.println("Read List"); }
    public static void updateList(){ System.out.println("Update List"); }
    public static void deleteList(){ System.out.println("Delete List"); }
    public static void markTaskAsDone(){ System.out.println("Mark List"); }
}