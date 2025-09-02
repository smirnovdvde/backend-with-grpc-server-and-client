package ru.backendbyjava.service;

import ru.backendbyjava.proto.Video;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static ru.backendbyjava.proto.VideoCategory.*;

public class VideoHelper {

    private static List<Video> videos = Collections.emptyList();

    private VideoHelper() {

    }

    public static List<Video> buildVideoList() {
        if (!videos.isEmpty()) {
            return videos;
        }
        List<Video> newVideoList = Arrays.asList(
                Video.newBuilder()
                        .setTitle("God Father")
                        .setRating(10)
                        .setCategory(FILM_AND_ANIMATION)
                        .setDescription("About mafia")
                        .build(),

                Video.newBuilder()
                        .setTitle("Motos from China")
                        .setRating(8)
                        .setCategory(AUTOS_AND_VEHICLES)
                        .setDescription("Modern motos from China. Cheap by good")
                        .build(),

                Video.newBuilder()
                        .setTitle("Music of 20th Century")
                        .setRating(5)
                        .setCategory(MUSIC)
                        .setDescription("Collection of music from previous century")
                        .build(),

                Video.newBuilder()
                        .setTitle("Favourite pets in Germany")
                        .setRating(7)
                        .setCategory(PETS_AND_ANIMALS)
                        .setDescription("Which pets are the most popular in Germany?!")
                        .build(),

                Video.newBuilder()
                        .setTitle("Octoberfest 2025")
                        .setRating(4)
                        .setCategory(TRAVELS_AND_EVENTS)
                        .setDescription("How will Octoberfest look like in 2025")
                        .build(),

                Video.newBuilder()
                        .setTitle("The most popular blog in the Internet")
                        .setRating(9)
                        .setCategory(PEOPLE_AND_BLOGS)
                        .setDescription("This video tells about the most popular blog in the Internet")
                        .build()
        );

        videos = newVideoList;
        return videos;
    }
}
