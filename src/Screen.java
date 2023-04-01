import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Screen {
    private List<String> options;

    /**
     * EXAMPLE
     * 1]: eMail         {option 1 points to the 'option' at array pos. 0}
     * 2]: Profiles
     * 3]: Database
     * 4]: Utilities
     * //EXAMPLE
     * @param options   The list of available options that make up the display
     */

    public Screen(List<String> options){
        this.options = options;
    }

    /**
     *
     * @param options String[] options passed as single arg- constructs ArrayList from provided items
     */
    public Screen(String[] options){
        this.options = new ArrayList<String>();
        for (int i=0; i<options.length; i++){
            this.options.add(options[i]);
        }
    }

    /**
     * Displays options on screen
     */
    public String render(){
        int count = 1;
        String output = "";
        for (String opt : this.options){
//            System.out.printf("%d]:%s\n", count, opt);
            output += count + "]: " + opt + "\n";
            count++;
        }

        output += "Q]: QUIT\n";
        return output;
//        System.out.println("Q]: QUIT");
    }

    /**
     *
     * @return Returns all available options to render the 'screen' for user interaction
     */
    public List<String> getAllOptions(){
        return this.options;
    }

    /**
     *
     * @param option The id as it is displayed to user (will automatically remove 1 to convert to array position)
     * @return Returns the option located at that position
     */
    public String getSpecificOption(int option){
        return this.options.get(option-1);
    }

    /**
     *
     * @param option The string option to append to the available options
     */
    public void appendOption(String option){
        this.options.add(option);
    }

    /**
     *
     * @param option The string option that appears, will attempt to remove by matching value
     */
    public void removeOption(String option){
        this.options.remove(option);
    }

    /**
     *
     * @param id The id as it is displayed to user (will automatically remove 1 to convert to array position)
     */
    public void removeOptionById(int id){
        this.options.remove(this.options.get(id-1));
    }
}
