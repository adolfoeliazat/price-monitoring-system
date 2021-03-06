package com.bihju.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.PersistenceConstructor;

import javax.persistence.*;

@Entity
@Data
@RequiredArgsConstructor(onConstructor = @__(@PersistenceConstructor))
@Table(name = "user", indexes = {@Index(name = "index_email", columnList = "email", unique = true)})
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class User {
    public enum NotificationType {
        INSTANT, DAILY;
    }

    @Id
    @GeneratedValue
    private long id;

    private String email;
    private String password;
    private NotificationType notificationType = NotificationType.INSTANT;
    private long createTime;
    private long updateTime;
}
