public class Entry {
    private Screen destination;
    private String contents;

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
