import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Screen {
    private List<Entry> options;
    private boolean firstScreen;

    /**
     * EXAMPLE
     * 1]: eMail         {option 1 points to the 'option' at array pos. 0}
     * 2]: Profiles
     * 3]: Database
     * 4]: Utilities
     * //EXAMPLE
     * @param options   The list of available options that make up the display
     */

    public Screen(List<Entry> options, boolean firstScreen){
        this.options = options;
        this.firstScreen = firstScreen;
    }

    /**
     *
     * @param options String[] options passed as single arg- constructs ArrayList from provided items
     */
    public Screen(List<Entry> options){
        this.options = options;
        this.firstScreen = false;
    }

    /**
     * Displays options on screen
     */
    public String render(){
        int count = 1;
        String output = "";
        for (Entry opt : this.options){
//            System.out.printf("%d]:%s\n", count, opt);
            output += count + "]: " + opt.getContents() + "\n";
            count++;
        }
        output += "\n\n\n\n\n";
        if(!this.firstScreen){
            output += "B]: BACK\n";
        }
        output += "Q]: QUIT\n";
        return output;
//        System.out.println("Q]: QUIT");
    }

    /**
     *
     * @return Returns all available options to render the 'screen' for user interaction
     */
    public List<Entry> getAllOptions(){
        return this.options;
    }

    /**
     *
     * @param option The id as it is displayed to user (will automatically remove 1 to convert to array position)
     * @return Returns the option located at that position
     */
    public Entry getSpecificOption(int option){
        return this.options.get(option-1);
    }

    /**
     *
     * @param option The string option to append to the available options
     */
    public void appendOption(Entry option){
        this.options.add(option);
    }

    /**
     *
     * @param option The string option that appears, will attempt to remove by matching value
     */
    public void removeOption(Entry option){
        this.options.remove(option);
    }

    /**
     *
     * @param id The id as it is displayed to user (will automatically remove 1 to convert to array position)
     */
    public void removeOptionById(int id){
        this.options.remove(this.options.get(id-1));
    }

    /**
     *
     * @param choice Integer that located the Entry's destination screen
     * @return The screen found attached to that Entry
     */
    public Screen getDestinationByInt(int choice){
        return this.options.get(choice-1).getDestination();
    }
}
