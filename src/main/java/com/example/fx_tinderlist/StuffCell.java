package com.example.fx_tinderlist;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class StuffCell extends ListCell<Stuff> {


    @FXML
    Label nameText;
    @FXML
    private ImageView imgV1;
    @FXML
    private ImageView imgV2;

    Image imgLiked;
    Image imgNotLiked;


    public StuffCell() {

        loadFXML();

        imgLiked = new Image(getClass().getResourceAsStream("/img/heart.png"));
        imgNotLiked = new Image(getClass().getResourceAsStream("/img/outline.png"));







    }

        private void loadFXML() {
            System.out.println("at FXML");
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("listcell_layout.fxml"));
                loader.setController(this);
                loader.setRoot(this);
                loader.load();
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public void updateItem(Stuff item, boolean empty) {
            super.updateItem(item, empty);

            if(empty || item == null) {
                //System.out.println("AT UPDATE....");
                setText(null);
                setContentDisplay(ContentDisplay.TEXT_ONLY);
            }
            else {
                //System.out.println("AT UPDATE...." + item.name + "..." + item.isLiked);
                nameText.setText(item.name);

                if(item.isLiked){ imgV2.setImage(imgLiked);}
                else{imgV2.setImage(imgNotLiked);}

                imgV1.setImage(item.img);
                imgV1.setOnDragDetected(dragEvent -> HelloController.myList.remove(item));


                imgV2.setOnMouseClicked(mouseEvent -> {
                    if(item.isLiked){ imgV2.setImage(imgNotLiked);}
                    else{imgV2.setImage(imgLiked);}
                    item.isLiked = ! item.isLiked;
                    HelloController.myList.set(item.id, item);
                });


                setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
            }
        }




}
