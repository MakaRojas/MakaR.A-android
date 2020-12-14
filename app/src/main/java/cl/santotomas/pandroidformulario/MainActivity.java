package cl.santotomas.pandroidformulario;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";


    private Button mActivityBtn;
    private EditText texto;
    private Button Registrar;
    private EditText nombre;
    private EditText apellido;
    private EditText tarjetadNum;
    private EditText mesID;
    private EditText añoID;
    private EditText callenum;
    private EditText ciudad;
    private EditText codigo;
    private EditText copostal;
    private EditText estado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.nombre = findViewById(R.id.NbreID);
        this.apellido = findViewById(R.id.ApdoID);
        this.tarjetadNum = findViewById(R.id.tarje_NumID);
        this.mesID = findViewById(R.id.MesID);
        this.añoID = findViewById(R.id.AñoID);
        this.callenum = findViewById(R.id.Calle_NumID);
        this.ciudad = findViewById(R.id.CiudadID);
        this.codigo = findViewById(R.id.Codigo_t_ID);
        this.copostal = findViewById(R.id.C_PostalID);
        this.estado = findViewById(R.id.EstadoID);

        Registrar = (Button) findViewById(R.id.botonREG);
        nombre = (EditText) findViewById(R.id.NbreID);
        mActivityBtn = (Button) findViewById(R.id.btn_Guardar);

        Log.i(TAG, "Funcion oncreate");
        Toast.makeText(this, "Dentro del onCreate", Toast.LENGTH_LONG).show(); // Notificacion del ususario

        Registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.botonREG:
                        Intent registroIntent = new Intent(MainActivity.this, Registro.class);
                        startActivity(registroIntent);
                        break;
                }
            }
        });

        mActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                texto = (EditText) findViewById(R.id.NbreID);
                intent.putExtra("nombre del Titular",texto.getText().toString());
                texto = (EditText) findViewById(R.id.ApdoID);
                intent.putExtra("apellido del Titular",texto.getText().toString());
                texto = (EditText) findViewById(R.id.Codigo_t_ID);
                intent.putExtra("numero de Tarjeta",texto.getText().toString());
                texto = (EditText) findViewById(R.id.MesID);
                intent.putExtra("mes tarjeta",texto.getText().toString());
                texto = (EditText) findViewById(R.id.AñoID);
                intent.putExtra("año tarjeta",texto.getText().toString());
                startActivity(intent);


            }
        });
    }
}