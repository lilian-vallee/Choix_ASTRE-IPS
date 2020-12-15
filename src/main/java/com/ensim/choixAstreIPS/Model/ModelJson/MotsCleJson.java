package com.ensim.choixAstreIPS.Model.ModelJson;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "mot",
        "astre",
        "ips"
})
public class MotsCleJson {

    @JsonProperty("mot")
    private String mot;
    @JsonProperty("astre")
    private Integer astre;
    @JsonProperty("ips")
    private Integer ips;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("mot")
    public String getMot() {
        return mot;
    }

    @JsonProperty("mot")
    public void setMot(String mot) {
        this.mot = mot;
    }

    @JsonProperty("astre")
    public Integer getAstre() {
        return astre;
    }

    @JsonProperty("astre")
    public void setAstre(Integer astre) {
        this.astre = astre;
    }

    @JsonProperty("ips")
    public Integer getIps() {
        return ips;
    }

    @JsonProperty("ips")
    public void setIps(Integer ips) {
        this.ips = ips;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}