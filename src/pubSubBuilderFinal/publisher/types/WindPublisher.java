package pubSubBuilderFinal.publisher.types;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class WindPublisher extends Publisher {
	private String name = "Wind Publisher";
	private String topic = null;

	public WindPublisher(String topicIn) {
		this.topic = topicIn;
	}

	public void setName(String nameIn) {
		this.name = nameIn + " " + name;

	}

	public String getName() {
		return this.name;
	}

	@Override
	public void publishMessage() {

		System.out.println(name + " initializing...");

		try {
			MqttClient mqttClient = this.getMqttClient();
			int wind = generateRandomNumber(2, 17);
			String content = "Wind Speed = " + wind + " mph";
			MqttMessage message = new MqttMessage(content.getBytes());

			// Here we are using QoS of 0 (equivalent to Direct Messaging)
			message.setQos(0);
			System.out.println("Publishing message: " + content);

			// Publish the message
			mqttClient.publish(topic, message);

			// Add Value to the database;

		} catch (MqttException me) {

			System.out.println("reason " + me.getReasonCode());
			System.out.println("msg " + me.getMessage());
			System.out.println("loc " + me.getLocalizedMessage());
			System.out.println("cause " + me.getCause());
			System.out.println("excep " + me);
			me.printStackTrace();

		}
	}
}
