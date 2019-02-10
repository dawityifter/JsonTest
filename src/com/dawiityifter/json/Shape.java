
package com.dawiityifter.json;
import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties({"handle"})
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "iri")
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
public abstract class Shape {
    private String iri;

    public String getIri() {
        return iri;
    }

    public void setIri(String iri) {
        this.iri = iri;
    }
}
