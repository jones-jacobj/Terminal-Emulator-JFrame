import javax.swing.*;
import javax.swing.text.Position;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ApplicationMain implements KeyListener{
    private boolean running = true;
    private Screen currentScreen;
    private final ScreensDatabase database;
    private String windowName;
    private String font;
    private int fontSize;
    private Color foregroundColor;
    private Color backgroundColor;

    /**
     * TODO: Make more colors
     * @param input String value of desired color i.e. "green"
     * @return A Color object to be used in JFrame
     */
    protected Color stringToColor(String input){
        input = input.toLowerCase();
        return switch (input) {
            case "black" -> Color.BLACK;
            case "blue" -> Color.BLUE;
            case "gray" -> Color.GRAY;
            case "green" -> Color.GREEN;
            case "orange" -> Color.orange;
            case "pink" -> Color.pink;
            case "red" -> Color.red;
            case "yellow" -> Color.yellow;
            case "white" -> Color.white;
            default -> null;
        };
    }

    public ApplicationMain(){
        // Reads from Setttings.txt, converts user entries into Variables -> to be used later on in the program
        try {
            // Setting file currently has to be in a very specific format
            BufferedReader reader = new BufferedReader(new FileReader("src/settings.txt"));
            this.windowName = reader.readLine().split("= ")[1];
            this.font = reader.readLine().split("= ")[1];
            this.fontSize = Integer.parseInt(reader.readLine().split("= ")[1]);
            this.foregroundColor = stringToColor(reader.readLine().split("= ")[1]);
            this.backgroundColor = stringToColor(reader.readLine().split("= ")[1]);
        } catch (IOException e){
            e.printStackTrace();
        }
        this.database = new ScreensDatabase();   //  Storing all possible screens here, created beforehand

//        JFRAME SETUP1
        JFrame frame1 = new JFrame(this.windowName);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);

//        JPANEL SETUP
        JPanel panel1 = new mainWindow().rootPanel;
        frame1.setContentPane(panel1);

//        JTEXTAREA SETUP
        JTextArea textArea1 = (JTextArea) panel1.getComponent(0);
        textArea1.addKeyListener(this);
        Font font = new Font(this.font, Font.BOLD, this.fontSize);
        textArea1.setEditable(false);
        textArea1.setForeground(this.foregroundColor);
        textArea1.setBackground(this.backgroundColor);
        textArea1.setFont(font);

        frame1.pack();
        this.currentScreen = this.database.screen1;

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
    public void keyPressed(KeyEvent e) {
        char choice = e.getKeyChar();
        switch (choice){
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                int intChoice = Integer.parseInt(String.valueOf(choice));
                try{
                    if (this.currentScreen.getSpecificOption(intChoice).getDestination() != null) {
                        this.currentScreen = this.currentScreen.getSpecificOption(intChoice).getDestination();
                    }
                } catch (NullPointerException npe){
                    npe.printStackTrace();
                }

                break;
            case 'b':
                this.currentScreen = this.database.screen1;
                break;
            case 'q':
                System.out.println("Goodbye!");
                running = false;
        }
        }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}