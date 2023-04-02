public class Entry {
    private Screen destination;
    private String contents;

    /**
     * Represents the specific options on the screen, Entries also allow user to navigate Screens
     * @param destination   Screen to go to when this option is chosen (if any)
     * @param contents      String to print on screen
     */
    public Entry(Screen destination, String contents){
        this.destination = destination;
        this.contents = contents;
    }

    public void setDestination(Screen destination) {
        this.destination = destination;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Screen getDestination() {
        return destination;
    }

    public String getContents() {
        return contents;
    }
}
