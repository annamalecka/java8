package com.company;

import java.util.*;

import static java.util.stream.Collectors.toList;

//zwraca null, a nie max i min - sprawdzić dlaczego

public class Main {

    public static void main(String[] args) {


        List<Dish> dishes = Arrays.asList(
                new Dish("Pizza", false, 900),
                new Dish("Burrito", false, 650),
                new Dish("Kaszanka", false, 469),
                new Dish("Kurczak z ryzem", false, 714),
                new Dish("Hummus", true, 230),
                new Dish("Makaron Andrea", true, 15),
                new Dish("Apple Pie", true, 200),
                new Dish("Chleb ze smalcem", false, 350)
        );

        //dishes.forEach(System.out::println);

        sortByCalories(dishes).forEach(System.out::println);

        getNames(dishes).forEach(System.out::println);

        System.out.println(amountAfterCalories(dishes));
    }

    public static List<Dish> sortByCalories(List<Dish> dishes) {
        return dishes.stream()
                .sorted((o1, o2) -> o2.getCalories() - o1.getCalories())
                .collect(toList());
    }

    public static List<String> getNames(List<Dish> dishes) {
        return dishes.stream()
                .map(Dish::getName)
                .sorted()
                .collect(toList());
    }

    public static Integer amountAfterCalories(List<Dish> dishes) {
        return dishes.stream()
                .map(Dish::getCalories)
                .reduce(0, (element,suma) -> element + suma);
                }

/*

        //getResultChangeFunction(Function<List<Integer>, Integer>, Consumer<Integer>);

        List<String> strings = new ArrayList<>(Arrays.asList("true"," ", "Value2"," ","Value3"));

        //referencja do metody
        strings.forEach(System.out::println);
        //removeIF przelatuje po liście stringów
        strings.removeIf(s -> s.isEmpty() );
        //forEach dla każdego elementu listy zamienia na wielkie litery
        strings.forEach((all) -> System.out.println(all.toUpperCase()) );

        for (String s : strings) {
            System.out.println(s);

            }

        List<Integer> ints = Arrays.asList(100, 128, 320, 0, -40);

      // runTask(() -> System.out.println("Lambda, hello"));

        //getResult i getResult z lambdą

       // System.out.println("Min: " );
       // getResult(ints, new MinOperation());


        System.out.println("Min: " );
        getResult(ints, integers -> {
                    Integer min = Integer.MAX_VALUE;
                    for (Integer i : integers) {
                        if (i < min)
                            min = i;
                    }

                    return min;
                });

      //  System.out.println("Max: " );
      //  getResult(ints, new MaxOperiation());

        System.out.println("Max: " );
        getResult(ints, integers -> {
            Integer max = Integer.MIN_VALUE;
            for (Integer i : integers) {
                if (i > max)
                    max = i;
            }

            return max;
        });




        MathOperiation maxValue = new MaxOperiation();
        System.out.println("Max value is: " + maxValue.calculate(ints));

        MathOperiation minValue = new MinOperation();
        System.out.println("Min value is: " + minValue.calculate(ints));
    }

    public static void runTask (Runnable runnable) {
        runnable.run();
    }

    public static void getResult (List<Integer> ints, MathOperiation mathOperiation) {
        Integer result = mathOperiation.calculate(ints);
        System.out.println(result);
    }
//metoda apllay wywołuje, metoda accept
    public static void getResultChangeFunction (List<Integer> ints, Function<List<Integer>, Integer> f, Consumer<Integer> c) {
            Integer result = f.apply(ints);
            c.accept(result);
    }

    //piszę metodę, która coś zrobi z intigerem
    Function<List<Integer>, Integer> min = l -> {
        Integer min = Integer.MAX_VALUE;
        for (Integer i : l) {
            if (i < min)
                min = i;
        }

        return min;

    };
    //tu jest konsument czyli rezultat
    Consumer<Integer> printer = z -> System.out.println(z);

    public static void getValueOfLitters() {
//Function <T,R> mapowanie danych do innego typu
        Function<List<String>, List<Integer>> lengths = list -> {
            List<Integer> result = new ArrayList<>();
            list.forEach(s -> result.add(s.length()));
            return result;
        };
       // System.out.println(lengths.apply(s));

    }*/

}
