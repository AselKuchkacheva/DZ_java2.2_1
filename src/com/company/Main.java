package com.company;

public class Main {

    public static void main(String[] args) {
        /*b)  Создать 2х уровневую иерархию из 4х классов (1й - родитель --> 2й, 3й, 4й - дочерние, с отличающимися полями).

      c)  Создать Интерфейс Printable с методом void print();

      d)  Реализовать интерфейс Printable классами 2й, 3й и 4й, переопределить метод интерфейса так
          чтобы он распечатывал всю информацию о свойствах объекта.

      e)  В классе Main создать возвращаемый метод createObject(String className),
          который умеет создавать объекты класса 2й, 3й и 4й и после создания и
          задания свойств объекту метод возвращает ссылку на объект (пульт). Можно использовать switch для того
          чтоб определить какого типа нужно создать экземпляр объекта. Например если в параметре передается “2й” метод
          должен создать объект именно этого типа.

      f)  В главном классе Main создать 3 различных объекта классов 2й, 3й и 4й
          с помощью метода createOcject, и распечатать по ним информацию методом print();*/

        SwimmingPool swimmingPool1 = new SwimmingPool("Лазурь", 2, SwimmingPoolCategory.SPORTS);
        swimmingPool1.print();

        Gym gym1 = new Gym("Сила", 1, GymKlass.TRAINING);
        gym1.print();

        Restaurant restaurant = new Restaurant("У бабушки", 2, 4, RestaurantCategory.HIGH);
        restaurant.print();

        Printable swimming = createObject(NameOfCenters.ЛАЗУРЬ);
        swimming.print();
        Printable gym = createObject(NameOfCenters.СИЛА);
        gym.print();
        Printable rest = createObject(NameOfCenters.У_БАБУШКИ);
        rest.print();


    }

    private  static Printable createObject(NameOfCenters className) {

        Printable toReturn = null;
        switch (className){
            case ЛАЗУРЬ:
                toReturn = new SwimmingPool("Лазурь", 2, SwimmingPoolCategory.INDIVIDUAL);
                break;
            case СИЛА:
                toReturn = new Gym("Сила", 1, GymKlass.КАРДИОТРЕНАЖЕРЫ);
                break;
            case У_БАБУШКИ:
                toReturn = new Restaurant("У бабушки", 2, 4, RestaurantCategory.LUX);
                break;

        } return toReturn;

    }
}
