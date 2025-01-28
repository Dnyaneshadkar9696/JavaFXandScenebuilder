package com.example.hellowsorkdjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class HelloController {

    @FXML
    private Label welcomeText;
    private MouseEvent event;

    @FXML
    void onHelloButtonClick(ActionEvent event) {

    }

    @FXML
    void onnameclick(MouseEvent event) {
        System.out.println("Dnyanesh");
    }

}
