package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class HelloControllerTest {
        Logic logic;
    @BeforeEach
    void setUp() {
        logic = new Logic();
    }

    @Test
    void testFunction1() {
        double expected = -0.05766 ;
        double result = logic.function(1.1, -0.5, 2 );
        assertEquals(expected, result, 1.0e-5);
    }

    @Test
    void testFunction2() {
        double expected = 1 ;
        double result = logic.function(0.6, -0.5, 2 );
        assertEquals(expected, result, 1.0e-5);
    }
    @Test
    void testFunction3() {
        double expected = -0.24046 ;
        double result = logic.function(2, -0.5, 2 );
        assertEquals(expected, result, 1.0e-5);
    }
    @Test
    void testPoint() {
        double expected = 751 ;
        double result = logic.point(0, 3, 0.004);
        assertEquals(expected, result, 1.0e-5);
    }


    @Test
    void testMasixX175(){
        double expected = 0.7 ;
        double[] x = logic.masivX(0, 3, 0.004);
        double result = x[175];
        assertEquals(expected, result, 1e-5);
    }
    @Test
    void testMasixX350(){
        double expected = 1.4 ;
        double[] x = logic.masivX(0, 3, 0.004);
        double result = x[350];
        assertEquals(expected, result, 1e-5);
    }
    @Test
    void testMasixX750(){
        double expected = 3 ;
        double[] x = logic.masivX(0, 3, 0.004);
        double result = x[750];
        assertEquals(expected, result, 1e-5);
    }
    @Test
    void testMasixY175(){
        double expected = 0.08738 ;
        double[] x = logic.masivX(0, 3, 0.004);
        double[] y = logic.masivY(-0.5, 2, x);
        double result = y[175];
        assertEquals(expected, result, 1e-5);
    }
    @Test
    void testMasixY350(){
        double expected = -0.32974 ;
        double[] x = logic.masivX(0, 3, 0.004);
        double[] y = logic.masivY(-0.5, 2, x);
        double result = y[350];
        assertEquals(expected, result, 1e-5);
    }

    @Test
    void testMasixY750(){
        double expected = 0.21424 ;
        double[] x = logic.masivX(0, 3, 0.004);
        double[] y = logic.masivY(-0.5, 2, x);
        double result = y[750];
        assertEquals(expected, result, 1e-5);
    }
    @Test
    void testSumY(){
        double expected = 118.03103;
        double[] x = logic.masivX(0, 3, 0.004);
        double[] y =  logic.masivY(-0.5, 2, x);
        double result = logic.sum(y);
        assertEquals(expected, result, 1e-5);
    }
    @Test
    void testSeredArefmY(){
        double expected =0.15716;
        double[] x = logic.masivX(0, 3, 0.004);
        double[] y =  logic.masivY(-0.5, 2, x);
        double result = logic.seredArefmY(y);
        assertEquals(expected, result, 1e-5);
    }
    @Test
    void testMinIndexY(){
        double[] y = {-0.7, -10, -20, 0.4};
        double expected = 2;

        double result = logic.indexMinY(y);
        assertEquals(expected, result);
    }
    @Test
    void testMaxIndexY(){
        double[] y = {-0.7, -10, 15, 0};
        double expected =2;

        double result = logic.indexMaxY(y);
        assertEquals(expected, result);
    }
}