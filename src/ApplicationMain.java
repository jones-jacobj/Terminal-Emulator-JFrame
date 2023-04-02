import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.util.Scanner;

public class ApplicationMain implements KeyListener{
    protected boolean running = true;
    protected Screen currentScreen;

    public ApplicationMain(){
        ScreensDatabase database = new ScreensDatabase();
//        JFRAME SETUP
        JFrame frame1 = new JFrame("mainWindow");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);

//        JPANEL SETUP
        JPanel panel1 = new mainWindow().rootPanel;
        frame1.setContentPane(panel1);

//        JTEXTAREA SETUP
        JTextArea textArea1 = (JTextArea) panel1.getComponent(0);
        textArea1.addKeyListener(this);
        Font font = new Font("VT232 Regular", Font.BOLD, 20);
        textArea1.setEditable(false);
        textArea1.setForeground(Color.GREEN);
        textArea1.setBackground(Color.BLACK);
        textArea1.setFont(font);

        frame1.pack();
        this.currentScreen = database.screen1;

        while (running) {
            textArea1.setText(currentScreen.render());
        }

//        When the program quits (i.e. running == false) send the close signal to the JFrame
        frame1.dispatchEvent(new WindowEvent(frame1, WindowEvent.WINDOW_CLOSING));
    }

    public static void main(String[] args) {
        new ApplicationMain();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        char choice = e.getKeyChar();
        switch (choice){
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
                System.out.println(this.currentScreen);
                int intChoice = Integer.parseInt(String.valueOf(choice));
                try{
                    if (this.currentScreen.getSpecificOption(intChoice).getDestination() != null) {
                        this.currentScreen = this.currentScreen.getSpecificOption(intChoice).getDestination();
                    }
                } catch (NullPointerException npe){
                    npe.printStackTrace();
                }
                break;
            case 'q':
                System.out.println("Goodbye!");
                running = false;
        }
        }
    @Override
    public void keyReleased(KeyEvent e) {
    }
}