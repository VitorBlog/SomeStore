package dev.vitorpaulo.somestore.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductImage {

    @Id @GeneratedValue
    private Long id;

    private String fileExtension;

    private Boolean defaultImage;

}
