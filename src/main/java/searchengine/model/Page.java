package searchengine.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.IdGeneratorType;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pages", indexes = {
        @Index(name = "idx_path", columnList = "path")
})
public class Page {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "site_id", nullable = false)
    private Long siteId;

    @Column(name = "path", nullable = false)
    private String path;

    @Column(name = "code", columnDefinition = "INT", nullable = false)
    private int code;

    @Column(name = "content", columnDefinition = "MEDIUMTEXT", nullable = false)
    private String content;

}
