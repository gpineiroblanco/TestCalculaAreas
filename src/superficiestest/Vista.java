/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superficiestest;

import javax.swing.JOptionPane;

/**
 *
 * @author gpineiroblanco
 */
public class Vista {

    public String pedirFigura() {
        String respuesta;
        respuesta = JOptionPane.showInputDialog("What shape would you like to find the area of? (square, circle, triangle, rectangle):");
        JOptionPane.showMessageDialog(null, "You said: " + respuesta);
        return respuesta;
    }

    public void pedirDatosC(Cuadrado c) {
        float lado = Float.parseFloat(JOptionPane.showInputDialog("What is the side length?"));
        c.setLado(lado);
    }

    public void pedirDatosR(Rectangulo r) {
        float alto = Float.parseFloat(JOptionPane.showInputDialog("what is the rectangles width?"));
        float largo = Float.parseFloat(JOptionPane.showInputDialog("what is the rectangles height?"));
        r.setAlto(alto);
        r.setLargo(largo);
    }

    public void pedirDatosT(Triangulo t) {
        float base = Float.parseFloat(JOptionPane.showInputDialog("What is the base length of the triangle?"));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("What is the height of the triangle?"));
        t.setBase(base);
        t.setAltura(altura);
    }

    public void pedirDatosCir(Circulo c) {
        float radio = Float.parseFloat(JOptionPane.showInputDialog("What is the radius of the circle?"));
        c.setRadio(radio);
    }

    public void imprimir(float area) {
        JOptionPane.showMessageDialog(null, "Area= " + area);
    }
}
