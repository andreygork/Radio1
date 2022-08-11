package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

public class RadioTest {

    @Test
    public void setCurrentChannel() {
        Radio channel = new Radio();
        channel.setCurrentChannel(8);
        int expected = 8;
        int actual = channel.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentChannelAboveMax() {
        Radio channel = new Radio();
        channel.setCurrentChannel(13);
        int expected = 9;
        int actual = channel.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentChannelBelowMin() {
        Radio channel = new Radio();
        channel.setCurrentChannel(-7);
        int expected = 0;
        int actual = channel.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextChannel() {
        Radio channel = new Radio();
        channel.setCurrentChannel(3);
        channel.nextChannel();
        int expected = 4;
        int actual = channel.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevChannel() {
        Radio channel = new Radio();
        channel.setCurrentChannel(8);
        channel.prevChannel();
        int expected = 7;
        int actual = channel.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextChannelAboveMax() {
        Radio channel = new Radio();
        channel.setCurrentChannel(9);
        channel.nextChannel();
        int expected = 0;
        int actual = channel.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextChannelBelowMin() {
        Radio channel = new Radio();
        channel.setCurrentChannel(0);
        channel.prevChannel();
        int expected = 9;
        int actual = channel.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(7);
        int expected = 7;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeBelowMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-7);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeAboveMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(15);
        int expected = 10;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseCurrentVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.increaseVolume();
        int expected = 1;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseCurrentVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(10);
        volume.decreaseVolume();
        int expected = 9;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseCurrentVolumeAboveMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(35);
        volume.increaseVolume();
        int expected = 10;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseCurrentVolumeBelowMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-4);
        volume.decreaseVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}