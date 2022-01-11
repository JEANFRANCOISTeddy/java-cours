import classes.Film;
import classes.Actor;
import classes.Character;
import classes.Bad;
import classes.Nice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        ArrayList<Film> collection = new ArrayList<Film>();

        System.out.print( "Enter movie's parameters \n" );
        try ( Scanner scanner = new Scanner( System.in ) ) {

            while( true ) {
                System.out.print( "Enter the movie's title: " );
                String title = scanner.nextLine();

                System.out.print( "Enter the movie's date: " );
                String date = scanner.nextLine();

                System.out.print( "Enter the movie's episode: " );
                String episode = scanner.nextLine();

                System.out.print( "Enter a movie's budget: " );
                float budget = scanner.nextFloat();

                System.out.print( "Enter a movie's receipts: " );
                float receipts = scanner.nextFloat();

                Film user_film = new Film(title, date, episode, budget, receipts);
                collection.add(user_film);

                break;
            }

        }

        Film film_1 = new Film("Un nouvel espoir","1977","IV",11_000_000, 780_000_000);
        Film film_2 = new Film("La menace fantôme", "1999","I",110_000_000,900_000_000);

        Character character_1 = new Character("Skywalker", "Luke");
        System.out.println(character_1.toString());

        collection.add(film_1);
        collection.add(film_2);

        for (int count = 0; count < collection.size(); count++) {
            System.out.println(collection.get(count).toString());
        }

        ArrayList<Actor> actors = new ArrayList<Actor>();
        Actor actor_1 = new Actor("Ford", "Harrisson");
        Actor actor_2 = new Actor("Jean-François", "Teddy");
        actors.add(actor_1);
        actors.add(actor_2);

        ArrayList<Character> characters = new ArrayList<Character>();
        characters.add(new Character("Solo", "Han"));
        characters.add(new Character("Indiana", "Jones"));

        ArrayList<Character> characters_2 = new ArrayList<Character>();
        characters_2.add(new Character("Snow", "John"));

        actor_1.setDuet(characters);
        actor_2.setDuet(characters_2);

        System.out.println(actor_1.getFirst_name() + " " + actor_1.getLast_name() + " played " + actor_1.nbCharacters() + " characters : ");
        for (int count = 0; count < characters.size(); count++) {
            System.out.println(characters.get(count).toString());
        }

        film_2.setActors(actors);

        System.out.println("There are " + film_2.nbActors() + " actors in the film Star Wars : " + film_1.getTitle());
        System.out.println("There are " + film_2.nbCharacters() + " characters in the film Star Wars : " + film_1.getTitle());

        String year = "1988";
        if(film_1.isBefore(year))
            System.out.println("This film was released before " + year);
        else
            System.out.println("This film was released after " + year);

        System.out.println("Sorted actors by last name");
        film_2.sortMyList();
        ArrayList<Object> duet = film_2.calculProfit();
        System.out.println("Profit : " + duet.get(1) + " value of " + duet.get(0));

        HashMap<String, Film> films = new HashMap<String, Film>();

        films.put(film_1.getDate(), film_1);
        films.put(film_2.getDate(), film_2);

        makeBackUp(films);
    }

    /**
     *
     * Méthode qui affiche certains arguments relatifs à un film
     *
     * @param films
     */
    public static void makeBackUp(HashMap<String, Film> films) {
        for (Map.Entry<String, Film> entry : films.entrySet()) {
            String key = entry.getKey();
            Film film = entry.getValue();


            System.out.println(key + " - " + film.getTitle() + " - " + film.calculProfit().get(0));
        }
    }

}
