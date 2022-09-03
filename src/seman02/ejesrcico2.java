/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seman02;

import java.util.Scanner;

/**
 *
 * @author 51992
 */
public class ejesrcico2 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("dame radio del circulo: ");
        double radio,diametro,area;
        radio=teclado.nextDouble();
        diametro=radio*2;
        area=(3.1416)*(radio*radio);
        System.out.println("El diametro del circulo es :"+diametro);
        System.out.println("el area del circulo es "+area);
        
        }
}
