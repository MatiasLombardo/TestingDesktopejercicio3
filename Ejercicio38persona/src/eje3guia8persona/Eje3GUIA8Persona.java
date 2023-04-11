/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package eje3guia8persona;

import entidades.Persona;
import servicio.PersonaServicio;

/*A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada objeto,
deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar
para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables(arrays),
para después calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en su peso ideal
y cuantos, por encima, y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
Para esto, podemos crear unos métodos adicionales.
 */
public class Eje3GUIA8Persona {

    public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio();
        int[] imcs = new int[4];
        boolean[] mayores = new boolean[4];

        System.out.println("--------------Persona 1-------------------");
        Persona p1 = ps.crearPersona();
        imcs[0] = ps.calcularIMC(p1);
        mayores[0] = ps.mayorEdad(p1);

        System.out.println("--------------Persona 2-------------------");
        Persona p2 = ps.crearPersona();
        imcs[1] = ps.calcularIMC(p2);
        mayores[1] = ps.mayorEdad(p2);

        System.out.println("--------------Persona 3-------------------");
        Persona p3 = ps.crearPersona();
        imcs[2] = ps.calcularIMC(p3);
        mayores[2] = ps.mayorEdad(p3);

        System.out.println("--------------Persona 4-------------------");
        Persona p4 = ps.crearPersona();
        imcs[3] = ps.calcularIMC(p4);
        mayores[3] = ps.mayorEdad(p4);

        System.out.println("----------------------------------");
        System.out.println("-----------Porcentaje Pesos-------------");
        porcentajePeso(imcs);
        System.out.println("-----------Porcentaje Edades-------------");
        porcentajeEdad(mayores);

    }

    public static void porcentajePeso(int a[]) {
        double porcentajeBajoPeso = 0;
        double porcentajeNormoPeso = 0;
        double porcentajeSobrepeso = 0;

        for (int i = 0; i < 4; i++) {
            switch (a[i]) {
                case 0:
                    porcentajeNormoPeso++;
                    break;
                case -1:
                    porcentajeBajoPeso++;
                    break;
                case 1:
                    porcentajeSobrepeso++;
                    break;
            }
        }
        System.out.println("El porcentaje de personas con bajo peso es del %" + ((porcentajeBajoPeso / 4) * 100));
        System.out.println("El porcentaje de personas con normopeso es del %" + ((porcentajeNormoPeso / 4) * 100));
        System.out.println("El porcentaje de personas con sobrepeso es del %" + ((porcentajeSobrepeso / 4) * 100));
    }

    public static void porcentajeEdad(boolean a[]) {
        double porcentajeMayores = 0;
        double porcentajeMenores = 0;

        for (int i = 0; i < 4; i++) {
            if (a[i]) {porcentajeMayores++;} else {porcentajeMenores++;}
        }

        System.out.println("El porcentaje de personas mayores de edad es del %" + ((porcentajeMayores / 4) * 100));
        System.out.println("El porcentaje de personas menores de edad es del %" + ((porcentajeMenores / 4) * 100));
// soy pro a
    }
}
