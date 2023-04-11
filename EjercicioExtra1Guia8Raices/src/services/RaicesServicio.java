/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package services;

import entities.Raices;
import java.util.Scanner;

/**
 *
 * @author lomba
 *
 */
public class RaicesServicio {
    private final Raices r = new Raices();
    
    
    public void inicializarRaiz(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar A");
        r.setA(leer.nextDouble());
        System.out.println("Ingresar B");
        r.setB(leer.nextDouble());
        System.out.println("Ingresar C");
        r.setC(leer.nextDouble());
    }
    
    public double getDiscriminante() {
        //(b^2)-4*a*c
        return (r.getB() * r.getB()) - (4 * r.getA() * r.getC());
    }
    
    public boolean tieneRaiz() {
        if (getDiscriminante() == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean tieneRaices() {
        if (getDiscriminante() > 0) {return true;}
        else {return false;}
    }
    
    public void obtenerRaiz() {
        double a = r.getA();
        double b = r.getB();
        double c = r.getC();
        System.out.println(a+b+c);
        double pot=Math.pow(r.getB(), 2);
        System.out.println("pot:"+pot);
        double sqr=Math.sqrt(pot - 4 * r.getA() * r.getC());
        System.out.println("sqr:"+sqr);
        double z=(-r.getB()+ sqr)/2*r.getA();
        
        
        
        //double z=(-b - (Math.sqrt(Math.pow(b, 2) - 4 * a * c)))/2*a;
        System.out.println("raiz:"+z);
    }
    
    public void obtenerRaices() {
        System.out.println((-r.getB() + (Math.sqrt(Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC()))) / (2 * r.getA()));
        System.out.println((-r.getB() - (Math.sqrt(Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC()))) / (2 * r.getA()));
        
        
    }
    
    public void calcular() {
        if (tieneRaices()) {System.out.println("Se han obtenido las raices: ");obtenerRaices();
        }else if (tieneRaiz()){System.out.println("Se ha obtenido la raiz: ");obtenerRaiz();
        }else System.out.println("Los valores ingresados nunca tocan el Eje X");
    }
    
}
