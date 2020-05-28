// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The GenericResource model. */
@Fluent
public class GenericResource extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GenericResource.class);

    /*
     * The plan of the resource.
     */
    @JsonProperty(value = "plan")
    private Plan plan;

    /*
     * The resource properties.
     */
    @JsonProperty(value = "properties")
    private Object properties;

    /*
     * The kind of the resource.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /*
     * ID of the resource that manages this resource.
     */
    @JsonProperty(value = "managedBy")
    private String managedBy;

    /*
     * The SKU of the resource.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * The identity of the resource.
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /**
     * Get the plan property: The plan of the resource.
     *
     * @return the plan value.
     */
    public Plan getPlan() {
        return this.plan;
    }

    /**
     * Set the plan property: The plan of the resource.
     *
     * @param plan the plan value to set.
     * @return the GenericResource object itself.
     */
    public GenericResource setPlan(Plan plan) {
        this.plan = plan;
        return this;
    }

    /**
     * Get the properties property: The resource properties.
     *
     * @return the properties value.
     */
    public Object getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: The resource properties.
     *
     * @param properties the properties value to set.
     * @return the GenericResource object itself.
     */
    public GenericResource setProperties(Object properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the kind property: The kind of the resource.
     *
     * @return the kind value.
     */
    public String getKind() {
        return this.kind;
    }

    /**
     * Set the kind property: The kind of the resource.
     *
     * @param kind the kind value to set.
     * @return the GenericResource object itself.
     */
    public GenericResource setKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the managedBy property: ID of the resource that manages this resource.
     *
     * @return the managedBy value.
     */
    public String getManagedBy() {
        return this.managedBy;
    }

    /**
     * Set the managedBy property: ID of the resource that manages this resource.
     *
     * @param managedBy the managedBy value to set.
     * @return the GenericResource object itself.
     */
    public GenericResource setManagedBy(String managedBy) {
        this.managedBy = managedBy;
        return this;
    }

    /**
     * Get the sku property: The SKU of the resource.
     *
     * @return the sku value.
     */
    public Sku getSku() {
        return this.sku;
    }

    /**
     * Set the sku property: The SKU of the resource.
     *
     * @param sku the sku value to set.
     * @return the GenericResource object itself.
     */
    public GenericResource setSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the identity property: The identity of the resource.
     *
     * @return the identity value.
     */
    public Identity getIdentity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the resource.
     *
     * @param identity the identity value to set.
     * @return the GenericResource object itself.
     */
    public GenericResource setIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getPlan() != null) {
            getPlan().validate();
        }
        if (getSku() != null) {
            getSku().validate();
        }
        if (getIdentity() != null) {
            getIdentity().validate();
        }
    }
}
