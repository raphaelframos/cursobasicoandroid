package br.com.powell.meucarro;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;

public class TelaMenuPrincipal extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela_menu_principal);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tela_menu_principal, menu);
		return true;
	}

}
