package com.example.mantenimiento2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OrdenTrabajoLista extends AppCompatActivity {
    Button nuevaOrden;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ordenes_lista);

        nuevaOrden = findViewById(R.id.btnNuevaOrden);

        nuevaOrden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NuevaOrden.class);
                startActivity(intent);
            }
        });
    }
}