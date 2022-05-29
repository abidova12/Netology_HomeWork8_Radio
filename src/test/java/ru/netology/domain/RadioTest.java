package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {


    @Test
    void limitVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(11);

        int actual = rad.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void maxVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(10);

        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void minVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(10);

        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void limitStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(10);

        int actual = rad.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void nextStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(9);

        rad.increaseStation();

        int actual = rad.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void prevVolume() {
        Radio rad = new Radio();

        rad.setCurrentStation(0);

        rad.decreaseStation();

        int actual = rad.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }
}
