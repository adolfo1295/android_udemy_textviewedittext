package edittext.textview.curso.udemy.adolfo.com.textview_edittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Adlfo Chavez, Textviews y EditText
 */
public class MainActivity extends AppCompatActivity {

    //primero declaramos las variables/componentes a utilziar
    private EditText etNombre;
    private TextView tvNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //despues se inician en el oncreate para poder utlizarlos, si no se nician, al tratar de trabajar con ellos
        //se tomaran como nulos y explotara la aplicacion
        //para iniiciarlos se sigue la siguiente estructura
        tvNombre = (TextView) findViewById(R.id.tvNombre);
        etNombre = (EditText) findViewById(R.id.etNombre);
    }

    //al presionar el boton, se obtendra lo que este dentro del edit text
    //y se mostrara en el tetview que esta abajo de el
    public void metodoPresionar(View view) {
        //se obtiene lo que este dentro dle edit text
        //se guardara en una variable el valor del edit text
        String dato = etNombre.getText().toString();
        //ya teniendo loq ue esta dentro, se insertara en el text view
        tvNombre.setText(dato);
    }
}
