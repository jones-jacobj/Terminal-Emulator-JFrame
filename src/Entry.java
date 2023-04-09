public class Entry {
    private Screen child;
    private Screen parent;
    private String label;

    /**
     *
     * @param child
     * @param label
     */
    public Entry(Screen child, String label){
        this.child = child;
        this.label = label;
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
