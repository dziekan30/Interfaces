package com.dziekan30;

public class Gearbox {

    private boolean clutchIsIn;

    public void operateClutch(String inOrOut) {
        this.clutchIsIn = inOrOut.equalsIgnoreCase("in");
    }
}
