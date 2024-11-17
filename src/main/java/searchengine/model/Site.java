package searchengine.model;

import searchengine.enums.Status;

import java.time.LocalDate;

public class Site {

    Long id;
    Status status;
    LocalDate statusTime;
    String lastError;
    String url;
    String name;

}
