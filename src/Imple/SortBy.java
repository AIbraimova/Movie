package Imple;
import Model.Cast;
import Model.Movie;
import Service.Findable;

import java.util.List;

    public class SortBy implements Findable {
        @Override
        public List<Movie> getAllMovies(List<Movie> movies) {
            return movies;
        }

        @Override
        public void findMovieByName(String name,List<Movie> movies) {
            for (Movie movies1:movies){
                if(movies1.getName().equals(name)){
                    System.out.println(movies1);
                    System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                    System.out.println("");
                }
            }


        }

        @Override
        public void findMovieByActorName(String name,List<Movie> movies) {
            for (Movie movies1:movies){
                for (Cast cast:movies1.getCast()){
                    if(cast.getActorFullName().equals(name)){
                        System.out.println("Actors: " +movies1.getCast());
                        System.out.println("Movie titles: " +movies1.getName());
                        System.out.println("Release year: " +movies1.getYear());
                        System.out.println("Description: " +movies1.getDescription());
                        System.out.println("Director: " +movies1.getDirector());
                        System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                        System.out.println("");
                    }
                }
            }
        }

        @Override
        public void findMovieByYear(int num,List<Movie> movies) {
            for (Movie movies1:movies){
                if(num==movies1.getYear()) {
                    System.out.println("Actors: " + movies1.getCast());
                    System.out.println("Release year : " + movies1.getYear());
                    System.out.println("Movie titles: " + movies1.getName());
                    System.out.println("Description: " + movies1.getDescription());
                    System.out.println("Director: " + movies1.getDirector());

                    System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                    System.out.println("");
                }
            }

        }

        @Override
        public void findMovieByDirector(String name,List<Movie> movies) {
            for (Movie movies1:movies){

                if(movies1.getDirector().getName().equals(name)){
                    System.out.println("Actors: " +movies1.getCast());
                    System.out.println("Director: " +movies1.getDirector());
                    System.out.println("Movie titles: " +movies1.getName());
                    System.out.println("Release year: " +movies1.getYear());
                    System.out.println("Description: " +movies1.getDescription());

                    System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                    System.out.println("");
                }
            }


        }

        @Override
        public void findMovieByDescription(String name,List<Movie> movies) {
            for (Movie movie:movies){
                if(movie.getDescription().contains(name)){
                    System.out.println(movie);
                }
            }

        }

        @Override
        public void findMovieByRole(String name,List<Movie> movies) {
            for (Movie movies1:movies){
                for (Cast cast:movies1.getCast()){
                    if(cast.getRole().equals(name)){
                        System.out.println("Actors : " +movies1.getCast());
                        System.out.println("Movie titles: " +movies1.getName());
                        System.out.println("Release year: " +movies1.getYear());
                        System.out.println("Description: " +movies1.getDescription());
                        System.out.println("Director: " +movies1.getDirector());
                        System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                        System.out.println("");
                    }
                }
            }

        }
    }

