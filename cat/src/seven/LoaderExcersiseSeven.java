package seven;
//Создать у кошки метод создания её “глубокой” копии. Для создания копии кошки вы можете использовать метод копирования или конструктор копирования.
public class LoaderExcersiseSeven {
    public static void main(String[] args) {

        CatExcersiseSeven cat = new CatExcersiseSeven();
        CatExcersiseSeven copyCat = new CatExcersiseSeven(cat);
        System.out.println(cat.getWeight());
        System.out.println(copyCat.getWeight());
        cat.feed(1.0);
        System.out.println(cat.getWeight());
        System.out.println(copyCat.getWeight());

    }
}
