/**
 * An end point where the menu area disappears and instead shows text across the entire page
 */
public class TextEntry {
    private String contents;

    public TextEntry(String contents){
        this.contents = contents;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
