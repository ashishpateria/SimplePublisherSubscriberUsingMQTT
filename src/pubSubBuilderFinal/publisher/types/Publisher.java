package pubSubBuilderFinal.publisher.types;

import java.util.concurrent.ThreadLocalRandom;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;

public abstract class Publisher {

	private String name = null;
	private MqttClient mqttClient;

	public void connect() {
		// Create an Mqtt client 
		try {
			mqttClient = new MqttClient("tcp://m2m.eclipse.org:1883", "HelloWorldPub");
			MqttConnectOptions connOpts = new MqttConnectOptions();
			connOpts.setCleanSession(true);

			// Connect the client
			System.out.println("Connecting to Solace broker: tcp://m2m.eclipse.org:1883");
			mqttClient.connect(connOpts);
			System.out.println("Connected");
		} catch (MqttException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	abstract public void publishMessage();

	public void disconnect() {
		// Disconnect the client
		try {
			mqttClient.disconnect();
			System.out.println("Message published. Exiting");
			
		} catch (MqttException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public int generateRandomNumber(int min, int max) {

		// Random rand;
		// int randomNumber = rand.nextInt((max - min) + 1) + min;
		// return randomNumber;
		return ThreadLocalRandom.current().nextInt(min, max + 1);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MqttClient getMqttClient() {
		return mqttClient;
	}

	public void setMqttClient(MqttClient mqttClient) {
		this.mqttClient = mqttClient;
	}

}
