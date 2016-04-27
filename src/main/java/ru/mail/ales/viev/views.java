package ru.mail.ales.viev;

import javafx.collections.ObservableList;
import javafx.scene.layout.Pane;
import ru.mail.ales.entity.Product;

/**
 * Created by USER on 27.04.2016.
 */
public interface Views {
    Pane buildPane(final ObservableList<Product> data);
}
