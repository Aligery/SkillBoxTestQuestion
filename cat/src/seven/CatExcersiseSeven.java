package seven;
//Создать у кошки метод создания её “глубокой” копии. Для создания копии кошки вы можете использовать метод копирования или конструктор копирования.
public class CatExcersiseSeven {
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;

    public CatExcersiseSeven() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;

    }

    public CatExcersiseSeven(CatExcersiseSeven cat) {
        this(cat.originWeight, cat.weight, cat.minWeight, cat.maxWeight);
    }

    private CatExcersiseSeven(double originWeight, double weight, double minWeight, double maxWeight) {
        this.originWeight = originWeight;
        this.weight = weight;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
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
