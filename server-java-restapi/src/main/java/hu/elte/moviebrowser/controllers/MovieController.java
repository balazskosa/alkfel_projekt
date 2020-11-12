package hu.elte.moviebrowser.controllers;


import hu.elte.moviebrowser.entities.Movie;
import hu.elte.moviebrowser.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieRepository movieRepository;

    public MovieController(@Autowired MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


    @GetMapping("")
    public ResponseEntity<Iterable<Movie>> getMovies(@RequestParam(required = false) String category) {
        Iterable<Movie> movies;
        if (category == null) {
            movies = movieRepository.findAll();
        } else {
            movies = movieRepository.findAllByCategory(category);
        }
        return ResponseEntity.ok(movies);
    }

    @GetMapping("/{movieId}")
    public ResponseEntity<Movie> getMovie(@PathVariable Integer movieId) {
        Optional<Movie> optionalMovie = movieRepository.findById(movieId);

        if (optionalMovie.isPresent()) {
            return ResponseEntity.ok(optionalMovie.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("")
    //@Secured({ "ROLE_ADMIN" })
    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie) {
        Movie savedMovie = movieRepository.save(movie);
        return ResponseEntity.ok(savedMovie);

    }

    @PutMapping("/{movieId}")
    //@Secured({ "ROLE_ADMIN" })
    public ResponseEntity<Movie> update(@PathVariable Integer movieId, @RequestBody Movie movie) {
        Optional<Movie> oMovie = movieRepository.findById(movieId);
        if(oMovie.isPresent()) {
            movie.setId(movieId);
            return ResponseEntity.ok(movieRepository.save(movie));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{movieId}")
    //@Secured({ "ROLE_ADMIN" })
    public ResponseEntity deleteMovie(@PathVariable Integer movieId) {
        try {
            movieRepository.deleteById(movieId);
        }catch (EmptyResultDataAccessException e) {
            ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().build();
    }


}
