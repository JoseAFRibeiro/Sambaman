package net.jose.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import net.jose.GUI.FileCard;

public class MainController implements Initializable{

    @FXML
    private MenuItem adderMenu;
    @FXML
    private ScrollPane contentScroll;
    @FXML
    private VBox contentBox;
    
    @FXML
    private void addCard(ActionEvent e){
        
        for(int i = 0; i < 100; i++)
            contentBox.getChildren().add(new FileCard("Hello, world!", "src\\main\\resources\\net\\jose\\unnamed2.png"));

    }

    @FXML
    private TextField counter;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        
        
    }
}