package com.pmdm.fragmentos;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
public class Fragment1 extends Fragment 
{
   @Override
   public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) 
   {
      // ---establecer el diseño para este fragmento ---
      return inflater.inflate(R.layout.fragment1, container,false);
   }
}
