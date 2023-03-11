package com.mycompany.aula_2_objeto;

import java.util.Random;

public class Moeda {
    float valor;
    String tipoMoeda;
    int anoFabri;
    
    void statusMoeda(){
        System.out.println("Valor: " + this.valor);
        System.out.println("Tipo da moeda: " + this.tipoMoeda);
        System.out.println("Ano de fabricação: " + this.anoFabri);
    }
    void tacarMoeda(){
        Random gerador = new Random();
        int numero = gerador.nextInt(2);
        if(numero == 1){
        System.out.println("Caiu cara.");
        }else{
            System.out.println("Caiu coroa.");
        }
    }
}
