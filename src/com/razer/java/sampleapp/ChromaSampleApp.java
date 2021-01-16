package com.razer.java.sampleapp;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import com.razer.java.JAppInfoType;
import com.razer.java.JChromaSDK;

public class ChromaSampleApp extends ChromaEffects {
	
	private static int MAX_ITEMS = 47;
	
	private static boolean sWaitForExit = true;
	private static boolean sChromaInitialized = false;
	private static int sSelectedItem = 1;
	
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

		JAppInfoType appInfo = new JAppInfoType();

	    appInfo.setTitle("Java Chroma Sample App");
	    appInfo.setDescription("A sample application using Razer Chroma SDK");
	    appInfo.setAuthorName("Razer");
	    appInfo.setAuthorContact("https://github.com/RazerOfficial/Java_ChromaSampleApp");

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
		int result = sChromaAnimationAPI.initSDK(appInfo);
		if (result == 0) {
			sChromaInitialized = true;
			logMessage("Initialized ChromaSDK!");
		} else {
			logError("Failed to initialize ChromaSDK! error="+result);
			sChromaInitialized = false;
			logMessage("Application quit!");
			return;
		}
		
		executeItem(1);
		
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
		
		
		for (int index = 1; index <= MAX_ITEMS; ++index)
        {
            if (index == sSelectedItem)
            {
                System.out.print("[*] ");
            }
            else
            {
            	System.out.print("[ ] ");
            }
            System.out.print("Effect" + index);

            if ((index % 4) == 0)
            {
            	System.out.println();
            }
            else
            {
            	System.out.print("\t\t");
            }
        }
		System.out.println();
		
