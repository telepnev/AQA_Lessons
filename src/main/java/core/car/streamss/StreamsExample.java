package core.car.streamss;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        List<String> email = Arrays.asList("evgeny@bk.ru", "evgenyT@bk.com", "evgeny@gmail.com",
                "evgeny@bork.rur",
                "evgeny999@mail.ru", "evgenybk.ru",
                "evgeny@123bk.ru", "evgeny@bk_mail.ru",
                "evgeny@123bk.ru", "evgeny@bk_mail.ru",
                "evgeny@123bk.ru", "evgeny@bk_mail.ru",
                "evgeny@123bk.ru", "evgeny@bk_mail.ru");

        // 1) Берем уникальное значение, ищем по тексту

        List<String> uniq = email.stream().distinct().collect(Collectors.toList());
        // выведет уникальные значения массива
        System.out.println("uniq = " + uniq);

        List<String> gmail = uniq.stream().filter(m -> m.endsWith("@gmail.com"))
                .collect(Collectors.toList());
        System.out.println("gmail = " + gmail);

//        Отфильтруем почту и выведем едиственную и не повторимую найденую запись
        Set<String> uniqMail = email.stream().distinct().filter(m -> m.endsWith("@gmail.com"))
                .collect(Collectors.toSet());
        System.out.println("uniqMail = " + uniqMail);

        // 2) allMatch
//        если вся колекция вернула тру, то будет тру, если хотя бы один элемент вернет фолс то ивсе будет флос

        //      все почты заканчиваются на "@gmail.com"
        boolean isAllEmailEndsWith = email.stream().allMatch(e -> e.endsWith("@gmail.com"));
        //      все почты заканчиваются на "evgeny"
        boolean isAllEmailNotStarsWithEvgen = email.stream().noneMatch(e -> e.endsWith("evgeny"));


        System.out.println("isAllEmailEndsWith = " + isAllEmailEndsWith);
        System.out.println("isAllEmailNotStarsWithEvgen = " + isAllEmailNotStarsWithEvgen);


    }
}
