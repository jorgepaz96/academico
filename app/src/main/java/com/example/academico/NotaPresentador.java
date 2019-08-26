package com.example.academico;

public class NotaPresentador implements Main.Presentador {
    private Main.Model model;
    private Main.Vista vista;
    public NotaPresentador(Main.Vista vista){
        this.vista = vista;
        model = new NotaModel(this);
    }
    @Override
    public void mostrarNota(String r) {
        if(vista!=null){
            vista.mostrarNota(r);
        }
    }

    @Override
    public void calcularNota(Integer n1,Integer n2,Integer n3) {
        if(vista!=null){
            model.calcularNota(n1,n2,n3);
        }
    }
}
