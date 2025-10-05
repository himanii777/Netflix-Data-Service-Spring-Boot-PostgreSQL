//package com.himani.proj2.netflix;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name = "netflix")
//public class Netflix {
//    @Id
//    @Column(name = "show_id")
//    private String showId;
//
//    private String type;
//
//    private String title;
//
//    private String director;
//
//    @Column(name = "cast")
//    private String cast;
//
//    private String country;
//
//    @Column(name = "date_added")
//    private String dateAdded;
//
//    @Column(name = "release_year")
//    private Integer releaseYear;
//
//    private String rating;
//
//    private String duration;
//
//    @Column(name = "listed_in")
//    private String listedIn;
//
//    private String description;
//
//    public Netflix() {
//    }
//
//    public Netflix(String showId, String type, String title, String director, String cast, String country, String dateAdded, Integer releaseYear, String rating, String duration, String listedIn, String description) {
//        this.showId = showId;
//        this.type = type;
//        this.title = title;
//        this.director = director;
//        this.cast = cast;
//        this.country = country;
//        this.dateAdded = dateAdded;
//        this.releaseYear = releaseYear;
//        this.rating = rating;
//        this.duration = duration;
//        this.listedIn = listedIn;
//        this.description = description;
//    }
//
//    public String getShowId() {
//        return showId;
//    }
//
//    public void setShowId(String showId) {
//        this.showId = showId;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getDirector() {
//        return director;
//    }
//
//    public void setDirector(String director) {
//        this.director = director;
//    }
//
//    public String getCast() {
//        return cast;
//    }
//
//    public void setCast(String cast) {
//        this.cast = cast;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public void setCountry(String country) {
//        this.country = country;
//    }
//
//    public String getDateAdded() {
//        return dateAdded;
//    }
//
//    public void setDateAdded(String dateAdded) {
//        this.dateAdded = dateAdded;
//    }
//
//    public Integer getReleaseYear() {
//        return releaseYear;
//    }
//
//    public void setReleaseYear(Integer releaseYear) {
//        this.releaseYear = releaseYear;
//    }
//
//    public String getRating() {
//        return rating;
//    }
//
//    public void setRating(String rating) {
//        this.rating = rating;
//    }
//
//    public String getDuration() {
//        return duration;
//    }
//
//    public void setDuration(String duration) {
//        this.duration = duration;
//    }
//
//    public String getListedIn() {
//        return listedIn;
//    }
//
//    public void setListedIn(String listedIn) {
//        this.listedIn = listedIn;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    @Override
//    public String toString() {
//        return "Netflix{" +
//                "showId='" + showId + '\'' +
//                ", type='" + type + '\'' +
//                ", title='" + title + '\'' +
//                ", director='" + director + '\'' +
//                ", cast='" + cast + '\'' +
//                ", country='" + country + '\'' +
//                ", dateAdded='" + dateAdded + '\'' +
//                ", releaseYear=" + releaseYear +
//                ", rating='" + rating + '\'' +
//                ", duration='" + duration + '\'' +
//                ", listedIn='" + listedIn + '\'' +
//                ", description='" + description + '\'' +
//                '}';
//    }
//}

package com.himani.proj2.netflix;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "netflix")
public class Netflix {
    @Id
    @Column(name = "show_id")
    private String showId;

    private String type;

    private String title;

    private String director;

    @Column(name = "cast_names")
    private String castNames;

    private String country;

    @Column(name = "date_added")
    private String dateAdded;

    @Column(name = "release_year")
    private Integer releaseYear;

    private String rating;

    private String duration;

    @Column(name = "listed_in")
    private String listedIn;

    private String description;

    public Netflix() {
    }

    public Netflix(String showId, String type, String title, String director, String castNames, String country, String dateAdded, Integer releaseYear, String rating, String duration, String listedIn, String description) {
        this.showId = showId;
        this.type = type;
        this.title = title;
        this.director = director;
        this.castNames = castNames;
        this.country = country;
        this.dateAdded = dateAdded;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.duration = duration;
        this.listedIn = listedIn;
        this.description = description;
    }

    public String getShowId() {
        return showId;
    }

    public void setShowId(String showId) {
        this.showId = showId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCastNames() {
        return castNames;
    }

    public void setCastNames(String castNames) {
        this.castNames = castNames;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getListedIn() {
        return listedIn;
    }

    public void setListedIn(String listedIn) {
        this.listedIn = listedIn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Netflix{" +
                "showId='" + showId + '\'' +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", castNames='" + castNames + '\'' +
                ", country='" + country + '\'' +
                ", dateAdded='" + dateAdded + '\'' +
                ", releaseYear=" + releaseYear +
                ", rating='" + rating + '\'' +
                ", duration='" + duration + '\'' +
                ", listedIn='" + listedIn + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
