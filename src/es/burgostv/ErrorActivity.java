package es.burgostv;

import es.burgostv.R;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Window;

/**
 * Muestra un mensaje de error.
 * @author Alvaro Lara Cano
 *
 */
public class ErrorActivity extends Activity {

	/**
	 * Llamado cuando la Actividad es creada.
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		//Establecer layout segun telefono o tablet.
				if(getResources().getString(R.string.tipo_pantalla).equals("telefono")){
					setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
				}else{
					setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
				}
		setContentView(R.layout.error);

	}

}
