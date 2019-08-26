package com.example.academico;

public class NotaModel implements Main.Model {
    private Main.Presentador presentador;
    private Integer notafinal;
    private String indicador;

    public NotaModel(Main.Presentador presentador){
        this.presentador= presentador;
    }
    @Override
    public void calcularNota(Integer n1,Integer n2,Integer n3) {
        //notafinal = String.valueOf((n1+n2+n3)/3);
        notafinal = (n1+n2+n3)/3;

        if (notafinal<12.4){
            indicador = "no logrado";
        }else if (12.5<=notafinal && notafinal <= 14){
            indicador = "logrado bajo";
        }else if (15<=notafinal && notafinal <= 17){
            indicador = "logro medio";
        }else if (18<=notafinal && notafinal <= 20){
            indicador = "logro destacado";
        }

        presentador.mostrarNota(String.valueOf(notafinal)+" "+indicador);

    }
}
