package cadastroaluno;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class FXMLDocumentController implements Initializable {

    private String imageFile;
    
    @FXML
    TextField nomeCompleto = new TextField();

    @FXML
    private Label fileSelected = new Label();
    
    @FXML
    ImageView profilePic = new ImageView();

    @FXML
    TextField endereco = new TextField();

    @FXML
    TextField idade = new TextField();

    @FXML
    TextField cpf = new TextField();

    @FXML
    TextField rg = new TextField();

    @FXML
    private Label label;
    
    @FXML
    TextArea txtArea = new TextArea();

    public void pickImage (ActionEvent actionEvent) throws MalformedURLException {

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Image File");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Image Files",
                        "*.bmp", "*.png", "*.jpg", "*.gif")); // limit fileChooser options to image files
        File selectedFile = fileChooser.showOpenDialog(fileSelected.getScene().getWindow());

        if (selectedFile != null) {

            imageFile = selectedFile.toURI().toURL().toString();

            Image image = new Image(imageFile);
            profilePic.setImage(image);
        } else {
            fileSelected.setText("Image file selection cancelled.");
        }

    }

    @FXML
    private void btnLimpar(ActionEvent event) {
        imageFile = "file:/C:/Linguagens1_Projetos/pratica6/CadastroAluno/Avatar.png";
        Image image1 = new Image(imageFile);
        nomeCompleto.setText("");
        endereco.setText("");
        idade.setText("");
        cpf.setText("");
        rg.setText("");
        profilePic.setImage(image1);
    }

    @FXML
    private void btnSaveText(ActionEvent event) {
       try {
            Connection conexao = ConnectionFactory.getConnection();
            String sql = "INSERT INTO tblalunos (nome, idade, ra) VALUES (?, ?,? );";
            PreparedStatement ps;
            ps = conexao.prepareStatement(sql);
            ps.setString(1, nomeCompleto.getText());
            ps.setInt(2, Integer.parseInt(idade.getText()));
            ps.setString(3, rg.getText());
            
            if (ps.execute()) {
                System.out.println("Erro");
            } else {
                System.out.println("Parabains");
            }

        } catch (SQLException ex) {
            Logger.getLogger(CadastroAluno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    private void SaveFile(String content, File file) {
        try {
            FileWriter fileWriter;

            fileWriter = new FileWriter(file);
            fileWriter.write(content);
            fileWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(CadastroAluno.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }

}
