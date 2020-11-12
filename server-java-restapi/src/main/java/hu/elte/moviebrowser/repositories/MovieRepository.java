package hu.elte.moviebrowser.repositories;

import hu.elte.moviebrowser.entities.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Integer> {
    Iterable<Movie> findAllByCategory(String category);

}