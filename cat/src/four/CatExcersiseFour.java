package four;
//- Создать у кошки константы: “количество глаз”, “минимальный вес” и “максимальный вес”.
//- Создать enum с окрасами кошек.
public class CatExcersiseFour {

    private double originWeight;
    private double weight;

    private final int countEyes = 2;
    private final double MIN_WEIGHT = 1000.0;
    private final double MAX_WEIGHT = 9000.0;

    public CatExcersiseFour()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;

    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < MIN_WEIGHT) {
            return "Dead";
        }
        else if(weight > MAX_WEIGHT) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

}
