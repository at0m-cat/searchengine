package searchengine.model;

import jakarta.persistence.*;
import searchengine.enums.Status;

import java.time.LocalDate;

@Entity
@Table(name = "sites")
public class Site {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "status", unique = true, nullable = false)
    private Status status;

    @Column(name = "status_time", nullable = false, columnDefinition = "DATETIME")
    private LocalDate statusTime;

    @Column(name = "last_error", nullable = false, columnDefinition = "TEXT")
    private String lastError;

    @Column(name = "url", nullable = false, columnDefinition = "VARCHAR(255)")
    private String url;

    @Column(name = "name", nullable = false, columnDefinition = "VARCHAR(255)")
    private String name;

}
