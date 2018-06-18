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
        "address",
        "distance",
        "type"
})
public class ATMLocation {

    @JsonProperty("address")
    private Address address;
    @JsonProperty("distance")
    private Integer distance;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The address
     */
    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    /**
     * @param address The address
     */
    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * @return The distance
     */
    @JsonProperty("distance")
    public Integer getDistance() {
        return distance;
    }

    /**
     * @param distance The distance
     */
    @JsonProperty("distance")
    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    /**
     * @return The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * @param type The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
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
        return "INGAtmLocation{" +
                "address=" + address +
                ", distance=" + distance +
                ", type='" + type + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}