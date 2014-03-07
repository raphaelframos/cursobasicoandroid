package br.com.powell.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import br.com.powell.adapterexemplo.R;
import br.com.powell.model.Exemplo;

public class ExemploAdapter extends ArrayAdapter<Exemplo>{

	private Context context;
	private List<Exemplo> exemplos;
	
	public ExemploAdapter(Context context, List<Exemplo> exemplos) {
		super(context, R.layout.adapter_exemplo, exemplos);
		this.context = context;
		this.exemplos = exemplos;
	}

	@Override
	public View getView(int posicao, View view, ViewGroup group){
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		view = inflater.inflate(R.layout.adapter_exemplo, group, false);
		TextView textNome = (TextView) view.findViewById(R.id.textViewNome);
		ImageView imagem = (ImageView) view.findViewById(R.id.imageViewImagem);
		
		Exemplo exemplo = exemplos.get(posicao);
		if(exemplo != null){
			textNome.setText(exemplo.getNome());
			imagem.setBackgroundResource(exemplo.getImagem());
		}
		
		return view;
		
	}
}
