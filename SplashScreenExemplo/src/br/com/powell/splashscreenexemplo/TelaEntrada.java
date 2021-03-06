package br.com.powell.splashscreenexemplo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class TelaEntrada extends Activity {

    private static final long TEMPO_ENTRADA = 1000;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_entrada);
        
        carregarOutraActivity();
    }

	private void carregarOutraActivity() {
		new Handler().postDelayed(new Runnable() {
			
			@Override
			public void run() {
				try{
					startActivity(new Intent(TelaEntrada.this, TelaSeguinte.class));
					finish();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}, TEMPO_ENTRADA);
	}
}
