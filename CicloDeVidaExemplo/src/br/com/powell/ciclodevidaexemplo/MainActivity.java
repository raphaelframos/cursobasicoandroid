package br.com.powell.ciclodevidaexemplo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

	private static final String TAG = "Ciclo de vida";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.d(TAG, "onCreate");
	}
	
	@Override
	public void onStart(){
		super.onStart();
		Log.v(TAG, "onStart");
	}
	
	@Override
	public void onResume(){
		super.onResume();
		Log.i(TAG, "onResume");
	}
	
	@Override
	public void onPause(){
		super.onPause();
		Log.v(TAG, "onPause");
	}
	
	@Override
	public void onStop(){
		super.onStop();
		Log.w(TAG, "onStop");
	}
	
	@Override
	public void onRestart(){
		super.onRestart();
		Log.d(TAG, "onRestart");
	}
	
	@Override
	public void onDestroy(){
		super.onDestroy();
		Log.e(TAG, "onDestroy");
	}
}
