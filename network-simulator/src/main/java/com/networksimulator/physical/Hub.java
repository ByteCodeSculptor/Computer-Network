package com.networksimulator.physical;

import java.util.ArrayList;
import java.util.List;

public class Hub {

    private List<EndDevice> connectedDevices;

    public Hub() {
        connectedDevices = new ArrayList<>();
    }

    public void addDevice(EndDevice device) {
        connectedDevices.add(device);
    }

    public void broadcastData(byte[] data) {
        for (EndDevice device : connectedDevices) {
            device.receiveData(data);
        }
    }
}
