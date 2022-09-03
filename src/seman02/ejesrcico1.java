/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seman02;

import javax.swing.JOptionPane;

/**
 *
 * @author 51992
 */
public class ejesrcico1 {
    public static void main(String[] args) {
        double lado1=0;
        double lado2=0;
        int sentinela=1;
        double resul=0;
        while(sentinela==1){
            lado1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero del primer lado "));
            lado2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero del segundo lado "));
            resul=calculo(lado1,lado2);
            JOptionPane.showMessageDialog(null,"lado 1:"+lado1+"\n"+ "+lado2+"+lado2+"\n"+"La hipotenusa es: "+resul+"\n","resultado: ",JOptionPane.PLAIN_MESSAGE );
            sentinela=Integer.parseInt(JOptionPane.showInputDialog("si disea pregurtar de nuevo digite 1, si no digite -1"));
            lado1=0;
            lado2=0;
    
        }
        
    }      
static double calculo(double lado1 , double lado2){
        double resultado=0;
        resultado=Math.sqrt((lado1*lado1)+(lado2*lado2));
    return resultado;
}
}         

    
