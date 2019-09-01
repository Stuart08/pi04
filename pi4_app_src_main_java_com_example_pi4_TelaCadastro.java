package com.example.pi4;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

public class TelaCadastro extends AppCompatActivity {

  private EditText tCpf;
  private EditText tNome1;
  private EditText tEmail;
  private EditText tIdade;
  private EditText tWhats;
  private EditText tCep;
  private EditText tPatrimonio;
  private Button btSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);


    }




}
