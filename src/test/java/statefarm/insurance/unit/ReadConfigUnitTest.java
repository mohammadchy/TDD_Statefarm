package statefarm.insurance.unit;

import org.testng.annotations.Test;

import statefarm.insurance.constants.KeyConfig;
import statefarm.insurance.utils.ReadConfig;


public class ReadConfigUnitTest {


	@Test
	public void getPropertiesTest() {
		ReadConfig config = new ReadConfig();
		String urlString = config.getValue(KeyConfig.url);
		System.out.println(urlString);
		
	}

}
