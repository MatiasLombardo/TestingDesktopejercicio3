/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eje3guia8persona;

import entidades.Persona;
import servicio.PersonaServicio;


public class Eje3GUIA8Persona {

    
    public static void main(String[] args) {
       PersonaServicio ps = new PersonaServicio();
       Persona p1=ps.crearPersona();
    }

}
