package ru.netology;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ManagerAfishaTest {
    private ManagerAfisha manager = new ManagerAfisha();
    private MovieItem firstMovie = new MovieItem(1, 1, "HotelBelgrade", "comedy");
    private MovieItem secondMovie = new MovieItem(2, 2, "Trolls", "cartoon");
    private MovieItem thirdMovie = new MovieItem(3, 3, "GreenMile", "fantasy");
    private MovieItem fourthMovie = new MovieItem(4, 4, "ShawshankRedemption", "drama");
    private MovieItem fifthMovie = new MovieItem(5, 5, "LordOfTheRings", "fantasy");
    private MovieItem sixthMovie = new MovieItem(6, 6, "ForrestGump", "comedy");
    private MovieItem seventhMovie = new MovieItem(7, 7, "Interstellar", "fantasy");
    private MovieItem eighthMovie = new MovieItem(8, 8, "LionKing", "cartoon");
    private MovieItem ninthMovie = new MovieItem(9, 9, "Walle", "cartoon");
    private MovieItem tenthMovie = new MovieItem(10, 10, "Klaus", "cartoon");
    private MovieItem eleventhMovie = new MovieItem(11, 11, "PulpFiction", "criminal");
    private MovieItem twelfthMovie = new MovieItem(12, 12, "Inception", "action");
    private MovieItem thirteenthMovie = new MovieItem(13, 13, "Matrix", "fantasy");
    private MovieItem fourteenthMovie = new MovieItem(14, 14, "Intouchables", "comedy");
    private MovieItem fifteenthMovie = new MovieItem(15, 15, "Snatch", "criminal");

    @BeforeEach
    public void setUp() {
        manager.addMovie(firstMovie);
        manager.addMovie(secondMovie);
        manager.addMovie(thirdMovie);
        manager.addMovie(fourthMovie);
        manager.addMovie(fifthMovie);
        manager.addMovie(sixthMovie);
        manager.addMovie(seventhMovie);
        manager.addMovie(eighthMovie);
        manager.addMovie(ninthMovie);
        manager.addMovie(tenthMovie);
        manager.addMovie(eleventhMovie);
        manager.addMovie(twelfthMovie);
        manager.addMovie(thirteenthMovie);
        manager.addMovie(fourteenthMovie);
        manager.addMovie(fifteenthMovie);
    }

    @Test
    public void addMovie() {
        MovieItem sixteenthMovie = new MovieItem(16, 16, "The Godfather", "drama");
        manager.addMovie(sixteenthMovie);
        MovieItem[] actual = manager.getLastMovies();
        MovieItem[] expected = new MovieItem[]{sixteenthMovie, fifteenthMovie, fourteenthMovie, thirteenthMovie, twelfthMovie, eleventhMovie, tenthMovie, ninthMovie, eighthMovie, seventhMovie};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void lastMoviesInRevertedOrderWithDefaultConstructor() { // фильмы в обратном порядке при выдаче дефолтного количества, фильмов больше 10
        MovieItem[] actual = manager.getLastMovies();
        MovieItem[] expected = new MovieItem[]{fifteenthMovie, fourteenthMovie, thirteenthMovie, twelfthMovie, eleventhMovie, tenthMovie, ninthMovie, eighthMovie, seventhMovie, sixthMovie};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void lastMoviesInRevertedOrderWithSpecifiedConstructor() { //
        ManagerAfisha manager = new ManagerAfisha(8);
        MovieItem firstMovie = new MovieItem(1, 1, "HotelBelgrade", "comedy");
        MovieItem secondMovie = new MovieItem(2, 2, "Trolls", "cartoon");
        manager.addMovie(firstMovie);
        manager.addMovie(secondMovie);
        MovieItem[] actual = manager.getLastMovies();
        MovieItem[] expected = new MovieItem[]{secondMovie, firstMovie};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void LastMovieIfNoItemQuantity() { //
        ManagerAfisha manager = new ManagerAfisha();
        MovieItem firstMovie = new MovieItem(1, 1, "HotelBelgrade", "comedy");
        MovieItem secondMovie = new MovieItem(2, 2, "Trolls", "cartoon");
        manager.addMovie(firstMovie);
        manager.addMovie(secondMovie);
        MovieItem[] actual = manager.getLastMovies();
        MovieItem[] expected = new MovieItem[]{secondMovie, firstMovie};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void LastMovieIfItemQuantityBelow() { //
        ManagerAfisha manager = new ManagerAfisha(1);
        MovieItem firstMovie = new MovieItem(1, 1, "HotelBelgrade", "comedy");
        MovieItem secondMovie = new MovieItem(2, 2, "Trolls", "cartoon");
        manager.addMovie(firstMovie);
        manager.addMovie(secondMovie);
        MovieItem[] actual = manager.getLastMovies();
        MovieItem[] expected = new MovieItem[]{secondMovie};
        assertArrayEquals(actual, expected);
    }
}