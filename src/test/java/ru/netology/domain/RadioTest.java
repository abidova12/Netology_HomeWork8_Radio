package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {


    @Test
    void limitVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(5);

        int actual = rad.getCurrentVolume();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void limitVolumeLessNull() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);

        int actual = rad.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void limitVolumeMoreTen() {
        Radio rad = new Radio();

        rad.setCurrentVolume(11);

        int actual = rad.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void maxVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(9);

        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void maxVolumeMoreTen() {
        Radio rad = new Radio();

        rad.setCurrentVolume(10);

        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void minVolumeNoTen() {
        Radio rad = new Radio();

        rad.setCurrentVolume(10);

        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void minVolumeNoNull() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);

        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void limitStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(7);

        int actual = rad.getCurrentStation();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    void limitStationMoreNine() {
        Radio rad = new Radio();

        rad.setCurrentStation(10);

        int actual = rad.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void limitStationLessNull() {
        Radio rad = new Radio();

        rad.setCurrentStation(-2);

        int actual = rad.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void nextStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(4);

        rad.increaseStation();

        int actual = rad.getCurrentStation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void nextStationMoreNine() {
        Radio rad = new Radio();

        rad.setCurrentStation(9);

        rad.increaseStation();

        int actual = rad.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }


    @Test
    void prevStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(5);

        rad.decreaseStation();

        int actual = rad.getCurrentStation();
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    void prevStationLessNull() {
        Radio rad = new Radio();

        rad.setCurrentStation(0);

        rad.decreaseStation();

        int actual = rad.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }
}
