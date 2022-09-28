package mx.edu.tesoem.isc.g7s21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NativoActivity extends AppCompatActivity {
    TextView lblnombre, lbledad;
    Button btnregresa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nativo);

        lblnombre = findViewById(R.id.lblnombre);
        lbledad = findViewById(R.id.lbledad);

        String nombre = "";
        int edad = 0;

        Bundle parametros = getIntent().getExtras();

        nombre= parametros.getString("nombre");
        edad= parametros.getInt("edad");

        lblnombre.setText(nombre);
        lbledad.setText(String.valueOf(edad));


        btnregresa = findViewById(R.id.btnregresa1);
        btnregresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { onBackPressed();

            }
        });


    }
}
