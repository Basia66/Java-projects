package com.company;

public class Main {

    public static void main(String[] args) {
        Telewizor telewizor = new Telewizor();
        Radio radio = new Radio();

        telewizor.nextInput();
        radio.turnOn();
        telewizor.turnOff();
        radio.changeVolumeByAmount(15);
        telewizor.turnOn();
        telewizor.nextInput();

        // wyświetlenie zmienionych ustawień
        System.out.println(telewizor.showChannelName());
        System.out.println(telewizor.getInput());
        System.out.println(radio.isTurnedOn());

        // konwersja do typu jako interfejs
        IRemotable remoteRadio = radio;
        System.out.println(remoteRadio.getVolume());
        remoteRadio.turnOff();
    }
}
