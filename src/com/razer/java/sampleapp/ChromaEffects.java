package com.razer.java.sampleapp;

import com.razer.java.JChromaSDK;
import com.razer.java.JChromaSDK.Device;
import com.razer.java.JChromaSDK.Device2D;

public class ChromaEffects {
	protected static JChromaSDK sChromaAnimationAPI = null;

	protected static String getAnimationPath() {
		String cd = System.getProperty("user.dir");
		// System.out.println("********* getAnimationPath: cd="+cd);
		String path = cd + "\\Animations\\";
		// System.out.println("********* getAnimationPath: path="+path);
		return path;
	}

	public static void showEffect1() {

		// Trigger haptic effect
		sChromaAnimationAPI.coreSetEventName("Effect1");
		
		// start with a blank animation
		String baseLayer = "animations/Sprite1_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect1ChromaLink() {
		// start with a blank animation
		String baseLayer = "animations/Sprite1_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect1Headset() {
		// start with a blank animation
		String baseLayer = "animations/Sprite1_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect1Mousepad() {
		// start with a blank animation
		String baseLayer = "animations/Sprite1_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect1Mouse() {
		// start with a blank animation
		String baseLayer = "animations/Sprite1_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect1Keypad() {
		// start with a blank animation
		String baseLayer = "animations/Sprite1_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect2() {

		// Trigger haptic effect
		sChromaAnimationAPI.coreSetEventName("Effect2");
				
		// start with a blank animation
		String baseLayer = "animations/Trails_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect2ChromaLink() {
		// start with a blank animation
		String baseLayer = "animations/Trails_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect2Headset() {
		// start with a blank animation
		String baseLayer = "animations/Trails_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect2Mousepad() {
		// start with a blank animation
		String baseLayer = "animations/Trails_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect2Mouse() {
		// start with a blank animation
		String baseLayer = "animations/Trails_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect2Keypad() {
		// start with a blank animation
		String baseLayer = "animations/Trails_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect3() {

		// Trigger haptic effect
		sChromaAnimationAPI.coreSetEventName("Effect3");
				
		// start with a blank animation
		String baseLayer = "animations/Trails_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// set middle color green
		sChromaAnimationAPI.multiplyIntensityAllFramesRGBName(baseLayer, 0, 255, 0);
		int minThreshold = 50; // set outer color to red
		int maxThreshold = 150; // set main color to blue
		sChromaAnimationAPI.fillThresholdColorsMinMaxAllFramesRGBName(baseLayer, minThreshold, 255, 0, 0, maxThreshold,
				0, 0, 255);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect3ChromaLink() {
		// start with a blank animation
		String baseLayer = "animations/Trails_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// set middle color green
		sChromaAnimationAPI.multiplyIntensityAllFramesRGBName(baseLayer, 0, 255, 0);
		int minThreshold = 50; // set outer color to red
		int maxThreshold = 150; // set main color to blue
		sChromaAnimationAPI.fillThresholdColorsMinMaxAllFramesRGBName(baseLayer, minThreshold, 255, 0, 0, maxThreshold,
				0, 0, 255);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect3Headset() {
		// start with a blank animation
		String baseLayer = "animations/Trails_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// set middle color green
		sChromaAnimationAPI.multiplyIntensityAllFramesRGBName(baseLayer, 0, 255, 0);
		int minThreshold = 50; // set outer color to red
		int maxThreshold = 150; // set main color to blue
		sChromaAnimationAPI.fillThresholdColorsMinMaxAllFramesRGBName(baseLayer, minThreshold, 255, 0, 0, maxThreshold,
				0, 0, 255);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect3Mousepad() {
		// start with a blank animation
		String baseLayer = "animations/Trails_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// set middle color green
		sChromaAnimationAPI.multiplyIntensityAllFramesRGBName(baseLayer, 0, 255, 0);
		int minThreshold = 50; // set outer color to red
		int maxThreshold = 150; // set main color to blue
		sChromaAnimationAPI.fillThresholdColorsMinMaxAllFramesRGBName(baseLayer, minThreshold, 255, 0, 0, maxThreshold,
				0, 0, 255);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect3Mouse() {
		// start with a blank animation
		String baseLayer = "animations/Trails_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// set middle color green
		sChromaAnimationAPI.multiplyIntensityAllFramesRGBName(baseLayer, 0, 255, 0);
		int minThreshold = 50; // set outer color to red
		int maxThreshold = 150; // set main color to blue
		sChromaAnimationAPI.fillThresholdColorsMinMaxAllFramesRGBName(baseLayer, minThreshold, 255, 0, 0, maxThreshold,
				0, 0, 255);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect3Keypad() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// static color
		sChromaAnimationAPI.fillZeroColorAllFramesRGBName(baseLayer, 255, 0, 0);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect4() {

		// Trigger haptic effect
		sChromaAnimationAPI.coreSetEventName("Effect4");

		// start with a blank animation
		String baseLayer = "animations/ParticlesOut_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect4ChromaLink() {
		// start with a blank animation
		String baseLayer = "animations/ParticlesOut_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect4Headset() {
		// start with a blank animation
		String baseLayer = "animations/ParticlesOut_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect4Mousepad() {
		// start with a blank animation
		String baseLayer = "animations/ParticlesOut_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect4Mouse() {
		// start with a blank animation
		String baseLayer = "animations/ParticlesOut_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect4Keypad() {
		// start with a blank animation
		String baseLayer = "animations/ParticlesOut_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect5() {

		// Trigger haptic effect
		sChromaAnimationAPI.coreSetEventName("Effect5");

		// start with a blank animation
		String baseLayer = "animations/ParticlesOut_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// turn grayscale particles to blue water
		sChromaAnimationAPI.multiplyIntensityAllFramesRGBName(baseLayer, 0, 127, 255);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect5ChromaLink() {
		// start with a blank animation
		String baseLayer = "animations/ParticlesOut_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// turn grayscale particles to blue water
		sChromaAnimationAPI.multiplyIntensityAllFramesRGBName(baseLayer, 0, 127, 255);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect5Headset() {
		// start with a blank animation
		String baseLayer = "animations/ParticlesOut_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// turn grayscale particles to blue water
		sChromaAnimationAPI.multiplyIntensityAllFramesRGBName(baseLayer, 0, 127, 255);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect5Mousepad() {
		// start with a blank animation
		String baseLayer = "animations/ParticlesOut_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// turn grayscale particles to blue water
		sChromaAnimationAPI.multiplyIntensityAllFramesRGBName(baseLayer, 0, 127, 255);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect5Mouse() {
		// start with a blank animation
		String baseLayer = "animations/ParticlesOut_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// turn grayscale particles to blue water
		sChromaAnimationAPI.multiplyIntensityAllFramesRGBName(baseLayer, 0, 127, 255);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect5Keypad() {
		// start with a blank animation
		String baseLayer = "animations/ParticlesOut_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// turn grayscale particles to blue water
		sChromaAnimationAPI.multiplyIntensityAllFramesRGBName(baseLayer, 0, 127, 255);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect6() {

		// Trigger haptic effect
		sChromaAnimationAPI.coreSetEventName("Effect6");

		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// the length of the animation
		int frameCount = 50;
		// set all frames to white, with all frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.033f, 255, 255, 255);
		// fade the start of the animation starting at frame zero to 40
		sChromaAnimationAPI.fadeStartFramesName(baseLayer, 40);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect6ChromaLink() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// the length of the animation
		int frameCount = 50;
		// set all frames to white, with all frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.033f, 255, 255, 255);
		// fade the start of the animation starting at frame zero to 40
		sChromaAnimationAPI.fadeStartFramesName(baseLayer, 40);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect6Headset() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// the length of the animation
		int frameCount = 50;
		// set all frames to white, with all frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.033f, 255, 255, 255);
		// fade the start of the animation starting at frame zero to 40
		sChromaAnimationAPI.fadeStartFramesName(baseLayer, 40);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect6Mousepad() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// the length of the animation
		int frameCount = 50;
		// set all frames to white, with all frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.033f, 255, 255, 255);
		// fade the start of the animation starting at frame zero to 40
		sChromaAnimationAPI.fadeStartFramesName(baseLayer, 40);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect6Mouse() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// the length of the animation
		int frameCount = 50;
		// set all frames to white, with all frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.033f, 255, 255, 255);
		// fade the start of the animation starting at frame zero to 40
		sChromaAnimationAPI.fadeStartFramesName(baseLayer, 40);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect6Keypad() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// the length of the animation
		int frameCount = 50;
		// set all frames to white, with all frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.033f, 255, 255, 255);
		// fade the start of the animation starting at frame zero to 40
		sChromaAnimationAPI.fadeStartFramesName(baseLayer, 40);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect7() {

		// Trigger haptic effect
		sChromaAnimationAPI.coreSetEventName("Effect7");

		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// the length of the animation
		int frameCount = 50;
		// set all frames to white, with all frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.033f, 255, 255, 255);
		// fade the end of the animation starting at frame length - 40 (60)
		sChromaAnimationAPI.fadeEndFramesName(baseLayer, 40);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect7ChromaLink() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// the length of the animation
		int frameCount = 50;
		// set all frames to white, with all frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.033f, 255, 255, 255);
		// fade the end of the animation starting at frame length - 40 (60)
		sChromaAnimationAPI.fadeEndFramesName(baseLayer, 40);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect7Headset() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// the length of the animation
		int frameCount = 50;
		// set all frames to white, with all frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.033f, 255, 255, 255);
		// fade the end of the animation starting at frame length - 40 (60)
		sChromaAnimationAPI.fadeEndFramesName(baseLayer, 40);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect7Mousepad() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// the length of the animation
		int frameCount = 50;
		// set all frames to white, with all frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.033f, 255, 255, 255);
		// fade the end of the animation starting at frame length - 40 (60)
		sChromaAnimationAPI.fadeEndFramesName(baseLayer, 40);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect7Mouse() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// the length of the animation
		int frameCount = 50;
		// set all frames to white, with all frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.033f, 255, 255, 255);
		// fade the end of the animation starting at frame length - 40 (60)
		sChromaAnimationAPI.fadeEndFramesName(baseLayer, 40);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect7Keypad() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// the length of the animation
		int frameCount = 50;
		// set all frames to white, with all frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.033f, 255, 255, 255);
		// fade the end of the animation starting at frame length - 40 (60)
		sChromaAnimationAPI.fadeEndFramesName(baseLayer, 40);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect8() {

		// Trigger haptic effect
		sChromaAnimationAPI.coreSetEventName("Effect8");

		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// the length of the animation
		int frameCount = 50;
		// set all frames to white, with all frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.033f, 255, 255, 255);
		// fade the start of the animation starting at frame zero to 40
		sChromaAnimationAPI.fadeStartFramesName(baseLayer, 40);
		// fade the end of the animation starting at frame length - 40 (60)
		sChromaAnimationAPI.fadeEndFramesName(baseLayer, 40);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect8ChromaLink() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// the length of the animation
		int frameCount = 50;
		// set all frames to white, with all frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.033f, 255, 255, 255);
		// fade the start of the animation starting at frame zero to 40
		sChromaAnimationAPI.fadeStartFramesName(baseLayer, 40);
		// fade the end of the animation starting at frame length - 40 (60)
		sChromaAnimationAPI.fadeEndFramesName(baseLayer, 40);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect8Headset() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// the length of the animation
		int frameCount = 50;
		// set all frames to white, with all frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.033f, 255, 255, 255);
		// fade the start of the animation starting at frame zero to 40
		sChromaAnimationAPI.fadeStartFramesName(baseLayer, 40);
		// fade the end of the animation starting at frame length - 40 (60)
		sChromaAnimationAPI.fadeEndFramesName(baseLayer, 40);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect8Mousepad() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// the length of the animation
		int frameCount = 50;
		// set all frames to white, with all frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.033f, 255, 255, 255);
		// fade the start of the animation starting at frame zero to 40
		sChromaAnimationAPI.fadeStartFramesName(baseLayer, 40);
		// fade the end of the animation starting at frame length - 40 (60)
		sChromaAnimationAPI.fadeEndFramesName(baseLayer, 40);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect8Mouse() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// the length of the animation
		int frameCount = 50;
		// set all frames to white, with all frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.033f, 255, 255, 255);
		// fade the start of the animation starting at frame zero to 40
		sChromaAnimationAPI.fadeStartFramesName(baseLayer, 40);
		// fade the end of the animation starting at frame length - 40 (60)
		sChromaAnimationAPI.fadeEndFramesName(baseLayer, 40);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect8Keypad() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// the length of the animation
		int frameCount = 50;
		// set all frames to white, with all frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.033f, 255, 255, 255);
		// fade the start of the animation starting at frame zero to 40
		sChromaAnimationAPI.fadeStartFramesName(baseLayer, 40);
		// fade the end of the animation starting at frame length - 40 (60)
		sChromaAnimationAPI.fadeEndFramesName(baseLayer, 40);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect9() {

		// Trigger haptic effect
		sChromaAnimationAPI.coreSetEventName("Effect9");

		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// the length of the animation
		int frameCount = 50;
		// set all frames to white, with all frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.033f, 255, 255, 255);
		// integer number of times to blink during animation
		float speed = 2;
		// loop over all frames in the layer
		for (int frameId = 0; frameId < frameCount; ++frameId) {
			// Math.cos gives a smooth 1 to 0 to 1 curve, subtracting from one inverts the
			// curve
			float t = (float) (1 - Math.abs(Math.cos(speed * Math.PI * (frameId + 1) / (float) frameCount)));
			// multiply the frame by the 't' intensity
			sChromaAnimationAPI.multiplyIntensityName(baseLayer, frameId, t);
		}
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect9ChromaLink() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// the length of the animation
		int frameCount = 50;
		// set all frames to white, with all frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.033f, 255, 255, 255);
		// integer number of times to blink during animation
		float speed = 2;
		// loop over all frames in the layer
		for (int frameId = 0; frameId < frameCount; ++frameId) {
			// Math.cos gives a smooth 1 to 0 to 1 curve, subtracting from one inverts the
			// curve
			float t = (float) (1 - Math.abs(Math.cos(speed * Math.PI * (frameId + 1) / (float) frameCount)));
			// multiply the frame by the 't' intensity
			sChromaAnimationAPI.multiplyIntensityName(baseLayer, frameId, t);
		}
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect9Headset() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// the length of the animation
		int frameCount = 50;
		// set all frames to white, with all frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.033f, 255, 255, 255);
		// integer number of times to blink during animation
		float speed = 2;
		// loop over all frames in the layer
		for (int frameId = 0; frameId < frameCount; ++frameId) {
			// Math.cos gives a smooth 1 to 0 to 1 curve, subtracting from one inverts the
			// curve
			float t = (float) (1 - Math.abs(Math.cos(speed * Math.PI * (frameId + 1) / (float) frameCount)));
			// multiply the frame by the 't' intensity
			sChromaAnimationAPI.multiplyIntensityName(baseLayer, frameId, t);
		}
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect9Mousepad() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// the length of the animation
		int frameCount = 50;
		// set all frames to white, with all frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.033f, 255, 255, 255);
		// integer number of times to blink during animation
		float speed = 2;
		// loop over all frames in the layer
		for (int frameId = 0; frameId < frameCount; ++frameId) {
			// Math.cos gives a smooth 1 to 0 to 1 curve, subtracting from one inverts the
			// curve
			float t = (float) (1 - Math.abs(Math.cos(speed * Math.PI * (frameId + 1) / (float) frameCount)));
			// multiply the frame by the 't' intensity
			sChromaAnimationAPI.multiplyIntensityName(baseLayer, frameId, t);
		}
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect9Mouse() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// the length of the animation
		int frameCount = 50;
		// set all frames to white, with all frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.033f, 255, 255, 255);
		// integer number of times to blink during animation
		float speed = 2;
		// loop over all frames in the layer
		for (int frameId = 0; frameId < frameCount; ++frameId) {
			// Math.cos gives a smooth 1 to 0 to 1 curve, subtracting from one inverts the
			// curve
			float t = (float) (1 - Math.abs(Math.cos(speed * Math.PI * (frameId + 1) / (float) frameCount)));
			// multiply the frame by the 't' intensity
			sChromaAnimationAPI.multiplyIntensityName(baseLayer, frameId, t);
		}
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect9Keypad() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// the length of the animation
		int frameCount = 50;
		// set all frames to white, with all frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.033f, 255, 255, 255);
		// integer number of times to blink during animation
		float speed = 2;
		// loop over all frames in the layer
		for (int frameId = 0; frameId < frameCount; ++frameId) {
			// Math.cos gives a smooth 1 to 0 to 1 curve, subtracting from one inverts the
			// curve
			float t = (float) (1 - Math.abs(Math.cos(speed * Math.PI * (frameId + 1) / (float) frameCount)));
			// multiply the frame by the 't' intensity
			sChromaAnimationAPI.multiplyIntensityName(baseLayer, frameId, t);
		}
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect10() {

		// Trigger haptic effect
		sChromaAnimationAPI.coreSetEventName("Effect10");

		// start with a blank animation
		String baseLayer = "animations/Particles2_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect10ChromaLink() {
		// start with a blank animation
		String baseLayer = "animations/Particles2_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect10Headset() {
		// start with a blank animation
		String baseLayer = "animations/Particles2_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect10Mousepad() {
		// start with a blank animation
		String baseLayer = "animations/Particles2_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect10Mouse() {
		// start with a blank animation
		String baseLayer = "animations/Particles2_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect10Keypad() {
		// start with a blank animation
		String baseLayer = "animations/Particles2_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect11() {

		// Trigger haptic effect
		sChromaAnimationAPI.coreSetEventName("Effect11");

		// start with a blank animation
		String baseLayer = "animations/Particles2_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// reduce the intensity of the layer
		sChromaAnimationAPI.multiplyIntensityAllFramesName(baseLayer, 0.25f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect11ChromaLink() {
		// start with a blank animation
		String baseLayer = "animations/Particles2_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// reduce the intensity of the layer
		sChromaAnimationAPI.multiplyIntensityAllFramesName(baseLayer, 0.25f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect11Headset() {
		// start with a blank animation
		String baseLayer = "animations/Particles2_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// reduce the intensity of the layer
		sChromaAnimationAPI.multiplyIntensityAllFramesName(baseLayer, 0.25f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect11Mousepad() {
		// start with a blank animation
		String baseLayer = "animations/Particles2_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// reduce the intensity of the layer
		sChromaAnimationAPI.multiplyIntensityAllFramesName(baseLayer, 0.25f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect11Mouse() {
		// start with a blank animation
		String baseLayer = "animations/Particles2_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// reduce the intensity of the layer
		sChromaAnimationAPI.multiplyIntensityAllFramesName(baseLayer, 0.25f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect11Keypad() {
		// start with a blank animation
		String baseLayer = "animations/Particles2_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// reduce the intensity of the layer
		sChromaAnimationAPI.multiplyIntensityAllFramesName(baseLayer, 0.25f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect12() {

		// Trigger haptic effect
		sChromaAnimationAPI.coreSetEventName("Effect12");

		// start with a blank animation
		String baseLayer = getAnimationPath() + "BlackAndWhiteRainbow_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect12ChromaLink() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "BlackAndWhiteRainbow_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect12Headset() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "BlackAndWhiteRainbow_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect12Mousepad() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "BlackAndWhiteRainbow_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect12Mouse() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "BlackAndWhiteRainbow_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect12Keypad() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "BlackAndWhiteRainbow_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect13() {

		// Trigger haptic effect
		sChromaAnimationAPI.coreSetEventName("Effect13");

		// start with a blank animation
		String baseLayer = getAnimationPath() + "BlackAndWhiteRainbow_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = sChromaAnimationAPI.getFrameCountName(baseLayer);
		// loop over all frames in the layer
		for (int frameId = 0; frameId < frameCount; ++frameId) {
			// give color to the layer
			sChromaAnimationAPI.multiplyIntensityRGBName(baseLayer, frameId, 255, 255, 0); // yellow
		}
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect13ChromaLink() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "BlackAndWhiteRainbow_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = sChromaAnimationAPI.getFrameCountName(baseLayer);
		// loop over all frames in the layer
		for (int frameId = 0; frameId < frameCount; ++frameId) {
			// give color to the layer
			sChromaAnimationAPI.multiplyIntensityRGBName(baseLayer, frameId, 255, 255, 0); // yellow
		}
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect13Headset() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "BlackAndWhiteRainbow_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = sChromaAnimationAPI.getFrameCountName(baseLayer);
		// loop over all frames in the layer
		for (int frameId = 0; frameId < frameCount; ++frameId) {
			// give color to the layer
			sChromaAnimationAPI.multiplyIntensityRGBName(baseLayer, frameId, 255, 255, 0); // yellow
		}
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect13Mousepad() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "BlackAndWhiteRainbow_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = sChromaAnimationAPI.getFrameCountName(baseLayer);
		// loop over all frames in the layer
		for (int frameId = 0; frameId < frameCount; ++frameId) {
			// give color to the layer
			sChromaAnimationAPI.multiplyIntensityRGBName(baseLayer, frameId, 255, 255, 0); // yellow
		}
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect13Mouse() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "BlackAndWhiteRainbow_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = sChromaAnimationAPI.getFrameCountName(baseLayer);
		// loop over all frames in the layer
		for (int frameId = 0; frameId < frameCount; ++frameId) {
			// give color to the layer
			sChromaAnimationAPI.multiplyIntensityRGBName(baseLayer, frameId, 255, 255, 0); // yellow
		}
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect13Keypad() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "BlackAndWhiteRainbow_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = sChromaAnimationAPI.getFrameCountName(baseLayer);
		// loop over all frames in the layer
		for (int frameId = 0; frameId < frameCount; ++frameId) {
			// give color to the layer
			sChromaAnimationAPI.multiplyIntensityRGBName(baseLayer, frameId, 255, 255, 0); // yellow
		}
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect14() {

		// Trigger haptic effect
		sChromaAnimationAPI.coreSetEventName("Effect14");

		// start with a blank animation
		String baseLayer = getAnimationPath() + "BlackAndWhiteRainbow_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.multiplyIntensityAllFramesRGBName(baseLayer, 0, 255, 255); // cyan
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect14ChromaLink() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "BlackAndWhiteRainbow_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.multiplyIntensityAllFramesRGBName(baseLayer, 0, 255, 255); // cyan
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect14Headset() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "BlackAndWhiteRainbow_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.multiplyIntensityAllFramesRGBName(baseLayer, 0, 255, 255); // cyan
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect14Mousepad() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "BlackAndWhiteRainbow_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.multiplyIntensityAllFramesRGBName(baseLayer, 0, 255, 255); // cyan
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect14Mouse() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "BlackAndWhiteRainbow_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.multiplyIntensityAllFramesRGBName(baseLayer, 0, 255, 255); // cyan
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect14Keypad() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "BlackAndWhiteRainbow_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.multiplyIntensityAllFramesRGBName(baseLayer, 0, 255, 255); // cyan
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect15() {

		// Trigger haptic effect
		sChromaAnimationAPI.coreSetEventName("Effect15");

		// start with a blank animation
		String baseLayer = getAnimationPath() + "BlackAndWhiteRainbow_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = sChromaAnimationAPI.getFrameCountName(baseLayer);
		int color1 = sChromaAnimationAPI.getRGB(255, 0, 0); // red
		int color2 = sChromaAnimationAPI.getRGB(0, 255, 0); // green
		// integer number of times to transition during animation
		float speed = 2;
		// loop over all frames in the layer
		for (int frameId = 0; frameId < frameCount; ++frameId) {
			// Math.cos gives a smooth 1 to 0 to 1 curve
			float t = (float) Math.abs(Math.cos(speed * Math.PI * (frameId + 1) / (float) frameCount));
			// use t to transition from color 1 to color 2
			int color = sChromaAnimationAPI.lerpColor(color1, color2, t);
			// give color to the layer
			sChromaAnimationAPI.multiplyIntensityColorName(baseLayer, frameId, color);
		}
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect15ChromaLink() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "BlackAndWhiteRainbow_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = sChromaAnimationAPI.getFrameCountName(baseLayer);
		int color1 = sChromaAnimationAPI.getRGB(255, 0, 0); // red
		int color2 = sChromaAnimationAPI.getRGB(0, 255, 0); // green
		// integer number of times to transition during animation
		float speed = 2;
		// loop over all frames in the layer
		for (int frameId = 0; frameId < frameCount; ++frameId) {
			// Math.cos gives a smooth 1 to 0 to 1 curve
			float t = (float) Math.abs(Math.cos(speed * Math.PI * (frameId + 1) / (float) frameCount));
			// use t to transition from color 1 to color 2
			int color = sChromaAnimationAPI.lerpColor(color1, color2, t);
			// give color to the layer
			sChromaAnimationAPI.multiplyIntensityColorName(baseLayer, frameId, color);
		}
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect15Headset() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "BlackAndWhiteRainbow_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = sChromaAnimationAPI.getFrameCountName(baseLayer);
		int color1 = sChromaAnimationAPI.getRGB(255, 0, 0); // red
		int color2 = sChromaAnimationAPI.getRGB(0, 255, 0); // green
		// integer number of times to transition during animation
		float speed = 2;
		// loop over all frames in the layer
		for (int frameId = 0; frameId < frameCount; ++frameId) {
			// Math.cos gives a smooth 1 to 0 to 1 curve
			float t = (float) Math.abs(Math.cos(speed * Math.PI * (frameId + 1) / (float) frameCount));
			// use t to transition from color 1 to color 2
			int color = sChromaAnimationAPI.lerpColor(color1, color2, t);
			// give color to the layer
			sChromaAnimationAPI.multiplyIntensityColorName(baseLayer, frameId, color);
		}
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect15Mousepad() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "BlackAndWhiteRainbow_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = sChromaAnimationAPI.getFrameCountName(baseLayer);
		int color1 = sChromaAnimationAPI.getRGB(255, 0, 0); // red
		int color2 = sChromaAnimationAPI.getRGB(0, 255, 0); // green
		// integer number of times to transition during animation
		float speed = 2;
		// loop over all frames in the layer
		for (int frameId = 0; frameId < frameCount; ++frameId) {
			// Math.cos gives a smooth 1 to 0 to 1 curve
			float t = (float) Math.abs(Math.cos(speed * Math.PI * (frameId + 1) / (float) frameCount));
			// use t to transition from color 1 to color 2
			int color = sChromaAnimationAPI.lerpColor(color1, color2, t);
			// give color to the layer
			sChromaAnimationAPI.multiplyIntensityColorName(baseLayer, frameId, color);
		}
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect15Mouse() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "BlackAndWhiteRainbow_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = sChromaAnimationAPI.getFrameCountName(baseLayer);
		int color1 = sChromaAnimationAPI.getRGB(255, 0, 0); // red
		int color2 = sChromaAnimationAPI.getRGB(0, 255, 0); // green
		// integer number of times to transition during animation
		float speed = 2;
		// loop over all frames in the layer
		for (int frameId = 0; frameId < frameCount; ++frameId) {
			// Math.cos gives a smooth 1 to 0 to 1 curve
			float t = (float) Math.abs(Math.cos(speed * Math.PI * (frameId + 1) / (float) frameCount));
			// use t to transition from color 1 to color 2
			int color = sChromaAnimationAPI.lerpColor(color1, color2, t);
			// give color to the layer
			sChromaAnimationAPI.multiplyIntensityColorName(baseLayer, frameId, color);
		}
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect15Keypad() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "BlackAndWhiteRainbow_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = sChromaAnimationAPI.getFrameCountName(baseLayer);
		int color1 = sChromaAnimationAPI.getRGB(255, 0, 0); // red
		int color2 = sChromaAnimationAPI.getRGB(0, 255, 0); // green
		// integer number of times to transition during animation
		float speed = 2;
		// loop over all frames in the layer
		for (int frameId = 0; frameId < frameCount; ++frameId) {
			// Math.cos gives a smooth 1 to 0 to 1 curve
			float t = (float) Math.abs(Math.cos(speed * Math.PI * (frameId + 1) / (float) frameCount));
			// use t to transition from color 1 to color 2
			int color = sChromaAnimationAPI.lerpColor(color1, color2, t);
			// give color to the layer
			sChromaAnimationAPI.multiplyIntensityColorName(baseLayer, frameId, color);
		}
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect16() {

		// Trigger haptic effect
		sChromaAnimationAPI.coreSetEventName("Effect16");

		// start with a blank animation
		String baseLayer = "animations/Trails_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect16ChromaLink() {
		// start with a blank animation
		String baseLayer = "animations/Trails_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect16Headset() {
		// start with a blank animation
		String baseLayer = "animations/Trails_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect16Mousepad() {
		// start with a blank animation
		String baseLayer = "animations/Trails_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect16Mouse() {
		// start with a blank animation
		String baseLayer = "animations/Trails_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect16Keypad() {
		// start with a blank animation
		String baseLayer = "animations/Trails_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect17() {

		// Trigger haptic effect
		sChromaAnimationAPI.coreSetEventName("Effect17");

		// start with a blank animation
		String baseLayer = "animations/Trails_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = sChromaAnimationAPI.getFrameCountName(baseLayer);
		// loop over all frames in the layer
		for (int frameId = 0; frameId < frameCount; ++frameId) {
			int threshold = 100;
			// give color to the layer
			sChromaAnimationAPI.fillThresholdColorsRGBName(baseLayer, frameId, threshold, 255, 0, 0);
		}
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect17ChromaLink() {
		// start with a blank animation
		String baseLayer = "animations/Trails_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = sChromaAnimationAPI.getFrameCountName(baseLayer);
		// loop over all frames in the layer
		for (int frameId = 0; frameId < frameCount; ++frameId) {
			int threshold = 100;
			// give color to the layer
			sChromaAnimationAPI.fillThresholdColorsRGBName(baseLayer, frameId, threshold, 255, 0, 0);
		}
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect17Headset() {
		// start with a blank animation
		String baseLayer = "animations/Trails_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = sChromaAnimationAPI.getFrameCountName(baseLayer);
		// loop over all frames in the layer
		for (int frameId = 0; frameId < frameCount; ++frameId) {
			int threshold = 100;
			// give color to the layer
			sChromaAnimationAPI.fillThresholdColorsRGBName(baseLayer, frameId, threshold, 255, 0, 0);
		}
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect17Mousepad() {
		// start with a blank animation
		String baseLayer = "animations/Trails_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = sChromaAnimationAPI.getFrameCountName(baseLayer);
		// loop over all frames in the layer
		for (int frameId = 0; frameId < frameCount; ++frameId) {
			int threshold = 100;
			// give color to the layer
			sChromaAnimationAPI.fillThresholdColorsRGBName(baseLayer, frameId, threshold, 255, 0, 0);
		}
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect17Mouse() {
		// start with a blank animation
		String baseLayer = "animations/Trails_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = sChromaAnimationAPI.getFrameCountName(baseLayer);
		// loop over all frames in the layer
		for (int frameId = 0; frameId < frameCount; ++frameId) {
			int threshold = 100;
			// give color to the layer
			sChromaAnimationAPI.fillThresholdColorsRGBName(baseLayer, frameId, threshold, 255, 0, 0);
		}
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect17Keypad() {
		// start with a blank animation
		String baseLayer = "animations/Trails_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = sChromaAnimationAPI.getFrameCountName(baseLayer);
		// loop over all frames in the layer
		for (int frameId = 0; frameId < frameCount; ++frameId) {
			int threshold = 100;
			// give color to the layer
			sChromaAnimationAPI.fillThresholdColorsRGBName(baseLayer, frameId, threshold, 255, 0, 0);
		}
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect18() {

		// Trigger haptic effect
		sChromaAnimationAPI.coreSetEventName("Effect18");

		// start with a blank animation
		String baseLayer = "animations/Trails_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int threshold = 50;
		sChromaAnimationAPI.fillThresholdColorsAllFramesRGBName(baseLayer, threshold, 0, 64, 0); // dark green
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect18ChromaLink() {
		// start with a blank animation
		String baseLayer = "animations/Trails_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int threshold = 50;
		sChromaAnimationAPI.fillThresholdColorsAllFramesRGBName(baseLayer, threshold, 0, 64, 0); // dark green
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect18Headset() {
		// start with a blank animation
		String baseLayer = "animations/Trails_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int threshold = 50;
		sChromaAnimationAPI.fillThresholdColorsAllFramesRGBName(baseLayer, threshold, 0, 64, 0); // dark green
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect18Mousepad() {
		// start with a blank animation
		String baseLayer = "animations/Trails_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int threshold = 50;
		sChromaAnimationAPI.fillThresholdColorsAllFramesRGBName(baseLayer, threshold, 0, 64, 0); // dark green
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect18Mouse() {
		// start with a blank animation
		String baseLayer = "animations/Trails_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int threshold = 50;
		sChromaAnimationAPI.fillThresholdColorsAllFramesRGBName(baseLayer, threshold, 0, 64, 0); // dark green
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect18Keypad() {
		// start with a blank animation
		String baseLayer = "animations/Trails_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int threshold = 50;
		sChromaAnimationAPI.fillThresholdColorsAllFramesRGBName(baseLayer, threshold, 0, 64, 0); // dark green
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect19() {

		// Trigger haptic effect
		sChromaAnimationAPI.coreSetEventName("Effect19");

		// start with a blank animation
		String baseLayer = "animations/Trails_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int minThreshold = 50; // dark cyan
		int maxThreshold = 150; // purple
		sChromaAnimationAPI.fillThresholdColorsMinMaxAllFramesRGBName(baseLayer, minThreshold, 0, 63, 63, maxThreshold,
				127, 0, 127);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect19ChromaLink() {
		// start with a blank animation
		String baseLayer = "animations/Trails_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int minThreshold = 50; // dark cyan
		int maxThreshold = 150; // purple
		sChromaAnimationAPI.fillThresholdColorsMinMaxAllFramesRGBName(baseLayer, minThreshold, 0, 63, 63, maxThreshold,
				127, 0, 127);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect19Headset() {
		// start with a blank animation
		String baseLayer = "animations/Trails_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int minThreshold = 50; // dark cyan
		int maxThreshold = 150; // purple
		sChromaAnimationAPI.fillThresholdColorsMinMaxAllFramesRGBName(baseLayer, minThreshold, 0, 63, 63, maxThreshold,
				127, 0, 127);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect19Mousepad() {
		// start with a blank animation
		String baseLayer = "animations/Trails_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int minThreshold = 50; // dark cyan
		int maxThreshold = 150; // purple
		sChromaAnimationAPI.fillThresholdColorsMinMaxAllFramesRGBName(baseLayer, minThreshold, 0, 63, 63, maxThreshold,
				127, 0, 127);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect19Mouse() {
		// start with a blank animation
		String baseLayer = "animations/Trails_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int minThreshold = 50; // dark cyan
		int maxThreshold = 150; // purple
		sChromaAnimationAPI.fillThresholdColorsMinMaxAllFramesRGBName(baseLayer, minThreshold, 0, 63, 63, maxThreshold,
				127, 0, 127);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect19Keypad() {
		// start with a blank animation
		String baseLayer = "animations/Trails_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int minThreshold = 50; // dark cyan
		int maxThreshold = 150; // purple
		sChromaAnimationAPI.fillThresholdColorsMinMaxAllFramesRGBName(baseLayer, minThreshold, 0, 63, 63, maxThreshold,
				127, 0, 127);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect20() {

		// Trigger haptic effect
		sChromaAnimationAPI.coreSetEventName("Effect20");

		// start with a blank animation
		String baseLayer = "animations/Arc3_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect20ChromaLink() {
		// start with a blank animation
		String baseLayer = "animations/Arc3_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect20Headset() {
		// start with a blank animation
		String baseLayer = "animations/Arc3_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect20Mousepad() {
		// start with a blank animation
		String baseLayer = "animations/Arc3_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect20Mouse() {
		// start with a blank animation
		String baseLayer = "animations/Arc3_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect20Keypad() {
		// start with a blank animation
		String baseLayer = "animations/Arc3_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect21() {

		sChromaAnimationAPI.coreSetEventName("Effect21");

		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Keyboard.chroma";
		String layer2 = "animations/Arc3_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.closeAnimationName(layer2);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.getAnimation(layer2);
		int background = sChromaAnimationAPI.getRGB(127, 0, 0);
		int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, background);
		// copy non zero colors from layer 2 to the base layer
		sChromaAnimationAPI.copyNonZeroAllKeysAllFramesName(layer2, baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect21ChromaLink() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_ChromaLink.chroma";
		String layer2 = "animations/Arc3_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.closeAnimationName(layer2);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.getAnimation(layer2);
		int background = sChromaAnimationAPI.getRGB(127, 0, 0);
		int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, background);
		// copy non zero colors from layer 2 to the base layer
		sChromaAnimationAPI.copyNonZeroAllKeysAllFramesName(layer2, baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect21Headset() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Headset.chroma";
		String layer2 = "animations/Arc3_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.closeAnimationName(layer2);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.getAnimation(layer2);
		int background = sChromaAnimationAPI.getRGB(127, 0, 0);
		int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, background);
		// copy non zero colors from layer 2 to the base layer
		sChromaAnimationAPI.copyNonZeroAllKeysAllFramesName(layer2, baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect21Mousepad() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Mousepad.chroma";
		String layer2 = "animations/Arc3_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.closeAnimationName(layer2);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.getAnimation(layer2);
		int background = sChromaAnimationAPI.getRGB(127, 0, 0);
		int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, background);
		// copy non zero colors from layer 2 to the base layer
		sChromaAnimationAPI.copyNonZeroAllKeysAllFramesName(layer2, baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect21Mouse() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Mouse.chroma";
		String layer2 = "animations/Arc3_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.closeAnimationName(layer2);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.getAnimation(layer2);
		int background = sChromaAnimationAPI.getRGB(127, 0, 0);
		int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, background);
		// copy non zero colors from layer 2 to the base layer
		sChromaAnimationAPI.copyNonZeroAllKeysAllFramesName(layer2, baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect21Keypad() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Keypad.chroma";
		String layer2 = "animations/Arc3_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.closeAnimationName(layer2);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.getAnimation(layer2);
		int background = sChromaAnimationAPI.getRGB(127, 0, 0);
		int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, background);
		// copy non zero colors from layer 2 to the base layer
		sChromaAnimationAPI.copyNonZeroAllKeysAllFramesName(layer2, baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect22() {

		sChromaAnimationAPI.coreSetEventName("Effect22");

		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Keyboard.chroma";
		String layer2 = "animations/Arc3_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.closeAnimationName(layer2);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.getAnimation(layer2);
		int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
		// setup background color on the base layer
		int background = sChromaAnimationAPI.getRGB(127, 0, 0);
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, background);
		// replace darker colors with background color
		sChromaAnimationAPI.fillThresholdColorsAllFramesName(layer2, 64, background);
		// copy non zero colors from layer 2 to the base layer
		sChromaAnimationAPI.copyNonZeroAllKeysAllFramesName(layer2, baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect22ChromaLink() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_ChromaLink.chroma";
		String layer2 = "animations/Arc3_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.closeAnimationName(layer2);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.getAnimation(layer2);
		int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
		// setup background color on the base layer
		int background = sChromaAnimationAPI.getRGB(127, 0, 0);
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, background);
		// replace darker colors with background color
		sChromaAnimationAPI.fillThresholdColorsAllFramesName(layer2, 64, background);
		// copy non zero colors from layer 2 to the base layer
		sChromaAnimationAPI.copyNonZeroAllKeysAllFramesName(layer2, baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect22Headset() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Headset.chroma";
		String layer2 = "animations/Arc3_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.closeAnimationName(layer2);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.getAnimation(layer2);
		int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
		// setup background color on the base layer
		int background = sChromaAnimationAPI.getRGB(127, 0, 0);
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, background);
		// replace darker colors with background color
		sChromaAnimationAPI.fillThresholdColorsAllFramesName(layer2, 64, background);
		// copy non zero colors from layer 2 to the base layer
		sChromaAnimationAPI.copyNonZeroAllKeysAllFramesName(layer2, baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect22Mousepad() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Mousepad.chroma";
		String layer2 = "animations/Arc3_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.closeAnimationName(layer2);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.getAnimation(layer2);
		int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
		// setup background color on the base layer
		int background = sChromaAnimationAPI.getRGB(127, 0, 0);
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, background);
		// replace darker colors with background color
		sChromaAnimationAPI.fillThresholdColorsAllFramesName(layer2, 64, background);
		// copy non zero colors from layer 2 to the base layer
		sChromaAnimationAPI.copyNonZeroAllKeysAllFramesName(layer2, baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect22Mouse() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Mouse.chroma";
		String layer2 = "animations/Arc3_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.closeAnimationName(layer2);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.getAnimation(layer2);
		int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
		// setup background color on the base layer
		int background = sChromaAnimationAPI.getRGB(127, 0, 0);
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, background);
		// replace darker colors with background color
		sChromaAnimationAPI.fillThresholdColorsAllFramesName(layer2, 64, background);
		// copy non zero colors from layer 2 to the base layer
		sChromaAnimationAPI.copyNonZeroAllKeysAllFramesName(layer2, baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect22Keypad() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Keypad.chroma";
		String layer2 = "animations/Arc3_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.closeAnimationName(layer2);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.getAnimation(layer2);
		int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
		// setup background color on the base layer
		int background = sChromaAnimationAPI.getRGB(127, 0, 0);
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, background);
		// replace darker colors with background color
		sChromaAnimationAPI.fillThresholdColorsAllFramesName(layer2, 64, background);
		// copy non zero colors from layer 2 to the base layer
		sChromaAnimationAPI.copyNonZeroAllKeysAllFramesName(layer2, baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect23() {

		sChromaAnimationAPI.coreSetEventName("Effect23");

		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Keyboard.chroma";
		String layer2 = "animations/Arc3_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.closeAnimationName(layer2);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.getAnimation(layer2);
		int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
		// setup background color on the base layer
		int background = sChromaAnimationAPI.getRGB(127, 0, 0);
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, background);
		// Add non zero colors from layer 2 to the base layer
		sChromaAnimationAPI.addNonZeroAllKeysAllFramesName(layer2, baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect23ChromaLink() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_ChromaLink.chroma";
		String layer2 = "animations/Arc3_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.closeAnimationName(layer2);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.getAnimation(layer2);
		int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
		// setup background color on the base layer
		int background = sChromaAnimationAPI.getRGB(127, 0, 0);
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, background);
		// Add non zero colors from layer 2 to the base layer
		sChromaAnimationAPI.addNonZeroAllKeysAllFramesName(layer2, baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect23Headset() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Headset.chroma";
		String layer2 = "animations/Arc3_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.closeAnimationName(layer2);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.getAnimation(layer2);
		int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
		// setup background color on the base layer
		int background = sChromaAnimationAPI.getRGB(127, 0, 0);
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, background);
		// Add non zero colors from layer 2 to the base layer
		sChromaAnimationAPI.addNonZeroAllKeysAllFramesName(layer2, baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect23Mousepad() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Mousepad.chroma";
		String layer2 = "animations/Arc3_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.closeAnimationName(layer2);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.getAnimation(layer2);
		int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
		// setup background color on the base layer
		int background = sChromaAnimationAPI.getRGB(127, 0, 0);
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, background);
		// Add non zero colors from layer 2 to the base layer
		sChromaAnimationAPI.addNonZeroAllKeysAllFramesName(layer2, baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect23Mouse() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Mouse.chroma";
		String layer2 = "animations/Arc3_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.closeAnimationName(layer2);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.getAnimation(layer2);
		int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
		// setup background color on the base layer
		int background = sChromaAnimationAPI.getRGB(127, 0, 0);
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, background);
		// Add non zero colors from layer 2 to the base layer
		sChromaAnimationAPI.addNonZeroAllKeysAllFramesName(layer2, baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect23Keypad() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Keypad.chroma";
		String layer2 = "animations/Arc3_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.closeAnimationName(layer2);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.getAnimation(layer2);
		int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
		// setup background color on the base layer
		int background = sChromaAnimationAPI.getRGB(127, 0, 0);
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, background);
		// Add non zero colors from layer 2 to the base layer
		sChromaAnimationAPI.addNonZeroAllKeysAllFramesName(layer2, baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect24() {

		sChromaAnimationAPI.coreSetEventName("Effect24");

		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Keyboard.chroma";
		String layer2 = "animations/Arc3_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.closeAnimationName(layer2);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.getAnimation(layer2);
		int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
		// setup background color on the base layer
		int background = sChromaAnimationAPI.getRGB(127, 0, 0);
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, background);
		// Add non zero colors from layer 2 to the base layer
		sChromaAnimationAPI.subtractNonZeroAllKeysAllFramesName(layer2, baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect24ChromaLink() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_ChromaLink.chroma";
		String layer2 = "animations/Arc3_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.closeAnimationName(layer2);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.getAnimation(layer2);
		int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
		// setup background color on the base layer
		int background = sChromaAnimationAPI.getRGB(127, 0, 0);
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, background);
		// Add non zero colors from layer 2 to the base layer
		sChromaAnimationAPI.subtractNonZeroAllKeysAllFramesName(layer2, baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect24Headset() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Headset.chroma";
		String layer2 = "animations/Arc3_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.closeAnimationName(layer2);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.getAnimation(layer2);
		int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
		// setup background color on the base layer
		int background = sChromaAnimationAPI.getRGB(127, 0, 0);
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, background);
		// Add non zero colors from layer 2 to the base layer
		sChromaAnimationAPI.subtractNonZeroAllKeysAllFramesName(layer2, baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect24Mousepad() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Mousepad.chroma";
		String layer2 = "animations/Arc3_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.closeAnimationName(layer2);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.getAnimation(layer2);
		int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
		// setup background color on the base layer
		int background = sChromaAnimationAPI.getRGB(127, 0, 0);
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, background);
		// Add non zero colors from layer 2 to the base layer
		sChromaAnimationAPI.subtractNonZeroAllKeysAllFramesName(layer2, baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect24Mouse() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Mouse.chroma";
		String layer2 = "animations/Arc3_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.closeAnimationName(layer2);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.getAnimation(layer2);
		int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
		// setup background color on the base layer
		int background = sChromaAnimationAPI.getRGB(127, 0, 0);
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, background);
		// Add non zero colors from layer 2 to the base layer
		sChromaAnimationAPI.subtractNonZeroAllKeysAllFramesName(layer2, baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect24Keypad() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Keypad.chroma";
		String layer2 = "animations/Arc3_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.closeAnimationName(layer2);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.getAnimation(layer2);
		int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
		// setup background color on the base layer
		int background = sChromaAnimationAPI.getRGB(127, 0, 0);
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, background);
		// Add non zero colors from layer 2 to the base layer
		sChromaAnimationAPI.subtractNonZeroAllKeysAllFramesName(layer2, baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect25() {

		sChromaAnimationAPI.coreSetEventName("Effect25");

		// start with a blank animation
		String baseLayer = getAnimationPath() + "CircleSmall_Keyboard.chroma";
		String layer2 = "animations/Rainbow_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.closeAnimationName(layer2);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.getAnimation(layer2);
		int frameCount = sChromaAnimationAPI.getFrameCountName(layer2);
		sChromaAnimationAPI.duplicateFirstFrameName(baseLayer, frameCount);
		// copy non zero colors from layer 2 to the base layer where the base layer was
		// non zero
		sChromaAnimationAPI.copyNonZeroTargetAllKeysAllFramesName(layer2, baseLayer);
		// set a background color
		sChromaAnimationAPI.fillZeroColorAllFramesRGBName(baseLayer, 255, 0, 0);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect25ChromaLink() {
		String baseLayer = "animations/Rainbow_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect25Headset() {
		String baseLayer = "animations/Rainbow_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect25Mousepad() {
		String baseLayer = "animations/Rainbow_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect25Mouse() {
		String baseLayer = "animations/Rainbow_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect25Keypad() {
		String baseLayer = "animations/Rainbow_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect26() {

		sChromaAnimationAPI.coreSetEventName("Effect26");

		// start with a blank animation
		String baseLayer = "animations/Movement_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect26ChromaLink() {
		// start with a blank animation
		String baseLayer = "animations/Movement_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect26Headset() {
		// start with a blank animation
		String baseLayer = "animations/Movement_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect26Mousepad() {
		// start with a blank animation
		String baseLayer = "animations/Movement_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect26Mouse() {
		// start with a blank animation
		String baseLayer = "animations/Movement_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect26Keypad() {
		// start with a blank animation
		String baseLayer = "animations/Movement_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect27() {

		sChromaAnimationAPI.coreSetEventName("Effect27");

		// start with a blank animation
		String baseLayer = "animations/Movement_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect27ChromaLink() {
		// start with a blank animation
		String baseLayer = "animations/Movement_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect27Headset() {
		// start with a blank animation
		String baseLayer = "animations/Movement_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect27Mousepad() {
		// start with a blank animation
		String baseLayer = "animations/Movement_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect27Mouse() {
		// start with a blank animation
		String baseLayer = "animations/Movement_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect27Keypad() {
		// start with a blank animation
		String baseLayer = "animations/Movement_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect28() {

		sChromaAnimationAPI.coreSetEventName("Effect28");

		// start with a blank animation
		String baseLayer = "animations/Movement_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// reverse the order of frames
		sChromaAnimationAPI.reverseAllFramesName(baseLayer);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect28ChromaLink() {
		// start with a blank animation
		String baseLayer = "animations/Movement_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// reverse the order of frames
		sChromaAnimationAPI.reverseAllFramesName(baseLayer);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect28Headset() {
		// start with a blank animation
		String baseLayer = "animations/Movement_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// reverse the order of frames
		sChromaAnimationAPI.reverseAllFramesName(baseLayer);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect28Mousepad() {
		// start with a blank animation
		String baseLayer = "animations/Movement_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// reverse the order of frames
		sChromaAnimationAPI.reverseAllFramesName(baseLayer);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect28Mouse() {
		// start with a blank animation
		String baseLayer = "animations/Movement_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// reverse the order of frames
		sChromaAnimationAPI.reverseAllFramesName(baseLayer);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect28Keypad() {
		// start with a blank animation
		String baseLayer = "animations/Movement_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// reverse the order of frames
		sChromaAnimationAPI.reverseAllFramesName(baseLayer);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect29() {

		sChromaAnimationAPI.coreSetEventName("Effect29");

		// start with a blank animation
		String baseLayer = "animations/Movement_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// invert all the animation colors
		sChromaAnimationAPI.invertColorsAllFramesName(baseLayer);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect29ChromaLink() {
		// start with a blank animation
		String baseLayer = "animations/Movement_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// invert all the animation colors
		sChromaAnimationAPI.invertColorsAllFramesName(baseLayer);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect29Headset() {
		// start with a blank animation
		String baseLayer = "animations/Movement_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// invert all the animation colors
		sChromaAnimationAPI.invertColorsAllFramesName(baseLayer);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect29Mousepad() {
		// start with a blank animation
		String baseLayer = "animations/Movement_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// invert all the animation colors
		sChromaAnimationAPI.invertColorsAllFramesName(baseLayer);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect29Mouse() {
		// start with a blank animation
		String baseLayer = "animations/Movement_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// invert all the animation colors
		sChromaAnimationAPI.invertColorsAllFramesName(baseLayer);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect29Keypad() {
		// start with a blank animation
		String baseLayer = "animations/Movement_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// invert all the animation colors
		sChromaAnimationAPI.invertColorsAllFramesName(baseLayer);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect30() {

		sChromaAnimationAPI.coreSetEventName("Effect30");

		// start with a blank animation
		String baseLayer = "animations/Movement_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// duplicate and mirror
		sChromaAnimationAPI.duplicateMirrorFramesName(baseLayer);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect30ChromaLink() {
		// start with a blank animation
		String baseLayer = "animations/Movement_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// duplicate and mirror
		sChromaAnimationAPI.duplicateMirrorFramesName(baseLayer);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect30Headset() {
		// start with a blank animation
		String baseLayer = "animations/Movement_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// duplicate and mirror
		sChromaAnimationAPI.duplicateMirrorFramesName(baseLayer);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect30Mousepad() {
		// start with a blank animation
		String baseLayer = "animations/Movement_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// duplicate and mirror
		sChromaAnimationAPI.duplicateMirrorFramesName(baseLayer);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect30Mouse() {
		// start with a blank animation
		String baseLayer = "animations/Movement_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// duplicate and mirror
		sChromaAnimationAPI.duplicateMirrorFramesName(baseLayer);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect30Keypad() {
		// start with a blank animation
		String baseLayer = "animations/Movement_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// duplicate and mirror
		sChromaAnimationAPI.duplicateMirrorFramesName(baseLayer);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect31() {

		sChromaAnimationAPI.coreSetEventName("Effect31");

		// start with a blank animation
		String baseLayer = "animations/Movement_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// insert a pause
		int frameId = 50;
		int delay = 20;
		sChromaAnimationAPI.insertDelayName(baseLayer, frameId, delay);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect31ChromaLink() {
		// start with a blank animation
		String baseLayer = "animations/Movement_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// insert a pause
		int frameId = 50;
		int delay = 20;
		sChromaAnimationAPI.insertDelayName(baseLayer, frameId, delay);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect31Headset() {
		// start with a blank animation
		String baseLayer = "animations/Movement_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// insert a pause
		int frameId = 50;
		int delay = 20;
		sChromaAnimationAPI.insertDelayName(baseLayer, frameId, delay);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect31Mousepad() {
		// start with a blank animation
		String baseLayer = "animations/Movement_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// insert a pause
		int frameId = 50;
		int delay = 20;
		sChromaAnimationAPI.insertDelayName(baseLayer, frameId, delay);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect31Mouse() {
		// start with a blank animation
		String baseLayer = "animations/Movement_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// insert a pause
		int frameId = 50;
		int delay = 20;
		sChromaAnimationAPI.insertDelayName(baseLayer, frameId, delay);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect31Keypad() {
		// start with a blank animation
		String baseLayer = "animations/Movement_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// insert a pause
		int frameId = 50;
		int delay = 20;
		sChromaAnimationAPI.insertDelayName(baseLayer, frameId, delay);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect32() {

		sChromaAnimationAPI.coreSetEventName("Effect32");

		// start with a blank animation
		String baseLayer = "animations/Movement_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// reduce half of the frames, remove every 2nd frame
		sChromaAnimationAPI.reduceFramesName(baseLayer, 2);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect32ChromaLink() {
		// start with a blank animation
		String baseLayer = "animations/Movement_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// reduce half of the frames, remove every 2nd frame
		sChromaAnimationAPI.reduceFramesName(baseLayer, 2);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect32Headset() {
		// start with a blank animation
		String baseLayer = "animations/Movement_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// reduce half of the frames, remove every 2nd frame
		sChromaAnimationAPI.reduceFramesName(baseLayer, 2);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect32Mousepad() {
		// start with a blank animation
		String baseLayer = "animations/Movement_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// reduce half of the frames, remove every 2nd frame
		sChromaAnimationAPI.reduceFramesName(baseLayer, 2);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect32Mouse() {
		// start with a blank animation
		String baseLayer = "animations/Movement_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// reduce half of the frames, remove every 2nd frame
		sChromaAnimationAPI.reduceFramesName(baseLayer, 2);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect32Keypad() {
		// start with a blank animation
		String baseLayer = "animations/Movement_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// reduce half of the frames, remove every 2nd frame
		sChromaAnimationAPI.reduceFramesName(baseLayer, 2);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect33() {

		sChromaAnimationAPI.coreSetEventName("Effect33");

		// start with a blank animation
		String baseLayer = "animations/Movement_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// double the number of the frames
		sChromaAnimationAPI.duplicateFramesName(baseLayer);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect33ChromaLink() {
		// start with a blank animation
		String baseLayer = "animations/Movement_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// double the number of the frames
		sChromaAnimationAPI.duplicateFramesName(baseLayer);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect33Headset() {
		// start with a blank animation
		String baseLayer = "animations/Movement_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// double the number of the frames
		sChromaAnimationAPI.duplicateFramesName(baseLayer);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect33Mousepad() {
		// start with a blank animation
		String baseLayer = "animations/Movement_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// double the number of the frames
		sChromaAnimationAPI.duplicateFramesName(baseLayer);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect33Mouse() {
		// start with a blank animation
		String baseLayer = "animations/Movement_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// double the number of the frames
		sChromaAnimationAPI.duplicateFramesName(baseLayer);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect33Keypad() {
		// start with a blank animation
		String baseLayer = "animations/Movement_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// double the number of the frames
		sChromaAnimationAPI.duplicateFramesName(baseLayer);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect34() {

		sChromaAnimationAPI.coreSetEventName("Effect34");

		// start with a blank animation
		String baseLayer = "animations/Movement_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// trim the start of the animation, so it starts at frame 10
		sChromaAnimationAPI.trimStartFramesName(baseLayer, 10);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect34ChromaLink() {
		// start with a blank animation
		String baseLayer = "animations/Movement_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// trim the start of the animation, so it starts at frame 10
		sChromaAnimationAPI.trimStartFramesName(baseLayer, 10);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect34Headset() {
		// start with a blank animation
		String baseLayer = "animations/Movement_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// trim the start of the animation, so it starts at frame 10
		sChromaAnimationAPI.trimStartFramesName(baseLayer, 10);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect34Mousepad() {
		// start with a blank animation
		String baseLayer = "animations/Movement_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// trim the start of the animation, so it starts at frame 10
		sChromaAnimationAPI.trimStartFramesName(baseLayer, 10);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect34Mouse() {
		// start with a blank animation
		String baseLayer = "animations/Movement_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// trim the start of the animation, so it starts at frame 10
		sChromaAnimationAPI.trimStartFramesName(baseLayer, 10);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect34Keypad() {
		// start with a blank animation
		String baseLayer = "animations/Movement_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// trim the start of the animation, so it starts at frame 10
		sChromaAnimationAPI.trimStartFramesName(baseLayer, 10);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect35() {

		sChromaAnimationAPI.coreSetEventName("Effect35");

		// start with a blank animation
		String baseLayer = "animations/Movement_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// trim the start of the animation, so it starts at frame 10
		sChromaAnimationAPI.trimStartFramesName(baseLayer, 10);
		// trim the end of the animation
		sChromaAnimationAPI.trimEndFramesName(baseLayer, 75);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect35ChromaLink() {
		// start with a blank animation
		String baseLayer = "animations/Movement_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// trim the start of the animation, so it starts at frame 10
		sChromaAnimationAPI.trimStartFramesName(baseLayer, 10);
		// trim the end of the animation
		sChromaAnimationAPI.trimEndFramesName(baseLayer, 75);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect35Headset() {
		// start with a blank animation
		String baseLayer = "animations/Movement_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// trim the start of the animation, so it starts at frame 10
		sChromaAnimationAPI.trimStartFramesName(baseLayer, 10);
		// trim the end of the animation
		sChromaAnimationAPI.trimEndFramesName(baseLayer, 75);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect35Mousepad() {
		// start with a blank animation
		String baseLayer = "animations/Movement_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// trim the start of the animation, so it starts at frame 10
		sChromaAnimationAPI.trimStartFramesName(baseLayer, 10);
		// trim the end of the animation
		sChromaAnimationAPI.trimEndFramesName(baseLayer, 75);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect35Mouse() {
		// start with a blank animation
		String baseLayer = "animations/Movement_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// trim the start of the animation, so it starts at frame 10
		sChromaAnimationAPI.trimStartFramesName(baseLayer, 10);
		// trim the end of the animation
		sChromaAnimationAPI.trimEndFramesName(baseLayer, 75);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect35Keypad() {
		// start with a blank animation
		String baseLayer = "animations/Movement_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// trim the start of the animation, so it starts at frame 10
		sChromaAnimationAPI.trimStartFramesName(baseLayer, 10);
		// trim the end of the animation
		sChromaAnimationAPI.trimEndFramesName(baseLayer, 75);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect36() {

		sChromaAnimationAPI.coreSetEventName("Effect36");

		// start with a blank animation
		String baseLayer = getAnimationPath() + "CircleSmall_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = 20;
		sChromaAnimationAPI.duplicateFirstFrameName(baseLayer, frameCount);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect36ChromaLink() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// green
		sChromaAnimationAPI.fillZeroColorAllFramesRGBName(baseLayer, 0, 255, 0);
		int frameCount = 20;
		sChromaAnimationAPI.duplicateFirstFrameName(baseLayer, frameCount);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect36Headset() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// green
		sChromaAnimationAPI.fillZeroColorAllFramesRGBName(baseLayer, 0, 255, 0);
		int frameCount = 20;
		sChromaAnimationAPI.duplicateFirstFrameName(baseLayer, frameCount);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect36Mousepad() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// green
		sChromaAnimationAPI.fillZeroColorAllFramesRGBName(baseLayer, 0, 255, 0);
		int frameCount = 20;
		sChromaAnimationAPI.duplicateFirstFrameName(baseLayer, frameCount);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect36Mouse() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// green
		sChromaAnimationAPI.fillZeroColorAllFramesRGBName(baseLayer, 0, 255, 0);
		int frameCount = 20;
		sChromaAnimationAPI.duplicateFirstFrameName(baseLayer, frameCount);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect36Keypad() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// green
		sChromaAnimationAPI.fillZeroColorAllFramesRGBName(baseLayer, 0, 255, 0);
		int frameCount = 20;
		sChromaAnimationAPI.duplicateFirstFrameName(baseLayer, frameCount);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect37() {

		sChromaAnimationAPI.coreSetEventName("Effect37");

		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = 20;
		// Start with blank frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, 0);
		// Fill all frames with black and white static
		sChromaAnimationAPI.fillRandomColorsBlackAndWhiteAllFramesName(baseLayer);
		// slow down the random frames so it can be seen
		sChromaAnimationAPI.duplicateFramesName(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect37ChromaLink() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = 20;
		// Start with blank frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, 0);
		// Fill all frames with black and white static
		sChromaAnimationAPI.fillRandomColorsBlackAndWhiteAllFramesName(baseLayer);
		// slow down the random frames so it can be seen
		sChromaAnimationAPI.duplicateFramesName(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect37Headset() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = 20;
		// Start with blank frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, 0);
		// Fill all frames with black and white static
		sChromaAnimationAPI.fillRandomColorsBlackAndWhiteAllFramesName(baseLayer);
		// slow down the random frames so it can be seen
		sChromaAnimationAPI.duplicateFramesName(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect37Mousepad() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = 20;
		// Start with blank frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, 0);
		// Fill all frames with black and white static
		sChromaAnimationAPI.fillRandomColorsBlackAndWhiteAllFramesName(baseLayer);
		// slow down the random frames so it can be seen
		sChromaAnimationAPI.duplicateFramesName(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect37Mouse() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = 20;
		// Start with blank frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, 0);
		// Fill all frames with black and white static
		sChromaAnimationAPI.fillRandomColorsBlackAndWhiteAllFramesName(baseLayer);
		// slow down the random frames so it can be seen
		sChromaAnimationAPI.duplicateFramesName(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect37Keypad() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = 20;
		// Start with blank frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, 0);
		// Fill all frames with black and white static
		sChromaAnimationAPI.fillRandomColorsBlackAndWhiteAllFramesName(baseLayer);
		// slow down the random frames so it can be seen
		sChromaAnimationAPI.duplicateFramesName(baseLayer);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect38() {

		sChromaAnimationAPI.coreSetEventName("Effect38");

		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = 20;
		// Start with blank frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, 0);
		// Fill all frames with black and white static
		sChromaAnimationAPI.fillRandomColorsBlackAndWhiteAllFramesName(baseLayer);
		// slow down the random frames so it can be seen
		sChromaAnimationAPI.duplicateFramesName(baseLayer);
		// make random colors more sparse using threshold
		int threshold = 240;
		// turn lower intensity colors to black
		sChromaAnimationAPI.fillThresholdColorsAllFramesName(baseLayer, threshold, 0);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect38ChromaLink() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = 20;
		// Start with blank frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, 0);
		// Fill all frames with black and white static
		sChromaAnimationAPI.fillRandomColorsBlackAndWhiteAllFramesName(baseLayer);
		// slow down the random frames so it can be seen
		sChromaAnimationAPI.duplicateFramesName(baseLayer);
		// make random colors more sparse using threshold
		int threshold = 240;
		// turn lower intensity colors to black
		sChromaAnimationAPI.fillThresholdColorsAllFramesName(baseLayer, threshold, 0);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect38Headset() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = 20;
		// Start with blank frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, 0);
		// Fill all frames with black and white static
		sChromaAnimationAPI.fillRandomColorsBlackAndWhiteAllFramesName(baseLayer);
		// slow down the random frames so it can be seen
		sChromaAnimationAPI.duplicateFramesName(baseLayer);
		// make random colors more sparse using threshold
		int threshold = 240;
		// turn lower intensity colors to black
		sChromaAnimationAPI.fillThresholdColorsAllFramesName(baseLayer, threshold, 0);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect38Mousepad() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = 20;
		// Start with blank frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, 0);
		// Fill all frames with black and white static
		sChromaAnimationAPI.fillRandomColorsBlackAndWhiteAllFramesName(baseLayer);
		// slow down the random frames so it can be seen
		sChromaAnimationAPI.duplicateFramesName(baseLayer);
		// make random colors more sparse using threshold
		int threshold = 240;
		// turn lower intensity colors to black
		sChromaAnimationAPI.fillThresholdColorsAllFramesName(baseLayer, threshold, 0);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect38Mouse() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = 20;
		// Start with blank frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, 0);
		// Fill all frames with black and white static
		sChromaAnimationAPI.fillRandomColorsBlackAndWhiteAllFramesName(baseLayer);
		// slow down the random frames so it can be seen
		sChromaAnimationAPI.duplicateFramesName(baseLayer);
		// make random colors more sparse using threshold
		int threshold = 240;
		// turn lower intensity colors to black
		sChromaAnimationAPI.fillThresholdColorsAllFramesName(baseLayer, threshold, 0);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect38Keypad() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = 20;
		// Start with blank frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, 0);
		// Fill all frames with black and white static
		sChromaAnimationAPI.fillRandomColorsBlackAndWhiteAllFramesName(baseLayer);
		// slow down the random frames so it can be seen
		sChromaAnimationAPI.duplicateFramesName(baseLayer);
		// make random colors more sparse using threshold
		int threshold = 240;
		// turn lower intensity colors to black
		sChromaAnimationAPI.fillThresholdColorsAllFramesName(baseLayer, threshold, 0);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect39() {

		sChromaAnimationAPI.coreSetEventName("Effect39");

		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = 20;
		// Start with blank frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, 0);
		// Fill all frames with black and white static
		sChromaAnimationAPI.fillRandomColorsBlackAndWhiteAllFramesName(baseLayer);
		// slow down the random frames so it can be seen
		sChromaAnimationAPI.duplicateFramesName(baseLayer);
		int minThreshold = 240; // black
		int maxThreshold = 240; // rain
		sChromaAnimationAPI.fillThresholdColorsMinMaxAllFramesRGBName(baseLayer, minThreshold, 0, 0, 0, maxThreshold, 0,
				127, 255);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect39ChromaLink() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = 20;
		// Start with blank frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, 0);
		// Fill all frames with black and white static
		sChromaAnimationAPI.fillRandomColorsBlackAndWhiteAllFramesName(baseLayer);
		// slow down the random frames so it can be seen
		sChromaAnimationAPI.duplicateFramesName(baseLayer);
		int minThreshold = 240; // black
		int maxThreshold = 240; // rain
		sChromaAnimationAPI.fillThresholdColorsMinMaxAllFramesRGBName(baseLayer, minThreshold, 0, 0, 0, maxThreshold, 0,
				127, 255);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect39Headset() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = 20;
		// Start with blank frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, 0);
		// Fill all frames with black and white static
		sChromaAnimationAPI.fillRandomColorsBlackAndWhiteAllFramesName(baseLayer);
		// slow down the random frames so it can be seen
		sChromaAnimationAPI.duplicateFramesName(baseLayer);
		int minThreshold = 240; // black
		int maxThreshold = 240; // rain
		sChromaAnimationAPI.fillThresholdColorsMinMaxAllFramesRGBName(baseLayer, minThreshold, 0, 0, 0, maxThreshold, 0,
				127, 255);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect39Mousepad() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = 20;
		// Start with blank frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, 0);
		// Fill all frames with black and white static
		sChromaAnimationAPI.fillRandomColorsBlackAndWhiteAllFramesName(baseLayer);
		// slow down the random frames so it can be seen
		sChromaAnimationAPI.duplicateFramesName(baseLayer);
		int minThreshold = 240; // black
		int maxThreshold = 240; // rain
		sChromaAnimationAPI.fillThresholdColorsMinMaxAllFramesRGBName(baseLayer, minThreshold, 0, 0, 0, maxThreshold, 0,
				127, 255);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect39Mouse() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = 20;
		// Start with blank frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, 0);
		// Fill all frames with black and white static
		sChromaAnimationAPI.fillRandomColorsBlackAndWhiteAllFramesName(baseLayer);
		// slow down the random frames so it can be seen
		sChromaAnimationAPI.duplicateFramesName(baseLayer);
		int minThreshold = 240; // black
		int maxThreshold = 240; // rain
		sChromaAnimationAPI.fillThresholdColorsMinMaxAllFramesRGBName(baseLayer, minThreshold, 0, 0, 0, maxThreshold, 0,
				127, 255);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect39Keypad() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = 20;
		// Start with blank frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesName(baseLayer, frameCount, 0.033f, 0);
		// Fill all frames with black and white static
		sChromaAnimationAPI.fillRandomColorsBlackAndWhiteAllFramesName(baseLayer);
		// slow down the random frames so it can be seen
		sChromaAnimationAPI.duplicateFramesName(baseLayer);
		int minThreshold = 240; // black
		int maxThreshold = 240; // rain
		sChromaAnimationAPI.fillThresholdColorsMinMaxAllFramesRGBName(baseLayer, minThreshold, 0, 0, 0, maxThreshold, 0,
				127, 255);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect40() {

		sChromaAnimationAPI.coreSetEventName("Effect40");

		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Keyboard.chroma";
		String idleAnimation = getAnimationPath() + "BlackAndWhiteRainbow_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.closeAnimationName(idleAnimation);
		// Set idle animation
		sChromaAnimationAPI.setIdleAnimationName(idleAnimation);
		// Enable idle animation
		sChromaAnimationAPI.useIdleAnimation(Device.Keyboard.getValue(), true);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// Transition from green to red and then stop
		int frameCount = 30;
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
		int color1 = sChromaAnimationAPI.getRGB(0, 255, 0);
		int color2 = sChromaAnimationAPI.getRGB(255, 0, 0);
		sChromaAnimationAPI.multiplyColorLerpAllFramesName(baseLayer, color1, color2);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, false);
	}

	public static void showEffect40ChromaLink() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_ChromaLink.chroma";
		String idleAnimation = getAnimationPath() + "BlackAndWhiteRainbow_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.closeAnimationName(idleAnimation);
		// Set idle animation
		sChromaAnimationAPI.setIdleAnimationName(idleAnimation);
		// Enable idle animation
		sChromaAnimationAPI.useIdleAnimation(Device.ChromaLink.getValue(), true);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// Transition from green to red and then stop
		int frameCount = 30;
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
		int color1 = sChromaAnimationAPI.getRGB(0, 255, 0);
		int color2 = sChromaAnimationAPI.getRGB(255, 0, 0);
		sChromaAnimationAPI.multiplyColorLerpAllFramesName(baseLayer, color1, color2);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, false);
	}

	public static void showEffect40Headset() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Headset.chroma";
		String idleAnimation = getAnimationPath() + "BlackAndWhiteRainbow_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.closeAnimationName(idleAnimation);
		// Set idle animation
		sChromaAnimationAPI.setIdleAnimationName(idleAnimation);
		// Enable idle animation
		sChromaAnimationAPI.useIdleAnimation(Device.Headset.getValue(), true);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// Transition from green to red and then stop
		int frameCount = 30;
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
		int color1 = sChromaAnimationAPI.getRGB(0, 255, 0);
		int color2 = sChromaAnimationAPI.getRGB(255, 0, 0);
		sChromaAnimationAPI.multiplyColorLerpAllFramesName(baseLayer, color1, color2);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, false);
	}

	public static void showEffect40Mousepad() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Mousepad.chroma";
		String idleAnimation = getAnimationPath() + "BlackAndWhiteRainbow_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.closeAnimationName(idleAnimation);
		// Set idle animation
		sChromaAnimationAPI.setIdleAnimationName(idleAnimation);
		// Enable idle animation
		sChromaAnimationAPI.useIdleAnimation(Device.Mousepad.getValue(), true);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// Transition from green to red and then stop
		int frameCount = 30;
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
		int color1 = sChromaAnimationAPI.getRGB(0, 255, 0);
		int color2 = sChromaAnimationAPI.getRGB(255, 0, 0);
		sChromaAnimationAPI.multiplyColorLerpAllFramesName(baseLayer, color1, color2);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, false);
	}

	public static void showEffect40Mouse() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Mouse.chroma";
		String idleAnimation = getAnimationPath() + "BlackAndWhiteRainbow_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.closeAnimationName(idleAnimation);
		// Set idle animation
		sChromaAnimationAPI.setIdleAnimationName(idleAnimation);
		// Enable idle animation
		sChromaAnimationAPI.useIdleAnimation(Device.Mouse.getValue(), true);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// Transition from green to red and then stop
		int frameCount = 30;
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
		int color1 = sChromaAnimationAPI.getRGB(0, 255, 0);
		int color2 = sChromaAnimationAPI.getRGB(255, 0, 0);
		sChromaAnimationAPI.multiplyColorLerpAllFramesName(baseLayer, color1, color2);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, false);
	}

	public static void showEffect40Keypad() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Keypad.chroma";
		String idleAnimation = getAnimationPath() + "BlackAndWhiteRainbow_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.closeAnimationName(idleAnimation);
		// Set idle animation
		sChromaAnimationAPI.setIdleAnimationName(idleAnimation);
		// Enable idle animation
		sChromaAnimationAPI.useIdleAnimation(Device.Mouse.getValue(), true);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// Transition from green to red and then stop
		int frameCount = 30;
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
		int color1 = sChromaAnimationAPI.getRGB(0, 255, 0);
		int color2 = sChromaAnimationAPI.getRGB(255, 0, 0);
		sChromaAnimationAPI.multiplyColorLerpAllFramesName(baseLayer, color1, color2);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, false);
	}

	public static void showEffect41() {

		sChromaAnimationAPI.coreSetEventName("Effect41");

		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// the length of the animation
		int frameCount = 50;
		// set all frames to white, with all frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.033f, 64, 0, 64);
		int maxRow = sChromaAnimationAPI.getMaxRow(Device2D.Keyboard.getValue());
		int maxColumn = sChromaAnimationAPI.getMaxColumn(Device2D.Keyboard.getValue());
		int startColumn = (int) Math.floor(Math.random() * maxColumn) % 22;
		int startRow = (int) Math.floor(Math.random() * maxRow) % 6;
		int color = sChromaAnimationAPI.getRGB(0, 255, 0);
		float radius = 0;
		float speed = 25 / (float) frameCount;
		int lineWidth = 2;
		for (int frameIndex = 0; frameIndex < frameCount; ++frameIndex) {
			float stroke = radius;
			for (int t = 0; t < lineWidth; ++t) {
				for (int i = 0; i < 360; ++i) {
					float angle = (float) (i * Math.PI / 180.0f);
					int r = (int) Math.floor(startRow + stroke * Math.sin(angle));
					int c = (int) Math.floor(startColumn + stroke * Math.cos(angle));
					if (r >= 0 && r < maxRow && c >= 0 && c < maxColumn) {
						int key = (r << 8) | c;
						sChromaAnimationAPI.setKeyColorName(baseLayer, frameIndex, key, color);
					}
				}
				stroke += speed;
			}
			radius += speed;
		}
		// play at top speed
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect41ChromaLink() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// the length of the animation
		int frameCount = 50;
		// solid color
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.033f, 64, 255, 64);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect41Headset() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// the length of the animation
		int frameCount = 50;
		// solid color
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.033f, 64, 255, 64);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect41Mousepad() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// the length of the animation
		int frameCount = 50;
		// solid color
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.033f, 64, 255, 64);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect41Mouse() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// the length of the animation
		int frameCount = 50;
		// solid color
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.033f, 64, 255, 64);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect41Keypad() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// the length of the animation
		int frameCount = 50;
		// solid color
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.033f, 64, 255, 64);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect42() {

		sChromaAnimationAPI.coreSetEventName("Effect42");

		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// the length of the animation
		int frameCount = 1;
		// set all frames to white, with all frames set to 30FPS
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.033f, 64, 0, 64);
		int maxRow = sChromaAnimationAPI.getMaxRow(Device2D.Keyboard.getValue());
		int maxColumn = sChromaAnimationAPI.getMaxColumn(Device2D.Keyboard.getValue());
		// pick first key
		int pointAColumn = (int) (Math.floor(Math.random() * maxColumn) % 22);
		int pointARow = (int) (Math.floor(Math.random() * maxRow) % 6);
		// pick a different second key
		int pointBColumn;
		int pointBRow;
		do {
			pointBColumn = (int) (Math.floor(Math.random() * maxColumn) % 22);
			pointBRow = (int) (Math.floor(Math.random() * maxRow) % 6);
		} while (pointAColumn == pointBColumn && pointARow == pointBRow);
		int color = sChromaAnimationAPI.getRGB(0, 255, 0);
		int frameIndex = 0;
		for (float i = 0.0f; i <= 1.0f; i += 0.04f) { // 1.0/22.0
			int r = (int) Math.floor(sChromaAnimationAPI.lerp(pointARow, pointBRow, i));
			int c = (int) Math.floor(sChromaAnimationAPI.lerp(pointAColumn, pointBColumn, i));
			if (r >= 0 && r < maxRow && c >= 0 && c < maxColumn) {
				int key = (r << 8) | c;
				sChromaAnimationAPI.setKeyColorName(baseLayer, frameIndex, key, color);
			}
		}
		// play at top speed
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect42ChromaLink() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// the length of the animation
		int frameCount = 50;
		// solid color
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.033f, 64, 255, 64);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect42Headset() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// the length of the animation
		int frameCount = 50;
		// solid color
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.033f, 64, 255, 64);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect42Mousepad() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// the length of the animation
		int frameCount = 50;
		// solid color
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.033f, 64, 255, 64);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect42Mouse() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// the length of the animation
		int frameCount = 50;
		// solid color
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.033f, 64, 255, 64);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect42Keypad() {
		// start with a blank animation
		String baseLayer = getAnimationPath() + "Blank_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the blank animation, passing a reference to the base animation when
		// loading has completed
		sChromaAnimationAPI.getAnimation(baseLayer);
		// the length of the animation
		int frameCount = 50;
		// solid color
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.033f, 64, 255, 64);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect43() {

		sChromaAnimationAPI.coreSetEventName("Effect43");

		String baseLayer = getAnimationPath() + "BlackAndWhiteRainbow_Keyboard.chroma";
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.reduceFramesName(baseLayer, 2);
		sChromaAnimationAPI.reduceFramesName(baseLayer, 2);
		int color1 = sChromaAnimationAPI.getRGB(64, 64, 0);
		int color2 = sChromaAnimationAPI.getRGB(64, 0, 64);
		sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
		int keys[] = { JChromaSDK.Keyboard.RZKEY.RZKEY_W.getValue(), JChromaSDK.Keyboard.RZKEY.RZKEY_A.getValue(),
				JChromaSDK.Keyboard.RZKEY.RZKEY_S.getValue(), JChromaSDK.Keyboard.RZKEY.RZKEY_D.getValue(),
				JChromaSDK.Keyboard.RZKEY.RZKEY_P.getValue(), JChromaSDK.Keyboard.RZKEY.RZKEY_M.getValue(),
				JChromaSDK.Keyboard.RZKEY.RZKEY_F1.getValue(), };
		int color = sChromaAnimationAPI.getRGB(0, 255, 0);
		sChromaAnimationAPI.setKeysColorAllFramesName(baseLayer, keys, keys.length, color);
		sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
		sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect43ChromaLink() {
		String baseLayer = getAnimationPath() + "BlackAndWhiteRainbow_ChromaLink.chroma";
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.reduceFramesName(baseLayer, 2);
		sChromaAnimationAPI.reduceFramesName(baseLayer, 2);
		int color1 = sChromaAnimationAPI.getRGB(64, 64, 0);
		int color2 = sChromaAnimationAPI.getRGB(64, 0, 64);
		sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect43Headset() {
		String baseLayer = getAnimationPath() + "BlackAndWhiteRainbow_Headset.chroma";
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.reduceFramesName(baseLayer, 2);
		sChromaAnimationAPI.reduceFramesName(baseLayer, 2);
		int color1 = sChromaAnimationAPI.getRGB(64, 64, 0);
		int color2 = sChromaAnimationAPI.getRGB(64, 0, 64);
		sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect43Mousepad() {
		String baseLayer = getAnimationPath() + "BlackAndWhiteRainbow_Mousepad.chroma";
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.reduceFramesName(baseLayer, 2);
		sChromaAnimationAPI.reduceFramesName(baseLayer, 2);
		int color1 = sChromaAnimationAPI.getRGB(64, 64, 0);
		int color2 = sChromaAnimationAPI.getRGB(64, 0, 64);
		sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect43Mouse() {
		String baseLayer = getAnimationPath() + "BlackAndWhiteRainbow_Mouse.chroma";
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.reduceFramesName(baseLayer, 2);
		sChromaAnimationAPI.reduceFramesName(baseLayer, 2);
		int color1 = sChromaAnimationAPI.getRGB(64, 64, 0);
		int color2 = sChromaAnimationAPI.getRGB(64, 0, 64);
		sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect43Keypad() {
		String baseLayer = getAnimationPath() + "BlackAndWhiteRainbow_Keypad.chroma";
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.reduceFramesName(baseLayer, 2);
		sChromaAnimationAPI.reduceFramesName(baseLayer, 2);
		int color1 = sChromaAnimationAPI.getRGB(64, 64, 0);
		int color2 = sChromaAnimationAPI.getRGB(64, 0, 64);
		sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect44() {

		sChromaAnimationAPI.coreSetEventName("Effect44");

		String baseLayer = getAnimationPath() + "Spiral_Keyboard.chroma";
		String layer2 = "animations/Rainbow_Keyboard.chroma";
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.closeAnimationName(layer2);
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.getAnimation(layer2);
		int color1 = sChromaAnimationAPI.getRGB(32, 32, 32);
		int color2 = sChromaAnimationAPI.getRGB(64, 64, 64);
		sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
		int keys[] = { JChromaSDK.Keyboard.RZKEY.RZKEY_W.getValue(), JChromaSDK.Keyboard.RZKEY.RZKEY_A.getValue(),
				JChromaSDK.Keyboard.RZKEY.RZKEY_S.getValue(), JChromaSDK.Keyboard.RZKEY.RZKEY_D.getValue(),
				JChromaSDK.Keyboard.RZKEY.RZKEY_P.getValue(), JChromaSDK.Keyboard.RZKEY.RZKEY_M.getValue(),
				JChromaSDK.Keyboard.RZKEY.RZKEY_F1.getValue(), };
		sChromaAnimationAPI.copyKeysColorAllFramesName(layer2, baseLayer, keys, keys.length);
		sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
		sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect44ChromaLink() {
		String baseLayer = getAnimationPath() + "BlackAndWhiteRainbow_ChromaLink.chroma";
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.reduceFramesName(baseLayer, 2);
		sChromaAnimationAPI.reduceFramesName(baseLayer, 2);
		int color1 = sChromaAnimationAPI.getRGB(32, 32, 32);
		int color2 = sChromaAnimationAPI.getRGB(64, 64, 64);
		sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect44Headset() {
		String baseLayer = getAnimationPath() + "BlackAndWhiteRainbow_Headset.chroma";
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.reduceFramesName(baseLayer, 2);
		sChromaAnimationAPI.reduceFramesName(baseLayer, 2);
		int color1 = sChromaAnimationAPI.getRGB(32, 32, 32);
		int color2 = sChromaAnimationAPI.getRGB(64, 64, 64);
		sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect44Mousepad() {
		String baseLayer = getAnimationPath() + "BlackAndWhiteRainbow_Mousepad.chroma";
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.reduceFramesName(baseLayer, 2);
		sChromaAnimationAPI.reduceFramesName(baseLayer, 2);
		int color1 = sChromaAnimationAPI.getRGB(32, 32, 32);
		int color2 = sChromaAnimationAPI.getRGB(64, 64, 64);
		sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect44Mouse() {
		String baseLayer = getAnimationPath() + "BlackAndWhiteRainbow_Mouse.chroma";
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.reduceFramesName(baseLayer, 2);
		sChromaAnimationAPI.reduceFramesName(baseLayer, 2);
		int color1 = sChromaAnimationAPI.getRGB(32, 32, 32);
		int color2 = sChromaAnimationAPI.getRGB(64, 64, 64);
		sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect44Keypad() {
		String baseLayer = getAnimationPath() + "BlackAndWhiteRainbow_Keypad.chroma";
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.reduceFramesName(baseLayer, 2);
		sChromaAnimationAPI.reduceFramesName(baseLayer, 2);
		int color1 = sChromaAnimationAPI.getRGB(32, 32, 32);
		int color2 = sChromaAnimationAPI.getRGB(64, 64, 64);
		sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect45() {

		sChromaAnimationAPI.coreSetEventName("Effect45");

		String baseLayer = getAnimationPath() + "Blank_Keyboard.chroma";
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = 120;
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 64, 64, 64);
		{
			int keys[] = { JChromaSDK.Keyboard.RZKEY.RZKEY_W.getValue(), JChromaSDK.Keyboard.RZKEY.RZKEY_A.getValue(),
					JChromaSDK.Keyboard.RZKEY.RZKEY_S.getValue(), JChromaSDK.Keyboard.RZKEY.RZKEY_D.getValue(), };
			sChromaAnimationAPI.setKeysColorAllFramesRGBName(baseLayer, keys, keys.length, 255, 255, 0);
		}
		int keys[] = { JChromaSDK.Keyboard.RZKEY.RZKEY_F1.getValue(), JChromaSDK.Keyboard.RZKEY.RZKEY_F2.getValue(),
				JChromaSDK.Keyboard.RZKEY.RZKEY_F3.getValue(), JChromaSDK.Keyboard.RZKEY.RZKEY_F4.getValue(),
				JChromaSDK.Keyboard.RZKEY.RZKEY_F5.getValue(), JChromaSDK.Keyboard.RZKEY.RZKEY_F6.getValue(), };
		float t = 0;
		float speed = 0.05f;
		for (int frameId = 0; frameId < frameCount; ++frameId) {
			t += speed;
			float hp = (float) Math.abs(Math.cos(Math.PI / 2.0f + t));
			for (int i = 0; i < keys.length; ++i) {
				int color = sChromaAnimationAPI.getRGB(0, (int) (255 * (1 - hp)), 0);
				if ((i + 1) / (float) ((keys.length + 1)) < hp) {
					color = sChromaAnimationAPI.getRGB(0, 255, 0);
				} else {
					color = sChromaAnimationAPI.getRGB(0, 100, 0);
				}
				int key = keys[i];
				sChromaAnimationAPI.setKeyColorName(baseLayer, frameId, key, color);
			}
		}
		sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
		sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect45ChromaLink() {
		String baseLayer = getAnimationPath() + "Blank_ChromaLink.chroma";
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = 50;
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
		sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
		sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
		int color1 = sChromaAnimationAPI.getRGB(0, 64, 0);
		int color2 = sChromaAnimationAPI.getRGB(0, 255, 0);
		sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect45Headset() {
		String baseLayer = getAnimationPath() + "Blank_Headset.chroma";
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = 50;
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
		sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
		sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
		int color1 = sChromaAnimationAPI.getRGB(0, 64, 0);
		int color2 = sChromaAnimationAPI.getRGB(0, 255, 0);
		sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect45Mousepad() {
		String baseLayer = getAnimationPath() + "Blank_Mousepad.chroma";
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = 50;
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
		sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
		sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
		int color1 = sChromaAnimationAPI.getRGB(0, 64, 0);
		int color2 = sChromaAnimationAPI.getRGB(0, 255, 0);
		sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect45Mouse() {
		String baseLayer = getAnimationPath() + "Blank_Mouse.chroma";
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = 50;
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
		sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
		sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
		int color1 = sChromaAnimationAPI.getRGB(0, 64, 0);
		int color2 = sChromaAnimationAPI.getRGB(0, 255, 0);
		sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect45Keypad() {
		String baseLayer = getAnimationPath() + "Blank_Keypad.chroma";
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = 50;
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
		sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
		sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
		int color1 = sChromaAnimationAPI.getRGB(0, 64, 0);
		int color2 = sChromaAnimationAPI.getRGB(0, 255, 0);
		sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect46() {

		sChromaAnimationAPI.coreSetEventName("Effect46");

		String baseLayer = getAnimationPath() + "Blank_Keyboard.chroma";
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = 120;
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 64, 64, 64);

		{
			int keys[] = { JChromaSDK.Keyboard.RZKEY.RZKEY_W.getValue(), JChromaSDK.Keyboard.RZKEY.RZKEY_A.getValue(),
					JChromaSDK.Keyboard.RZKEY.RZKEY_S.getValue(), JChromaSDK.Keyboard.RZKEY.RZKEY_D.getValue(), };
			sChromaAnimationAPI.setKeysColorAllFramesRGBName(baseLayer, keys, keys.length, 255, 0, 0);
		}

		int[] keys = { JChromaSDK.Keyboard.RZKEY.RZKEY_F7.getValue(), JChromaSDK.Keyboard.RZKEY.RZKEY_F8.getValue(),
				JChromaSDK.Keyboard.RZKEY.RZKEY_F9.getValue(), JChromaSDK.Keyboard.RZKEY.RZKEY_F10.getValue(),
				JChromaSDK.Keyboard.RZKEY.RZKEY_F11.getValue(), JChromaSDK.Keyboard.RZKEY.RZKEY_F12.getValue() };
		float t = 0;
		float speed = 0.05f;
		for (int frameId = 0; frameId < frameCount; ++frameId) {
			t += speed;
			float hp = (float) Math.abs(Math.cos(Math.PI / 2.0f + t));
			for (int i = 0; i < keys.length; ++i) {
				int color = sChromaAnimationAPI.getRGB((int) (255 * (1 - hp)), (int) (255 * (1 - hp)), 0);
				if ((i + 1) / ((float) (keys.length + 1)) < hp) {
					color = sChromaAnimationAPI.getRGB(255, 255, 0);
				} else {
					color = sChromaAnimationAPI.getRGB(100, 100, 0);
				}
				int key = keys[i];
				sChromaAnimationAPI.setKeyColorName(baseLayer, frameId, key, color);
			}
		}
		sChromaAnimationAPI.setChromaCustomFlagName(baseLayer, true);
		sChromaAnimationAPI.setChromaCustomColorAllFramesName(baseLayer);
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect46ChromaLink() {
		String baseLayer = getAnimationPath() + "Blank_ChromaLink.chroma";
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = 50;
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
		sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
		sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
		int color1 = sChromaAnimationAPI.getRGB(64, 64, 0);
		int color2 = sChromaAnimationAPI.getRGB(255, 255, 0);
		sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect46Headset() {
		String baseLayer = getAnimationPath() + "Blank_Headset.chroma";
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = 50;
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
		sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
		sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
		int color1 = sChromaAnimationAPI.getRGB(64, 64, 0);
		int color2 = sChromaAnimationAPI.getRGB(255, 255, 0);
		sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect46Mousepad() {
		String baseLayer = getAnimationPath() + "Blank_Mousepad.chroma";
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = 50;
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
		sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
		sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
		int color1 = sChromaAnimationAPI.getRGB(64, 64, 0);
		int color2 = sChromaAnimationAPI.getRGB(255, 255, 0);
		sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect46Mouse() {
		String baseLayer = getAnimationPath() + "Blank_Mouse.chroma";
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = 50;
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
		sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
		sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
		int color1 = sChromaAnimationAPI.getRGB(64, 64, 0);
		int color2 = sChromaAnimationAPI.getRGB(255, 255, 0);
		sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect46Keypad() {
		String baseLayer = getAnimationPath() + "Blank_Keypad.chroma";
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.getAnimation(baseLayer);
		int frameCount = 50;
		sChromaAnimationAPI.makeBlankFramesRGBName(baseLayer, frameCount, 0.1f, 255, 255, 255);
		sChromaAnimationAPI.fadeStartFramesName(baseLayer, frameCount / 2);
		sChromaAnimationAPI.fadeEndFramesName(baseLayer, frameCount / 2);
		int color1 = sChromaAnimationAPI.getRGB(64, 64, 0);
		int color2 = sChromaAnimationAPI.getRGB(255, 255, 0);
		sChromaAnimationAPI.multiplyTargetColorLerpAllFramesName(baseLayer, color1, color2);
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}
	
	public static void showEffect47() {

		sChromaAnimationAPI.coreSetEventName("Effect47");

		String baseLayer = "Embedded/Sample_Keyboard.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the bytes from memory and name it
		sChromaAnimationAPI.openAnimationFromMemory(EmbeddedAnimations.EMBED_Sample_Keyboard(), baseLayer);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect47ChromaLink() {
		String baseLayer = "Embedded/Sample_ChromaLink.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the bytes from memory and name it
		sChromaAnimationAPI.openAnimationFromMemory(EmbeddedAnimations.EMBED_Sample_ChromaLink, baseLayer);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect47Headset() {
		String baseLayer = "Embedded/Sample_Headset.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the bytes from memory and name it
		sChromaAnimationAPI.openAnimationFromMemory(EmbeddedAnimations.EMBED_Sample_Headset, baseLayer);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect47Mousepad() {
		String baseLayer = "Embedded/Sample_Mousepad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the bytes from memory and name it
		sChromaAnimationAPI.openAnimationFromMemory(EmbeddedAnimations.EMBED_Sample_Mousepad, baseLayer);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect47Mouse() {
		String baseLayer = "Embedded/Sample_Mouse.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the bytes from memory and name it
		sChromaAnimationAPI.openAnimationFromMemory(EmbeddedAnimations.EMBED_Sample_Mouse, baseLayer);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}

	public static void showEffect47Keypad() {
		String baseLayer = "Embedded/Sample_Keypad.chroma";
		// close the blank animation if it's already loaded, discarding any changes
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		// open the bytes from memory and name it
		sChromaAnimationAPI.openAnimationFromMemory(EmbeddedAnimations.EMBED_Sample_Keypad, baseLayer);
		// set animation playback to 30 FPS
		sChromaAnimationAPI.overrideFrameDurationName(baseLayer, 0.033f);
		// play the animation on the dynamic canvas
		sChromaAnimationAPI.playAnimationName(baseLayer, true);
	}
	public static void showEffect48()
	{
		// Trigger haptic effect
		sChromaAnimationAPI.coreSetEventName("Effect48");

		String baseLayer = "Animations/Idle_Keyboard.chroma"; // 8x24
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.useIdleAnimation(Device.Keyboard.getValue(), true);
		sChromaAnimationAPI.setIdleAnimationName(baseLayer);

		String animLayer = "Animations/Effect48_Keyboard.chroma";
		sChromaAnimationAPI.closeAnimationName(animLayer);
		sChromaAnimationAPI.getAnimation(animLayer);
		final int fadeFrames = 20;
		sChromaAnimationAPI.fadeStartFramesName(animLayer, fadeFrames);
		sChromaAnimationAPI.fadeEndFramesName(animLayer, fadeFrames);
		sChromaAnimationAPI.playAnimationName(animLayer, false);
	}
	public static void showEffect48ChromaLink()
	{
		String baseLayer = "Animations/Idle_ChromaLink.chroma";
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.useIdleAnimation(Device.ChromaLink.getValue(), true);
		sChromaAnimationAPI.setIdleAnimationName(baseLayer);

		String animLayer = "Animations/Effect48_ChromaLink.chroma";
		sChromaAnimationAPI.closeAnimationName(animLayer);
		sChromaAnimationAPI.getAnimation(animLayer);
		final int fadeFrames = 20;
		sChromaAnimationAPI.fadeStartFramesName(animLayer, fadeFrames);
		sChromaAnimationAPI.fadeEndFramesName(animLayer, fadeFrames);
		sChromaAnimationAPI.playAnimationName(animLayer, false);
	}
	public static void showEffect48Headset()
	{
		String baseLayer = "Animations/Idle_Headset.chroma";
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.useIdleAnimation(Device.Headset.getValue(), true);
		sChromaAnimationAPI.setIdleAnimationName(baseLayer);

		String animLayer = "Animations/Effect48_Headset.chroma";
		sChromaAnimationAPI.closeAnimationName(animLayer);
		sChromaAnimationAPI.getAnimation(animLayer);
		final int fadeFrames = 20;
		sChromaAnimationAPI.fadeStartFramesName(animLayer, fadeFrames);
		sChromaAnimationAPI.fadeEndFramesName(animLayer, fadeFrames);
		sChromaAnimationAPI.playAnimationName(animLayer, false);
	}
	public static void showEffect48Mousepad()
	{
		String baseLayer = "Animations/Idle_Mousepad.chroma";
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.useIdleAnimation(Device.Mousepad.getValue(), true);
		sChromaAnimationAPI.setIdleAnimationName(baseLayer);

		String animLayer = "Animations/Effect48_Mousepad.chroma";
		sChromaAnimationAPI.closeAnimationName(animLayer);
		sChromaAnimationAPI.getAnimation(animLayer);
		final int fadeFrames = 20;
		sChromaAnimationAPI.fadeStartFramesName(animLayer, fadeFrames);
		sChromaAnimationAPI.fadeEndFramesName(animLayer, fadeFrames);
		sChromaAnimationAPI.playAnimationName(animLayer, false);
	}
	public static void showEffect48Mouse()
	{
		String baseLayer = "Animations/Idle_Mouse.chroma";
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.useIdleAnimation(Device.Mouse.getValue(), true);
		sChromaAnimationAPI.setIdleAnimationName(baseLayer);

		String animLayer = "Animations/Effect48_Mouse.chroma";
		sChromaAnimationAPI.closeAnimationName(animLayer);
		sChromaAnimationAPI.getAnimation(animLayer);
		final int fadeFrames = 20;
		sChromaAnimationAPI.fadeStartFramesName(animLayer, fadeFrames);
		sChromaAnimationAPI.fadeEndFramesName(animLayer, fadeFrames);
		sChromaAnimationAPI.playAnimationName(animLayer, false);
	}
	public static void showEffect48Keypad()
	{
		String baseLayer = "Animations/Idle_Keypad.chroma";
		sChromaAnimationAPI.closeAnimationName(baseLayer);
		sChromaAnimationAPI.getAnimation(baseLayer);
		sChromaAnimationAPI.useIdleAnimation(Device.Keypad.getValue(), true);
		sChromaAnimationAPI.setIdleAnimationName(baseLayer);

		String animLayer = "Animations/Effect48_Keypad.chroma";
		sChromaAnimationAPI.closeAnimationName(animLayer);
		sChromaAnimationAPI.getAnimation(animLayer);
		final int fadeFrames = 20;
		sChromaAnimationAPI.fadeStartFramesName(animLayer, fadeFrames);
		sChromaAnimationAPI.fadeEndFramesName(animLayer, fadeFrames);
		sChromaAnimationAPI.playAnimationName(animLayer, false);
	}

}
