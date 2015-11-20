package br.com.leandroap.demolayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText etUsuario;
    private EditText etSenha;
    private Button btLogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsuario = (EditText) findViewById(R.id.etUsuario);
        etSenha = (EditText) findViewById(R.id.etSenha);
        btLogar = (Button) findViewById(R.id.btLogar);

        btLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validar(etUsuario.getText().toString(),
                        etSenha.getText().toString())){
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    i.putExtra("USUARIO", etUsuario.getText().toString());
                    startActivity(i);
                    finish();

                } else {
                    Toast.makeText(getApplicationContext(), R.string.msg_login_invalido, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean validar(String usuario, String senha) {

        if(usuario.equals("fiap") && senha.equals("fiap")){
            return true;
        } else {
            return false;
        }
    }


}
