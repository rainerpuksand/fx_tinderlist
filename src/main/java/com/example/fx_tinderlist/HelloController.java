package com.example.fx_tinderlist;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.SwipeEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {


    @FXML
    ListView<Stuff> lv2;
    static ObservableList<Stuff> myList ;//needed by LV2


    @FXML
    void loadCustomList() {

        myList = FXCollections.observableArrayList(
                new Stuff(0,"YO", "1011", false),
                new Stuff(1,"Mr Two", "1025", false),
                new Stuff(2,"Root Nine", "1027", true),
                new Stuff(3,"For-U", "1069", false),
                new Stuff(4,"NoMan", "1074", false),
                new Stuff(5,"God@OMG", "1075", false),
                new Stuff(6,"IslandBoy", "1083", true),
                new Stuff(7,"Sweetzz", "133", false),
                new Stuff(8,"Ah-A", "219", true),
                new Stuff(9,"JoTv", "239", false),
                new Stuff(10,"Avokado", "240", false),
                new Stuff(11,"EggsOtic", "326", false) );

        System.out.println("----------");
        lv2.setItems(myList);
        lv2.setCellFactory(new TheCellFactory());


    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadCustomList();
    }





}