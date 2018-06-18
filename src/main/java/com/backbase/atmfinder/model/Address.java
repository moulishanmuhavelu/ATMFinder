package com.backbase.atmfinder.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "street",
        "housenumber",
        "postalcode",
        "city",
        "geoLocation"
})
public class Address {



    @JsonProperty("street")
    private String street;
    @JsonProperty("housenumber")
    private String housenumber;
    @JsonProperty("postalcode")
    private String postalcode;
    @JsonProperty("city")
    private String city;
    @JsonProperty("geoLocation")
    private GeoLocation geoLocation;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The street
     */
    @JsonProperty("street")
    public String getStreet() {
        return street;
    }

    /**
     *
     * @param street
     * The street
     */
    @JsonProperty("street")
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     *
     * @return
     * The housenumber
     */
    @JsonProperty("housenumber")
    public String getHousenumber() {
        return housenumber;
    }

    /**
     *
     * @param housenumber
     * The housenumber
     */
    @JsonProperty("housenumber")
    public void setHousenumber(String housenumber) {
        this.housenumber = housenumber;
    }

    /**
     *
     * @return
     * The postalcode
     */
    @JsonProperty("postalcode")
    public String getPostalcode() {
        return postalcode;
    }

    /**
     *
     * @param postalcode
     * The postalcode
     */
    @JsonProperty("postalcode")
    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    /**
     *
     * @return
     * The city
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     *
     * @param city
     * The city
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     *
     * @return
     * The geoLocation
     */
    @JsonProperty("geoLocation")
    public GeoLocation getGeoLocation() {
        return geoLocation;
    }

    /**
     *
     * @param geoLocation
     * The geoLocation
     */
    @JsonProperty("geoLocation")
    public void setGeoLocation(GeoLocation geoLocation) {
        this.geoLocation = geoLocation;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", housenumber='" + housenumber + '\'' +
                ", postalcode='" + postalcode + '\'' +
                ", city='" + city + '\'' +
                ", geoLocation=" + geoLocation +
                ", additionalProperties=" + additionalProperties +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(street, address.street) &&
                Objects.equals(housenumber, address.housenumber) &&
                Objects.equals(postalcode, address.postalcode) &&
                Objects.equals(city, address.city) &&
                Objects.equals(geoLocation, address.geoLocation) &&
                Objects.equals(additionalProperties, address.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, housenumber, postalcode, city, geoLocation, additionalProperties);
    }
}