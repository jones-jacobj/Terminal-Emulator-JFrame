import java.util.List;

public class ScreensDatabase {
    public Screen screen1, screen2, screen3, screen4;

    /**
     * All the different screens the user can see / interact with
     */
    public ScreensDatabase(){
        this.screen1 = new Screen((List.of(
                new Entry(null, "Assets"),
                new Entry(null, "eMail"),
                new Entry(null, "Databases"))));
        this.screen2 = new Screen(List.of(new Entry(null, "ASSETS")));
        this.screen3 = new Screen(List.of(new Entry(null, "EMAIL")));
        this.screen4 = new Screen(List.of(new Entry(null, "DATABASES")));
        this.screen1.getSpecificOption(1).setchild(this.screen2);
        this.screen1.getSpecificOption(2).setchild(this.screen3);
        this.screen1.getSpecificOption(3).setchild(this.screen4);
    }

}
