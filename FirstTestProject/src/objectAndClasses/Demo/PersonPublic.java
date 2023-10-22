package objectAndClasses.Demo;

public class PersonPublic {
    public String namePublic; // само тази може да бъде извикана чрез инстанция на класа (без направени гетъри и сетъри) ->
                              // PersonPublic personPublic = new PersonPublic(); -> personPublic.namePublic
    private String namePrivate; //тази може да бъде извикана през инстанция на класа (с гетъри и сетъри - без конструктор) -> personPublic.getNamePrivate(); personPublic.setNamePrivate();
    public static final String NAME_PUBLIC_STATIC = ""; //само тази може да бъде извикана от main директно чрез класа. -> PersonPublic.namePublicStatic
    private static String namePrivateStatic; // тази може да се извиква директно през името на класа.

    public String getNamePrivate() {
        return namePrivate;
    }

    public void setNamePrivate(String namePrivate) {
        this.namePrivate = namePrivate;
    }

    public static String getNamePrivateStatic() {
        return namePrivateStatic;
    }

    public static void setNamePrivateStatic(String namePrivateStatic) {
        PersonPublic.namePrivateStatic = namePrivateStatic;
    }
}
