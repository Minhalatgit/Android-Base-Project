package com.example.baseproject.network;

public class NetworkHandler {

    private static NetworkHandler networkHandler;

    public static NetworkHandler getInstance() {
        if (networkHandler == null) {
            return new NetworkHandler();
        }
        return networkHandler;
    }

}

