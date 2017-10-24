/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleestoque;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

/**
 *
 * @author Aluno 12
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TableView<?> tblbusca;
    @FXML
    private TextArea txtbusca;
    @FXML
    private Button btnbusca;
    @FXML
    private Button btnacrescentar;
    @FXML
    private TextArea txtidprod;
    @FXML
    private TextArea txtqtd;
    @FXML
    private Button btnremover;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnbusca(ActionEvent event) {
    }

    @FXML
    private void btnacrescentar(ActionEvent event) {
    }

    @FXML
    private void btnremover(ActionEvent event) {
    }
    
}
