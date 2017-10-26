package pubSubBuilderFinal.publisher.types;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class TimePublisher extends Publisher {

	private String name = "Time Publisher";
	private String topic = null;

	public TimePublisher(String topicIn) {
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

			Date today = new Date();
			DateFormat df = new SimpleDateFormat("HH:mm:SS z");

			String time = null;

			if (topic.contains("/Time/EST")) {
				df.setTimeZone(TimeZone.getTimeZone("US/Eastern"));
				time = df.format(today);
			} else if (topic.contains("/Time/CST")) {
				df.setTimeZone(TimeZone.getTimeZone("US/Central"));
				time = df.format(today);
			} else if (topic.contains("/Time/MST")) {
				df.setTimeZone(TimeZone.getTimeZone("US/Mountain"));
				time = df.format(today);
			} else if (topic.contains("/Time/PST")) {
				df.setTimeZone(TimeZone.getTimeZone("US/Pacific"));
				time = df.format(today);
			}

			// Create a Mqtt message
			String content = "Current Time: " + time;

			MqttMessage message = new MqttMessage(content.getBytes());

			// Set the QoS on the Messages -QoS of 0 (equivalent to Direct
			// Messaging in Solace)

			message.setQos(0);
			System.out.println("Publishing message: " + content);

			// Publish the message
			mqttClient.publish(topic, message);

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
