/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package loginpagebantal;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author MSI
 */
public class Dashboard2Controller implements Initializable {

    @FXML
    private BorderPane mainPane;
    
    OpenScene bukaScene = new OpenScene();
    
    @FXML
    private Button MemantauPerkembangan;
    
    
    @FXML
    private void mantauperkembangan(ActionEvent event) throws IOException {
        Pane halaman = bukaScene.getPane("FXMLMemantauPerkembangan.fxml");
        mainPane.setCenter(halaman);
        System.out.println("udah di click");
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}