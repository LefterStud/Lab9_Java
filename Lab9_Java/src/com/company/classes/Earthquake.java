package com.company.classes;


import java.util.Comparator;

public class Earthquake implements java.io.Serializable{
    private String timestamp;
    private double latitude;
    private double longitude;
    private double depth;
    private double size;
    private double quality;
    private String humanReadableLocation;

    public Earthquake(String timestamp, double latitude, double longitude, double depth, double size, double quality, String humanReadableLocation) {
        this.setTimestamp(timestamp);
        this.setLatitude(latitude);
        this.setLongitude(longitude);
        this.setDepth(depth);
        this.setSize(size);
        this.setQuality(quality);
        this.setHumanReadableLocation(humanReadableLocation);
    }

    public Earthquake() {
    }

    public String getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
    public double getLatitude() {
        return latitude;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public double getLongitude() {
        return longitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    public double getDepth() {
        return depth;
    }
    public void setDepth(double depth) {
        this.depth = depth;
    }
    public double getSize() {
        return size;
    }
    public void setSize(double size) {
        this.size = size;
    }
    public double getQuality() {
        return quality;
    }
    public void setQuality(double quality) {
        this.quality = quality;
    }
    public String getHumanReadableLocation() {
        return humanReadableLocation;
    }
    public void setHumanReadableLocation(String humanReadableLocation) {
        this.humanReadableLocation = humanReadableLocation;
    }

    @Override
    public String toString() {
        return "Earthquake{" +
                "timestamp: " + timestamp +
                ", latitude: " + latitude +
                ", longitude: " + longitude +
                ", depth: " + depth +
                ", size: " + size +
                ", quality: " + quality +
                ", humanReadableLocation: '" + humanReadableLocation + '\'' +
                '}'+
                System.lineSeparator();
    }

    //Методы(Компараторы) сортировки по полям
    public static Comparator<Earthquake> bySizeUp = (o1, o2) -> o1.size > o2.size ? 1 : o1.size < o2.size ? -1 : 0;
    public static Comparator<Earthquake> bySizeDown = (o1, o2) -> o1.size < o2.size ? 1 : o1.size > o2.size ? -1 : 0;
    public static Comparator<Earthquake> byDepthUp = (o1, o2) -> o1.depth > o2.depth ? 1 : o1.depth < o2.depth ? -1 : 0;
    public static Comparator<Earthquake> byDepthDown = (o1, o2) -> o1.depth < o2.depth ? 1 : o1.depth > o2.depth ? -1 : 0;
    public static Comparator<Earthquake> byQualityUp = (o1, o2) -> o1.quality > o2.quality ? 1 : o1.quality < o2.quality ? -1 : 0;
    public static Comparator<Earthquake> byQualityDown = (o1, o2) -> o1.quality < o2.quality ? 1 : o1.quality > o2.quality ? -1 : 0;
}
