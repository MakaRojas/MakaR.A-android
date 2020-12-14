package cl.santotomas.pandroidformulario;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    TextView datostarjeta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        obtenerDatos();
    }

    public void obtenerDatos() {
        Bundle extras = getIntent().getExtras();
        String dato1 = extras.getString("nombre del Titular");
        String dato2 = extras.getString("apellido del Titular");
        String dato3 = extras.getString("numero deTarjeta");
        String dato4 = extras.getString("mes de tarjeta");
        String dato5 = extras.getString("año de tarjeta");

        datostarjeta = (TextView) findViewById(R.id.datostarjeta);
        datostarjeta.setText(dato1 + " " + dato2);
        datostarjeta = (TextView) findViewById(R.id.numCredit);
        datostarjeta.setText(dato3);
        datostarjeta = (TextView) findViewById(R.id.mesYaño);
        datostarjeta.setText(dato4 + "/" + dato5);
    }




}
