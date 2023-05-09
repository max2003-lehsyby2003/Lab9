package com.example.demo;

//import javafx.event.ActionEvent;
import javafx.fxml.FXML;
//import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
//import javafx.scene.layout.Pane;

//import java.awt.*;

public class HelloController {


    @FXML
    private Label lable;
    @FXML
    private Label lable1;
    @FXML
    private Label lable2;
    @FXML
    private Label lable3;
    @FXML
    private Label lable4;

    @FXML
    private TextField D;
    @FXML
    private TextField X;
    @FXML
    private TextField Y;
    @FXML
    private TextField H;

    Logic logic= new Logic ();





    public void print(){

        double a = Double.parseDouble(X.getText());
        double b = Double.parseDouble(Y.getText());
        double d = Double.parseDouble(D.getText());
        double h = Double.parseDouble(H.getText());
        double []x= logic.masivX(a, d, h);
        double[] y = logic.masivY(a, b, x);
        int imin = logic.indexMinY(y);
        int imax = logic.indexMaxY(y);
        int point= logic.point( b, d, h);
        double sumY = logic.sum(y);
        double sered= logic.seredArefmY(y);
        lable.setText("sumY= " +String.valueOf(sumY));
        lable3.setText("sered= " +String.valueOf(sered));
        lable1.setText("imin= " + String.valueOf(imin));
        lable2.setText("imax= " +String.valueOf(imax));
        lable4.setText("point= " +String.valueOf(point));

    }



}