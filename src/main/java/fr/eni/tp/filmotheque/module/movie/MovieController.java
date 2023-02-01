package fr.eni.tp.filmotheque.module.movie;

import fr.eni.tp.filmotheque.model.Movie;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@Slf4j
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/movies/{id}")
    public String findById(@PathVariable final Long id, Model model) {
        Movie movie = movieService.findById(id);
        model.addAttribute("movie", movie);
        return "movies";
    }

    @GetMapping("/movies")
    public String findAll(Model model) {
        List<Movie> movies = movieService.findAll();
        model.addAttribute("movies", movies);
        return "movies";
    }

    @PostMapping("/movies")
    public String create(Movie movie) {
        movieService.create(movie);
        return "redirect:/movies";
    }
}
