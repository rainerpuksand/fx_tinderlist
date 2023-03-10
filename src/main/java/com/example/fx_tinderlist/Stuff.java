package com.example.fx_tinderlist;

import javafx.scene.image.Image;

public class Stuff {
    int id;
    String name, imgId;
    Image img;
    boolean isLiked;

    final String imgURL = "https://picsum.photos/id/";

    public Stuff(int id, String name, String imgId, boolean isLiked) {
        this.id = id;
        this.name = name;
        this.imgId = imgId;

        String path = imgURL + imgId + "/200/300";
        img = new Image(path);

        this.isLiked = isLiked;

    }
}
