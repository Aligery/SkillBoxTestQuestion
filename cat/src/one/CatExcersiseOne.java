package one;
//Создать 5-7 кошек и вызвать у них различные методы:
//
//- напечатайте в консоль вес созданных кошек
//- покормите 2 кошки и после этого распечатать их вес (убедитесь что вес изменился)
//- перекормите кошку
//- "замяукайте" кошку до смерти
public class CatExcersiseOne {

    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;

    public CatExcersiseOne()
    {
        weight = 1500.0 + 3000.0 * Math.random();
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
