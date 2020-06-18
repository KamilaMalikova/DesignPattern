package com.company.IteratorPattern;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

public class Songs90s implements ISongIterator{
    Hashtable<Integer, SongInfo> bestSongs;
    int index = 0;
    public Songs90s() {
        bestSongs = new Hashtable<>();
        addSong("Roam", "B 52s", 1989);
        addSong("Cruel Summer", "Bananarama", 1984);
        addSong("Head Over Heels", "Tears For Fears", 1985);
    }

    private void addSong(String songName, String bandName, int releaseDate){
        SongInfo song = new SongInfo(songName, bandName, releaseDate);
        bestSongs.put(index++, song);
    }

    @Override
    public Iterator createIterator() {
        return bestSongs.values().iterator();
    }
}
