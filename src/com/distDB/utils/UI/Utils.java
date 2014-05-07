package com.distDB.utils.UI;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;

public class Utils {
	public static void messageBox(String title, String msg, final Activity activity) {
		AlertDialog.Builder alertBuilder = new AlertDialog.Builder(activity);
		alertBuilder.setTitle(title);
		alertBuilder.setMessage(msg);
		alertBuilder.setPositiveButton("OK",new DialogInterface.OnClickListener() {
	        public void onClick(DialogInterface dialog, int whichButton) {
	             activity.finish(); 
	        }
	    });
		alertBuilder.create().show();
	}
}