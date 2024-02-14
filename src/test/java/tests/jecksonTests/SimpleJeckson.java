package tests.jecksonTests;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import models.Cat;
import models.PeoplWithHobbi;
import models.People;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.utils.JsonHelper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SimpleJeckson {

    @Test
    @SneakyThrows //  отвечает за обратботку ошибок (эксепшенов)
    @DisplayName("Работа с ")
    void jecksonsTest() {

        // Читаем из файла
        File file = new File("src/test/resources/petruha.json");
        ObjectMapper objectMapper = new ObjectMapper();
        // приобразуем в обьект, если обьект и файл по полям расходятся хотя бы на один символ,
        // то работать не буте
        People people = objectMapper.readValue(file, People.class);
        System.out.println("people.name() = " + people.name());


        // запись в Json формате
        People sasha = new People("Sasha", 12, "female");
        String sashaJson = objectMapper.writeValueAsString(sasha);

        System.out.println(sashaJson);

    }

    @Test
    @SneakyThrows //  отвечает за обратботку ошибок (эксепшенов)
    @DisplayName("Работа с ")
    void listJsonTest() {

        // Читаем из файла
        File file = new File("src/test/resources/hobiPeople.json");
        ObjectMapper objectMapper = new ObjectMapper();
        List<String> myHobi = List.of("apple", "banana", "orange");

        // запись в Json формате
        PeoplWithHobbi gora = new PeoplWithHobbi("Gora", 21, "male",myHobi);
        String goraJson = objectMapper.writeValueAsString(gora);
        System.out.println(goraJson);

        PeoplWithHobbi hubiPeopl = objectMapper.readValue(file, PeoplWithHobbi.class);

        System.out.println("hubiPeopl.hobi().isEmpty() = " + hubiPeopl.hobi());
    }

    @Test
    @SneakyThrows //  отвечает за обратботку ошибок (эксепшенов)
    @DisplayName("Работа с ")
    void catsTest() {
        Cat cat = JsonHelper.fromJson("src/test/resources/Cat.json", Cat.class);
        People people = JsonHelper.fromJson("src/test/resources/petruha.json", People.class);
        PeoplWithHobbi hubiPeopl = JsonHelper.fromJson("src/test/resources/hobiPeople.json", PeoplWithHobbi.class);

        //  json to object
        System.out.println("cat = " + cat);
        System.out.println("people = " + people);
        System.out.println("hubiPeopl = " + hubiPeopl);

        // object to json
        System.out.println("cat = " + JsonHelper.toJson(cat));
        System.out.println("people = " + JsonHelper.toJson(people));
        System.out.println("hubiPeopl = " + JsonHelper.toJson(hubiPeopl));




    }
}
