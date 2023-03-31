import java.util.Scanner;

public class ApplicationMain {

    public ApplicationMain(){
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("What would you like to do?");
            String choice = input.next();

            switch (choice){
                case "help":
                    System.out.println("You're in the help menu!");
                    break;
                case "q":
                case "quit":
                case "Q":
                    System.out.println("Goodybe");
                    running = false;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new ApplicationMain();
    }
}