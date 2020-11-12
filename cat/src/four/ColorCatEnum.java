package four;
//- Создать у кошки константы: “количество глаз”, “минимальный вес” и “максимальный вес”.
//- Создать enum с окрасами кошек.
public enum ColorCatEnum {
    BLACK("Черный"),
    WHITE("Белый"),
    RED("Рыжий"),
    GREY("Серый");

    private String color;

    ColorCatEnum(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}
