package br.com.powell.adapterexemplo;

import java.util.Arrays;
import java.util.List;

import android.app.ListActivity;
import android.os.Bundle;
import br.com.powell.adapter.ExemploAdapter;
import br.com.powell.model.Exemplo;

public class MainActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		List<Exemplo> exemplos = criaExemplos();
		ExemploAdapter adapter = new ExemploAdapter(this, exemplos);
		setListAdapter(adapter);
	}

	private List<Exemplo> criaExemplos() {
		Exemplo exemplo1 = new Exemplo(R.drawable.ic_launcher, "Opção Um");
		Exemplo exemplo2 = new Exemplo(R.drawable.ic_launcher, "Opção Dois");
		Exemplo exemplo3 = new Exemplo(R.drawable.ic_launcher, "Opção Tres");
		return Arrays.asList(exemplo1, exemplo2, exemplo3);
	}
}
