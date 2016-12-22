/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movie.business;

public class Movie {
     private String movieId;
    private String title;
    private String year;
    private String duration;
    private String actor;
    private String director;
    private String genre;
    private String synopsis;
    
    public Movie(){}
    
    public void setmovieId(String id) {
        this.movieId = id;
    }

    public String getmovieId() {
        return movieId;
    }
public void settitle(String title) {
        this.title = title;
    }

    public String gettitle() {
        return title;
    }
public void setyear(String year) {
        this.year = year;
    }

    public String getyear() {
        return year;
    }
    public void setduration(String duration) {
        this.duration = duration;
    }

    public String getduration() {
        return duration;
    }
public void setactor(String actor) {
        this.actor = actor;
    }

    public String getactor() {
        return actor;
    }
public void setdirector(String director) {
        this.director = director;
    }

    public String getdirector() {
        return director;
    }
public void setgenre(String genre) {
        this.genre = genre;
    }

    public String getgenre() {
        return genre;
    }

public void setsynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getsynopsis() {
        return synopsis;
    }

   
}
