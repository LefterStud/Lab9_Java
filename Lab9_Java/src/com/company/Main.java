package com.company;

import com.company.classes.Earthquake;
import com.company.classes.EarthquakeList;
import com.company.classes.JSONGetter;
import java.io.IOException;

/**
 * Lefter Olexiy, 18
 */
public class Main {
    /**
     * В отдельном классе реализовать загрузку данных отдельным потоком из JSON любого сайта, отдающего данные  этом формате.
     * Реализовать возможность фильтрации полученных данных и поиска по списку с использованием компараторов в виде лямбда-выражений
     * Выгрузить проект в репозиторий GitHub и добавить к нему описание в README (кратко, несколько строк пояснений по каждому заданию)
     * Прикрепить ссылку на репозиторий в виде ответа на задание
     * */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        EarthquakeList earthquakeList = new EarthquakeList();
        earthquakeList = JSONGetter.loadByURL("https://apis.is/earthquake/is");
        System.out.println(earthquakeList);

        //Сортировка списков и вывод отсортированных списков объектов
        System.out.println("-------------------------------------------------\n\nSorting by size");
        earthquakeList.getList().sort(Earthquake.bySizeUp);
        System.out.println(earthquakeList);
        System.out.println("-------------------------------------------------\n\nSorting by depth:");
        earthquakeList.getList().sort(Earthquake.byDepthDown);
        System.out.println(earthquakeList);
        System.out.println("-------------------------------------------------\n\nSorting by quality:");
        earthquakeList.getList().sort(Earthquake.byQualityUp);
        System.out.println(earthquakeList);
    }
}
