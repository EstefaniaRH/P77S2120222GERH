package mx.edu.tesoem.isc.g7s21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ObjetoActvity extends AppCompatActivity {

    TextView lblnombre2,lbledad2;
    Button btnregresa1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objeto_actvity);

        lblnombre2 = findViewById(R.id.lblnombre2);
        lbledad2 = findViewById(R.id.lbledad2);

        String nombre = "";
        int edad = 0;

        Bundle parametros = getIntent().getExtras();

        nombre= parametros.getString("nombre");
        edad= parametros.getInt("edad");

        lblnombre2.setText(nombre);
        lbledad2.setText(String.valueOf(edad));


        btnregresa1 = findViewById(R.id.btnregresa1);
        btnregresa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { onBackPressed();

            }
        });


        //lo mando a los objetos del xml
    }
}
