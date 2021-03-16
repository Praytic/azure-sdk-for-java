// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of the Service Fabric Type Backend. */
@Fluent
public final class BackendServiceFabricClusterProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BackendServiceFabricClusterProperties.class);

    /*
     * The client certificate id for the management endpoint.
     */
    @JsonProperty(value = "clientCertificateId")
    private String clientCertificateId;

    /*
     * The client certificate thumbprint for the management endpoint. Will be
     * ignored if certificatesIds are provided
     */
    @JsonProperty(value = "clientCertificatethumbprint")
    private String clientCertificatethumbprint;

    /*
     * Maximum number of retries while attempting resolve the partition.
     */
    @JsonProperty(value = "maxPartitionResolutionRetries")
    private Integer maxPartitionResolutionRetries;

    /*
     * The cluster management endpoint.
     */
    @JsonProperty(value = "managementEndpoints", required = true)
    private List<String> managementEndpoints;

    /*
     * Thumbprints of certificates cluster management service uses for tls
     * communication
     */
    @JsonProperty(value = "serverCertificateThumbprints")
    private List<String> serverCertificateThumbprints;

    /*
     * Server X509 Certificate Names Collection
     */
    @JsonProperty(value = "serverX509Names")
    private List<X509CertificateName> serverX509Names;

    /**
     * Get the clientCertificateId property: The client certificate id for the management endpoint.
     *
     * @return the clientCertificateId value.
     */
    public String clientCertificateId() {
        return this.clientCertificateId;
    }

    /**
     * Set the clientCertificateId property: The client certificate id for the management endpoint.
     *
     * @param clientCertificateId the clientCertificateId value to set.
     * @return the BackendServiceFabricClusterProperties object itself.
     */
    public BackendServiceFabricClusterProperties withClientCertificateId(String clientCertificateId) {
        this.clientCertificateId = clientCertificateId;
        return this;
    }

    /**
     * Get the clientCertificatethumbprint property: The client certificate thumbprint for the management endpoint. Will
     * be ignored if certificatesIds are provided.
     *
     * @return the clientCertificatethumbprint value.
     */
    public String clientCertificatethumbprint() {
        return this.clientCertificatethumbprint;
    }

    /**
     * Set the clientCertificatethumbprint property: The client certificate thumbprint for the management endpoint. Will
     * be ignored if certificatesIds are provided.
     *
     * @param clientCertificatethumbprint the clientCertificatethumbprint value to set.
     * @return the BackendServiceFabricClusterProperties object itself.
     */
    public BackendServiceFabricClusterProperties withClientCertificatethumbprint(String clientCertificatethumbprint) {
        this.clientCertificatethumbprint = clientCertificatethumbprint;
        return this;
    }

    /**
     * Get the maxPartitionResolutionRetries property: Maximum number of retries while attempting resolve the partition.
     *
     * @return the maxPartitionResolutionRetries value.
     */
    public Integer maxPartitionResolutionRetries() {
        return this.maxPartitionResolutionRetries;
    }

    /**
     * Set the maxPartitionResolutionRetries property: Maximum number of retries while attempting resolve the partition.
     *
     * @param maxPartitionResolutionRetries the maxPartitionResolutionRetries value to set.
     * @return the BackendServiceFabricClusterProperties object itself.
     */
    public BackendServiceFabricClusterProperties withMaxPartitionResolutionRetries(
        Integer maxPartitionResolutionRetries) {
        this.maxPartitionResolutionRetries = maxPartitionResolutionRetries;
        return this;
    }

    /**
     * Get the managementEndpoints property: The cluster management endpoint.
     *
     * @return the managementEndpoints value.
     */
    public List<String> managementEndpoints() {
        return this.managementEndpoints;
    }

    /**
     * Set the managementEndpoints property: The cluster management endpoint.
     *
     * @param managementEndpoints the managementEndpoints value to set.
     * @return the BackendServiceFabricClusterProperties object itself.
     */
    public BackendServiceFabricClusterProperties withManagementEndpoints(List<String> managementEndpoints) {
        this.managementEndpoints = managementEndpoints;
        return this;
    }

    /**
     * Get the serverCertificateThumbprints property: Thumbprints of certificates cluster management service uses for
     * tls communication.
     *
     * @return the serverCertificateThumbprints value.
     */
    public List<String> serverCertificateThumbprints() {
        return this.serverCertificateThumbprints;
    }

    /**
     * Set the serverCertificateThumbprints property: Thumbprints of certificates cluster management service uses for
     * tls communication.
     *
     * @param serverCertificateThumbprints the serverCertificateThumbprints value to set.
     * @return the BackendServiceFabricClusterProperties object itself.
     */
    public BackendServiceFabricClusterProperties withServerCertificateThumbprints(
        List<String> serverCertificateThumbprints) {
        this.serverCertificateThumbprints = serverCertificateThumbprints;
        return this;
    }

    /**
     * Get the serverX509Names property: Server X509 Certificate Names Collection.
     *
     * @return the serverX509Names value.
     */
    public List<X509CertificateName> serverX509Names() {
        return this.serverX509Names;
    }

    /**
     * Set the serverX509Names property: Server X509 Certificate Names Collection.
     *
     * @param serverX509Names the serverX509Names value to set.
     * @return the BackendServiceFabricClusterProperties object itself.
     */
    public BackendServiceFabricClusterProperties withServerX509Names(List<X509CertificateName> serverX509Names) {
        this.serverX509Names = serverX509Names;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (managementEndpoints() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property managementEndpoints in model"
                            + " BackendServiceFabricClusterProperties"));
        }
        if (serverX509Names() != null) {
            serverX509Names().forEach(e -> e.validate());
        }
    }
}