package dev.vitorpaulo.somestore.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Category {

    @Id @GeneratedValue
    private Long id;

    private String name;

    @ManyToOne
    private Category parent;

    private Date createdAt;

    private Date lastUpdate;

}
