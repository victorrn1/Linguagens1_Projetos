/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olajavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Aluno 12
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML   //Quando você quer que algo seja visto no XML
    private Label LblMensagem;
    private Button BtnClick;
    
    @FXML
    private void clickBotao(ActionEvent event) {
        BtnClick.setText("To go over, everything");
        LblMensagem.setText("I was wondering if after all this years u want to meet");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
