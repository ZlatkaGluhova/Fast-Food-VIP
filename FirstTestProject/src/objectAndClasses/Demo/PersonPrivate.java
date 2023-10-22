package objectAndClasses.Demo;

public class PersonPrivate {
    public String cityPublic; // само тази може да бъде извикана чрез инстанция на класа (без направени гетъри и сетъри) ->
                              // PersonPrivate personPrivate = new PersonPrivate(); -> personPrivate.cityPublic
    private String cityPrivate; //тази може да бъде извикана през инстанция на класа (с гетъри и сетъри - без конструктор) ->personPrivate.getCityPrivate(); personPrivate.setCityPrivate();
    public static String cityPublicStatic; //само тази може да бъде извикана от main директно чрез класа. -> PersonPrivate.cityPublicStatic
    private static String cityPrivateStatic; //тази може да бъде извикана през името на класа (с гетъри и сетъри - без конструктор) -> PersonPrivate.getCityPrivateStatic();



    public String getCityPrivate() {
        return cityPrivate;
    }

    public void setCityPrivate(String cityPrivate) {
        this.cityPrivate = cityPrivate;
    }

    public static String getCityPrivateStatic() {
        return cityPrivateStatic;
    }

    public static void setCityPrivateStatic(String cityPrivateStatic) {
        PersonPrivate.cityPrivateStatic = cityPrivateStatic;
    }
}
