package factorymethod;

import javax.management.OperationsException;

public class LogisticManager {
    public static BaseLogistic getLogistic(String type)
    {
        if(type.equalsIgnoreCase("road"))
            return new RoadLogistic();
        else if(type.equalsIgnoreCase("sea"))
            return new SeaLogistic();
        else if(type.equalsIgnoreCase("air"))
            return new AirLogistic();
        else
            return null;
    }
}
