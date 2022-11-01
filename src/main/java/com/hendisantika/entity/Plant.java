package com.hendisantika.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.NaturalId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-keycloak5
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/1/22
 * Time: 08:03
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "plant")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Plant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @NaturalId()
    @Column(name = "name")
    private String name;
    @NaturalId()
    @Column(name = "scientificName")
    private String scientificName;
    @Column(name = "family")
    private String family;
    @Column(name = "createdAt")
    private Instant createdAt = Instant.now();

    public Plant() {
        this.createdAt = Instant.now();
    }

    public Plant(String name, String scientificName, String family) {
        this.name = name;
        this.scientificName = scientificName;
        this.family = family;
        this.createdAt = Instant.now();
    }
}
