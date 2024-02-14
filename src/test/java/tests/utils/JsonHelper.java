package tests.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonHelper {
    private static final ObjectMapper mapper = new ObjectMapper();

    //создаем метод, который будет читать файл и превращать json в обьект
    public static <T> T fromJson(String jsonPath, Class<T> out)  {
        try {
           return mapper.readValue(new File(jsonPath), out);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // превращает обьект в json
    public static String toJson(Object o) throws JsonProcessingException {
       return mapper.writeValueAsString(o);
    }
}
