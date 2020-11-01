package org.openjfx;

import javafx.util.Duration;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class FXMLController {
    
    @FXML
    private Label label;
    
    private  Circle circle;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
        if (circle != null) {
        	circle.setVisible(false);
            PauseTransition wait = new PauseTransition(Duration.seconds(1));
            wait.setOnFinished(value -> circle.setVisible(true));
            wait.play();        	
        }


    }
    
    public void initialize() {
        // TODO
    } 
    
    public void setCircle(Circle circle) {
    	this.circle = circle;
    }
}
