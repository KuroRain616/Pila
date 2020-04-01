/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;
import java.util.Scanner;
import java.util.Random;
import java.util.*;

public class Pila {///LLAVE PUBLIC CLASSS PILA
    private int tope,MAX;
    private String Pila[];
public Pila(int M)
{
    M=27;
    MAX=M;
    Pila=new String[MAX];
    tope=0;
}
///PARA AGREGAR
private void Agregar(String n)
{/////LLAVE METODO AGREGAR
    if(tope<MAX)
    {////LLAVE IF AGREGAR
        String[]abc={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y"," z"};
        int AleatoriaLetra=(int)Math.round(Math.random()*27);
        String Letra=(abc[AleatoriaLetra]);
        Pila[tope]=Letra;
        tope++;
                System.out.println("DATO AGREGADO");
    }///LLAVE IF AGREGAR
    else
    {////LLAVE ELSE AGERGAR
        System.out.println("LLENA");
    }///LLAVE ELSE AGREGAR
}/////LLAVE METODO AGREGAR
private void Eliminar()
{///LLAVE ELIMINAR
    if(tope>0)
    {///LLAVE IF ELIMINAR
        tope--;
        System.out.println("DATO ELIMINADO");
    }///LLAVE IF ELIMINAR
    else
    {///LLAVE ELSE ELIMINAR
        System.out.println("NO HAY QUE ELIMINAR");
    }///LLAVE ELSE ELIMINAR
}///LLAVE ELIMINAR
 private void Mostrar()
 {///LLAVE MOSTRAR
     if(!Vacia())
     {///LLAVE IF MOSTRAR
         for(int i=(tope-1);i>=0;i--)
         {//// LLAVE FORN MOSTRAR
             System.out.println(Pila[i]);
         }///LLAVE FOR MOSTRAR
     }///LLAVE IF MOSTRAR
     else
         System.out.println("VACIO");
 }////LLAVE MOSTRAR   
 private boolean Vacia()
 {///LLAVE PILA VACIA
     if(Pila==null)
         return true;
     else return false;
 }///LLAVE PILA VACIA
private void Llenar(String o)
{
    if(tope<MAX)
    {
        String[]abc={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y"," z"};
        int AleatoriaLetra=(int)Math.round(Math.random()*27);
        String Letra=(abc[AleatoriaLetra]);
        Pila[tope]=Letra;
        tope++;
                System.out.println("DATO AGREGADO");
    }
}

private boolean Buscar(String dato)
{
    boolean encontrado=false;
    if(!Vacia())
            {/////LLAVE IF ENCONTRADO
                for(int i=(tope-1);i>=0;i--)
                {
                    if(Pila[i].equals(dato))encontrado=true;
                }
            }////LLAVE IF ENCONRTRADO
    else System.out.println("NO HAY DATOS");
    return encontrado;
}



///LLAVE PUBLIC CLASS PILA
    public static void main (String[] args) 
    {///LLAVE Public STATIC MAIN
       
       int t,opcion;
        String dato;
        Scanner teclado=new Scanner(System.in);
        System.out.println("----PILA----");
        t=teclado.nextInt();
        Pila PILA=new Pila(t);
        do
        {///LLAVE DO
            System.out.println("1.-Llenado de datos");///YA
            System.out.println("2.-Eliminar Datos");///YA
            System.out.println("3.-Mostrar Datos");///YA
            System.out.println("4.-Agregar datos");///YA
            System.out.println("5.-Buscar datos");
            System.out.println("6.-ORdenar");
            System.out.println("7.-Salir");///YA
            System.out.println("INGRESE SU OPCION");
            opcion=teclado.nextInt();
            switch(opcion)
            {///LLAVE OPCION SWITCH
                case 1:
                /////CASE 1 Llenado de datos
                    Scanner leer=new Scanner(System.in);
                    System.out.println("INGRESE EL NUMERO DE DATOS: ");
                    int x=leer.nextInt();
                    char[]datos=new char[x];
                    for(int i=0;i<x;i++)
                    {
                       String[]abc={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y"," z"};
                    
                    int AleatoriaLetra=(int)Math.round(Math.random()*27);
                    PILA.Agregar(abc[AleatoriaLetra]);
                     
                    }
                                       
                    break;
                /////Llenado de datos
                case 2:
                //////CASE 2 ELIMINAR DATOS
                    PILA.Eliminar();
                    break;
                //////CASE 2 ELIMINAR DATOS
                case 3:
                /////CASE 3 MOSTRAR DATOS
                    PILA.Mostrar();
                    break;
                /////CASE 3MOSTRAR DATOS
                case 4:
                    //////AGREGAR DATOS
                 System.out.println("SE AGREGA EL DATO");
                 String[]abc={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y"," z"};
                 int AleatoriaLetra=(int)Math.round(Math.random()*27);
                 
                 PILA.Llenar(abc[AleatoriaLetra]);
                    //////AGREGAR DATOS
                case 5:
                    //////BUSCAR
                    System.out.println("INGRESE DATO A BUSCAR: ");
                    dato=teclado.next();
                    if(PILA.Buscar(dato))
                        System.out.println("DATO ENCONTRADO");
                    else System.out.println("DATO NO ENCONTRADO");
                            break;
                    //////BUSCAR
                case 6: 
                    System.out.println("PROFRE LA VERDAD NO SUPE COMO HACER EL ORDENAMIENTO");
                    System.out.println("TENGO LOS METODOS PERO NO ENTENDI COMO IMPLEMENTARLOS EN CODIGO");
            }///LLAVE OPCION SWITCH

            }////LLAVE DO 
        while(opcion!=7);
        
}
}

///////// int metodo = 0;          
//////7int burbj;
   ///////for(int i=1;i<metodo.length;i++)
   ///////{
      ///// for(int j=0;j<metodo.length-1;j++)
       ///////{
           ///if(metodo[j]>metodo[j+1])
          ////// {
               /////burbj=metodo[j];
               //////metodo[j]=metodo[j+1];
             ////  metodo[j+1]=burbj;
        ////   }
      /////// }
   /////}
                    
                   
                    
                    ////ORDENAR
                    
                   
                    
                    ////ORDENAR
        ////    }///LLAVE OPCION SWITCH

          ////  }////LLAVE DO 
 


////private void Ordenar (int Agregar[],int izq,int der)
//{
    
   /////int pivote=Agregar[izq];
   // int i=izq;
    //int j=der;
    //int aux;
    //while(i<j)
    //{
      //  while(Agregar[i]<=pivote && i<j)i++;
        //while(Agregar[j]>pivote)j--;
        //if(i<j)
        //{
          //  aux=Agregar[i];
           // Agregar[i]=Agregar[j];
            //Agregar[j]=aux;
            
       // }
    ///}
    //Agregar[izq]=Agregar[j];
    //Agregar[j]=pivote;
    //if(izq<j-1)
      //  Ordenar(Agregar,izq,j-1);
    //if(j+1<der)
      //  Ordenar(Agregar,der+1,der);
//}