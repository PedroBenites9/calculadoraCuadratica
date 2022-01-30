/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.lang.Math;
/**
 *
 * @author pedro
 */
public class calculator {
    private double a;
    private double b;
    private double c;
    private double x1;
    private double x2;
    /**
     * @return the a
     */
    public double getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public double getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(double b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public double getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(double c) {
        this.c = c;
    }
    private static double calculatePower (double b, int pow){ //tenenmos que obtener la potencia para despues introducirlo a la raiz
        return Math.pow(b,pow);
    }


    public double equis1(){ //calculamos cuadratica
        double be = calculatePower(b, 2); //asignamos valores para la potencia
        double contRaiz = be-4*a*c; //creamos el contenido que va a tener la raiz
        double raiz=Math.sqrt(contRaiz); //calculamos y obtenenmos raiz +
        double numerador=-b+raiz; //creamos un numerador para despues dividirlo por 2*a
        double x1=numerador/(2*a); //obtenemos la x1
        return x1; //x1
    }
    public double equis2(){ //calculamos cuadratica
            double be = calculatePower(b, 2); //asignamos valores para la potencia
            double contRaiz = be-4*a*c; //creamos el contenido que va a tener la raiz
            double raiz=Math.sqrt(contRaiz); //calculamos y obtenenmos raiz +
            double numerador=-b-raiz; //creamos un numerador para despues dividirlo por 2*a
            double x2=numerador/(2*a); //obtenemos la x1
            return x2; //x1
        }
}
