package fr.eni.tp.filmotheque.module.movie;

import fr.eni.tp.filmotheque.model.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
@Service
@Profile("dev")
public class MovieServiceMock implements MovieService {
    private final List<Movie> movies = new ArrayList<>();
    private final List<MovieMember> movieMembers = new ArrayList<>();

    public MovieServiceMock() {

        // 2 réalisateurs dont 1 pour 2 films
        Director stevenSpielberg = Director.builder()
                .id(1L)
                .firstName("Steven")
                .name("Spielberg")
                .build();
        Director davidCronenberg = Director.builder()
                .id(2L)
                .name("Cronenberg")
                .firstName("David")
                .build();
        movieMembers.add(stevenSpielberg);
        movieMembers.add(davidCronenberg);

        // 2 acteurs par film et l'un d'eux dans 2 films
        Actor richardAttenborough = Actor.builder()
                .id(1L)
                .firstName("Richard")
                .name("Attenborough")
                .build();
        Actor jeffGoldblum = Actor.builder()
                .id(2L)
                .firstName("Jeff")
                .name("Goldblum")
                .build();
        List<Actor> actorsJurassicPark = new ArrayList<>();
        actorsJurassicPark.add(richardAttenborough);
        actorsJurassicPark.add(jeffGoldblum);
        movieMembers.addAll(actorsJurassicPark);

        Actor geenaDavis = Actor.builder()
                .id(3L)
                .firstName("Geena")
                .name("Davis")
                .build();
        List<Actor> actorsTheFly = new ArrayList<>();
        actorsTheFly.add(jeffGoldblum);
        actorsTheFly.add(geenaDavis);
        movieMembers.add(geenaDavis);

        Actor markRylance = Actor.builder()
                .id(4L)
                .firstName("Mark")
                .name("Rylance")
                .build();
        Actor rubyBarnhill = Actor.builder()
                .id(5L)
                .firstName("Ruby")
                .name("Barnhill")
                .build();
        List<Actor> actorsTheBFG = new ArrayList<>();
        actorsTheBFG.add(markRylance);
        actorsTheBFG.add(rubyBarnhill);
        movieMembers.addAll(actorsTheBFG);

        Movie jurassicPark = Movie.builder()
                .id(1L)
                .title("Jurassic Park")
                .year(1993)
                .duration(128)
                .type(MovieType.ADVENTURE)
                .director(stevenSpielberg)
                .actors(actorsJurassicPark)
                .synopsis("Le film raconte l'histoire d'un milliardaire et son équipe de généticiens parvenant à ramener à la vie des dinosaures grâce au clonage.")
                .build();
        movies.add(jurassicPark);

        Movie theFly = Movie.builder()
                .id(2L)
                .title("The Fly")
                .year(1986)
                .duration(96)
                .type(MovieType.HORROR)
                .director(davidCronenberg)
                .actors(actorsTheFly)
                .synopsis("Un scientifique se transforme en insecte géant après avoir été accidentellement exposé à un produit expérimental.")
                .build();
        movies.add(theFly);

        Movie theBFG = Movie.builder()
                .id(3L)
                .title("The BFG")
                .year(2016)
                .duration(117)
                .type(MovieType.ADVENTURE)
                .director(stevenSpielberg)
                .actors(actorsTheBFG)
                .synopsis("Un jeune garçon, qui a été adopté par une famille d'humains, rencontre une créature gigantesque qui vient de Big Friendly Giant.")
                .build();
        movies.add(theBFG);
    }

    @Override
    public List<Movie> findAll() {
        return movies;
    }

    @Override
    public Movie findById(long id) {
        return movies.stream()
                .filter(movie -> movie.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<MovieType> getMovieTypes() {
        return Arrays.stream(MovieType.values()).toList();
    }

    public List<MovieMember> getMovieMembers() {
        return movieMembers;
    }

    public MovieMember getMovieMember(long id) {
        return movieMembers.stream()
                .filter(movieMember -> movieMember.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void create(Movie movie) {
        movies.add(movie);
    }

    @Override
    public void update(Movie movie, Long id) {
        throw new Error("Not implemented");
    }

    @Override
    public void delete(Long id) {
        throw new Error("Not implemented");
    }

}

