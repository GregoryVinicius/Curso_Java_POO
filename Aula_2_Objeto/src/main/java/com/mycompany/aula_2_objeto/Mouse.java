package com.mycompany.aula_2_objeto;

public class Mouse {
    String cor;
    String marca;
    String modelo;
    boolean temLed;
    String corLed;
    boolean ledLigado;
    int quatBotoes;   
    
    void ligarLed(){
        this.ledLigado = true;
    }
    
    void desligarLed(){
        this.ledLigado = false;
    }
    
    void statusMouse(){
        System.out.println("cor: "+ this.cor);
        System.out.println("marca: " + this.marca);
        System.out.println("modelo: " + this.modelo);
        if(this.temLed == true){
            System.out.println("Tem led? Sim");
            if(this.ledLigado == true){
                System.out.println("A led esta ligada.");
            }
            System.out.println("Cor do led: " + this.corLed);
        }else{
            System.out.println("Tem led? Não");
            this.ledLigado = false;
            this.corLed = "não tem.";
        }
        System.out.println("Quantidade de botões: " + this.quatBotoes);
    }
}
