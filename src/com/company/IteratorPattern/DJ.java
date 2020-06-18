package com.company.IteratorPattern;

import java.time.chrono.IsoChronology;
import java.util.Iterator;
import java.util.function.DoubleToIntFunction;

public class DJ {
    private ISongIterator songs70s;
    private ISongIterator songs80s;
    private ISongIterator songs90s;

    public DJ(ISongIterator newSongs70s, ISongIterator newSongs80s, ISongIterator newSongs90s) {
        songs70s = newSongs70s;
        songs80s = newSongs80s;
        songs90s = newSongs90s;
    }
    public void showTheSongs(){
        System.out.println("70's\n");
        Iterator songIterator70s = songs70s.createIterator();
        printTheSongs(songIterator70s);

        System.out.println("80's\n");
        Iterator songIterator80s = songs80s.createIterator();
        printTheSongs(songIterator80s);

        System.out.println("90's\n");
        Iterator songIterator90s = songs90s.createIterator();
        printTheSongs(songIterator90s);

    }

    private void printTheSongs(Iterator songsIterator){
        while (songsIterator.hasNext()){
            SongInfo song = (SongInfo) songsIterator.next();
            System.out.println(song.getSongName());
            System.out.println(song.getBandName());
            System.out.println(song.getYearReleased());
        }
    }


}
