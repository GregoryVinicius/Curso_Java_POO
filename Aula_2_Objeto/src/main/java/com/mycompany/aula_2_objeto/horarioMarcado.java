package com.mycompany.aula_2_objeto;

import java.util.Date;
import java.time.LocalDate;

public class horarioMarcado {
    boolean marcada;
    String status;
    Date dataMarcada;
    Date horaMarcada;
    
    void desmarcar(){
        this.marcada = false;
        this.status = "Desmarcada";
    }
}
