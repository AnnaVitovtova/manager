package ru.netology.domain;

public class Manager {
    private String[] nameFilms = {};

    private int resultLength = 10;

    public Manager() {
    }

    public Manager(int resultLength) {
        this.resultLength = resultLength;
    }


    public void addFilm(String name) {
        int length = this.nameFilms.length + 1;

        String[] tempFilmArray = new String[length];

        System.arraycopy(this.nameFilms, 0, tempFilmArray, 0, length - 1);

        tempFilmArray[length - 1] = name;

        this.nameFilms = tempFilmArray;
    }

    public String[] findAll() {
        return this.nameFilms;
    }

    public String[] findLast() {
        int resultLength = this.resultLength;


        if (this.nameFilms.length == 0) {
            return this.nameFilms;
        }

        if (resultLength > this.nameFilms.length) {
            resultLength = this.nameFilms.length;
        }

        String[] mas = new String[resultLength];

        for (int i = 0; i <= resultLength - 1; i++) {
            int index = this.nameFilms.length - i - 1;
            mas[i] = this.nameFilms[index];
        }

        return mas;
    }
}







