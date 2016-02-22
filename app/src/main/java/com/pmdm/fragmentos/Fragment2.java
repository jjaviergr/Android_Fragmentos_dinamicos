package com.pmdm.fragmentos;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Fragment2 extends Fragment {
	public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState)
	{
		return inflater.inflate(R.layout.fragment2, container,false);
	}
	
	public void onStart() { 
		 super.onStart(); 
		 //--- Vista del botón ---
		 Button btnGetText=(Button)getActivity().findViewById(R.id.btnGetText); 
		 btnGetText.setOnClickListener(new View.OnClickListener()
		 { 
		 
			 public void onClick(View v)
			 { 
				 
		 TextView lbl = (TextView) getActivity().findViewById(R.id.lblfragment2);
		 
		 Toast toast=Toast.makeText(getActivity(), lbl.getText(), Toast.LENGTH_SHORT);
		 toast.show(); 
		
		 } 
		 }); 
		} 


}
