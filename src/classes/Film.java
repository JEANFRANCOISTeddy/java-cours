package classes;

import java.util.ArrayList;

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

    public Integer nbCharacters() {
        int nb_characters = 0;
        for (int count = 0; count < this.nbActors(); count++) {
            nb_characters += actors.get(count).getDuet().size();
        }

        return nb_characters;
    }

    public void calculProfit() {
        float profit = this.receipts - this.budget;
        boolean isProfitable = false;
        if(profit > 0)
            isProfitable = true;

    }

    public void calculDeficit() {
        float profit = this.receipts - this.budget;
        boolean isDeficit = false;
        if(profit < 0)
            isDeficit = true;

    }

    public Boolean isBefore(String year) {
        if(Integer.parseInt(year) > Integer.parseInt(this.date))
                return true;
        else
            return false;
    }

    public void sortMyList() {
        System.out.println(this.nbActors());

        /*ArrayList<String> last_name_list = new ArrayList<String>();
        for (int count = 0; count < this.nbActors(); count++) {
            last_name_list.add(actors.get(count).getLast_name());
        }

        Collections.sort(last_name_list);

        System.out.println(last_name_list);*/
    }

    public String toString() {
        return "title : " + this.title
            + "; date : " + this.date
            + "; episode : " + this.episode
            + "; budget : " + this.budget
            + "; receipts : " + this.receipts;
    }
}
