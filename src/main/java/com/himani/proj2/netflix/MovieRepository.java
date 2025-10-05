package com.himani.proj2.netflix;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Netflix, String> {
    Optional<Netflix> findByTitle(String title);
    void deleteByShowId(String showId);

    @Query("SELECT n.title FROM Netflix n")
    List<String> findAllTitles();
}
