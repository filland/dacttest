import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class DactTestController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button arcButton;

    @FXML
    private Button curlButton;

    @FXML
    private Label labelScore;

    @FXML
    private Button loopButton;

    @FXML
    private ImageView uzor;

    Image znak = new Image("/sample/zavitok.jpg");


    @FXML
    void initialize() {

    }
    
}
