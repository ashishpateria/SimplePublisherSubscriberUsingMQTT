package pubSubBuilderFinal.data;

import java.util.ArrayList;
import java.util.Arrays;

public class Data {
	private ArrayList<String> device1Data;
	private ArrayList<String> device2Data;
	private ArrayList<String> device3Data;
	private ArrayList<String> device4Data;

	public Data() {
		device1Data = new ArrayList<String>(Arrays.asList("/Device1/Time/EST", "/Device1/Time/CST", "/Device1/Time/MST",
				"/Device1/Time/PST", "/Device1/Humidity/EST", "/Device1/Humidity/CST", "/Device1/Humidity/MST",
				"/Device1/Humidity/PST", "/Device1/Wind/EST", "/Device1/Wind/CST", "/Device1/Wind/MST",
				"/Device1/Wind/PST", "/Device1/Temperature/Fahrenheit", "/Device1/Temperature/Celsius",
				"/Device1/Power/Watt", "/Device1/Power/HP"));

		device2Data = new ArrayList<String>(Arrays.asList("/Device2/Time/EST", "/Device2/Time/CST", "/Device2/Time/MST",
				"/Device2/Time/PST", "/Device2/Humidity/EST", "/Device2/Humidity/CST", "/Device2/Humidity/MST",
				"/Device2/Humidity/PST", "/Device2/Wind/EST", "/Device2/Wind/CST", "/Device2/Wind/MST",
				"/Device2/Wind/PST", "/Device2/Temperature/Fahrenheit", "/Device2/Temperature/Celsius",
				"/Device2/Power/Watt", "/Device2/Power/HP"));

		device3Data = new ArrayList<String>(Arrays.asList("/Device3/Time/EST", "/Device3/Time/CST", "/Device3/Time/MST",
				"/Device3/Time/PST", "/Device3/Humidity/EST", "/Device3/Humidity/CST", "/Device3/Humidity/MST",
				"/Device3/Humidity/PST", "/Device3/Wind/EST", "/Device3/Wind/CST", "/Device3/Wind/MST",
				"/Device3/Wind/PST", "/Device3/Temperature/Fahrenheit", "/Device3/Temperature/Celsius",
				"/Device3/Power/Watt", "/Device3/Power/HP"));

		device4Data = new ArrayList<String>(Arrays.asList("/Device4/Time/EST", "/Device4/Time/CST", "/Device4/Time/MST",
				"/Device4/Time/PST", "/Device4/Humidity/EST", "/Device4/Humidity/CST", "/Device4/Humidity/MST",
				"/Device4/Humidity/PST", "/Device4/Wind/EST", "/Device4/Wind/CST", "/Device4/Wind/MST",
				"/Device4/Wind/PST", "/Device4/Temperature/Fahrenheit", "/Device4/Temperature/Celsius",
				"/Device4/Power/Watt", "/Device4/Power/HP"));
	}

	public ArrayList<String> getDevice1Data() {
		return device1Data;
	}

	public ArrayList<String> getDevice2Data() {
		return device2Data;
	}

	public ArrayList<String> getDevice3Data() {
		return device3Data;
	}

	public ArrayList<String> getDevice4Data() {
		return device4Data;
	}

}
