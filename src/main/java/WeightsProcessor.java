import io.smallrye.mutiny.Uni;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.eclipse.microprofile.reactive.messaging.Acknowledgment;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.control.ActivateRequestContext;
import javax.inject.Inject;

@ApplicationScoped
public class WeightsProcessor {

    private static final Logger LOGGER = Logger.getLogger(WeightsProcessor.class.getName());


//    WeightsService service;
//
//    @Inject
//    MessageSender sender;
//    @Inject
//    ConsumptionWeightsRepository consumptionWeightsRepository;

    /**
     * Check required fields /completeness
     * Weight_Proc
     * DateFrom, DateTo
     */

//    public void checkSingle( String field, Object value) throws IllegalArgumentException
//    {
//        if ( value == null ) throw new IllegalArgumentException(field );
//    }
//
//
//    public String checkInput(WeightsEvent input) throws IllegalArgumentException
//    {
//        String errorfield = new String();
//        checkSingle("weight_proc", input.weight_proc);
//
//        for (WeightEvent weightEvent : input.weights)
//        {
//            checkSingle("dateto", weightEvent.dateto);
//            checkSingle("datefrom", weightEvent.datefrom);
//        }
//
//        return errorfield;
//    }

//    @Inject
//    WeightsEvent event;

    @ActivateRequestContext
    @Acknowledgment(Acknowledgment.Strategy.POST_PROCESSING)
    @Incoming("WEIGHTS_REQUEST")
    @Incoming("CREATION_WEIGHTS_REQUEST")
    public Uni<Void> process2(ConsumerRecord<String, WeightsEvent> record) {
        WeightsEvent event = record.value();
        LOGGER.infof("Get Weight for Weighting Procedure %s", event.weight_proc);

        String key = record.key();
        String topic = record.topic();
        int partition = record.partition();

        return Uni.createFrom().voidItem();
    }



}

