package astechzgo.luminescent.rendering;

import org.lwjgl.opengl.GL11;

import astechzgo.luminescent.utils.DisplayUtils;

/**
 * 
 * @author Tylar
 *
 * OpenGL class to initialize the 2d rendering scene
 */
public class OpenGL
{
	private static float red = 0.15f;
	private static float green = 0.15f;
	private static float blue = 0.15f;
	private static float alpha = 1.0f;
	
	public static void InitOpenGL()
	{
		ChangeResolution(DisplayUtils.SCREEN_WIDTH, DisplayUtils.SCREEN_HEIGHT);
	}
	
	public static void Tick()
	{
		GL11.glClearColor(red, green, blue, alpha);
		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
		GL11.glEnable(GL11.GL_TEXTURE_2D);
	}
	
	public static void ChangeResolution(int x, int y)
	{
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glLoadIdentity();
		GL11.glOrtho(0, x, 0, y, 1, -1);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
	}
	
	public static void SetClearColor(float redVal, float greenVal, float blueVal, float alphaVal)
	{
		red = redVal;
		green = greenVal;
		blue = blueVal;
		alpha = alphaVal;
	}
	
}