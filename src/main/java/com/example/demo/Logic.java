package com.example.demo;

public class Logic {

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
