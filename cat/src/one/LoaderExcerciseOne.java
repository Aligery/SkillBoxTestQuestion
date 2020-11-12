package one;
//Создать 5-7 кошек и вызвать у них различные методы:
//
//- напечатайте в консоль вес созданных кошек
//- покормите 2 кошки и после этого распечатать их вес (убедитесь что вес изменился)
//- перекормите кошку
//- "замяукайте" кошку до смерти
public class LoaderExcerciseOne {

    public static void main(String[] args) {
        CatExcersiseOne catOne      = new CatExcersiseOne();
        CatExcersiseOne catTwo      = new CatExcersiseOne();
        CatExcersiseOne catThree    = new CatExcersiseOne();
        CatExcersiseOne catFour     = new CatExcersiseOne();
        CatExcersiseOne catFive     = new CatExcersiseOne();
        CatExcersiseOne catSix      = new CatExcersiseOne();

        System.out.println("Вес кошки 1: " + catOne.getWeight());
        System.out.println("Вес кошки 2: " + catTwo.getWeight());
        System.out.println("Вес кошки 3: " + catThree.getWeight());
        System.out.println("Вес кошки 4: " + catFour.getWeight());
        System.out.println("Вес кошки 5: " + catFive.getWeight());
        System.out.println("Вес кошки 6: " + catSix.getWeight());
        catOne.feed(5.0);
        catTwo.feed(5.0);
        System.out.println("Вес кошки 1 после кормежки: " + catOne.getWeight());
        System.out.println("Вес кошки 2 после кормежки: " + catTwo.getWeight());

        while(!catThree.getStatus().equalsIgnoreCase("exploded")) {
            catThree.feed(1.0);
            if (catThree.getStatus().equalsIgnoreCase("exploded")) {
                System.out.println("Кошку 3 закормили до смерти. Она взорвалась");
            }
        }

        while(!catFour.getStatus().equalsIgnoreCase("Dead")) {
            catFour.meow();
            if (catFour.getStatus().equalsIgnoreCase("Dead")) {
                System.out.println("Кошку 4 замяукали до смерти");
            }
        }

    }
}
