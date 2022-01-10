package classes;

public class Bad extends Character{

    Boolean dark_side;

    public Bad(String last_name, String first_name, Boolean dark_side) {
        super(last_name, first_name);
        this.dark_side = dark_side;
    }

    public Boolean getDark_side() {
        return dark_side;
    }

    public void setDark_side(Boolean dark_side) {
        this.dark_side = dark_side;
    }

    public String toString() {
        return "last_name : " + this.last_name
                + "; first_name : " + this.first_name
                + "; dark_side : " + this.dark_side;
    }

}
