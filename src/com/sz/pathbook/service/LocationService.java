package com.sz.pathbook.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class LocationService extends Service{

	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	 @Override
	 public int onStartCommand(Intent intent, int flags, int startId) {
		Toast.makeText(this, "定位服务开启", Toast.LENGTH_LONG).show();
		return START_STICKY;
	}
	 
	 @Override
	 public void onDestroy () {
		 super.onDestroy();
		 Toast.makeText(this, "定位服务关闭", Toast.LENGTH_LONG).show();
		
	 } 

}
