/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superficiestest;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author gpineiroblanco
 */
@RunWith(Parameterized.class)
public class CuadradoTest {

    private float lado, area;
    private Controlador con;
    private Cuadrado c;

    public CuadradoTest(float l, float a) {
        this.area = a;
        this.lado = l;
        c = new Cuadrado(l, 0);
    }

    @Before
    public void initialize() {
        con = new Controlador();
    }

    /**
     * Test of main method, of class Controlador.
     */
    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][]{
            {10, 100},
            {5, 25},
            {10, 1},
            {3, 9}
        });
    }

    @Test
    public void testMain() {
        System.out.println("Parameterized Number is : " + lado + " ---> " + area);
        assertEquals(area,
                con.calcC(c), 0.0);
    }

}
