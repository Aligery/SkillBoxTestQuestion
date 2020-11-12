package five;
//- Создать в классе Cat ещё один конструктор так, чтобы можно было создать кошку с весом переданным в конструктор
//- Создать в главном классе Loader метод генерации котенка 
// private static Cat getKitten(),
// который будет возвращать кошку с весом 1100.00, используя конструктор в который передаем вес кошки, как описано в видеоуроке.
public class LoaderExcersiseFive {

    public static void main(String[] args) {
        System.out.println("Создаем котенка");
        CatExcersiseFive cat = getKiiten();
        System.out.println("Вес котенка: " + cat.getWeight());
    }

    private static CatExcersiseFive getKiiten() {
        return new CatExcersiseFive(1100.0);
    }
}
