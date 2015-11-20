package br.com.leandroap.demolayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import br.com.leandroap.demolayout.adapter.ImagemAdapter;

public class GaleriaTimesActivity extends AppCompatActivity {
    
    private GridView gridView;
    private ImagemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria_times);
        adapter = new ImagemAdapter(this, getImagens());
        gridView = (GridView)findViewById(R.id.gridview);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Integer imagem = (Integer) adapter.getItem(i);
            }
        });
    }

    private Integer[] getImagens() {
        Integer[] imagens = {

                R.drawable.atl_mineiro,
                R.drawable.botafogo,
                R.drawable.corinthians,
                R.drawable.coritiba,
                R.drawable.cruzeiro,
                R.drawable.figueirense,
                R.drawable.flamengo,
                R.drawable.fluminense,
                R.drawable.goias,
                R.drawable.gremio,
                R.drawable.guarani,
                R.drawable.internacional,
                R.drawable.juventude,
                R.drawable.palmeiras,
                R.drawable.parana,
                R.drawable.paranaense,
                R.drawable.paysandu,
                R.drawable.ponte_preta,
                R.drawable.santos,
                R.drawable.sao_caetano,
                R.drawable.sao_paulo,
                R.drawable.vasco_da_gama,
                R.drawable.vitoria
        };

        return imagens;
    }


}
