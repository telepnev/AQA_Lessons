package models;

import java.util.List;

public record PeoplWithHobbi(String name, Integer age, String sex, List<String> hobi) {
}
