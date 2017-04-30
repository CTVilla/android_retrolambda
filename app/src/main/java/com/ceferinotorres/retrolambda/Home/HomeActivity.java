package com.ceferinotorres.retrolambda.Home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import com.ceferinotorres.retrolambda.R;

/**
 * Created by CTORRES on 4/30/17.
 */

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        Button btnRetro = (Button) findViewById(R.id.btn_retro);
        //Aplicamos retrolambda para el evento onclick en el boton
        btnRetro.setOnClickListener(e -> Toast.makeText(this,
                "Click en el boton retro",Toast.LENGTH_LONG).show());
    }
}
