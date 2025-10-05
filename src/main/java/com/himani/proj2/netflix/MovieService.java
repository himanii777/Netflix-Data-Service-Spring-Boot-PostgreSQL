package com.himani.proj2.netflix;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class MovieService {
    private final MovieRepository repository;

    @Autowired
    public MovieService(MovieRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Netflix save(Netflix movie) {
        return repository.save(movie);
    }

    @Transactional
    public Netflix createMovie(Netflix movie) {
        return repository.save(movie);
    }

    @Transactional
    public Netflix createMovie(String showId, String type, String title, String director, String cast, String country, String dateAdded, Integer releaseYear, String rating, String duration, String listedIn, String description) {
        Netflix movie = new Netflix(showId, type, title, director, cast, country, dateAdded, releaseYear, rating, duration, listedIn, description);
        return repository.save(movie);
    }

    public Optional<Netflix> findById(String id) {
        return repository.findById(id);
    }

    public Optional<Netflix> findByTitle(String title) {
        return repository.findByTitle(title);
    }

    public List<Netflix> getAll() {
        return repository.findAll();
    }

    @Transactional
    public void deleteByShowId(String showId) {
        repository.deleteByShowId(showId);
    }

    public List<String> getAllTitles() {
        return repository.findAllTitles();
    }
}
