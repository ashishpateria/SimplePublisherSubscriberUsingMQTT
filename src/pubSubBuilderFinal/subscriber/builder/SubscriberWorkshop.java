package pubSubBuilderFinal.subscriber.builder;

import pubSubBuilderFinal.subscriber.Subscriber;

public class SubscriberWorkshop implements SubscriberWorkshopInterface {

	@Override
	public void construct(Subscriber subscriber) {
		subscriber.connect();
		subscriber.subscribeMessage();
		subscriber.disconnect();

	}

}
