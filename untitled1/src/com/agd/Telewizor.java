package com.company;

public class Telewizor implements IRemotable {
    private boolean isTurnedOn;
    private String channelName = "Polsat";
    private int input;
    private int volume;

    @Override
    public void turnOn() {
        isTurnedOn = true;
    }

    @Override
    public void turnOff() {
        isTurnedOn = false;
    }

    @Override
    public String showChannelName() {
        return channelName;
    }

    @Override
    public void nextInput() {
        ++input;
    }

    @Override
    public void changeVolumeByAmount(int amount) {
        volume += amount;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    public int getInput() {
        return input;
    }
}
