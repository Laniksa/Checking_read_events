package com.company;

public class Main {
    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Начало", 2010, 16),
                new Movie("Конец", 2011, 10),
                new Movie("Середина", 2012, 18),


        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Анна Каренина", 2017, 16),
                new Theatre("Анна Иванова", 2018, 10),
                new Theatre("Анна Сидорова", 2019, 18),

        };
    }
    public static void validEvent(Event event){
       if (event.title == null || event.releaseYear == 0 || event.age == 0){
           throw new RuntimeException("Все поля должны быть заполнены");
       }

    }
    public static void main(String[] args) {
        for (Event event: getMovies()) {
            validEvent(event);
        }
        for (Event event: getTheatres()) {
            validEvent(event);
        }
        System.out.println("Все события корректны");
    }
}
