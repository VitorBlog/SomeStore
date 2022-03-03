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
public class Address {

    @Id @GeneratedValue
    private Long id;

    private String addressCode;

    private String addressNumber;

}
