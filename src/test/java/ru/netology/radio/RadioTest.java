package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

public class RadioTest {

    @Test
    public void shouldSetNumberStaton() {
        Radio station = new Radio();
        station.setNumberStation(9);
        int expected = 9;
        int actual = station.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberChannelBelowMin() {
        Radio station = new Radio();
        station.setNumberStation(-1);
        int expected = 10;
        int actual = station.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentChannelBelowMin() {
        Radio station = new Radio();
        station.setNumberStation(-7);
        int expected = 10;
        int actual = station.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation() {
        Radio station = new Radio();
        station.setCurrentStation(9);
        int expected = 9;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberStation11() {
        Radio station = new Radio(11);
        station.setNumberStation(9);
        int expected = 9;
        int actual = station.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation11() {
        Radio station = new Radio(11);
        station.setCurrentStation(9);
        int expected = 9;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStation11() {
        Radio station = new Radio(11);
        station.setCurrentStation(6);
        int expected = 6;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMax11() {
        Radio station = new Radio(11);
        station.setCurrentStation(11);
        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStation11() {
        Radio station = new Radio(11);
        station.setCurrentStation(8);
        station.increaseStation();
        int expected = 9;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void IncreaseStation11() {
        Radio station = new Radio(11);
        station.setCurrentStation(10);
        station.increaseStation();
        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStation11() {
        Radio station = new Radio(11);
        station.setCurrentStation(1);
        station.decreaseStation();
        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseStation11() {
        Radio station = new Radio(11);
        station.setCurrentStation(0);
        station.decreaseStation();
        int expected = 10;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationBelowMin() {
        Radio station = new Radio();
        station.setCurrentStation(-10);
        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMax() {
        Radio station = new Radio();
        station.setCurrentStation(14);
        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStation() {
        Radio station = new Radio();
        station.setCurrentStation(5);
        station.increaseStation();
        int expected = 6;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStation0() {
        Radio station = new Radio();
        station.setCurrentStation(9);
        station.increaseStation();
        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStation() {
        Radio station = new Radio();
        station.setCurrentStation(1);
        station.decreaseStation();
        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStation0() {
        Radio station = new Radio();
        station.setCurrentStation(0);
        station.decreaseStation();
        int expected = 9;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-11);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(101);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolume0() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume0() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1);
        volume.decreaseVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        volume.increaseVolume();
        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(27);
        volume.increaseVolume();
        int expected = 28;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin11() {
        Radio volume = new Radio(11);
        volume.setCurrentVolume(-11);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax11() {
        Radio volume = new Radio(11);
        volume.setCurrentVolume(101);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume11() {
        Radio volume = new Radio(11);
        volume.setCurrentVolume(7);
        volume.increaseVolume();
        int expected = 8;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolume11() {
        Radio volume = new Radio(11);
        volume.setCurrentVolume(100);
        volume.increaseVolume();
        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolume11() {
        Radio volume = new Radio(11);
        volume.setCurrentVolume(1);
        volume.decreaseVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolume011() {
        Radio volume = new Radio(11);
        volume.setCurrentVolume(0);
        volume.decreaseVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
