package br.com.powell.logcatexemplo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

	private static final String TAG = "LogCatExemplo";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.d(TAG, "Debbug");
		Log.i(TAG, "Info");
		Log.v(TAG, "Verbose");
		Log.w(TAG, "Warning");
		Log.e(TAG, "Error");
	}
}
