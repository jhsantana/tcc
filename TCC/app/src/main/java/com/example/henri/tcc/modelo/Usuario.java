package com.example.henri.tcc.modelo;

/**
 * Created by henri on 24/04/2016.
 */
public class Usuario {

    private long id;
    private String nome;
    private String email;
    private String password;
    private String password_confirm;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void setPassword_confirm(String password_confirm) {
        this.password_confirm = password_confirm;
    }
    public String getPassword_confirm() {
        return password_confirm;
    }
}
