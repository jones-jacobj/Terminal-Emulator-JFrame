public class Entry {
    private Screen child;
    private Screen parent;
    private String label;

    /**
     *
     * @param child
     * @param label
     * @param parent
     */
    public Entry(Screen child, String label, Screen parent){
        this.child = child;
        this.label = label;
        this.parent = parent;
    }

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

    public Screen getParent() {
        return parent;
    }

    public void setParent(Screen parent) {
        this.parent = parent;
    }
}
