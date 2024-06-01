package com.lester.geohash.entity;

import java.util.*;
import jakarta.persistence.*;

@Entity
@Table(name = "subregions")
public class Subregion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String translations;
    private Long region_id;
    private Date created_at;
    private Date updated_at;
    private Boolean flag;
    private String wikiDataId;

    // Getters and Setters
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTranslations() {
        return translations;
    }
    public void setTranslations(String translations) {
        this.translations = translations;
    }
    public Long getRegion_id() {
        return region_id;
    }
    public void setRegion_id(Long region_id) {
        this.region_id = region_id;
    }
    public Date getCreated_at() {
        return created_at;
    }
    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }
    public Date getUpdated_at() {
        return updated_at;
    }
    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }
    public Boolean getFlag() {
        return flag;
    }
    public void setFlag(Boolean flag) {
        this.flag = flag;
    }
    public String getWikiDataId() {
        return wikiDataId;
    }
    public void setWikiDataId(String wikiDataId) {
        this.wikiDataId = wikiDataId;
    }
}