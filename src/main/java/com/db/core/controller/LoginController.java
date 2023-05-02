package com.db.core.controller;
import java.io.IOException;
import com.db.core.dao.UserDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

	@FXML
    private Button btnLogin;

    @FXML
    private PasswordField password;

    @FXML
    private TextField username;

    @FXML
    private Label lblLogin;
    
    private UserDao userService;
            
	@FXML
    private void login(ActionEvent event) throws IOException{
    	/*if(userService.authenticate(getUsername(), getPassword())){
    		    		
    		stageManager.switchScene(FxmlView.USER);
    		
    	}else{
    		lblLogin.setText("Login Failed.");
    	}*/
    }
	

}
