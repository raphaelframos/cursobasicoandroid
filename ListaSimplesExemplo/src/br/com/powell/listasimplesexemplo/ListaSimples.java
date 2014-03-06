package br.com.powell.listasimplesexemplo;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class ListaSimples extends ListActivity {

	private String[] menuPrincipal = {"Opção Um", "Opção Dois", "Opção Três"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(ListaSimples.this, 
				android.R.layout.simple_list_item_1, menuPrincipal);
		setListAdapter(adapter);
	}
}
