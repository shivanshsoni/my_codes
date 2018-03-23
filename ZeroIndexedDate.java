import java.util.Date;
import java.util.Calendar;

public class ZeroIndexedDate
{
        public static void main (String args[])
        {
                // Get today's date
                Date today = new Date();
	
		// Print return value of getMonth
		System.out.println ("Date.getMonth() returns : " +
			 today.getMonth());

		// Get today's date using a Calendar
		Calendar rightNow = Calendar.getInstance();

		// Print return value of get ( Calendar.MONTH )
		System.out.println ("Calendar.get (month) returns : " +
			rightNow.get ( Calendar.MONTH ));
        }
}