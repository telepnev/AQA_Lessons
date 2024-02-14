package models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class DogLombok {
    private String name;
    private String model;
    private Boolean angry;
    private List<String> childrenList;
}
