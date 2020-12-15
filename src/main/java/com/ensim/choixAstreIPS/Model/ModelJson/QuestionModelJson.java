package com.ensim.choixAstreIPS.Model.ModelJson;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "index",
        "intitule",
        "motsCles",
        "coeff"
})
public class QuestionModelJson {

    @JsonProperty("index")
    private Integer index;
    @JsonProperty("intitule")
    private String intitule;
    @JsonProperty("motsCles")
    private List<MotsCleJson> motsCles = null;
    @JsonProperty("coeff")
    private Double coeff;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("index")
    public Integer getIndex() {
        return index;
    }

    @JsonProperty("index")
    public void setIndex(Integer index) {
        this.index = index;
    }

    @JsonProperty("intitule")
    public String getIntitule() {
        return intitule;
    }

    @JsonProperty("intitule")
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    @JsonProperty("motsCles")
    public List<MotsCleJson> getMotsCles() {
        return motsCles;
    }

    @JsonProperty("motsCles")
    public void setMotsCles(List<MotsCleJson> motsCles) {
        this.motsCles = motsCles;
    }

    @JsonProperty("coeff")
    public Double getCoeff() {
        return coeff;
    }

    @JsonProperty("coeff")
    public void setCoeff(Double coeff) {
        this.coeff = coeff;
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