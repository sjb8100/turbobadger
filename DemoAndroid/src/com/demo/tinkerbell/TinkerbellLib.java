package com.demo.tinkerbell;

import android.content.res.AssetManager;

public class TinkerbellLib
{
	static
	{
		System.loadLibrary("Tinkerbell");
	}
	static boolean sInitiated = false;

	public static native void createAssetManager(AssetManager assetManager);

	public static native void InitApp(int width, int height, String settings_path, String custom_data_path);
	public static native void ShutDownApp();

	public static native void OnPauseApp();
	public static native void OnResumeApp();

	public static native void OnPointer(float x, float y, int down);
	public static native void OnPointer2(float x, float y, int down);
	public static native void OnPointerMove(float x, float y, float x2, float y2);

	public static native int OnBackKey();
	public static native int OnMenuKey();

	public static native void OnContextLost();
	public static native void OnContextRestored();
	public static native void OnSurfaceResized(int width, int height);

	public static native void RunSlice();
}