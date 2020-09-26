package es.joseljg.a2damcontador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txt_contador = null;
    private int cont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_contador = findViewById(R.id.txt_contador);
        cont = 0;
    }

    public void incrementarContador(View view) {
        cont++;
        if(cont == 100)
        {
            txt_contador.setTextSize(150);
        }
        String nuevoNumero = String.valueOf(cont);
        txt_contador.setText(nuevoNumero);
    }


}