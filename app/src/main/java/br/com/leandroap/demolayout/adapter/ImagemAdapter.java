package br.com.leandroap.demolayout.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import br.com.leandroap.demolayout.R;

/**
 * Created by leandro on 26/09/15.
 */
public class ImagemAdapter extends BaseAdapter {


    private Context context;
    private Integer[] imagens;

    public ImagemAdapter(Context context, Integer[] imagens) {
        this.context = context;
        this.imagens = imagens;
    }


    @Override
    public int getCount() {
        return imagens.length;
    }

    @Override
    public Object getItem(int i) {
        return imagens[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

        @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_gridview,
                    parent, false);

        }

        ImageView imagem = (ImageView) convertView.findViewById(R.id.ivClube);
        imagem.setImageResource(imagens[position]);

        return convertView;
    }
}
