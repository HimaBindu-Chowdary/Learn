package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Robotcls   //type Qsp in notepad
{
	
	public static void main(String[] args) throws IOException, AWTException    {
	Runtime.getRuntime().exec("notepad");
	
	 Robot r= new Robot();
	 r.keyPress(KeyEvent.VK_SHIFT);
	 r.keyPress(KeyEvent.VK_Q);
	 r.keyRelease(KeyEvent.VK_SHIFT);
	 r.keyPress(KeyEvent.VK_S);
	 r.keyPress(KeyEvent.VK_P);
	// System.out.println();
	
}
}
