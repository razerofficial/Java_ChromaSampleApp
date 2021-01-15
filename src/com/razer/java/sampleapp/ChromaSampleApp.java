package com.razer.java.sampleapp;

import java.io.IOException;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import com.razer.java.JAppInfoType;
import com.razer.java.JChromaSDK;

public class ChromaSampleApp extends ChromaEffects {
	
	private static boolean sWaitForExit = true;
	private static boolean sChromaInitialized = false;
	
	private static void logMessage(String msg) {
		System.out.println(msg);
	}
	
	private static void logError(String msg) {
		System.err.println(msg);
	}

	public static void main(String[] args) {
		logMessage("JAVA Chroma Sample App");
		
		sChromaAnimationAPI = JChromaSDK.getInstance();
		ChromaEffects.sChromaAnimationAPI = sChromaAnimationAPI;

		logMessage("*****Constructing AppInfo...");
		JAppInfoType appInfo = new JAppInfoType();

	    appInfo.setTitle("Java Chroma Sample App");
	    appInfo.setDescription("A sample application using Razer Chroma SDK");
	    appInfo.setAuthorName("Razer");
	    appInfo.setAuthorContact("https://github.com/tgraupmann/Java_ChromaSampleApp");

	    //appInfo.SupportedDevice = 
	    //    0x01 | // Keyboards
	    //    0x02 | // Mice
	    //    0x04 | // Headset
	    //    0x08 | // Mousepads
	    //    0x10 | // Keypads
	    //    0x20   // ChromaLink devices
	    //    ;
	    appInfo.supportedDevice = (0x01 | 0x02 | 0x04 | 0x08 | 0x10 | 0x20);
	    appInfo.category = 2;
	    logMessage("*****Initializing Chroma...");
		int result = sChromaAnimationAPI.initSDK(appInfo);
		if (result == 0) {
			sChromaInitialized = true;
			logMessage("*****Initialized ChromaSDK!");
		} else {
			logError("******* Failed to initialize ChromaSDK! error="+result);
			sChromaInitialized = false;
			logMessage("Application quit!");
			return;
		}
		
		handleInput();
		
		uninit();
		
		logMessage("Application quit!");
	}
	
	private static void uninit() {
		sWaitForExit = false;
		Timer timer = new Timer("Timer");
		TimerTask task = new TimerTask() {
			public void run() {
				try {
					if (sChromaInitialized) {
						sChromaAnimationAPI.stopAll();
						sChromaAnimationAPI.closeAll();
						sChromaAnimationAPI.uninit();
						sChromaInitialized = false;
					}
					
					ChromaEffects.sChromaAnimationAPI = null;
					sChromaAnimationAPI = null;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		timer.schedule(task, 100);
	}
	
	private static void printLegend() {
		logMessage("Press 'q' enter to quit\r\n");
	}
	
	private static void handleInput() {
		printLegend();
		while (sWaitForExit) {
			try {
				int key =  System.in.read();
				printLegend();
				if (key == 113) { // q
					return;
				}
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				return;
			}
	    
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
