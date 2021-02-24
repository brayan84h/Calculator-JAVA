package com.company;

import javax.swing.*;

public class Main {
    //Variables que utlizaremos para el menu
    static int opcion;
    static String menu;
    public static void main(String[] args) {
	// Hacemos un objeto con la clase OperacionesBasicas
        OperacionesBasicas object = new OperacionesBasicas();

        //Creamos el menu
        do {
            menu= JOptionPane.showInputDialog("MENU PRINCIPAL\n"+"1. Suma\n"+"2. Resta\n"+"3. Division\n"+"4. Multiplciacion\n"+"5. Salir\n");
            opcion= Integer.parseInt(menu);

            //Opciones del menu
            switch (opcion){
                case 1:
                    object.suma();
                    break;
                case 2:
                    object.resta();
                    break;
                case 3:
                    object.division();
                    break;
                case 4:
                    object.multiplicacion();
                    break;
                case 5:
                    break;
            }
        }while (opcion!=5);
    }
}
