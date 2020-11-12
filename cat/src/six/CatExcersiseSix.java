package six;
//- Создать у кошки переменную в которой хранится окрас, написать геттер и сеттер для окраса.
//- метод возвращающий результат проверки “Жива ли кошка?” можно назвать isAlive(),
//  если кошка жива - мы ожидаем возврат значение true
//- метод возвращающий результат проверки “Есть ли у кошки хвост?” можно назвать hasTail(),
//  если кошка с хвостом - мы ожидаем возврат значение true
public class CatExcersiseSix {
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;

    private String color;
    private boolean tail;

    public CatExcersiseSix()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        tail = true;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAlive() {
        return getStatus().equalsIgnoreCase("Sleeping") || getStatus().equalsIgnoreCase("Playing");
    }

    public boolean hasTail() {
        return tail;
    }
}
