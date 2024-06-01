package com.lester.geohash.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "countries")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
    
    private char iso3;
    private char numeric_code;
    private char iso2;
    private String phonecode;
    private String capital;
    private String currency;
    private String currency_name;
    private String currency_symbol;
    private String tld;
    private String nativ;
    private String region;
    private Long region_id;
    private String subregion;
    private Long subregion_id;
    private String nationality;
    private String timezones;
    private String translations;
    private Double latitude;
    private Double longitude;
    private String emoji;
    private String emojiU;
    
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
    public char getIso3() {
        return iso3;
    }
    public void setIso3(char iso3) {
        this.iso3 = iso3;
    }
    public char getNumeric_code() {
        return numeric_code;
    }
    public void setNumeric_code(char numeric_code) {
        this.numeric_code = numeric_code;
    }
    public char getIso2() {
        return iso2;
    }
    public void setIso2(char iso2) {
        this.iso2 = iso2;
    }
    public String getPhonecode() {
        return phonecode;
    }
    public void setPhonecode(String phonecode) {
        this.phonecode = phonecode;
    }
    public String getCapital() {
        return capital;
    }
    public void setCapital(String capital) {
        this.capital = capital;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getCurrency_name() {
        return currency_name;
    }
    public void setCurrency_name(String currency_name) {
        this.currency_name = currency_name;
    }
    public String getCurrency_symbol() {
        return currency_symbol;
    }
    public void setCurrency_symbol(String currency_symbol) {
        this.currency_symbol = currency_symbol;
    }
    public String getTld() {
        return tld;
    }
    public void setTld(String tld) {
        this.tld = tld;
    }
    public String getNativ() {
        return nativ;
    }
    public void setNativ(String nativ) {
        this.nativ = nativ;
    }
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public Long getRegion_id() {
        return region_id;
    }
    public void setRegion_id(Long region_id) {
        this.region_id = region_id;
    }
    public String getSubregion() {
        return subregion;
    }
    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }
    public Long getSubregion_id() {
        return subregion_id;
    }
    public void setSubregion_id(Long subregion_id) {
        this.subregion_id = subregion_id;
    }
    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public String getTimezones() {
        return timezones;
    }
    public void setTimezones(String timezones) {
        this.timezones = timezones;
    }
    public String getTranslations() {
        return translations;
    }
    public void setTranslations(String translations) {
        this.translations = translations;
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
    public String getEmoji() {
        return emoji;
    }
    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }
    public String getEmojiU() {
        return emojiU;
    }
    public void setEmojiU(String emojiU) {
        this.emojiU = emojiU;
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
