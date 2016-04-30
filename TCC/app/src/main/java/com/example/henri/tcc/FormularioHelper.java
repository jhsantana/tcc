package com.example.henri.tcc;

import android.widget.EditText;

import com.example.henri.tcc.modelo.Usuario;

public class FormularioHelper {

    private final EditText cadastro_email;
    private final EditText cadastro_nome;
    private final EditText cadastro_password;
    private final EditText cadastro_password_confirm;

    public FormularioHelper(CadastroActivity cadastroActivity){

        cadastro_email = (EditText) cadastroActivity.findViewById(R.id.edtCadEmail);
        cadastro_nome = (EditText) cadastroActivity.findViewById(R.id.edtCadNome);
        cadastro_password = (EditText)cadastroActivity.findViewById(R.id.edtCadPassword);
        cadastro_password_confirm = (EditText) cadastroActivity.findViewById(R.id.edtCadPasswordConfirm);
    }
    public Usuario getUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNome(cadastro_nome.getText().toString());
        usuario.setEmail(cadastro_email.getText().toString());
        usuario.setPassword(cadastro_password.getText().toString());
        usuario.setPassword_confirm(cadastro_password_confirm.getText().toString());
        return usuario;
    }
}
