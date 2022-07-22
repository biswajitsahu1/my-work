package xyz1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class CurrentTimeDate {
//	public static void main(String[] args) {
//		SimpleDateFormat format = new SimpleDateFormat("E, MMM dd yyyy  HH:mm:ss ");
//		Date date=new Date();
//		System.out.println(format.format(date));
//	}
	public static void main(String[] args)
    {

    Timer timer = new Timer();

         timer.scheduleAtFixedRate(new TimerTask()
         {
            public void run()
            {
                Robot robbie;

                int second, minute, hour;
                Calendar date = Calendar.getInstance();
                second = date.get(Calendar.SECOND);
                minute = date.get(Calendar.MINUTE);
                hour = date.get(Calendar.HOUR);
                System.out.println(hour + " : " + minute +" : " + second);

                try
                {
                    robbie = new Robot();
                    robbie.keyPress(KeyEvent.VK_ALT);
                    robbie.keyPress(KeyEvent.VK_SHIFT);
                    robbie.keyPress(KeyEvent.VK_Q);
                    robbie.keyRelease(KeyEvent.VK_ALT);
                    robbie.keyRelease(KeyEvent.VK_SHIFT);
                    robbie.keyRelease(KeyEvent.VK_Q);
                    robbie.keyPress(KeyEvent.VK_C);
                    robbie.keyRelease(KeyEvent.VK_C);
                    robbie.keyPress(KeyEvent.VK_SHIFT);
                    robbie.keyPress(KeyEvent.VK_F10);
                    robbie.keyPress(KeyEvent.VK_R);
                    robbie.keyRelease(KeyEvent.VK_SHIFT);
                    robbie.keyRelease(KeyEvent.VK_F10);
                    robbie.keyRelease(KeyEvent.VK_R);
                } catch (AWTException e)
                {
                    e.printStackTrace();
                }
            }
        }, 1 * 500, 1 * 500);
    }
}
