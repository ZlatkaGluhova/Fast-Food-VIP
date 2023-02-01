package myProjectFastFood.utils.enums;

public enum MenuType {

    PIZZA(1, "Pizza", "Пица"),
    BUGREG(2, "Burger", "Бургер"),
    DONER(3, "Doner", "Дюнер"),
    TOST(4, "Tost", "Тост"),
    HOT_DOG(5, "Hot dog", "Хотдог"),
    GARNISHES_AND_SAUCES(6, "Garnishes And Sauces", "Гарнитури и сосове"),
    DRINKS(7, "Drinks", "Напитки"),
    DESSERT(8, "Dessert", "Десерти");

    private int number;
    private String typeEN;
    private String typeBG;

    MenuType(int number, String typeEN, String typeBG) {
        this.number = number;
        this.typeEN = typeEN;
        this.typeBG = typeBG;
    }

    public int getNumber() {
        return number;
    }

    public String getTypeEN() {
        return typeEN;
    }

    public String getTypeBG() {
        return typeBG;
    }

    public static boolean checkNumber(int input){
        MenuType[] values = MenuType.values();
        for (int i = 0; i < values.length; i++) {
            if (input == values[i].getNumber()){
                return true;
            }
        }

        return false;
    }
}
