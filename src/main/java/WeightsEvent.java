import javax.enterprise.context.ApplicationScoped;
import javax.inject.Singleton;
import java.util.List;

@Singleton
public class WeightsEvent
{
    public String  weight_proc;
    public List<WeightEvent> weights;


}
