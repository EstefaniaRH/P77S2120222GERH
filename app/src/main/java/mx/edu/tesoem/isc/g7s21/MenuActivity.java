package mx.edu.tesoem.isc.g7s21;

import androidx.appcompat.app.AppCompatActivity;
import mx.edu.tesoem.isc.g7s21.Datos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    Button btnnat, btnobj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        final String nombre = "Estefania Rodriguez";
        final int edad = 22;

        btnnat = findViewById(R.id.btnnat);
        btnobj = findViewById(R.id.btnobj);

        btnnat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inativo = new Intent(MenuActivity.this,NativoActivity.class);
                inativo.putExtra("nombre",nombre);
                inativo.putExtra("edad",edad);
                startActivity(inativo);
            }
        });

        btnobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iobj = new Intent(MenuActivity.this,ObjetoActvity.class );
                iobj.putExtra("nombre",nombre);
                iobj.putExtra("edad",edad);
                startActivity(iobj);

            }
        });
    }
}
