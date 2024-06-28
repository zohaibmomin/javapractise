package com.example.prototype;

public class NetworkConnection implements Cloneable{
    private String networkIP;
    private final static String data="Hello dummy image across 1000km";

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NetworkConnection{");
        sb.append("networkIP='").append(networkIP).append('\'');
        sb.append(", data='").append(data).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void loadVeryImportantData() throws InterruptedException {
        System.out.println("Loading important data");
        Thread.sleep(2000);
    }

    public String getNetworkIP() {
        return networkIP;
    }

    public void setNetworkIP(String networkIP) {
        this.networkIP = networkIP;
    }

    public String getData() {
        return data;
    }

    @Override
    public NetworkConnection clone() {
        try {
            NetworkConnection clone = (NetworkConnection) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
