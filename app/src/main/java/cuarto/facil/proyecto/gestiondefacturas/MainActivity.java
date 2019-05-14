package cuarto.facil.proyecto.gestiondefacturas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.e("sopadomacaco", "OnCreate");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.e("sopadomacaco", "OnStart");
    }




    @Override
    protected void onResume() {
        super.onResume();
        Log.e("sopadomacaco", "OnResume");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.e("sopadomacaco", "OnRestart");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.e("sopadomacaco", "OnPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.e("sopadomacaco", "OnStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.e("sopadomacaco", "OnDestroy");
    }


}
