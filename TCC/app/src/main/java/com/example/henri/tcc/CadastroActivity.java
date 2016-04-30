package com.example.henri.tcc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.henri.tcc.DAO.UsuarioDAO;
import com.example.henri.tcc.modelo.Usuario;

public class CadastroActivity extends AppCompatActivity {
    FormularioHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        Button cadastrar = (Button) findViewById(R.id.btnCadEnviar);
        helper = new FormularioHelper(this);

        setSupportActionBar(toolbar);


        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Usuario usuario = helper.getUsuario();
                UsuarioDAO dao = new UsuarioDAO(CadastroActivity.this);
                dao.inserir(usuario);
                dao.close();
                Toast.makeText(CadastroActivity.this,"Usuario "+ usuario.getNome()+" salvo", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }


}
