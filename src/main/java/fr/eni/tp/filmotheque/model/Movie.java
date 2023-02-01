package fr.eni.tp.filmotheque.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    private Long id;
    private String title;
    private Director director;
    private List<Actor> actors;
    private MovieType type;
    private Integer year;
    private Integer duration;
    private String synopsis;
    private String poster;

    public String toString() {
        return "Movie [id=" + getId() + "]\n" +
                "\t title : " + getTitle() + " [year : " + getYear() + ", duration : " + getDuration() + "m]\n" +
                "\t director : " + getDirector().getName() + " " + getDirector().getFirstName() + "\n" +
                "\t actors : [" + getActors().stream().map(MovieMember::toString).collect(Collectors.joining(", ")) + "]\n" +
                "\t type : " + getType() + "\n" +
                "\t synopsis : " + getSynopsis();
    }
}
