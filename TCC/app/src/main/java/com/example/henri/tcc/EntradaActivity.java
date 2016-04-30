package com.example.henri.tcc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.facebook.FacebookSdk;

public class EntradaActivity extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrada);
        FacebookSdk.sdkInitialize(getApplicationContext());

        Button cadastro = (Button) findViewById(R.id.btn_cadastrar);
        Button logar = (Button) findViewById(R.id.btn_entrar);

        ImageView logo_principal = (ImageView) findViewById(R.id.logo_main);
        logo_principal.setImageResource(R.drawable.logo_main);


        logar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(EntradaActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(EntradaActivity.this, CadastroActivity.class);
                startActivity(intent);
            }
        });

    }


}
