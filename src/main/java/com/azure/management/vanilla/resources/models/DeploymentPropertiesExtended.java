// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.vanilla.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The DeploymentPropertiesExtended model. */
@Fluent
public final class DeploymentPropertiesExtended {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DeploymentPropertiesExtended.class);

    /*
     * The state of the provisioning.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The correlation ID of the deployment.
     */
    @JsonProperty(value = "correlationId", access = JsonProperty.Access.WRITE_ONLY)
    private String correlationId;

    /*
     * The timestamp of the template deployment.
     */
    @JsonProperty(value = "timestamp", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime timestamp;

    /*
     * The duration of the template deployment.
     */
    @JsonProperty(value = "duration", access = JsonProperty.Access.WRITE_ONLY)
    private String duration;

    /*
     * Key/value pairs that represent deployment output.
     */
    @JsonProperty(value = "outputs")
    private Object outputs;

    /*
     * The list of resource providers needed for the deployment.
     */
    @JsonProperty(value = "providers")
    private List<Provider> providers;

    /*
     * The list of deployment dependencies.
     */
    @JsonProperty(value = "dependencies")
    private List<Dependency> dependencies;

    /*
     * The template content. Use only one of Template or TemplateLink.
     */
    @JsonProperty(value = "template")
    private Object template;

    /*
     * The URI referencing the template. Use only one of Template or
     * TemplateLink.
     */
    @JsonProperty(value = "templateLink")
    private TemplateLink templateLink;

    /*
     * Deployment parameters. Use only one of Parameters or ParametersLink.
     */
    @JsonProperty(value = "parameters")
    private Object parameters;

    /*
     * The URI referencing the parameters. Use only one of Parameters or
     * ParametersLink.
     */
    @JsonProperty(value = "parametersLink")
    private ParametersLink parametersLink;

    /*
     * The deployment mode. Possible values are Incremental and Complete.
     */
    @JsonProperty(value = "mode")
    private DeploymentMode mode;

    /*
     * The debug setting of the deployment.
     */
    @JsonProperty(value = "debugSetting")
    private DebugSetting debugSetting;

    /*
     * The deployment on error behavior.
     */
    @JsonProperty(value = "onErrorDeployment")
    private OnErrorDeploymentExtended onErrorDeployment;

    /**
     * Get the provisioningState property: The state of the provisioning.
     *
     * @return the provisioningState value.
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the correlationId property: The correlation ID of the deployment.
     *
     * @return the correlationId value.
     */
    public String getCorrelationId() {
        return this.correlationId;
    }

    /**
     * Get the timestamp property: The timestamp of the template deployment.
     *
     * @return the timestamp value.
     */
    public OffsetDateTime getTimestamp() {
        return this.timestamp;
    }

    /**
     * Get the duration property: The duration of the template deployment.
     *
     * @return the duration value.
     */
    public String getDuration() {
        return this.duration;
    }

    /**
     * Get the outputs property: Key/value pairs that represent deployment output.
     *
     * @return the outputs value.
     */
    public Object getOutputs() {
        return this.outputs;
    }

    /**
     * Set the outputs property: Key/value pairs that represent deployment output.
     *
     * @param outputs the outputs value to set.
     * @return the DeploymentPropertiesExtended object itself.
     */
    public DeploymentPropertiesExtended setOutputs(Object outputs) {
        this.outputs = outputs;
        return this;
    }

    /**
     * Get the providers property: The list of resource providers needed for the deployment.
     *
     * @return the providers value.
     */
    public List<Provider> getProviders() {
        return this.providers;
    }

    /**
     * Set the providers property: The list of resource providers needed for the deployment.
     *
     * @param providers the providers value to set.
     * @return the DeploymentPropertiesExtended object itself.
     */
    public DeploymentPropertiesExtended setProviders(List<Provider> providers) {
        this.providers = providers;
        return this;
    }

    /**
     * Get the dependencies property: The list of deployment dependencies.
     *
     * @return the dependencies value.
     */
    public List<Dependency> getDependencies() {
        return this.dependencies;
    }

    /**
     * Set the dependencies property: The list of deployment dependencies.
     *
     * @param dependencies the dependencies value to set.
     * @return the DeploymentPropertiesExtended object itself.
     */
    public DeploymentPropertiesExtended setDependencies(List<Dependency> dependencies) {
        this.dependencies = dependencies;
        return this;
    }

    /**
     * Get the template property: The template content. Use only one of Template or TemplateLink.
     *
     * @return the template value.
     */
    public Object getTemplate() {
        return this.template;
    }

    /**
     * Set the template property: The template content. Use only one of Template or TemplateLink.
     *
     * @param template the template value to set.
     * @return the DeploymentPropertiesExtended object itself.
     */
    public DeploymentPropertiesExtended setTemplate(Object template) {
        this.template = template;
        return this;
    }

    /**
     * Get the templateLink property: The URI referencing the template. Use only one of Template or TemplateLink.
     *
     * @return the templateLink value.
     */
    public TemplateLink getTemplateLink() {
        return this.templateLink;
    }

    /**
     * Set the templateLink property: The URI referencing the template. Use only one of Template or TemplateLink.
     *
     * @param templateLink the templateLink value to set.
     * @return the DeploymentPropertiesExtended object itself.
     */
    public DeploymentPropertiesExtended setTemplateLink(TemplateLink templateLink) {
        this.templateLink = templateLink;
        return this;
    }

    /**
     * Get the parameters property: Deployment parameters. Use only one of Parameters or ParametersLink.
     *
     * @return the parameters value.
     */
    public Object getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Deployment parameters. Use only one of Parameters or ParametersLink.
     *
     * @param parameters the parameters value to set.
     * @return the DeploymentPropertiesExtended object itself.
     */
    public DeploymentPropertiesExtended setParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the parametersLink property: The URI referencing the parameters. Use only one of Parameters or
     * ParametersLink.
     *
     * @return the parametersLink value.
     */
    public ParametersLink getParametersLink() {
        return this.parametersLink;
    }

    /**
     * Set the parametersLink property: The URI referencing the parameters. Use only one of Parameters or
     * ParametersLink.
     *
     * @param parametersLink the parametersLink value to set.
     * @return the DeploymentPropertiesExtended object itself.
     */
    public DeploymentPropertiesExtended setParametersLink(ParametersLink parametersLink) {
        this.parametersLink = parametersLink;
        return this;
    }

    /**
     * Get the mode property: The deployment mode. Possible values are Incremental and Complete.
     *
     * @return the mode value.
     */
    public DeploymentMode getMode() {
        return this.mode;
    }

    /**
     * Set the mode property: The deployment mode. Possible values are Incremental and Complete.
     *
     * @param mode the mode value to set.
     * @return the DeploymentPropertiesExtended object itself.
     */
    public DeploymentPropertiesExtended setMode(DeploymentMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get the debugSetting property: The debug setting of the deployment.
     *
     * @return the debugSetting value.
     */
    public DebugSetting getDebugSetting() {
        return this.debugSetting;
    }

    /**
     * Set the debugSetting property: The debug setting of the deployment.
     *
     * @param debugSetting the debugSetting value to set.
     * @return the DeploymentPropertiesExtended object itself.
     */
    public DeploymentPropertiesExtended setDebugSetting(DebugSetting debugSetting) {
        this.debugSetting = debugSetting;
        return this;
    }

    /**
     * Get the onErrorDeployment property: The deployment on error behavior.
     *
     * @return the onErrorDeployment value.
     */
    public OnErrorDeploymentExtended getOnErrorDeployment() {
        return this.onErrorDeployment;
    }

    /**
     * Set the onErrorDeployment property: The deployment on error behavior.
     *
     * @param onErrorDeployment the onErrorDeployment value to set.
     * @return the DeploymentPropertiesExtended object itself.
     */
    public DeploymentPropertiesExtended setOnErrorDeployment(OnErrorDeploymentExtended onErrorDeployment) {
        this.onErrorDeployment = onErrorDeployment;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getProviders() != null) {
            getProviders().forEach(e -> e.validate());
        }
        if (getDependencies() != null) {
            getDependencies().forEach(e -> e.validate());
        }
        if (getTemplateLink() != null) {
            getTemplateLink().validate();
        }
        if (getParametersLink() != null) {
            getParametersLink().validate();
        }
        if (getDebugSetting() != null) {
            getDebugSetting().validate();
        }
        if (getOnErrorDeployment() != null) {
            getOnErrorDeployment().validate();
        }
    }
}
