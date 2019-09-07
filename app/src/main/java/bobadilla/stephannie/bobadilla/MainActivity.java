package bobadilla.stephannie.bobadilla;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    EditText editTextNombre, editTextPass;
    Button botonIngreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //match con la vista
        setContentView(R.layout.activity_main);
        //match de los widgets
        editTextNombre = findViewById(R.id.etNombre);
        editTextPass = findViewById(R.id.etPass);
        botonIngreso = findViewById(R.id.btnEntrar);

        botonIngreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombreUsuario = editTextNombre.getText().toString();
                String password = editTextPass.getText().toString();

                if (nombreUsuario.isEmpty() || password.isEmpty()) {
                    //nombre de usuario vacio
                    mensajito("El usuario o contraseña estan vacios");
                } else {
                    if (nombreUsuario.equals("stephannie") && password.equals("1234")) {
                        //imprimir bienvenido
                        mensajito("Bienvenido!!!");
                    } else {
                        //imprimir datos erroneos
                        mensajito("Datos erroneos, intente nuevamente");
                    }
                }
            }
        });
    }
    public void mensajito(String mensaje){
        Toast.makeText( this,mensaje,Toast.LENGTH_LONG).show();
    }

}
