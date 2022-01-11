package classes;

import java.util.ArrayList;

public class Actor {

    String last_name;
    String first_name;
    ArrayList<Character> duet;

    public Actor(String last_name, String first_name) {
        this.last_name = last_name;
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public ArrayList<Character> getDuet() {
        return duet;
    }

    public void setDuet(ArrayList<Character> duet) {
        this.duet = duet;
    }

    /**
     *
     * Méthode qui renvoie le nombre de personnages jouer par un acteur
     *
     * @return nb de characters
     */
    public Integer nbCharacters() {
        return this.duet.size();
    }

    public String toString() {
        return "last_name : " + this.last_name
                + "; first_name : " + this.first_name;
    }

}
