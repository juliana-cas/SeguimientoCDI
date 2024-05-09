package model;

import jakarta.enterprise.context.SessionScoped;
import lombok.*;

import java.io.Serializable;
import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@SessionScoped
public class Client implements Serializable {

    private Long idClient;
    private String name;
    private String email;
    private int telephone;
    private Date birthDate;
}
