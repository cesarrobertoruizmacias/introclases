package com.company;

class persona
{
    private int edad;
 public void cumplirAnios()
 {
  edad ++;

 }

 public int getEdad()
 {
     return edad;
 }
}


public class Main {

    public static void main(String[] args) {
	persona panchito = new persona();
	persona lupita = new persona();

	panchito.cumplirAnios();
	panchito.cumplirAnios();
	panchito.cumplirAnios();
	panchito.cumplirAnios();
	panchito.cumplirAnios();
	lupita.cumplirAnios();
	lupita.cumplirAnios();

	System.out.println("panchito tiene " + panchito.getEdad() + " anios");
	System.out.println("lupita tiene " + lupita.getEdad() + " anios");


    }
}
