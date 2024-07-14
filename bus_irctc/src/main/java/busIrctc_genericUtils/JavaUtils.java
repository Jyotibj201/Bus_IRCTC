package busIrctc_genericUtils;

import java.util.Date;
import java.util.Random;

import org.testng.annotations.Test;

public class JavaUtils {

	
	/**@author Jyoti Jogur
	 * Generate the Random number
	 * @return 
	 * 
	 */
	@Test
	public String getRandomNumber() {
		Random random=new Random();
		int randomNum=random.nextInt(1000);
		//System.out.println(randomNum);
		return randomNum+"";
	}
	
	/**@author Jyoti Jogur
	 * Print the current date.
	 * @return 
	 */
	public String currentDate() {
		Date date=new Date();
		String Idate=date.toString().replace(' ', '_');
		return Idate;
	}
}
