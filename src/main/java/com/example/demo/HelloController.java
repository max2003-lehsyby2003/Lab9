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



    public void initialize(){

    }
    public double function(double x, double a, double b){
        double eps = 1e-7;

        if ((0.7<x) && (x<=1.4+eps))
            return a*x*x*Math.log(x);
        else
        if (x<=0.7+eps)
            return 1;
        else
            return Math.exp(x*a)*Math.cos(b*x);

    }

    public double sum(double[] y) {
        double sum = 0;
        for (double v : y) sum = sum + v;

        return sum;
    }




    public double[] masivX (double b, double d, double h ){
        double [] masivX= new double[point(b, d, h)];
        for (int i = 0; i < masivX.length; i++){
            masivX[i]= b+i*h;

        }

        return masivX;
    }
    public int point (double b, double d, double h){

        return(int) ((d-b)/h+1);
    }
    public double[] masivY (double a, double b, double[] masivX){
        double[] masivY= new double[masivX.length];
        for (int i = 0; i < masivY.length; i++) {
            masivY[i]= function(masivX[i],a,b);
        }
        return masivY;
    }


    public void print(){

        double a = Double.parseDouble(X.getText());
        double b = Double.parseDouble(Y.getText());
        double d = Double.parseDouble(D.getText());
        double h = Double.parseDouble(H.getText());
        double []x= masivX(a, d, h);
        double[] y = masivY(a, b, x);
        int imin = indexMinY(y);
        int imax = indexMaxY(y);
        int point= point( b, d, h);
        double sumY = sum(y);
        double sered= seredArefmY(y);
        lable.setText("sumY= " +String.valueOf(sumY));
        lable3.setText("sered= " +String.valueOf(sered));
        lable1.setText("imin= " + String.valueOf(imin));
        lable2.setText("imax= " +String.valueOf(imax));
        lable4.setText("point= " +String.valueOf(point));

    }
    public double seredArefmY(double[] y) {
        return  sum(y)/y.length;

    }
    public int indexMinY(double[] y){
        int min = 0;
        for (int i = 0; i < y.length; i++)
            if (y[min] > y[i])
                min = i;
        return min;
    }
    public int indexMaxY(double[] y){
        int max = 0;
        for (int i = 0; i < y.length; i++)
            if (y[max] < y[i])
                max = i;
        return max;
    }


}