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
public class Purchase {

    @Id @GeneratedValue
    private Long id;

    @OneToMany
    private List<Product> products;

    @OneToOne
    private User author;

    @ManyToOne
    private Address address;

    private PurchaseStatus status;

    private Date createdAt;

    private Date lastUpdate;

}
