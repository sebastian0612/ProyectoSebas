package extraclase;



import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author schaves
 */
public class trabajoExtraclase {
 
    public static double calcularImpuesto(int numDependientes, double salario){
  
   
    double monto=0.0;
    if (salario <= 200000){
    monto = 0.0;}
    
    else if (salario <= 400000){
    monto = 0.10;}
    
    else if (salario <= 600000){
    monto = 0.15;}
    
    else if (salario <= 800000){
    monto = 0.20;}
    else if (salario > 800000);{
    monto = 0.30;}
  
 
 
    double monto2 = 0;
   
  if (numDependientes==1)
   monto2 =salario*1;
  
  else if (numDependientes==2){
   monto2= salario*0.90;}
  
  else if (numDependientes==3){
   monto2= salario*0.70;}
  
  else if (numDependientes==4){
   monto2=salario * 0.60;}
  
  else if(numDependientes > 5){
   monto2 = salario*0.40;}
   double impuesto = monto2*monto;
   return impuesto; 
  
           
         
 }
  public static void main(String[] args);{
  scaner= new Scanner(System.in);
 System.out.println("Porfavor Introduzca su salario");
 double salario = entrada.nextDouble();
 
System.out.println("Introduzca la dependiente");
int numDependiente = entrada.nextInt();
double pagar = calcularImpuesto(numDependientes,salario);

System.out.println("El monto a pagar es de: ");

   }     
  
} 