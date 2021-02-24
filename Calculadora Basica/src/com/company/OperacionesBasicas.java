package com.company;

import javax.swing.*;

public class OperacionesBasicas {
    //Se crea las variables que se utilizan
    int n1, n2;
    double resultado;

    //Constructor de la clase OperacionesBasicas
    public OperacionesBasicas(){
        n1=0;
        n2=0;
        resultado=0;
    }

    //Creamos los metodos de las operaciones

    public void suma(){
        n1= Integer.parseInt(JOptionPane.showInputDialog("Digite el primer valor"));
        n2= Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo valor"));
        resultado=n1+n2;
        JOptionPane.showMessageDialog(null, "El resultado es "+resultado);
    }
    public void resta(){
        n1= Integer.parseInt(JOptionPane.showInputDialog("Digite el primer valor"));
        n2= Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo valor"));
        resultado=n1-n2;
        JOptionPane.showMessageDialog(null, "El resultado es "+resultado);
    }
    public void division(){
        n1= Integer.parseInt(JOptionPane.showInputDialog("Digite el primer valor"));
        n2= Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo valor"));
        resultado= n1/n2;
        JOptionPane.showMessageDialog(null, "El resultado es "+resultado);
    }
    public void multiplicacion(){
        n1= Integer.parseInt(JOptionPane.showInputDialog("Digite el primer valor"));
        n2= Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo valor"));
        resultado=n1*n2;
        JOptionPane.showMessageDialog(null, "El resultado es "+resultado);
    }

}
