/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superficiestest;

/**
 *
 * @author gpineiroblanco
 */
public class Cuadrado {

    private float lado;
    private float area;

    /**
     *
     */
    public Cuadrado() {
    }

    public Cuadrado(float lado, float area) {
        this.lado = lado;
        this.area = area;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }
}
