/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

import java.util.Scanner;

/**
 *
 * @author Michal
 */
public class Github
{
    static void zad1()
    {

    int x;
    do{
      System.out.println("1 - NOT");
      System.out.println("2 - XOR");
      System.out.println("0 - KONIEC");
     
      Scanner scan1= new Scanner(System.in);
      x=scan1.nextInt();
      System.out.println(x);
        switch(x){
        case 1:{
        int a,b;
        
        System.out.println("Podaj wartosci dwoch liczb:");
        Scanner not= new Scanner(System.in);
        a=not.nextInt();
        b=not.nextInt();
        if(a>b)
        {
        System.out.println("Liczba A jest wieksza od liczby B");
        }        
        else
        {
        System.out.println("Liczba B jest wieksza lub rowna liczbie A");
        }
        if(!(a>b))
        {
        System.out.println("NOT-liczba B jest wieksza od liczby A");
        }        
        else
        {
        System.out.println(" NOT- liczba A jest wieksza lub rowna liczbie B");
        }
        break;}
         
        case 2:{
        int c,d;
        System.out.println("Podaj wartosci dwoch kolejnych liczb:");
        Scanner xor= new Scanner(System.in);
        c=xor.nextInt();
        d=xor.nextInt();
        if(c%2==0|| d%2==0)
        {
            System.out.println("Co najmniej jedna z liczb jest parzysta");
        }
        else
        {
            System.out.println("Zadna z liczb nie jest parzysta");
        }
        if(!(c%2==0|| d%2==0))
        {
            System.out.println("Maksymalnie jedna liczba jest parzysta");
        }
        else
        {
            System.out.println("Obie liczby sa parzyste");
        }
        break;}
         
            
    }}
    while(x!=0);
       
    } 
    
    static void zad2(){
        int xz; 
 
    do{
      System.out.println("1.Dzialanie >>");
      System.out.println("2.Dzialanie <<");
      System.out.println("3.Dzialanie >>>");
      System.out.println("0.Koniec");
      Scanner scan2= new Scanner(System.in);
      xz=scan2.nextInt();
      switch(xz){
          case 1:
              int a,b;
              System.out.println("Podaj wartosc a:");
              Scanner scan3=new Scanner(System.in);
              a= scan3.nextInt();
              System.out.println("Twoja zmienna to: "+a);
              b= a>>1;
              System.out.println("Twoja zmienna po przesunieciu o 1 bit w lewo to:"+b);
              break;
           case 2:
              int c,d;
              System.out.println("Podaj b:");
              Scanner scan4=new Scanner(System.in);
              c= scan4.nextInt();
              System.out.println("Twoja zmienna to: "+c);
              d= c<<1;
              System.out.println("Twoja zmienna po przesunieciu o 1 bit w lewo to:"+d);
              break;
           case 3:
              int e,f;
              System.out.println("Podaj e:");
              Scanner ope=new Scanner(System.in);
              e= ope.nextInt();
              System.out.println("Twoja zmienna to: "+e);
              f= e>>>3;
              System.out.println("Twoja zmienna po przesunieciu o 1 bit w lewo to:"+f);
              break;  
          }
    }while(xz!=0);
    
    
    }
    

    static void zad3(){
        String str = "Tekst";
    char[] tab = str.toCharArray();
    for(int i=0;i<tab.length;i++)
    {
        System.out.println(i+"."+tab[i] );
    }
    
   byte[] byt= str.getBytes();
   for(int i=0;i<byt.length;i++)
    {
        System.out.println(tab[i]+"="+byt[i]);
    }
   
     String str2="tekst";
     boolean c;
     c=str.equals(str2);
     System.out.println(c);
   
     c=str.equalsIgnoreCase(str2);
     System.out.println(c);
    
     int i;
     
     i=str.compareTo(str2);
     System.out.println(i);
     
     
     i=str.compareToIgnoreCase(str2);
     System.out.println(i);
     

     i=str2.indexOf("t");
     System.out.println(i);
     

     i=str2.indexOf("t",2);
     System.out.println(i);
     
     i=str2.lastIndexOf("t");
     System.out.println(i);
     
     i=str2.lastIndexOf("t",4);
     System.out.println(i);
     
    String str3;
    str3=str.substring(2);
    System.out.println(str3);
     
    str3=str.substring(1,3);
    System.out.println(str3);
     
    String str4="Ala";
    str3=str4.replace("A","O");
    System.out.println(str3);
    
    String str5="                 Ala ma kota";
    String str6=str5.trim();
    System.out.println(str5);
    System.out.println(str6);
    
    
    str5=str.toLowerCase();
    System.out.println(str5);
    
    str5=str2.toUpperCase();
    System.out.println(str5);
    
    String str8="tttt-aaa-kkk";  
    String str7[]=str8.split("-",2);
    for(i=0;i<str7.length;i++)
        {
            System.out.println(str7[i]);
        }
    
    
    String str9[]=str8.split("-");
    for(i=0;i<str9.length;i++)
        {
            System.out.println(str9[i]);
        }
    
    } 
    
    static void zad4(){
 
    int z4;
    do{
    System.out.println("1.Potegowanie for");
    System.out.println("2.Potegowanie rekurencja");
    System.out.println("0.Koniec");
    Scanner odczyt= new Scanner(System.in);
     z4=odczyt.nextInt();
      switch(z4){
          case 1:
              int k,n;
              int w=1;
              System.out.println("Podaj podstawe i wykladnik:");
              Scanner p= new Scanner(System.in);
              k=p.nextInt();
              n=p.nextInt();
              for(int i=1;i<=n;i++){
              w=w*k;
              }
              System.out.println(w);
              break;
          case 2:
              Scanner sc = new Scanner(System.in);
              System.out.print("Podaj liczbę oraz wykladnik: " ); 
              int liczba = sc.nextInt(); 
              int wykladnik=sc.nextInt();
              System.out.println(liczba + " ^ "+ wykladnik + "=" + potegowanie(liczba,wykladnik));
              break;           
              
              
      }
     
    }while(z4!=0);
      
    
}
public static int potegowanie(int podstawa, int wykladnik) {
if(wykladnik == 0) return 1;
else return podstawa * potegowanie(podstawa,wykladnik-1);
   
}

    static void zad5(){
   
        System.out.println("Podaj n ciagu");
        Scanner fib=new Scanner(System.in);
        int n=fib.nextInt();
        System.out.println("Suma ciagu: "+ciag(n));
         
        
                
     } 
public static int ciag(int n){
   if(n==1 ||n==2) return 1;
   else return ciag(n-1)+ciag(n-2);
}

    static void menu(){
        int zg;
    do
    {
    System.out.println("Menu:");
    System.out.println("Zadanie 1.");
    System.out.println("Zadanie 2.");
    System.out.println("Zadanie 3.");
    System.out.println("Zadanie 4.");
    System.out.println("Zadanie 5.");
    System.out.println("Koniec 0.");
    Scanner menu= new Scanner(System.in);
    zg=menu.nextInt();
    
        switch(zg){
            case 1:
                Github.zad1();
                break;
            case 2:
                Github.zad2();
                break;
            case 3:
                Github.zad3();
                break;
            case 4:    
                Github.zad4();
                break;
            case 5:
                Github.zad5();
                
                break; 
    }}while (zg!=0);
    }}
