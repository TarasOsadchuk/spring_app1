package com.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    List<Music> musicList;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic() {
        Random random = new Random();
        return "Playing: " + musicList.get(random.nextInt(musicList.size())).getSongs();
    }
//    private Music music1;
//    private Music music2;
//    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
//                       @Qualifier("rockMusic") Music music2) {
//        this.music1 = music1;
//        this.music2 = music2;
//    }
//    public String playMusic() {
//        return ("Playing: " + music1.getSongs() + " " + music2.getSongs());
//    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}