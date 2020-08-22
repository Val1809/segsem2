package model;
import java.util.Scanner;

import exceptions.idException;

import java.util.InputMismatchException;

public class Menu {
	  private final static int CONSULTATION = 1;
	  private final static int NEW_PER = 2;
	  private final static int EXIT = 3;
      private Scanner sc = new Scanner(System.in);
      private boolean salir = true;
      int documentNumber = 0;
      
      public void menu() {
         int option;
         
         System.out.println("-----------------------Minimercado Mi Barrio te quiere----------------");
         System.out.println("");
         System.out.println("-----------------------------Menu----------------------------------");
         System.out.println("Opciones:\n(1.) Cantidad de personas que han intentado ingresar al minimercado.\n(2.) Registrar a una nueva persona.\n(3.) Salir.");
         int selection2 = sc.nextInt();
			if(selection2==1) {
			             
				
			}else if(selection2==2) {
				System.out.println("¿Qué tipo de documento tiene?");
			
				System.out.println("Opciones:\n(1.)Cédula de ciudadanía.\n(2.)Tarjeta de identidad.\n(3.) Pasaporte.\\n(2.)Cédula de extranjería.");
			    documentNumber = sc.nextInt();
			boolean continuar = false;
			do {
				try {
					
			    if(documentNumber==1) {
			    	String DocumentType = "CC";
			    	continuar = false;
			    
			    }else if(documentNumber==2) {
			    	String DocumentType = "TI";
			    	continuar = false;
			    
			    }else if(documentNumber==3) {
			    	String DocumentType = "PP";
			    	continuar = false;
			    	
			    }else if(documentNumber==4) {
			    	String DocumentType = "CE";
			    	continuar = false;			
			    }else {
				System.out.println("Ingrese el número que corresponde a su opción");
			}
				}
				
			    catch(InputMismatchException ime) {
				System.err.println("Ingrese un valor numérico");
			}
			
			   
		 } while(continuar);
			System.out.println("Ingrese su número de documentp");
			documentNumber = sc.nextInt();
			
			
		 }else if(selection2==3) {
			
			 boolean exit = false;
		 }
			
			}
		
			
			
		public void startMenu() {
				// TODO Auto-generated method stub

		}
		
		
		
		
                 
}
