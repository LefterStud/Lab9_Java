package com.company.classes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JSONGetter extends Thread{
    //Считывание данных из API
    public static EarthquakeList loadByURL(String url) throws IOException
    {
        StringBuilder jsonIn = new StringBuilder();
        InputStream is = null;
        is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            int cp;
            while ((cp = rd.read()) != -1) {
                jsonIn.append((char) cp);
            }
        }
        finally {
            is.close();
        }
        return new ObjectMapper().readValue(jsonIn.toString().strip(), EarthquakeList.class);
    }
}
