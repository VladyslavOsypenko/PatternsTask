package org.main;

import org.radio.Broadcasts_composer.Advertising;
import org.radio.Broadcasts_composer.CompoundBroadcast;
import org.radio.Broadcasts_composer.Interview;
import org.radio.Broadcasts_composer.Song;
/**
.Для реализации структуры программы был выбран паттерн компановщик.
..Для постороенния объекта я хотел использовать паттерн билдер, чтобы собирать трансляцию из песен,
интервью и рекламы - это не реалезовано пока что...
*/
public class Main {
    public static void main(String[] args) {
        CompoundBroadcast b1 = new CompoundBroadcast(131, "Test", new Song(320,"SingerTest","SongTest"),new Interview(120,"TestInterview"), new Advertising(10, "TestProduct"));
        b1.getBroadcast(b1);
    }
}
