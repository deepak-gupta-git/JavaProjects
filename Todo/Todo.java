import java.util.*;

class Todo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        int opt;

        do {
            System.out.println("Welcome To Do App");

            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");

            // String task;

            System.out.print("Please Enter Your Choice : ");
            opt = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (opt) {
                case 1:
                    System.out.print("Please Add Your Task : ");
                    String task = sc.nextLine();

                    tasks.add(task);
                    System.out.println("Your Task Added Successfully!");
                    break;

                case 2:
                    System.out.println("Your task : ");
                    if (tasks.isEmpty()) {
                        System.out.println("No Tasks Yet!");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                            // System.out.println(tasks.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter The Task Number to delete : ");
                    int index = sc.nextInt();

                    if (index > 0 && index < tasks.size()) {
                        tasks.remove(index - 1);
                        System.out.println("Task Deleted Successfully!");
                    } else {
                        System.out.println("Invalid Tasks");
                    }
                    break;

                case 4:
                    System.out.println("Bye!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
                    break;
            }

        } while (opt != 4);

    }
}