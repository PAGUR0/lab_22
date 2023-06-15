package com.company;

public class Main {

    public static void main(String[] args) {
		Voltage voltage = new Voltage();
		PhoneCharger phoneCharger = new PhoneCharger();
		Charger adapter = new Adapter(voltage);
		adapter.charger(phoneCharger);
    }
}
