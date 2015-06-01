/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superficiestest;

/**
 *
 * @author oquintansocampo
 */
public class Rectangulo {

    private float alto;
    private float largo;
    private float area;

    public Rectangulo() {
    }

    public Rectangulo(float alto, float largo, float area) {
        this.alto = alto;
        this.largo = largo;
        this.area = area;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }
}
