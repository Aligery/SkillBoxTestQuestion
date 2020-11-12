package two;
//- Создать в классе Cat метод, который будет возвращать сумму съеденной еды текущей кошки
//- Создать в классе Cat метод “сходить в туалет” pee(), который будет уменьшать вес кошки и что-нибудь печатать.
public class LoaderExcersiseTwo {
    public static void main(String[] args) {
        CatExcersiseTwo cat = new CatExcersiseTwo();
        cat.feed(150.00);
        cat.pee();
        cat.pee();
        cat.pee();
        System.out.println("Вес съеденного корма кошкой: " + cat.eatenFood());
    }
}
