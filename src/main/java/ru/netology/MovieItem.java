package ru.netology;

public class MovieItem {
    private int movieId;
    private int imageId;
    private String movieName;
    private String movieGenre;

    public int getMovieId() {
        return movieId;
    }

    public int getImageId() {
        return imageId;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public MovieItem(int movieId, int imageId, String movieName, String movieGenre) {
        this.movieId = movieId;
        this.imageId = imageId;
        this.movieName = movieName;
        this.movieGenre = movieGenre;
    }
}
