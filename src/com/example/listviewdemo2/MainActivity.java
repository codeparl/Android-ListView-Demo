package com.example.listviewdemo2;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ListView    lv  =  (ListView) findViewById(R.id.listView1);
		AdapterView.OnItemClickListener  listener  =  new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> adv, View vw, int pos, long id) {
			Intent intent  =  new Intent(MainActivity.this, LanduageDetail.class);
			
			//pass on the index to the activity to be loaded
			intent.putExtra(LanduageDetail.EXTRA_LANGID, (int) id);
			startActivity(intent);
				
			}
		};
		
		lv.setOnItemClickListener(listener);
	}//end method 



	
}
