/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github_proyect;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author MIDDLEY
 */
public class GitHub_proyect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola");
        System.out.println("Editado en github");
    }
    
}

class usuario{
    private static char[] nombre;
    private static char[] apellido;
    private static long dni;
    
    public usuario(char[] nom,char[] ap,long d){
        nombre = nom;
        apellido = ap;
        dni = d;
    }
    
    //inicializacion del tamaño de nombre
    public void setNombre(int tam){
        nombre = new char[tam];
    }
    
    //inicializacion del tamaño de apellido
    public void setApellido(int tam2){
        apellido = new char[tam2];
    }
    
    //dar valor a dni
    public void setDni(int t){
        dni = t;
    }
    
    public void ingreso(char a){
        Scanner sc = new Scanner(System.in);
        a = sc.next().charAt(0);        
    }
    
    public char[] ingreso_nombre(){
        
        while(true){
            System.out.println("f");
        }
        return nombre;;
    }
    
    public static void hora(){
        int a,b,c;
        System.out.println("Actualizando GitHub dia 06-10-2019");
    }
    
}
