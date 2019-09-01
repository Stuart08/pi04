package com.example.pi4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btCadastra = (Button) findViewById(R.id.btCadastra);
        Button btLogin = (Button) findViewById(R.id.btLogin);


        btCadastra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setContentView(R.layout.activity_tela_cadastro);
            }
        });

        btLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                 TextView tLogin = (TextView) findViewById(R.id.tLogin);
                 TextView tSinha = (TextView) findViewById(R.id.tSenha);
                 String login = tLogin.getText().toString();
                 String senha = tSinha.getText().toString();

                 if(login.equals("otavio") && senha.equals("123")){

                     alert("Login realizado com Sucesso, seja bem vindo Empresario");
                     setContentView(R.layout.activity_tela_empresario);

                 }else{

                    if(login.equals("alberto")&& senha.equals("321")){

                        alert("Login realizado com Sucesso, seja bem vindo Empreendedor");
                        setContentView(R.layout.activity_tela_enpreandedor);

                    }else{
                        alert("Login ou Senha incorretos");
                    }


         }}


        });
    }
    private void alert(String s){
        Toast.makeText(this,s,Toast.LENGTH_LONG).show();
    }
}
