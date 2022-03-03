package dev.vitorpaulo.somestore.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Comment {

    @Id @GeneratedValue
    private Long id;

    private String title;

    @Lob
    private String content;

    @OneToOne
    private Product product;

    @OneToOne
    private User author;

    @ManyToOne
    private Comment parent;

    private Date createdAt;

    private Date lastUpdate;

}
