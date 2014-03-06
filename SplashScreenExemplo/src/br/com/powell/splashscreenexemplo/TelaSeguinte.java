package br.com.powell.splashscreenexemplo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TelaSeguinte extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela_seguinte);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tela_seguinte, menu);
		return true;
	}

}
