/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;
import entities.NIF;
import java.util.Scanner;
/**
Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su correspondiente 
* letra (NIF). Los atributos serán el número de DNI (entero largo) y la letra (String o char) 
* que le corresponde. En NIFService se dispondrá de los siguientes métodos:
*Métodos getters y setters para el número de DNI y la letra.
* 
*Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le corresponderá.
* Una vez calculado, le asigna la letra que le corresponde según
* 
*Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en mayúscula;
* por ejemplo: 00395469-F).
* 
*La letra correspondiente al dígito verificador se calculará a traves de un método que funciona de
* la siguiente manera: Para calcular la letra se toma el resto de dividir el número de DNI por 23 
* (el resultado debe ser un número entre 0 y 22). El método debe buscar en un array (vector) de 
* caracteres la posición que corresponda al resto de la división para obtener la letra correspondiente. 
* La tabla de caracteres es la siguiente:
 */

public class NIFServicio {
    private final NIF n = new NIF();
    Scanner leer = new Scanner(System.in);
    
    public String crearNif(){
        
        System.out.println("Ingrese su número de DNI");
        n.setDni(leer.nextInt());
        
        switch (n.getDni()%23){
            case  0: n.setLetra("-T");break;
            case  1: n.setLetra("-R");break;
            case  2: n.setLetra("-W");break;
            case  3: n.setLetra("-A");break;
            case  4: n.setLetra("-G");break;
            case  5: n.setLetra("-M");break;
            case  6: n.setLetra("-Y");break;
            case  7: n.setLetra("-F");break;
            case  8: n.setLetra("-P");break;
            case  9: n.setLetra("-D");break;
            case 10: n.setLetra("-X");break;
            case 11: n.setLetra("-B");break;
            case 12: n.setLetra("-N");break;
            case 13: n.setLetra("-J");break;
            case 14: n.setLetra("-Z");break;
            case 15: n.setLetra("-S");break;
            case 16: n.setLetra("-Q");break;
            case 17: n.setLetra("-V");break;
            case 18: n.setLetra("-H");break;
            case 19: n.setLetra("-L");break;
            case 20: n.setLetra("-C");break;
            case 21: n.setLetra("-K");break;
            case 22: n.setLetra("-E");break;
            default: System.out.println("Ocurrió un error");break;
        }
        
        String clave=n.getDni()+n.getLetra();
        return clave;
    }
    
    public void mostrar(){
        System.out.println(crearNif());
    }
            
}
