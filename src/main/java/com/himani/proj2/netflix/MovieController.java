package com.himani.proj2.netflix;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private final MovieService service;

    @Autowired
    public MovieController(MovieService service) {
        this.service = service;
    }

    @GetMapping
    public List<Netflix> getAll() {
        return service.getAll();
    }

    @GetMapping("/titles")
    public List<String> getAllTitles() {
        return service.getAllTitles();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Netflix> getById(@PathVariable String id) {
        Optional<Netflix> movie = service.findById(id);
        return movie.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Netflix> addMovie(@RequestBody Netflix movie) {
        Netflix saved = service.createMovie(movie);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PostMapping("/fields")
    public ResponseEntity<Netflix> addMovieByFields(
            @RequestParam String showId,
            @RequestParam(required = false) String type,
            @RequestParam(required = false) String title,
            @RequestParam(required = false) String director,
            @RequestParam(required = false) String cast,
            @RequestParam(required = false) String country,
            @RequestParam(required = false) String dateAdded,
            @RequestParam(required = false) Integer releaseYear,
            @RequestParam(required = false) String rating,
            @RequestParam(required = false) String duration,
            @RequestParam(required = false) String listedIn,
            @RequestParam(required = false) String description
    ) {
        Netflix saved = service.createMovie(showId, type, title, director, cast, country, dateAdded, releaseYear, rating, duration, listedIn, description);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }
}
