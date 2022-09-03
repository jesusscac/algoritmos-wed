/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana03;

/**
 *
 * @author 51992
 */
interface constante{
    int n=5;
}
class fruta{
    String name;
    float price;
    public fruta(String n, float p){
        this.name=n;
        this.price=p;
    }
    String informacion(){
        return "Nombre: "+this.name+"precio: "+this.price;
    }
    class canasta implements constante{
        fruta lista[]=new fruta[n];
        int cont=0;
        void llenar(fruta p){
        lista[cont]=p;
        cont++;
        }
    }
    void mostrar(){
        int i=0;
        do{
            System.out.println(lista[i].informacion());
            i++;
        }while(cont!=i);
    }
}
public class ejer4 {
    canasta canasta1=new canasta();
    canasta1
}
