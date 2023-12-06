package com.example.eventmanagementsystem;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import java.io.File;
import java.util.ResourceBundle;
import java.net.URL;

public class Logincontroller {
    @FXML
     private Button cancelButton;
    @FXML
    private Label loginmsglabel;
    @FXML
    private TextField usernametextfield;
    @FXML
    private PasswordField passwordtextfield;
    public void loginButtonOnAction(ActionEvent event)
    { if(usernametextfield.getText().isBlank()==false&&passwordtextfield.getText().isBlank()==false){
        loginmsglabel.setText("try to login");
    }
    else{
        loginmsglabel.setText("Enter username and password");
    }}
    public void cancelButtonOnAction(ActionEvent event){
        Stage stage =(Stage) cancelButton.getScene().getWindow();
        stage.close();
    }
    //public void validatelogin(){

   // }
}