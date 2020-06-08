package com.example.operacoescrud;

import android.database.sqlite.SQLiteDatabase;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    private TextInputLayout formaRa;
    private TextInputLayout formaNome;
    private TextInputLayout formaEmail;
    private TextInputLayout formaTelefone;

    private EditText ra;
    private EditText nome;
    private EditText email;
    private EditText telefone;

    private Button botaoCadastro;
    private SQLiteDatabase banco;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Cria a ase
        banco = openOrCreateDatabase("base", MODE_PRIVATE, null);
        //cria a tabela de cadastro

        banco.execSQL("CREATE TABLE IF NOT EXISTS usuários (usuário VARCHAR PRIMARY KEY, nome VARCHAR, senha VARCHAR)");

        formaRa = findViewById(R.id.textInputLayout);
        formaNome = findViewById(R.id.textInputLayout2);
        formaEmail = findViewById(R.id.textInputLayout3);
        formaTelefone = findViewById(R.id.textInputLayout4);

        ra = findViewById(R.id.inputRA);
        nome = findViewById(R.id.inputNome);
        email = findViewById(R.id.inputEmail);
        telefone = findViewById(R.id.inputTelefone);

        botaoCadastro = findViewById(R.id.botaoCadastro);

        botaoCadastro.setOnClickListener(
            banco.execSQL("INSERT INTO usuários (usuário, nome, senha) VALUES ('joao.silva', 'João', '12345')");
        );





        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
