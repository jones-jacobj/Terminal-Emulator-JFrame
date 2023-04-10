public class Entry {
    private Screen child;
    private String label;

    /**
     *
     * @param label What is displayed to the user representing possible choices
     * @param child Points to a destination Screen
     */
    public Entry(String label, Screen child){
        this.label = label;
        this.child = child;
    }

    public Entry(String label){
        this.label = label;
        this.child = null;
    }

    public void setchild(Screen child) {
        this.child = child;
    }

    public void setlabel(String label) {
        this.label = label;
    }

    public Screen getchild() {
        return child;
    }

    public String getlabel() {
        return label;
    }
}
