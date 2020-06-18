package com.company.IteratorPattern;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class Songs70s implements ISongIterator{
    SongInfo bestSongs[];
    int arrayValue = 0;

    public Songs70s() {

        bestSongs = new SongInfo[3];
        addSong("Roam", "B 52s", 1989);
        addSong("Cruel Summer", "Bananarama", 1984);
        addSong("Head Over Heels", "Tears For Fears", 1985);
    }

    private void addSong(String songName, String bandName, int releaseDate){
        SongInfo song = new SongInfo(songName, bandName, releaseDate);
        bestSongs[arrayValue++] = song;
    }

    @Override
    public Iterator createIterator() {
        return Arrays.asList(bestSongs).iterator();
    }
}
