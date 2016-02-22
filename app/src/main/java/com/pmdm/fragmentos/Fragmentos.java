package com.pmdm.fragmentos;


 
import android.app.Activity; 
import android.app.FragmentManager; 
import android.app.FragmentTransaction; 
import android.os.Bundle; 
import android.view.Display; 
import android.view.WindowManager; 
 
public class Fragmentos extends Activity { 
 /** Called when the activity is first created. */ 
 @Override 
 public void onCreate(Bundle savedInstanceState) { 
 super.onCreate(savedInstanceState); 
 setContentView(R.layout.activity_fragmentos); 
 
 /** Código que añadimos. */
 
//Para manejar fragmentos mediante transacciones 
 FragmentManager fragmentManager = getFragmentManager(); 
 FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction(); 
 
//---obtiene información sobre la vista o View actual---
WindowManager wm = getWindowManager(); 
 
Display d = wm.getDefaultDisplay(); 
 
if (d.getWidth() > d.getHeight()) //se puede sustiuir a partir API 13 por (ver nota**) 
{ 
//---si modo horizontal, crea el fragmento1--- 
Fragment1 fragment1 = new Fragment1(); 
// android.R.id.content hace referencia a la vista de contenido de la actividad 
fragmentTransaction.replace(android.R.id.content, fragment1); 
}

else 
{ 
//---si modo vertical: crea el fragmento2--- 
Fragment2 fragment2 = new Fragment2(); 
fragmentTransaction.replace(android.R.id.content, fragment2); 
} 
//---añadir a la pila de nuevo---
fragmentTransaction.addToBackStack(null); 
 
//Para asegurar que los cambios sufren efecto, ejecutamos commit 
fragmentTransaction.commit(); 
} 
}
