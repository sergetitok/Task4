package task4.TaxiFactory;
import task4.TypesOfTaxi;
import task4.typesoftaxi.FreightTaxi;
import task4.typesoftaxi.Minivan;
import task4.typesoftaxi.Taxi;
import task4.typesoftaxi.Taxpark;

public class TaxoparkFactory extends Taxpark {


    public static Taxpark getTaxipark(TypesOfTaxi type) {
        Taxpark toReturn = null;
        switch (type) {
            case TAXI:
                toReturn = new Taxi();
                break;
            case FREIGHT_TAXI:
                toReturn = new FreightTaxi();
                break;
            case MINIVAN:
                toReturn = new Minivan();
                break;
            default:
                throw new IllegalArgumentException("Wrong doughnut type:" + type);
        }
        return toReturn;
    }
}
