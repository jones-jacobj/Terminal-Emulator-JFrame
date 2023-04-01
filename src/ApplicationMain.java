import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ApplicationMain {

    public ApplicationMain(){
        JFrame frame1 = new JFrame("mainWindow");
        JPanel panel1 = new mainWindow().rootPanel;
        JTextArea textArea1 = (JTextArea) panel1.getComponent(0);

        frame1.setContentPane(panel1);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.pack();
        frame1.setVisible(true);
        Scanner input = new Scanner(System.in);
        boolean running = true;
        Screen welcomeScreen = new Screen(new String[]{"Assets", "eMail", "Databases"});
        Screen currentScreen = welcomeScreen;

        while (running) {
            textArea1.setText(currentScreen.render());
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
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                    if (!currentScreen.getSpecificOption(Integer.parseInt(choice)).isEmpty()){
                        System.out.println(currentScreen.getSpecificOption(Integer.parseInt(choice)));
                    }
            }
        }
    }

    public static void main(String[] args) {
        new ApplicationMain();
    }
}