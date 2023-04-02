public class ScreensDatabase {
    public Screen screen1, screen2, screen3, screen4;

    /**
     * All the different screens the user can see / interact with
     */
    public ScreensDatabase(){
        this.screen1 = new Screen(new Entry[]{new Entry(null, "Assets"), new Entry(null, "eMail"), new Entry(null, "Databases")});
        this.screen2 = new Screen(new Entry[]{new Entry(null, "ASSETS"), new Entry(screen1, "Back")});
        this.screen3 = new Screen(new Entry[]{new Entry(null, "EMAIL"), new Entry(screen1, "Back")});
        this.screen4 = new Screen(new Entry[]{new Entry(null, "DATABASES"), new Entry(screen1, "Back")});
        this.screen1.getSpecificOption(1).setDestination(this.screen2);
        this.screen1.getSpecificOption(2).setDestination(this.screen3);
        this.screen1.getSpecificOption(3).setDestination(this.screen4);
    }

}
