package org.main;

import org.radio.Broadcasts.Advertising;
import org.radio.Broadcasts.CompoundBroadcast;
import org.radio.Broadcasts.Interview;
import org.radio.Broadcasts.Song;

public class Main {
    public static void main(String[] args) {
        CompoundBroadcast b1 = new CompoundBroadcast(131, "Test", new Song(320,"SingerTest","SongTest"),new Interview(120,"TestInterview"), new Advertising(10, "TestProduct"));
        b1.getBroadcast(b1);
    }
}
