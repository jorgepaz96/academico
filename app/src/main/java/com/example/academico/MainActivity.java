package com.example.academico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Main.Vista {
    private Main.Presentador presentador;
    private EditText nota1,nota2,nota3;
    private Boolean dato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presentador = new NotaPresentador(this);
        nota1 = (EditText) findViewById(R.id.nota1);
        nota2 = (EditText) findViewById(R.id.nota2);
        nota3 = (EditText) findViewById(R.id.nota3);
    }

    public void calcularNota(View view) {
        Integer nota1i,nota2i,nota3i;
        dato = true;
        if (nota1.getText().toString().equals("")){
            dato = false;
            Toast.makeText(getApplicationContext(),"Ingresar Nota número 1",Toast.LENGTH_SHORT).show();
        }
        if (nota2.getText().toString().equals("")){
            dato = false;
            Toast.makeText(getApplicationContext(),"Ingresar Nota número 2",Toast.LENGTH_SHORT).show();
        }
        if (nota3.getText().toString().equals("")){
            dato = false;
            Toast.makeText(getApplicationContext(),"Ingresar Nota número 3",Toast.LENGTH_SHORT).show();
        }

        if (dato){
            nota1i = Integer.parseInt(nota1.getText().toString());
            nota2i = Integer.parseInt(nota2.getText().toString());
            nota3i = Integer.parseInt(nota3.getText().toString());

            presentador.calcularNota(nota1i,nota2i,nota3i);
        }

    }

    @Override
    public void mostrarNota(String r) {
        Toast.makeText(getApplicationContext(), "El promedio final es: "+r, Toast.LENGTH_LONG).show();
    }
}
