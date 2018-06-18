package com.backbase.atmfinder.model;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "lat",
        "lng"
})
public class GeoLocation {

    @JsonProperty("lat")
    private String lat;
    @JsonProperty("lng")
    private String lng;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The lat
     */
    @JsonProperty("lat")
    public String getLat() {
        return lat;
    }

    /**
     * @param lat The lat
     */
    @JsonProperty("lat")
    public void setLat(String lat) {
        this.lat = lat;
    }

    /**
     * @return The lng
     */
    @JsonProperty("lng")
    public String getLng() {
        return lng;
    }

    /**
     * @param lng The lng
     */
    @JsonProperty("lng")
    public void setLng(String lng) {
        this.lng = lng;
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
        return "GeoLocation{" +
                "lat='" + lat + '\'' +
                ", lng='" + lng + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        GeoLocation that = (GeoLocation) o;
//        return Objects.equals(lat, that.lat) &&
//                Objects.equals(lng, that.lng) &&
//                Objects.equals(additionalProperties, that.additionalProperties);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(lat, lng, additionalProperties);
//    }
}
