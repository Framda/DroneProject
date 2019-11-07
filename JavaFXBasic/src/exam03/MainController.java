package exam03;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private Button btnOK;
    @FXML
    private Button btnCancel;
    //FXML 파일의 객체를 주입시켜줌 like Autowired

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btnOK.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("yee 버튼이 btnOK를 처리합니다");
            }
        });
        btnCancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("jueng 버튼이 btnCanel을 처리합니다");
            }
        });
    }
}