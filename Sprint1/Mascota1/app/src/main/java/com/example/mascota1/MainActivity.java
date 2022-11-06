package com.example.mascota1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Mascota mascota = new Mascota("Pipo", "Calle 132b 91-65",
                "Un mejor amigo tierno y adorable", 7904292,
                5, 7.1377,
                73.121, TipoLugar.LUGARESADOPCION);

        mensaje = findViewById(R.id.txt_mensaje);
        mensaje.setText(mascota.toString());
        Log.d("Tag en main", "Mensaje prueba por el logcat");
    }
}