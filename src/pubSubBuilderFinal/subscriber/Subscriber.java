package pubSubBuilderFinal.subscriber;

import java.sql.Timestamp;
import java.util.concurrent.CountDownLatch;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class Subscriber {

	private MqttClient mqttClient;
	private String[] subTopic = null;
	private String name = "Subscriber";

	// final String[] subTopic = { "T/GettingStarted/pubsub",
	// "T/GettingStarted/pubsub/bye" };
	public Subscriber(String[] topicsIn) {
		this.subTopic = topicsIn;
	}

	public void setName(String nameIn) {
		this.name = nameIn + " " + name;
	}

	public String getName() {
		return this.name;
	}

	public void connect() {
		try {

			mqttClient = new MqttClient("tcp://m2m.eclipse.org:1883", "Subcriber");
			// mqttClient = new MqttClient("tcp://localhost:1883", "Subcriber");
			MqttConnectOptions connOpts = new MqttConnectOptions();
			connOpts.setCleanSession(true);

			System.out.println("Connecting to Solace broker: tcp://m2m.eclipse.org:1883");
			mqttClient.connect(connOpts);
			System.out.println("Connected");

		} catch (MqttException e) {
			e.printStackTrace();
		} finally {
		}

	}

	public void subscribeMessage() {
		// Latch used for synchronizing b/w threads
		final CountDownLatch latch = new CountDownLatch(subTopic.length);

		// Callback - Anonymous inner-class for receiving messages
		mqttClient.setCallback(new MqttCallback() {

			public void messageArrived(String topic, MqttMessage message) throws Exception {
				// Called when a message arrives from the server that matches
				// any subscription made by the client
				String time = new Timestamp(System.currentTimeMillis()).toString();
				System.out.println("\nReceived a Message!");
				System.out.println("\tName:    " + name);
				System.out.println("\tTime:    " + time);
				System.out.println("\tTopic:   " + topic);
				System.out.println("\tMessage: " + new String(message.getPayload()));
				System.out.println("\tQoS:     " + message.getQos() + "\n");
				latch.countDown(); // unblock main thread
			}

			public void connectionLost(Throwable cause) {
				System.out.println("Connection to Solace broker lost!" + cause.getMessage());
				latch.countDown();
			}

			public void deliveryComplete(IMqttDeliveryToken token) {
			}
		});

		try {
			// Subscribe client to the topic filter
			for (String str : subTopic) {
				System.out.println("Subscribing client to topic: " + str);
				mqttClient.subscribe(str);
			}
		} catch (MqttException me) {

			System.out.println("reason " + me.getReasonCode());
			System.out.println("msg " + me.getMessage());
			System.out.println("loc " + me.getLocalizedMessage());
			System.out.println("cause " + me.getCause());
			System.out.println("excep " + me);
			me.printStackTrace();
		} finally {

		}

		// Wait for the message to be received
		try {
			latch.await(); // block here until message received, and latch will
							// flip
		} catch (InterruptedException e) {
			System.out.println("I was awoken while waiting");
		} finally {

		}

	}

	public void disconnect() {
		try {
			// Disconnect the client
			mqttClient.disconnect();
			System.out.println("Exiting");
		} catch (MqttException e) {
			e.printStackTrace();
		} finally {
		}
	}

}
