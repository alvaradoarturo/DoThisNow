import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        printGreeting();
        scan.nextLine();
        scan.close();

    }

    public static void printGreeting() {
        System.out.println("Welcome back! What would you like to do today? Choose one of the options below:\n" + //
                "\n" + //
                "1. Review Today's Tasks - Check your current to-do list.\n" + //
                "2. Add a New Task - Quickly add something new to your agenda.\n" + //
                "3. Prioritize Tasks - Organize and mark your top priorities.\n" + //
                "4. Track Progress - See how much you’ve accomplished so far.\n" + //
                "5. Set Goals for the Week - Plan ahead and set your weekly objectives.\n" + //
                "6. Get a Time Report - View a breakdown of time spent on tasks.\n" + //
                "7. Analytics - Check out your task completion stats.\n" + //
                "8. Settings - Adjust app preferences.");
    }
}
