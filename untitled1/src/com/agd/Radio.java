package com.company;

public class Radio implements IRemotable {
    private boolean isTurnedOn;
    private String channelName;
    private int fmChannel = 805;
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
        ++fmChannel;
    }

    @Override
    public void changeVolumeByAmount(int amount) {
        volume += amount;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }
}
