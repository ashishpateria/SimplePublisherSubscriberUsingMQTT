package pubSubBuilderFinal.publisher.builder;

import pubSubBuilderFinal.publisher.types.Publisher;

public class PublisherWorkShop implements PublisherWorkshopInterface {

	@Override
	public void construct(Publisher publisher) {
		publisher.connect();
		publisher.publishMessage();
		publisher.disconnect();
	}
}
