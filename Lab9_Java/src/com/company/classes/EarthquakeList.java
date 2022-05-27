package com.company.classes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EarthquakeList implements java.io.Serializable{
    private ArrayList<Earthquake> results;
    public ArrayList<Earthquake> getList() {
        return results;
    }

    public void Earthquakes(ArrayList<Earthquake> earthquakes) {
        this.results = earthquakes;
    }

    public void setResults(ArrayList<Earthquake> results) {
        this.results = results;
    }

    public void Earthquakes() {
        results = new ArrayList<>();
    }

    public void add(Earthquake earthquake) {
        this.results.add(earthquake);
    }

    @Override
    public String toString() {
        return "EarthquakeList{" +
                "earthquakes=" + results +
                '}';
    }
}
