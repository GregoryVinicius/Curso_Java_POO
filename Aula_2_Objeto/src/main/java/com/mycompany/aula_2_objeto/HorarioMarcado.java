package com.mycompany.aula_2_objeto;

import java.util.Date;
import java.time.LocalDate;

public class HorarioMarcado {
    boolean marcada;
    String status;
    String dataMarcada;
    String horaMarcada;
    
    void desmarcar(){
        this.marcada = false;
        this.status = "Desmarcada";
    }
}
