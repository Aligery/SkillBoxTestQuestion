package five;
//- Создать в классе Cat ещё один конструктор так, чтобы можно было создать кошку с весом переданным в конструктор
//- Создать в главном классе Loader метод генерации котенка private static Cat getKitten(),
// который будет возвращать кошку с весом 1100.00, используя конструктор
// в который передаем вес кошки, как описано в видеоуроке.
public class CatExcersiseFive {
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;

    public CatExcersiseFive()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;

    }

    public CatExcersiseFive(double weight)
    {
        this.weight = weight;
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;

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
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
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
