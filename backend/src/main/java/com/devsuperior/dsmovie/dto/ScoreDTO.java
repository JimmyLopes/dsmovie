package com.devsuperior.dsmovie.dto;

public class ScoreDTO {

    private Long movieId;
    private String email;
    private Double score;

    public ScoreDTO() {
    }

    public ScoreDTO(Long movieId, String email, Double score) {
        this.movieId = movieId;
        this.email = email;
        this.score = score;
    }

    public Long getMovieId() {
        return movieId;
    }

    public ScoreDTO setMovieId(Long movieId) {
        this.movieId = movieId;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public ScoreDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public Double getScore() {
        return score;
    }

    public ScoreDTO setScore(Double score) {
        this.score = score;
        return this;
    }
}
