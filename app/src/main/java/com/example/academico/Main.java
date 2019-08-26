package com.example.academico;

public class Main {
    public interface Vista{
        public void mostrarNota(String r);
    }
    public interface Presentador{
        public void mostrarNota(String r);
        public void calcularNota(Integer n1,Integer n2,Integer n3);
    }
    public interface Model{
        public void calcularNota(Integer n1,Integer n2,Integer n3);
    }
}
