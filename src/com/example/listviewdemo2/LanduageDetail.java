package com.example.listviewdemo2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

public class LanduageDetail extends Activity {
public static final String EXTRA_LANGID= "langid";
private static final String[] langTitle = {
		"HTML5","CSS3","JavaScript","PHP"
}; 
	private static final String[] langText = {
			"HTML5 is a morkup language designed to structure "+
	" an html document by giving meaning to its content that a "
	+ "web browser displays  on screen.",
	
	"CSS3 is a powerful stylesheet language designed to work with an html document"
	+ " in order to layout its content and give it its presentation on screen. ",
	
	" JavaScript is a scripting language designed to manipulate the structure of "
	+ " an HTML document in order to change its content and appearence dynamically. ",
	
	 " PHP which stands for Hypertext Preproccessor is a scripting language designed "
	+ " to work within a server software in  order to process incoming and outgoing data"
	+ " between a server and a web browser."
	
	
	}; 
	protected  void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.languagedetail);
		
		//get the views
		TextView  textV_title  =  (TextView) findViewById(R.id.langTitle);
		TextView  textV_text  =  (TextView) findViewById(R.id.langText);
		
		//get the clicked language index on the list
		Intent callerIntent  =  getIntent();
		int index  =  callerIntent.getIntExtra(EXTRA_LANGID, 0);
		
		
		//use this index to determine the title and text of the language
		textV_title.setText(langTitle[index]);
		textV_text.setText(langText[index]);
	}
}


