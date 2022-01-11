package classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Film {

    String title;
    String date;
    String episode;
    float budget;
    float receipts;
    ArrayList<Actor> actors;

    public Film(String title, String date, String episode, float budget, float receipts) {
        this.title = title;
        this.date = date;
        this.episode = episode;
        this.budget = budget;
        this.receipts = receipts;
        this.actors = new ArrayList<Actor>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEpisode() {
        return episode;
    }

    public void setEpisode(String episode) {
        this.episode = episode;
    }

    public float getBudget() {
        return budget;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }

    public float getReceipts() {
        return receipts;
    }

    public void setReceipts(float receipts) {
        this.receipts = receipts;
    }

    public ArrayList<Actor> getActors() { return actors; }

    public void setActors(ArrayList<Actor> actors) { this.actors = actors; }

    public int nbActors() { return this.actors.size(); }

    /**
     *
     * Méthode qui renvoie le nombre de personnages dans un film
     *
     * @return nb_characters
     */
    public Integer nbCharacters() {
        int nb_characters = 0;
        for (int count = 0; count < this.nbActors(); count++) {
            nb_characters += actors.get(count).getDuet().size();
        }

        return nb_characters;
    }

    /**
     *
     * Méthode qui calcule le profit qu'à réalisé un film
     *
     * @return ArrayList<Object>
     */
    public ArrayList<Object> calculProfit() {
        float profit = this.receipts - this.budget;
        boolean isProfitable = false;
        if(profit > 0)
            isProfitable = true;

        ArrayList<Object> duet = new ArrayList<Object>();
        duet.add(profit);
        duet.add(isProfitable);

        return duet;
    }

    /**
     *
     * Méthode qui calcule le décificit qu'à réalisé un film
     *
     * @return ArrayList<Object>
     */
    public ArrayList<Object> calculDeficit() {
        float profit = this.receipts - this.budget;
        boolean isDeficit = false;
        if(profit < 0)
            isDeficit = true;

        ArrayList<Object> duet = new ArrayList<Object>();
        duet.add(profit);
        duet.add(isDeficit);

        return duet;
    }

    /**
     *
     * Méthode permettant de savoir si un film est sorti avant une certaine année ou pas
     *
     * @param year
     * @return
     */
    public Boolean isBefore(String year) {
        if(Integer.parseInt(year) > Integer.parseInt(this.date))
                return true;
        else
            return false;
    }

    /**
     * Méthode permettant de trier les acteurs par leur nom de famille et par ordre alphabétique
     */
    public void sortMyList() {
        ArrayList<String> last_name_list = new ArrayList<String>();
        for (int count = 0; count < this.nbActors(); count++) {
            last_name_list.add(actors.get(count).getLast_name());
        }

        Collections.sort(last_name_list);

        System.out.println(last_name_list);
    }

    public String toString() {
        return "title : " + this.title
            + "; date : " + this.date
            + "; episode : " + this.episode
            + "; budget : " + this.budget
            + "; receipts : " + this.receipts;
    }
}
