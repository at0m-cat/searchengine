package searchengine.model;

import jakarta.persistence.*;
import searchengine.enums.Status;

import java.time.LocalDate;

@Entity
@Table(name = "sites")
public class Site {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "status", unique = true, nullable = false)
    Status status;

    @Column(name = "status_time", nullable = false, columnDefinition = "DATETIME")
    LocalDate statusTime;

    @Column(name = "last_error", nullable = false, columnDefinition = "TEXT")
    String lastError;

    @Column(name = "url", nullable = false, columnDefinition = "VARCHAR(255)")
    String url;

    @Column(name = "name", nullable = false, columnDefinition = "VARCHAR(255)")
    String name;

}
