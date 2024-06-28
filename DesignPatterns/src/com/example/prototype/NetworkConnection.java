package com.example.prototype;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {
    private String networkIP;
    private final static String data = "Hello dummy image across 1000km";
    private List<String> domains = new ArrayList<>();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NetworkConnection{");
        sb.append("networkIP='").append(networkIP).append('\'');
        sb.append("data='").append(data).append('\'');
        sb.append(", domains=").append(domains);
        sb.append('}');
        return sb.toString();
    }

    public void loadVeryImportantData() throws InterruptedException {
        System.out.println("Loading important data");
        this.domains.add("www.google.com");
        this.domains.add("www.zohaib.com");
        this.domains.add("www.demosample.com");
        this.domains.add("www.helloworld.com");
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

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
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
