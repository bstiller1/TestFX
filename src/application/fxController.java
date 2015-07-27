package application;

import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;

public class fxController implements Initializable {
	@Override 
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
@FXML
private Button btn1;
@FXML
private Label lbl1;
@FXML
private TextField txt1;
@FXML
private TextField txt2;


public void clickME(ActionEvent event){
	
	lbl1.setText(txt1.getText() + " " + txt2.getText());
}

}
