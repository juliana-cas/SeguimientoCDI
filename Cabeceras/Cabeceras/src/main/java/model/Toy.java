package model;

import jakarta.enterprise.context.SessionScoped;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@SessionScoped
public class    Toy implements Serializable {

    private Long id;
    private String name;
    private Double price;
    private Integer amount;
    private String category;

}
