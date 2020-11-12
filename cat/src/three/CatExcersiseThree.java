package three;

//**Урок 3. Статические методы и переменные**
//
//- Создать у класса Cat статическую переменную count, которая будет увеличиваться, если кошку создали,
//  и убывать, если кошка взорвалась или умерла
//- Создать статический метод getCount(), который будет возвращать количество кошек
//
//**Задание c *:** придумайте способ проверять жива ли кошка или нет на основе
// значения ее веса, и используя это запретите кормить, пить,
// ходить в туалет неживой кошке.
public class CatExcersiseThree {

    private static int count = 0;

    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;

    public CatExcersiseThree() {
        count++;
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;

    }

    public void meow() {
        if (!isDead()) {
            weight = weight - 1;
            System.out.println("Meow");
            if (isDead()) {
                count--;
            }
        }
    }

    public void feed(Double amount) {
        if (!isDead()) {
            weight = weight + amount;
            if (isDead()) {
                count--;
            }
        }
    }

    public void drink(Double amount) {
        if (!isDead()) {
            weight = weight + amount;
            if (isDead()) {
                count--;
            }
        }
    }

    public Double getWeight() {
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

    public static int getCount() {
        return count;
    }

    public boolean isDead() {
        return getStatus().equalsIgnoreCase("Dead") || getStatus().equalsIgnoreCase("Exploded");
    }

}
