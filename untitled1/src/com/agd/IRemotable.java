package com.company;

public interface IRemotable {
    public void turnOn();
    public void turnOff();
    public String showChannelName();
    public void nextInput();
    public void changeVolumeByAmount(int amount);
    public int getVolume();
}
