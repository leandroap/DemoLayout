package br.com.leandroap.demolayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvUsuarioLogado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvUsuarioLogado = (TextView) findViewById(R.id.tvUsuarioLogado);

        if (getIntent().getExtras() != null) {
            tvUsuarioLogado.setText(
                    getString(R.string.usuario_logado,
                            getIntent().getStringExtra("USUARIO")));

        }
    }

    public void cadastrar(View view){

        Intent i = new Intent(this, CadastroActivity.class);
        startActivity(i);
    }

    public void listar(View view){
        Intent i = new Intent(this, ListaTimesActivity.class);
        startActivity(i);
    }

    public void listarGaleria (View view){
        Intent i = new Intent(this, GaleriaTimesActivity.class);
        startActivity(i);
    }

    public void sair (View view){
        finish();
    }
}
