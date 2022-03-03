package dev.vitorpaulo.somestore.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id @GeneratedValue
    private Long id;

    private String name;

    private String email;

    private String password;

    @OneToOne
    private PersonalInfo personalInfo;

    @OneToOne
    private Address address;

    private Date createdAt;

    private Date lastLogin;

}
