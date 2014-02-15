package com.whereismymoney.activity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

// this menu class is not used for now, but it is kept because we might utilize it later
public class Menu extends ListActivity {

	String[] classes = {"Welcome","Login","example3","example4","example5","example6"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(Menu.this,android.R.layout.simple_list_item_1,classes));
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		String selected = classes[position];
		try {
			Class ourClass = Class.forName("com.whereismymoney.activity." + selected);
			Intent intent = new Intent(Menu.this,ourClass);
			startActivity(intent);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {

		}
	}

}