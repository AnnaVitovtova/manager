package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    Manager manager = new Manager();

    @Test
    void addFilm() {
        this.manager.addFilm("Бландшот");


        String[] mas = manager.findAll();

        String[] expected = {"Бландшот"};
        String[] actual = this.manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void addFilmLastElement() {
        this.manager.addFilm("Бландшот");
        this.manager.addFilm("Вперёд");
        this.manager.addFilm("Отель Белград");
        this.manager.addFilm("Джентельмены");
        this.manager.addFilm("Человек невидимка");
        this.manager.addFilm("Тролли. Мировой тур");


        String[] mas = manager.findAll();

        String[] expected = {"Бландшот", "Вперёд", "Отель Белград",
                "Джентельмены", "Человек невидимка", "Тролли. Мировой тур"};
        String[] actual = this.manager.findAll();

        assertArrayEquals(expected, actual);


        assertEquals("Тролли. Мировой тур", mas[mas.length - 1]);

        this.manager.addFilm("Номер один");

        mas = this.manager.findAll();

        assertEquals("Номер один", mas[mas.length - 1]);


    }

    @Test
    void findAll() {
        this.manager.addFilm("Бландшот");
        this.manager.addFilm("Вперёд");
        this.manager.addFilm("Отель Белград");
        this.manager.addFilm("Джентельмены");
        this.manager.addFilm("Человек невидимка");
        this.manager.addFilm("Тролли. Мировой тур");
        this.manager.addFilm("Номер один");

        String[] mas = manager.findAll();

        String[] expected = {"Бландшот", "Вперёд", "Отель Белград",
                "Джентельмены", "Человек невидимка", "Тролли. Мировой тур", "Номер один"};
        String[] actual = this.manager.findAll();

        assertArrayEquals(expected, actual);


    }

    @Test
    void findLast() {
        this.manager.addFilm("Отель Белград");
        this.manager.addFilm("Джентельмены");
        this.manager.addFilm("Человек невидимка");
        this.manager.addFilm("Тролли. Мировой тур");
        this.manager.addFilm("Номер один");

        String[] mas = manager.findAll();

        String[] expected = {"Номер один", "Тролли. Мировой тур", "Человек невидимка",
                "Джентельмены", "Отель Белград"};
        String[] actual = this.manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLastDefaultMax() {
        this.manager.addFilm("Отель Белград");
        this.manager.addFilm("Джентельмены");
        this.manager.addFilm("Человек невидимка");
        this.manager.addFilm("Тролли. Мировой тур");
        this.manager.addFilm("Номер один");
        this.manager.addFilm("Вперёд");
        this.manager.addFilm("Белград");
        this.manager.addFilm("111");
        this.manager.addFilm("222");
        this.manager.addFilm("333");
        this.manager.addFilm("444");

        String[] mas = manager.findAll();

        int expected = 10;

        String[] newMas = this.manager.findLast();

        int actual = newMas.length;

        assertEquals(expected, actual);
    }

    @Test
    void findLastCustomMax() {

        Manager manager = new Manager(3);
        manager.addFilm("Отель Белград");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек невидимка");
        manager.addFilm("Тролли. Мировой тур");
        manager.addFilm("Номер один");
        manager.addFilm("Вперёд");
        manager.addFilm("Белград");
        manager.addFilm("111");
        manager.addFilm("222");
        manager.addFilm("333");
        manager.addFilm("444");

        String[] mas = manager.findAll();

        int expected = 3;

        String[] newMas = manager.findLast();

        int actual = newMas.length;

        assertEquals(expected, actual);
    }
}