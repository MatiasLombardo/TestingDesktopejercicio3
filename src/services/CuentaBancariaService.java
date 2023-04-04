/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.CuentaBancaria;
import java.util.Scanner;


/*
Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos: numeroCuenta(entero),
dniCliente(entero largo), saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. Si la cuenta no tiene la
cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
*/
public class CuentaBancariaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public CuentaBancaria crearCuenta (){
        System.out.println("Bienvenido al cliente del Banco Austral del Noveno Comodato Ortodoxo (B.A.N.C.O.)");
        System.out.println("A continuación lo asistiremos en la creación de su cuenta");
        System.out.println("");
        System.out.println("Ingrese su número de DNI");
        long dni=leer.nextLong();
        int numCuenta=123456789;
        System.out.println("Su número de cuenta es: "+numCuenta);
        double saldo=0;
        return new CuentaBancaria(numCuenta,dni,saldo);
    } 
    
    public void ingresar(CuentaBancaria cuenta){
        double saldo = cuenta.getSaldoActual();
        System.out.println("Digite la cantidad de dinero que desea ingresar a su cuenta");
        saldo+=leer.nextDouble();
        System.out.println("Su saldo actual es igual a "+saldo);
        cuenta.setSaldoActual(saldo);
    }
    
    public void retirar(CuentaBancaria cuenta){
        double saldo = cuenta.getSaldoActual();
        double aux;
        System.out.println("Digite la cantidad de dinero que desea retirar de su cuenta");
        aux=leer.nextDouble();
        
        if (saldo-aux<0) {
            System.out.println("Parece que no cuenta con esos fondos, se retirará tanto dinero como sea posible hasta que la cuenta está en 0");
            System.out.println("Se han retirado "+saldo+"$");
            System.out.println("No se han podidio retirar "+(aux-saldo));
            cuenta.setSaldoActual(0);
            
        } else {
            saldo-=aux;
            cuenta.setSaldoActual(saldo);
            System.out.println("Se han retirado "+aux+"$");
            System.out.println("El saldo actual es igual a "+cuenta.getSaldoActual());
        }

    }
    
    public void extraccionRapida(CuentaBancaria cuenta){
        double saldo = cuenta.getSaldoActual();
        System.out.println("La extracción rápida le permite extraer el 20% del dinero de su cuenta");
        System.out.println("El 20% de su saldo es "+(saldo*0.2));
        saldo-=(saldo*0.2);
        cuenta.setSaldoActual(saldo);
        System.out.println("El saldo actual es igual a "+cuenta.getSaldoActual());
    }
    
    public void consultarSaldo(CuentaBancaria cuenta){
        System.out.println("El saldo actual es de "+cuenta.getSaldoActual());
    }

    public void consultarDatos(CuentaBancaria cuenta){
        System.out.println("Su número de cuenta es "+cuenta.getNumeroCuenta());
        System.out.println("El DNI registrado es "+cuenta.getDniCliente());
    }
}
