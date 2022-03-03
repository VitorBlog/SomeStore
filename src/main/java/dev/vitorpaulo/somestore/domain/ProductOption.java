package dev.vitorpaulo.somestore.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductOption {

    @Id @GeneratedValue
    private Long id;

    private String name;

    private String colorCode;

    private Boolean defaultOption;

}
