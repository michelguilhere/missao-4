package com.mycompany.projeto_michel;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;
import static javafx.application.Application.launch;
import javafx.scene.control.ScrollPane;

public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        Text titleLabel = new Text("Site do Michel");
        Text titleLabel2 = new Text("Clique no botão para ter uma interção com este site");
        titleLabel.setStyle("-fx-fill: blue");
        titleLabel.setFont(Font.font("Times", FontWeight.BOLD, 30));
        titleLabel2.setStyle("-fx-fill: blue");
        titleLabel2.setFont(Font.font("Verdana", FontWeight.BOLD, 13));
        Text textLabel = new Text(" Site teste da matéria programação para Interface de Usuário "
                + "do aluno Guilherme Michel do 6º semestre do curso de ciência da computação. "
                + "Site teste realizado no netbeans contendo dois botões interativos, sendo um onde acusa "
                + "o clique e outro carrega uma image API através de um link."
                + "Site teste da matéria programação para Interface de Usuário "
                + "do aluno Guilherme Michel do 6º semestre do curso de ciência da computação. "
                + "Site teste realizado no netbeans contendo dois botões interativos, sendo um onde acusa "
                + "o clique e outro carrega uma image API através de um link.");
        textLabel.setWrappingWidth(600);
        
        
        Button button = new Button("CLIQUE AQUI!");
        button.setOnAction(e -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Você clicou no botão interativo desse site");
            alert.showAndWait();
        });
        button.setStyle("-fx-background-color: #989699; -fx-text-fill: black;");
        
        Text addtionalTitleLabel = new Text ("Seção Importante");
        addtionalTitleLabel.setFont(Font.font("Times", FontWeight.BOLD, 30));
        Text additionalTextLabel = new Text("Seção importante para mencionar uma API "
                + "que pega imagens em que alunos da instituição tiraram com efeito cinza de paisagens"
                + "em locais aleatórios. Seção importante para mencionar uma API "
                + "que pega imagens em que alunos da instituição tiraram com efeito cinza de paisagens"
                + "em locais aleatórios. ");
        additionalTextLabel.setWrappingWidth(600);
        
        
        Image image = new Image("https://www.unijui.edu.br/images/stories/manual_identidade/marcas/download.php?arquivo=marca.png");
        ImageView imageView = new ImageView(image);
        imageView.setPreserveRatio(true);
        imageView.setFitHeight(image.getHeight() * 0.1);
        imageView.setFitWidth(image.getWidth() * 0.1);
        
        ImageView apiImageView = new ImageView();
       
        
        Button apiButton = new Button("API imagem cinza");

        
        apiButton.setOnAction(e -> {
           
            String imageUrl = "https://picsum.photos/200/300?grayscale";
            
           
            Image apiImage = new Image(imageUrl);
            
           
            apiImageView.setImage(apiImage);
        });
        VBox vbox = new VBox(
        titleLabel, textLabel, titleLabel2,
        new Text(), new Text(),
        button, addtionalTitleLabel,
        additionalTextLabel, imageView,
        apiButton, apiImageView
);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(10);
        
        
        vbox.setStyle("-fx-background-color: #CCCCCC;");
        ScrollPane scrollPane = new ScrollPane(vbox);
        scrollPane.setFitToWidth(true);
        
        
        scene = new Scene(scrollPane, 650, 500);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}
