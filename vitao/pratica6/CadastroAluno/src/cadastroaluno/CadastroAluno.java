package cadastroaluno;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CadastroAluno extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}

// Codigo base

//package cadastroaluno;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.scene.Group;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.TextArea;
//import javafx.scene.layout.VBox;
//import javafx.stage.FileChooser;
//import javafx.stage.Stage;
// 
//public class CadastroAluno extends Application {
//     
//    @Override
//    public void start(Stage primaryStage) {
//        primaryStage.setTitle("Cadastro Aluno");
//        Group root = new Group();
//         
//        TextArea textArea = new TextArea();
// 
//        Button buttonSave = new Button("Save");
//                 
//        buttonSave.setOnAction((ActionEvent event) -> {
//            FileChooser fileChooser = new FileChooser();
//             
//            //Set extension filter
//            FileChooser.ExtensionFilter extFilter = 
//                new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
//            fileChooser.getExtensionFilters().add(extFilter);
//             
//            //Show save file dialog
//            File file = fileChooser.showSaveDialog(primaryStage);
//             
//            if(file != null){
//                SaveFile(textArea.getText(), file);
//            }
//        });
//         
//        VBox vBox = new VBox();
//        vBox.getChildren().addAll(textArea, buttonSave);
//         
//        root.getChildren().add(vBox);
//         
//        primaryStage.setScene(new Scene(root, 500, 400));
//        primaryStage.show();
//    }
// 
//    public static void main(String[] args) {
//        launch(args);
//    }
// 
//    private void SaveFile(String content, File file){
//        try {
//            FileWriter fileWriter;
//              
//            fileWriter = new FileWriter(file);
//            fileWriter.write(content);
//            fileWriter.close();
//        } catch (IOException ex) {
//            Logger.getLogger(CadastroAluno.class
//                .getName()).log(Level.SEVERE, null, ex);
//        }
//          
//    }
//     
//}
