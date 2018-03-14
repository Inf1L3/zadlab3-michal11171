/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

import java.util.Scanner;


/**
 *
 * @author Asia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO 1.4, 1.7, 
        // TODO 2.2
        // TODO 3.3, 3.4
        
        //zadanie silnia
               System.out.println("Podaj silnie:");
        Scanner odczyt1 = new Scanner(System.in); 
 int c;
 int silnia=1;
      c = odczyt1.nextInt();
     for(int i=1;i<=c;i++)
      {
          silnia=silnia*i;
         
      }
     System.out.println(silnia);
        

//zadanie z & && 
System.out.println("zadanie z operatorami");
        int a2 = 5;
int b2 = 3;
int d=5;
int d2 =(a2++)+b2;
System.out.println(d);
        int a,b;
        System.out.println("Podaj wartosci dwoch liczb:");
        System.out.println("Operatory logiczne:");
        Scanner odczyt = new Scanner(System.in); 
 
      a = odczyt.nextInt();
      b = odczyt.nextInt();
      if (a>10&&b>10)
      {
          System.out.println("Obie liczby sa wieksze od 10");
      }
         System.out.println("Operatory bitowe:");

int c1 = a & b;
int d1 = a | b;
System.out.println(c1);
System.out.println(d1);




    }
    }
    

