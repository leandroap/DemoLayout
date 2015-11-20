package br.com.leandroap.demolayout;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class ListaTimesActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_times);

        String[] clubes = getResources().getStringArray(R.array.clubes_nome);
        setListAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, clubes));
    }


}
