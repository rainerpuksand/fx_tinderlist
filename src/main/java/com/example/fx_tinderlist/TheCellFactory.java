package com.example.fx_tinderlist;

import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

public class TheCellFactory implements Callback<ListView<Stuff>, ListCell<Stuff>> {

        @Override
        public ListCell<Stuff> call(ListView<Stuff> param) {
            System.out.println("At Factory...." + param);
            return new StuffCell();
        }


}
