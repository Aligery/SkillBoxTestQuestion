package two;
//- Создать в классе Cat метод, который будет возвращать сумму съеденной еды текущей кошки
//- Создать в классе Cat метод “сходить в туалет” pee(), который будет уменьшать вес кошки и что-нибудь печатать.
public class CatExcersiseTwo {

    private static int count = 0;
    private double originWeight;
    private double weight;
    private double minWeight;
    private double maxWeight;
    private double eatenFood;
    public CatExcersiseTwo()
    {
        count++;
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        eatenFood = 0.0;
    }
    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }
    public void feed(Double amount)
    {
        eatenFood = eatenFood + amount;
        weight = weight + amount;
    }
    public void drink(Double amount) {
        weight = weight + amount;
    }
    public void pee() {
        weight = weight - 2;
        System.out.println("Cat pee pee");
    }
    public Double getWeight()
    {
        return weight;
    }
    public String getStatus() {
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

    public Double eatenFood() {
        return this.eatenFood;
    }

    public static int getCount() {
        return count;
    }
}
