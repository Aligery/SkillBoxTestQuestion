package six;
//- метод возвращающий результат проверки “Жива ли кошка?” можно назвать isAlive(), если кошка жива - мы ожидаем возврат значение true
//- метод возвращающий результат проверки “Есть ли у кошки хвост?” можно назвать hasTail(), если кошка с хвостом - мы ожидаем возврат значение true
public class LoaderExcersiseSix {
    public static void main(String[] args) {
        CatExcersiseSix cat = new CatExcersiseSix();
        System.out.println(cat.isAlive());
        System.out.println(cat.hasTail());
    }
}
