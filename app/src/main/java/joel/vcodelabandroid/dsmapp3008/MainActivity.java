package joel.vcodelabandroid.dsmapp3008;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // CICLO DE VIDA UNA ACTIVIDAD

    /**
     * Se activa cuando el sistema crea la actividad por primera vez
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show();
    }

    /**
     * La llamda onStard() hace que el usuario pueda ver la actividad mientras la app
     * se prepara para qie esta entre en primer plano y se convierta en interactiva
     */
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show();
    }

    /**
     * Cuando entra a este actividad se pone en primer plano y, a continuación, el
     * sistema invoca la devolución de llamda
     */
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResumen", Toast.LENGTH_SHORT).show();
    }

    /**
     * Cuando el usuario ya no pueda ver tu actividad, significa que ha entrado en
     * el estado Stopped, y el sistema invoca la devolución de llamada onOstop()
     */
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();
    }

    /**
     * Se llama a onDestroy() antes de que finalice la actividad:
     *
     * 1) La actividad está terminando (debido a que el usuario la descarta por
     * completo o a que se llama finish())
     *
     * 2) El sistema está finilizando temporalmente la actividad debido a un
     * cambio de configuración (como la rotación del dispositivo o el modo
     * multiventana)
      */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }

}