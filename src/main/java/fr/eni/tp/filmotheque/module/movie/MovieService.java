package fr.eni.tp.filmotheque.module.movie;

import fr.eni.tp.filmotheque.model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MovieService {

    public Movie findById(long id);

    public void create(final Movie movie);

    public void update(final Movie movie, final Long id);

    public void delete(final Long id);

    public List<Movie> findAll();

}
