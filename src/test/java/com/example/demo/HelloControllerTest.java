package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class HelloControllerTest {
        HelloController helloController;
    @BeforeEach
    void setUp() {
        helloController = new HelloController();
    }

    @Test
    void testFunction1() {
        double expected = -0.05766 ;
        double result = helloController.function(1.1, -0.5, 2 );
        assertEquals(expected, result, 1.0e-5);
    }

    @Test
    void testFunction2() {
        double expected = 1 ;
        double result = helloController.function(0.6, -0.5, 2 );
        assertEquals(expected, result, 1.0e-5);
    }
    @Test
    void testFunction3() {
        double expected = -0.24046 ;
        double result = helloController.function(2, -0.5, 2 );
        assertEquals(expected, result, 1.0e-5);
    }
    @Test
    void testPoint() {
        double expected = 751 ;
        double result = helloController.point(0, 3, 0.004);
        assertEquals(expected, result, 1.0e-5);
    }


    @Test
    void testMasixX175(){
        double expected = 0.7 ;
        double[] x = helloController.masivX(0, 3, 0.004);
        double result = x[175];
        assertEquals(expected, result, 1e-5);
    }
    @Test
    void testMasixX350(){
        double expected = 1.4 ;
        double[] x = helloController.masivX(0, 3, 0.004);
        double result = x[350];
        assertEquals(expected, result, 1e-5);
    }
    @Test
    void testMasixX750(){
        double expected = 3 ;
        double[] x = helloController.masivX(0, 3, 0.004);
        double result = x[750];
        assertEquals(expected, result, 1e-5);
    }
    @Test
    void testMasixY175(){
        double expected = 0.08738 ;
        double[] x = helloController.masivX(0, 3, 0.004);
        double[] y = helloController.masivY(-0.5, 2, x);
        double result = y[175];
        assertEquals(expected, result, 1e-5);
    }
    @Test
    void testMasixY350(){
        double expected = -0.32974 ;
        double[] x = helloController.masivX(0, 3, 0.004);
        double[] y = helloController.masivY(-0.5, 2, x);
        double result = y[350];
        assertEquals(expected, result, 1e-5);
    }

    @Test
    void testMasixY750(){
        double expected = 0.21424 ;
        double[] x = helloController.masivX(0, 3, 0.004);
        double[] y = helloController.masivY(-0.5, 2, x);
        double result = y[750];
        assertEquals(expected, result, 1e-5);
    }
    @Test
    void testSumY(){
        double expected = 118.03103;
        double[] x = helloController.masivX(0, 3, 0.004);
        double[] y =  helloController.masivY(-0.5, 2, x);
        double result = helloController.sum(y);
        assertEquals(expected, result, 1e-5);
    }
    @Test
    void testSeredArefmY(){
        double expected =0.15716;
        double[] x = helloController.masivX(0, 3, 0.004);
        double[] y =  helloController.masivY(-0.5, 2, x);
        double result = helloController.seredArefmY(y);
        assertEquals(expected, result, 1e-5);
    }
    @Test
    void testMinIndexY(){
        double[] y = {-0.7, -10, -20, 0.4};
        double expected = 2;

        double result = helloController.indexMinY(y);
        assertEquals(expected, result);
    }
    @Test
    void testMaxIndexY(){
        double[] y = {-0.7, -10, 15, 0};
        double expected =2;

        double result = helloController.indexMaxY(y);
        assertEquals(expected, result);
    }
}