		logMessage("Enter the effect number and press `ENTER` to play the effect.");
		logMessage("Press `p` and press `ENTER` for the previous effect.");
		logMessage("Press `n` and press `ENTER` for the next effect.");
		logMessage("Press `q` and press `ENTER` to quit\r\n");
	}
	
	private static void handleInput() {
		Scanner scanner = new Scanner(System.in);
		
		printLegend();
		while (sWaitForExit) {
			try {
				String input =  scanner.next();
				printLegend();
				int item = 0;
				switch (input) {
				case "p":
				case "P":
					if (sSelectedItem > 0) {
						--sSelectedItem;
					}
					item = sSelectedItem;
					break;
				case "n":
				case "N":
					if (sSelectedItem < MAX_ITEMS) {
						++sSelectedItem;
					}
					item = sSelectedItem;
					break;
				case "Q":
				case "q":
					scanner.close();
					return;
				default:
					item = Integer.parseInt(input);
					sSelectedItem = item;
					break;
				}
				executeItem(item);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static void executeItem(int item) {
		switch (item)
        {
            case 1:
                showEffect1();
                showEffect1ChromaLink();
                showEffect1Headset();
                showEffect1Keypad();
                showEffect1Mousepad();
                showEffect1Mouse();
                break;
            case 2:
                showEffect2();
                showEffect2ChromaLink();
                showEffect2Headset();
                showEffect2Keypad();
                showEffect2Mousepad();
                showEffect2Mouse();
                break;
            case 3:
                showEffect3();
                showEffect3ChromaLink();
                showEffect3Headset();
                showEffect3Keypad();
                showEffect3Mousepad();
                showEffect3Mouse();
                break;
            case 4:
                showEffect4();
                showEffect4ChromaLink();
                showEffect4Headset();
                showEffect4Keypad();
                showEffect4Mousepad();
                showEffect4Mouse();
                break;
            case 5:
                showEffect5();
                showEffect5ChromaLink();
                showEffect5Headset();
                showEffect5Keypad();
                showEffect5Mousepad();
                showEffect5Mouse();
                break;
            case 6:
                showEffect6();
                showEffect6ChromaLink();
                showEffect6Headset();
                showEffect6Keypad();
                showEffect6Mousepad();
                showEffect6Mouse();
                break;
            case 7:
                showEffect7();
                showEffect7ChromaLink();
                showEffect7Headset();
                showEffect7Keypad();
                showEffect7Mousepad();
                showEffect7Mouse();
                break;
            case 8:
                showEffect8();
                showEffect8ChromaLink();
                showEffect8Headset();
                showEffect8Keypad();
                showEffect8Mousepad();
                showEffect8Mouse();
                break;
            case 9:
                showEffect9();
                showEffect9ChromaLink();
                showEffect9Headset();
                showEffect9Keypad();
                showEffect9Mousepad();
                showEffect9Mouse();
                break;
            case 10:
                showEffect10();
                showEffect10ChromaLink();
                showEffect10Headset();
                showEffect10Keypad();
                showEffect10Mousepad();
                showEffect10Mouse();
                break;
            case 11:
                showEffect11();
                showEffect11ChromaLink();
                showEffect11Headset();
                showEffect11Keypad();
                showEffect11Mousepad();
                showEffect11Mouse();
                break;
            case 12:
                showEffect12();
                showEffect12ChromaLink();
                showEffect12Headset();
                showEffect12Keypad();
                showEffect12Mousepad();
                showEffect12Mouse();
                break;
            case 13:
                showEffect13();
                showEffect13ChromaLink();
                showEffect13Headset();
                showEffect13Keypad();
                showEffect13Mousepad();
                showEffect13Mouse();
                break;
            case 14:
                showEffect14();
                showEffect14ChromaLink();
                showEffect14Headset();
                showEffect14Keypad();
                showEffect14Mousepad();
                showEffect14Mouse();
                break;
            case 15:
                showEffect15();
                showEffect15ChromaLink();
                showEffect15Headset();
                showEffect15Keypad();
                showEffect15Mousepad();
                showEffect15Mouse();
                break;
            case 16:
                showEffect16();
                showEffect16ChromaLink();
                showEffect16Headset();
                showEffect16Keypad();
                showEffect16Mousepad();
                showEffect16Mouse();
                break;
            case 17:
                showEffect17();
                showEffect17ChromaLink();
                showEffect17Headset();
                showEffect17Keypad();
                showEffect17Mousepad();
                showEffect17Mouse();
                break;
            case 18:
                showEffect18();
                showEffect18ChromaLink();
                showEffect18Headset();
                showEffect18Keypad();
                showEffect18Mousepad();
                showEffect18Mouse();
                break;
            case 19:
                showEffect19();
                showEffect19ChromaLink();
                showEffect19Headset();
                showEffect19Keypad();
                showEffect19Mousepad();
                showEffect19Mouse();
                break;
            case 20:
                showEffect20();
                showEffect20ChromaLink();
                showEffect20Headset();
                showEffect20Keypad();
                showEffect20Mousepad();
                showEffect20Mouse();
                break;
            case 21:
                showEffect21();
                showEffect21ChromaLink();
                showEffect21Headset();
                showEffect21Keypad();
                showEffect21Mousepad();
                showEffect21Mouse();
                break;
            case 22:
                showEffect22();
                showEffect22ChromaLink();
                showEffect22Headset();
                showEffect22Keypad();
                showEffect22Mousepad();
                showEffect22Mouse();
                break;
            case 23:
                showEffect23();
                showEffect23ChromaLink();
                showEffect23Headset();
                showEffect23Keypad();
                showEffect23Mousepad();
                showEffect23Mouse();
                break;
            case 24:
                showEffect24();
                showEffect24ChromaLink();
                showEffect24Headset();
                showEffect24Keypad();
                showEffect24Mousepad();
                showEffect24Mouse();
                break;
            case 25:
                showEffect25();
                showEffect25ChromaLink();
                showEffect25Headset();
                showEffect25Keypad();
                showEffect25Mousepad();
                showEffect25Mouse();
                break;
            case 26:
                showEffect26();
                showEffect26ChromaLink();
                showEffect26Headset();
                showEffect26Keypad();
                showEffect26Mousepad();
                showEffect26Mouse();
                break;
            case 27:
                showEffect27();
                showEffect27ChromaLink();
                showEffect27Headset();
                showEffect27Keypad();
                showEffect27Mousepad();
                showEffect27Mouse();
                break;
            case 28:
                showEffect28();
                showEffect28ChromaLink();
                showEffect28Headset();
                showEffect28Keypad();
                showEffect28Mousepad();
                showEffect28Mouse();
                break;
            case 29:
                showEffect29();
                showEffect29ChromaLink();
                showEffect29Headset();
                showEffect29Keypad();
                showEffect29Mousepad();
                showEffect29Mouse();
                break;
            case 30:
                showEffect30();
                showEffect30ChromaLink();
                showEffect30Headset();
                showEffect30Keypad();
                showEffect30Mousepad();
                showEffect30Mouse();
                break;
            case 31:
                showEffect31();
                showEffect31ChromaLink();
                showEffect31Headset();
                showEffect31Keypad();
                showEffect31Mousepad();
                showEffect31Mouse();
                break;
            case 32:
                showEffect32();
                showEffect32ChromaLink();
                showEffect32Headset();
                showEffect32Keypad();
                showEffect32Mousepad();
                showEffect32Mouse();
                break;
            case 33:
                showEffect33();
                showEffect33ChromaLink();
                showEffect33Headset();
                showEffect33Keypad();
                showEffect33Mousepad();
                showEffect33Mouse();
                break;
            case 34:
                showEffect34();
                showEffect34ChromaLink();
                showEffect34Headset();
                showEffect34Keypad();
                showEffect34Mousepad();
                showEffect34Mouse();
                break;
            case 35:
                showEffect35();
                showEffect35ChromaLink();
                showEffect35Headset();
                showEffect35Keypad();
                showEffect35Mousepad();
                showEffect35Mouse();
                break;
            case 36:
                showEffect36();
                showEffect36ChromaLink();
                showEffect36Headset();
                showEffect36Keypad();
                showEffect36Mousepad();
                showEffect36Mouse();
                break;
            case 37:
                showEffect37();
                showEffect37ChromaLink();
                showEffect37Headset();
                showEffect37Keypad();
                showEffect37Mousepad();
                showEffect37Mouse();
                break;
            case 38:
                showEffect38();
                showEffect38ChromaLink();
                showEffect38Headset();
                showEffect38Keypad();
                showEffect38Mousepad();
                showEffect38Mouse();
                break;
            case 39:
                showEffect39();
                showEffect39ChromaLink();
                showEffect39Headset();
                showEffect39Keypad();
                showEffect39Mousepad();
                showEffect39Mouse();
                break;
            case 40:
                showEffect40();
                showEffect40ChromaLink();
                showEffect40Headset();
                showEffect40Keypad();
                showEffect40Mousepad();
                showEffect40Mouse();
                break;
            case 41:
                showEffect41();
                showEffect41ChromaLink();
                showEffect41Headset();
                showEffect41Keypad();
                showEffect41Mousepad();
                showEffect41Mouse();
                break;
            case 42:
                showEffect42();
                showEffect42ChromaLink();
                showEffect42Headset();
                showEffect42Keypad();
                showEffect42Mousepad();
                showEffect42Mouse();
                break;
            case 43:
                showEffect43();
                showEffect43ChromaLink();
                showEffect43Headset();
                showEffect43Keypad();
                showEffect43Mousepad();
                showEffect43Mouse();
                break;
            case 44:
                showEffect44();
                showEffect44ChromaLink();
                showEffect44Headset();
                showEffect44Keypad();
                showEffect44Mousepad();
                showEffect44Mouse();
                break;
            case 45:
                showEffect45();
                showEffect45ChromaLink();
                showEffect45Headset();
                showEffect45Keypad();
                showEffect45Mousepad();
                showEffect45Mouse();
                break;
            case 46:
                showEffect46();
                showEffect46ChromaLink();
                showEffect46Headset();
                showEffect46Keypad();
                showEffect46Mousepad();
                showEffect46Mouse();
                break;
            case 47:
                showEffect47();
                showEffect47ChromaLink();
                showEffect47Headset();
                showEffect47Keypad();
                showEffect47Mousepad();
                showEffect47Mouse();
                break;
        }
	}

}
