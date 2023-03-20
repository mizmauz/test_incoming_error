import javax.persistence.Id;
import java.time.LocalDate;

public class WeightEvent
{
    @Id
    public Long id;

    public LocalDate datefrom;

    public LocalDate dateto;

    public Double weightresult;

    public WeightEvent(LocalDate datefrom, LocalDate dateto, Double weightresult)
    {
        this.datefrom = datefrom;
        this.dateto = dateto;
        this.weightresult = weightresult;
    }

    public LocalDate getDatefrom()
    {
        return this.datefrom;
    }

}
