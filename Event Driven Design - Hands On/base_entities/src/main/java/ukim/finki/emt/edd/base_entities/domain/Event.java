package ukim.finki.emt.edd.base_entities.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event<T> {
    private String message;
    private String status;
    private T object;
}
