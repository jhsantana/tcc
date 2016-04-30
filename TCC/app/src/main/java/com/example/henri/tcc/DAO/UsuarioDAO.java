package com.example.henri.tcc.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.henri.tcc.modelo.Usuario;

/**
 * Created by henri on 24/04/2016.
 */
public class UsuarioDAO extends SQLiteOpenHelper {
    public UsuarioDAO(Context context) {
        super(context, "AUC", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
            String sql = "CREATE TABLE Usuarios (id INTEGER PRIMARY KEY, nome TEXT NOT NULL, email TEXT NOT NULL, password TEXT NOT NULL, password_confirm TEXT NOT NULL);";
            db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            String sql = "DROP TABLE IF EXIST Usuarios";
            db.execSQL(sql);
        onCreate(db);
    }

    public void inserir(Usuario usuario) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues dados = new ContentValues();
        dados.put("nome", usuario.getNome().toString());
        dados.put("email", usuario.getEmail().toString());
        dados.put("password", usuario.getPassword().toString());
        dados.put("password_confirm", usuario.getPassword_confirm().toString());
        db.insert("Usuarios",null, dados);
    }
}
