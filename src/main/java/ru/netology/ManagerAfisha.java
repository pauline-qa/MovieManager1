package ru.netology;

public class ManagerAfisha {
    private int itemQuantity = 10;
    private MovieItem[] items = new MovieItem[0];

    public ManagerAfisha(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public ManagerAfisha() {
    }

    public void addMovie(MovieItem item) {
        // создаём новый массив размером на единицу больше
        int newLength = items.length + 1;
        MovieItem[] tmp = new MovieItem[newLength];
        for (int i = 0; i < items.length; i++) { // скопировать из старого в новый
            tmp[i] = items[i]; // (присвой в ячейку нового массива то, что было в старой ячейке)
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public MovieItem[] getLastMovies() {
        int resultLength;
        if (items.length > itemQuantity) {
            resultLength = itemQuantity;
        } else {
            resultLength = items.length;
        }
        MovieItem[] result = new MovieItem[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}
