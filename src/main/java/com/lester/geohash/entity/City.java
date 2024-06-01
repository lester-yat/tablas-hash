package com.lester.geohash.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cities")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
    
    private Long state_id;
    private String state_code;
    private Long country_id;
    private String country_code;
    private Double latitude;
    private Double longitude;
    private String created_at;
    private String updated_at;
    
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
    public Long getState_id() {
        return state_id;
    }
    public void setState_id(Long state_id) {
        this.state_id = state_id;
    }
    public String getState_code() {
        return state_code;
    }
    public void setState_code(String state_code) {
        this.state_code = state_code;
    }
    public Long getCountry_id() {
        return country_id;
    }
    public void setCountry_id(Long country_id) {
        this.country_id = country_id;
    }
    public String getCountry_code() {
        return country_code;
    }
    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }
    public Double getLatitude() {
        return latitude;
    }
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
    public Double getLongitude() {
        return longitude;
    }
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
    public String getCreated_at() {
        return created_at;
    }
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
    public String getUpdated_at() {
        return updated_at;
    }
    public void setUpdated_at(String updated_at) {
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