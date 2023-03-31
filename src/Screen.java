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
