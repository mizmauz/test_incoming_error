import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class WeightsEventDeserializer extends ObjectMapperDeserializer<WeightsEvent> {
    public WeightsEventDeserializer(){
        // pass the class to the parent.
        super(WeightsEvent.class);
    }
}
