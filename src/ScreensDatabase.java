import java.util.List;

public class ScreensDatabase {
    public Screen screen1;
    public Screen screen2;
    public Screen screen3;
    public Screen screen4;
    public Screen screen5;
    public Screen screen6;
//    public Screen screen7;
//    public Screen screen8;
//    public Screen screen9;
//    public Screen screen10;
//    public Screen screen11;
//    public Screen screen12;
//    public Screen screen13;

    /**
     * All the different screens the user can see / interact with
     */
    public ScreensDatabase(){
        this.screen1 = new Screen((List.of(
                new Entry("Assets"),
                new Entry( "eMail"),
                new Entry( "Databases"))));
        this.screen2 = new Screen(List.of(new Entry("ASSETS")));
        this.screen3 = new Screen(List.of(new Entry("EMAIL")));
        this.screen4 = new Screen(List.of(new Entry( "DATABASESx1")));
        this.screen5 = new Screen(List.of(new Entry("DATABASESx2")));
        this.screen6 = new Screen(List.of(new Entry("DATABASESx3")));
        this.screen1.getSpecificOption(1).setchild(this.screen2);
        this.screen1.getSpecificOption(2).setchild(this.screen3);
        this.screen1.getSpecificOption(3).setchild(this.screen4);
        this.screen4.getSpecificOption(1).setchild(this.screen5);
        this.screen5.getSpecificOption(1).setchild(this.screen6);
    }

}
