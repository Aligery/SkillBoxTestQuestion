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
public class LoaderExcersiseThree {

    public static void main(String[] args) {
        System.out.println(CatExcersiseThree.getCount());
        CatExcersiseThree cat = new CatExcersiseThree();
        CatExcersiseThree catTwo = new CatExcersiseThree();
        System.out.println(CatExcersiseThree.getCount());
        System.out.println("Кормим первую кошку до смерти");
        while(!cat.isDead()) {
            cat.feed(1.0);
        }
        System.out.println(CatExcersiseThree.getCount());

        //Test for dead cat dont eat
        System.out.println(cat.getWeight());
        cat.feed(10000.0);
        System.out.println(cat.getWeight());
    }

}
