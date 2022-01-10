package classes;

public class Nice extends Character {

    Boolean strength;

    public Nice(String last_name, String first_name, Boolean strength) {
        super(last_name, first_name);
        this.strength = strength;
    }

    public Boolean getStrength() {
        return strength;
    }

    public void setStrength(Boolean strength) {
        this.strength = strength;
    }

    public String toString() {
        return "last_name : " + this.last_name
                + "; first_name : " + this.first_name
                + "; strength : " + this.strength;
    }

}
