import Imple.FindBy;
import Imple.SortBy;
import Model.Cast;
import Model.Director;
import Model.Movie;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {


            Director director1 = new Director("Mark ", "Mylod");
            Director director2 = new Director("Ryan ", "Coogler");
            Director director3 = new Director("James ", "Cameron");
            Director director4 = new Director("Shonda ", "Rhimes");
            Director director5 = new Director("Olivier", "Nacas");

            Cast cast1 = new Cast("Anya Taylor-Joy", "Margot Mills / Erin");
            Cast cast2 = new Cast("Letitia Wright", "Shuri / Black Panther");
            LinkedList<Cast> casts = new LinkedList<>();
            casts.add(cast1);
            casts.add(cast2);

            Cast cast3 = new Cast("Sam Worthington", "Jake Sally");
            Cast cast4 = new Cast("Ellen Pompeo", "Meredith Grey");
            LinkedList<Cast> casts2 = new LinkedList<>();
            casts2.add(cast3);
            casts2.add(cast4);

            Cast cast5 = new Cast("Francois Kluzet", "Philippe Pozzo di Borgo");
            LinkedList<Cast> casts3 = new LinkedList<>();
            casts3.add(cast5);

            Movie movie1 = new Movie("Black Panther!", 2022, "The people of Wakanda fight to protect their home from intervening world powers as they mourn the death of King T'Challa.", director2, casts2);
            Movie movie2 = new Movie("The Menu", 2022, "A couple (Anya Taylor-Joy and Nicholas Hoult) travels to a coastal island to eat at an exclusive restaurant where the chef (Ralph Fiennes) has prepared ", director1, (List<Cast>) cast1);
            Movie movie3 = new Movie("Avatar", 2009, "By the middle of the XXII century, mankind had almost exhausted the natural resources of the overpopulated Earth. ", director3, casts3);
            Movie movie4 = new Movie("Grey's Anatomy", 2005, "The series focuses on the lives of surgical interns, residents, and attendings as they develop into seasoned doctors while balancing personal and professional relationships.", director3, casts3);
            Movie movie5 = new Movie("1+1 Intouchables", 2022, "Paralyzed rich aristocrat Philip, who became disabled after crashing on a paraglider, is looking for an assistant who should take care of him", director5,cast4 );
            LinkedList<Movie> movies = new LinkedList<>();
            movies.add(movie1);
            movies.add(movie2);
            movies.add(movie3);
            movies.add(movie4);
            movies.add(movie5);
            FindBy movieStore = new FindBy();


            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("""
                        *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*
                           Click on 1 to see the movie catalog ->
                           Click on 2 to search movie by Movie name ->
                           Click on 3 to search movie by Actor name
                           Click on 4 to find a movie by release year
                           Click on 5 to find a movie by movie description
                           Click on 6 to find a movie by the name of thr role of the actor 
                           Click on 7 to find a movie by the director's name 
                           Click on 8 to sort movie by movie title
                           Click on 9 to sort the movie by release year
                           Click on 10 to sort movie by movie director name
                        *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*    
                           """);
                int num = scanner.nextInt();
                SortBy findByMap = new SortBy();

                switch (num) {
                    case 1:
                        findByMap.getAllMovies(movies);
                        for (Movie m : movies) {
                            System.out.println(m);
                            System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                        }
                        break;
                    case 2:
                        System.out.print("Movie titles :");
                        String n = scanner.nextLine();
                        String name = scanner.nextLine();
                        findByMap.findMovieByName(name, movies);
                        break;
                    case 3:
                        String n1 = scanner.nextLine();
                        String name2 = scanner.nextLine();
                        findByMap.findMovieByActorName(name2, movies);
                        break;
                    case 4:
                        int num2 = scanner.nextInt();
                        findByMap.findMovieByYear(num2, movies);
                        break;
                    case 5:
                        String n3 = scanner.nextLine();
                        String nam = scanner.nextLine();
                        findByMap.findMovieByDescription(nam, movies);
                        break;
                    case 6:
                        String n4 = scanner.nextLine();
                        String nam3 = scanner.nextLine();
                        findByMap.findMovieByRole(nam3, movies);
                        break;
                    case 7:
                        String n5 = scanner.nextLine();
                        String nam4 = scanner.nextLine();
                        findByMap.findMovieByDirector(nam4, movies);
                        break;
                    case 8:
                        System.out.println("""
                                Click on 1 to sort from A to Z!
                                Click on 1 to sort from Z to A!""");
                        int h = scanner.nextInt();
                        movieStore.sortByMovieName(h, movies);
                        break;
                    case 9:
                        System.out.println("""
                                Click on 1 to sort decrease!
                                Click on 1 to sort increase!""");
                        int h1 = scanner.nextInt();
                        movieStore.sortByYear(h1, movies);
                        break;
                    case 10:
                        System.out.println("""
                                Click on 1 to sort from A to Z!
                                Click on 1 to sort from Z to A!""");
                        int h2 = scanner.nextInt();
                        movieStore.sortByDirector(h2, movies);
                        break;
                    default:
                        System.out.println("Enter a number from  1 to 10");
                }


            }
        }catch (InputMismatchException e){
            System.err.println("You entered letters instead of a number!");
        }
    }
}