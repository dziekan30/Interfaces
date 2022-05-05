package com.dziekan30;

public class Main {

    public static void main(String[] args) {
        ITelephone timPhone;
        timPhone = new DeskPhone(123345);
        timPhone.powerOn();
        timPhone.callPhone(123345);
        timPhone.answer();

        timPhone = new MobilePhone(456666);
        timPhone.powerOn();
        timPhone.callPhone(456666);
        timPhone.answer();
    }
}