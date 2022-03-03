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
public class Product {

    @Id @GeneratedValue
    private Long id;

    private String name;

    @Lob
    private String description;

    @ManyToMany
    private List<Category> categories;

    @OneToMany
    private List<ProductImage> images;

    @OneToMany
    private List<ProductOption> productOptions;

    private Date createdAt;

    private Date lastUpdate;

}
