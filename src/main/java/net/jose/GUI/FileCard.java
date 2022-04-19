package net.jose.GUI;

import java.io.FileInputStream;
import java.io.IOException;

import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class FileCard extends GridPane {
     
    public FileCard(String text, String file){
        
        this.setGridLinesVisible(false);
        this.setPadding(new Insets(5.0f));
        this.setVgap(10.0f);
        this.setHgap(10.0f);
        this.setBackground(new Background(new BackgroundFill(Color.ALICEBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        this.add(new Text(text), 0, 0, 1, 1);

        try (FileInputStream input = new FileInputStream(file)) {

            Image img = new Image(input);
            ImageView iView = new ImageView(img);
            iView.setPreserveRatio(true);
            iView.setFitHeight(100.0f);
            this.add(new HBox(iView), 1, 0, 2, 2);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

     }
}
