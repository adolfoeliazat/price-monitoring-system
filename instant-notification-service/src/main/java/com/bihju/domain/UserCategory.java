package com.bihju.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "user_category", indexes = {@Index(name = "index_user_id_category_id", columnList = "userId, categoryId", unique = true)})
public class UserCategory {
    @Id
    @GeneratedValue
    private long id;

    private long userId;
    private long categoryId;
    private long createTime;
    private long updateTime;
}
