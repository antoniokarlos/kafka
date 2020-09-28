package kafka;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

public class Producer {
	
	public static void main(String[] args) {
		
		var producer = new KafkaProducer<String, String>(getProperties());
		var record = new ProducerRecord<String, String>("product_topic", "produto", "produto_1,50");
		producer.send(record, (data, ex) -> {
			if(ex!=null) {
				ex.printStackTrace();
			}
			System.out.println("opa! Parece que deu Certo! "+ data.topic());
		});
		
	}

	private static Properties getProperties() {
		var properties = new Properties();
		
		properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		return properties;
	}
}
