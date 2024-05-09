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
public class Sale implements Serializable {
    private Long idSale;
    private Long idToy;
    private Long idClient;
    private Long idEmployee;
}
