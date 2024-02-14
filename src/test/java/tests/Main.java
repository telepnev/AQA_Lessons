package tests;

import com.fasterxml.jackson.core.JsonProcessingException;
import models.DogLombok;
import tests.utils.JsonHelper;

import java.util.List;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {

        List<String> childrenDog = List.of("apple", "banana", "orange");
        JsonHelper jsonHelper = new JsonHelper();

        DogLombok dogLombok = DogLombok.builder()
                .name("Stesha")
                .model("Chihua Hua")
                .angry(false)
                .childrenList(childrenDog)
                .build();

        System.out.println("dogLombok = " + dogLombok);
        System.out.println(JsonHelper.toJson(dogLombok));
    }
}
