package objectAndClasses.Demo;

import myProjectFastFood.model.Order;
import myProjectFastFood.model.Pizza;

import javax.lang.model.element.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DemoMain {
    public static void main(String[] args) {

        printTextStatic(); // този метод се извиква без инстанция на класа
        DemoMain nonStatic = new DemoMain();
        nonStatic.printTextNonStatic(); // този метод се извиква С инстанция на класа
        System.out.println(PersonPublic.NAME_PUBLIC_STATIC); // извикват се без конструктор, гетъри и сетъри
        System.out.println(PersonPrivate.cityPublicStatic); // извикват се без конструктор, гетъри и сетъри

        List<Integer> numbers = new ArrayList<>();


        PersonPublic personPublic = new PersonPublic();
        System.out.println(personPublic.namePublic); // само тази може да бъде извикана чрез инстанция на класа (без направени гетъри и сетъри)
        PersonPrivate personPrivate = new PersonPrivate();
        System.out.println(personPrivate.cityPublic); // само тази може да бъде извикана чрез инстанция на класа (без направени гетъри и сетъри)
        personPublic.getNamePrivate();
        personPublic.setNamePrivate("Name"); //тази може да бъде извикана през инстанция на класа (с гетъри и сетъри - без конструктор)
        personPrivate.getCityPrivate();
        personPrivate.setCityPrivate("City"); //тази може да бъде извикана през инстанция на класа (с гетъри и сетъри - без конструктор)
        PersonPublic.getNamePrivateStatic();
        PersonPublic.setNamePrivateStatic("Name"); //тази може да бъде извикана директно през името на класа (с гетъри и сетъри - без конструктор)
        PersonPrivate.getCityPrivateStatic();
        PersonPrivate.setCityPrivateStatic("City"); //тази може да бъде извикана директно през името на класа (с гетъри и сетъри - без конструктор)


    }

    public static void printTextStatic() { // без инстанция
        System.out.println("Static method");
    }

    public void printTextNonStatic() { // с инстанция
        System.out.println("Non-Static method");
    }
}
