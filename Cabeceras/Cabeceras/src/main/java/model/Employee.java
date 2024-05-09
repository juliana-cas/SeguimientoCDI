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
public class Employee implements Serializable {
    private Long idEmployee;
    private String name;
    private String email;
    private int telephone;
}
