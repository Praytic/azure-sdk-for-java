// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.iot.deviceupdate;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.Response;
import com.azure.iot.deviceupdate.implementation.DevicesImpl;
import com.azure.iot.deviceupdate.models.Device;
import com.azure.iot.deviceupdate.models.DeviceClass;
import com.azure.iot.deviceupdate.models.DeviceTag;
import com.azure.iot.deviceupdate.models.Group;
import com.azure.iot.deviceupdate.models.UpdatableDevices;
import com.azure.iot.deviceupdate.models.UpdateCompliance;
import com.azure.iot.deviceupdate.models.UpdateId;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous DeviceUpdateClient type. */
@ServiceClient(builder = DeviceUpdateClientBuilder.class, isAsync = true)
public final class DevicesAsyncClient {
    private final DevicesImpl serviceClient;

    /**
     * Initializes an instance of Devices client.
     *
     * @param serviceClient the service client implementation.
     */
    DevicesAsyncClient(DevicesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Gets a list of all device classes (unique combinations of device manufacturer and model) for all devices
     * connected to Device Update for IoT Hub.
     *
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all device classes (unique combinations of device manufacturer and model) for all devices
     *     connected to Device Update for IoT Hub.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<DeviceClass>> getAllDeviceClassesSinglePage() {
        return this.serviceClient.getAllDeviceClassesSinglePageAsync();
    }

    /**
     * Gets a list of all device classes (unique combinations of device manufacturer and model) for all devices
     * connected to Device Update for IoT Hub.
     *
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all device classes (unique combinations of device manufacturer and model) for all devices
     *     connected to Device Update for IoT Hub.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<DeviceClass> getAllDeviceClasses() {
        return this.serviceClient.getAllDeviceClassesAsync();
    }

    /**
     * Gets the properties of a device class.
     *
     * @param deviceClassId Device class identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a device class.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DeviceClass>> getDeviceClassWithResponse(String deviceClassId) {
        return this.serviceClient.getDeviceClassWithResponseAsync(deviceClassId);
    }

    /**
     * Gets the properties of a device class.
     *
     * @param deviceClassId Device class identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a device class.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DeviceClass> getDeviceClass(String deviceClassId) {
        return this.serviceClient.getDeviceClassAsync(deviceClassId);
    }

    /**
     * Gets a list of device identifiers in a device class.
     *
     * @param deviceClassId Device class identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of device identifiers in a device class.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<String>> getDeviceClassDeviceIdsSinglePage(String deviceClassId) {
        return this.serviceClient.getDeviceClassDeviceIdsSinglePageAsync(deviceClassId);
    }

    /**
     * Gets a list of device identifiers in a device class.
     *
     * @param deviceClassId Device class identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of device identifiers in a device class.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<String> getDeviceClassDeviceIds(String deviceClassId) {
        return this.serviceClient.getDeviceClassDeviceIdsAsync(deviceClassId);
    }

    /**
     * Gets a list of installable updates for a device class.
     *
     * @param deviceClassId Device class identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of installable updates for a device class.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<UpdateId>> getDeviceClassInstallableUpdatesSinglePage(String deviceClassId) {
        return this.serviceClient.getDeviceClassInstallableUpdatesSinglePageAsync(deviceClassId);
    }

    /**
     * Gets a list of installable updates for a device class.
     *
     * @param deviceClassId Device class identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of installable updates for a device class.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<UpdateId> getDeviceClassInstallableUpdates(String deviceClassId) {
        return this.serviceClient.getDeviceClassInstallableUpdatesAsync(deviceClassId);
    }

    /**
     * Gets a list of devices connected to Device Update for IoT Hub.
     *
     * @param filter Restricts the set of devices returned. You can only filter on device GroupId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of devices connected to Device Update for IoT Hub.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<Device>> getAllDevicesSinglePage(String filter) {
        return this.serviceClient.getAllDevicesSinglePageAsync(filter);
    }

    /**
     * Gets a list of devices connected to Device Update for IoT Hub.
     *
     * @param filter Restricts the set of devices returned. You can only filter on device GroupId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of devices connected to Device Update for IoT Hub.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<Device> getAllDevices(String filter) {
        return this.serviceClient.getAllDevicesAsync(filter);
    }

    /**
     * Gets the device properties and latest deployment status for a device connected to Device Update for IoT Hub.
     *
     * @param deviceId Device identifier in Azure IOT Hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the device properties and latest deployment status for a device connected to Device Update for IoT Hub.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Device>> getDeviceWithResponse(String deviceId) {
        return this.serviceClient.getDeviceWithResponseAsync(deviceId);
    }

    /**
     * Gets the device properties and latest deployment status for a device connected to Device Update for IoT Hub.
     *
     * @param deviceId Device identifier in Azure IOT Hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the device properties and latest deployment status for a device connected to Device Update for IoT Hub.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Device> getDevice(String deviceId) {
        return this.serviceClient.getDeviceAsync(deviceId);
    }

    /**
     * Gets the breakdown of how many devices are on their latest update, have new updates available, or are in progress
     * receiving new updates.
     *
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the breakdown of how many devices are on their latest update, have new updates available, or are in
     *     progress receiving new updates.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<UpdateCompliance>> getUpdateComplianceWithResponse() {
        return this.serviceClient.getUpdateComplianceWithResponseAsync();
    }

    /**
     * Gets the breakdown of how many devices are on their latest update, have new updates available, or are in progress
     * receiving new updates.
     *
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the breakdown of how many devices are on their latest update, have new updates available, or are in
     *     progress receiving new updates.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<UpdateCompliance> getUpdateCompliance() {
        return this.serviceClient.getUpdateComplianceAsync();
    }

    /**
     * Gets a list of available group device tags for all devices connected to Device Update for IoT Hub.
     *
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of available group device tags for all devices connected to Device Update for IoT Hub.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<DeviceTag>> getAllDeviceTagsSinglePage() {
        return this.serviceClient.getAllDeviceTagsSinglePageAsync();
    }

    /**
     * Gets a list of available group device tags for all devices connected to Device Update for IoT Hub.
     *
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of available group device tags for all devices connected to Device Update for IoT Hub.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<DeviceTag> getAllDeviceTags() {
        return this.serviceClient.getAllDeviceTagsAsync();
    }

    /**
     * Gets a count of how many devices have a device tag.
     *
     * @param tagName Tag name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a count of how many devices have a device tag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DeviceTag>> getDeviceTagWithResponse(String tagName) {
        return this.serviceClient.getDeviceTagWithResponseAsync(tagName);
    }

    /**
     * Gets a count of how many devices have a device tag.
     *
     * @param tagName Tag name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a count of how many devices have a device tag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DeviceTag> getDeviceTag(String tagName) {
        return this.serviceClient.getDeviceTagAsync(tagName);
    }

    /**
     * Gets a list of all device groups.
     *
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all device groups.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<Group>> getAllGroupsSinglePage() {
        return this.serviceClient.getAllGroupsSinglePageAsync();
    }

    /**
     * Gets a list of all device groups.
     *
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all device groups.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<Group> getAllGroups() {
        return this.serviceClient.getAllGroupsAsync();
    }

    /**
     * Gets the properties of a group.
     *
     * @param groupId Group identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Group>> getGroupWithResponse(String groupId) {
        return this.serviceClient.getGroupWithResponseAsync(groupId);
    }

    /**
     * Gets the properties of a group.
     *
     * @param groupId Group identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Group> getGroup(String groupId) {
        return this.serviceClient.getGroupAsync(groupId);
    }

    /**
     * Create or update a device group.
     *
     * @param groupId Group identifier.
     * @param group The group properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return group details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Group>> createOrUpdateGroupWithResponse(String groupId, Group group) {
        return this.serviceClient.createOrUpdateGroupWithResponseAsync(groupId, group);
    }

    /**
     * Create or update a device group.
     *
     * @param groupId Group identifier.
     * @param group The group properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return group details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Group> createOrUpdateGroup(String groupId, Group group) {
        return this.serviceClient.createOrUpdateGroupAsync(groupId, group);
    }

    /**
     * Deletes a device group.
     *
     * @param groupId Group identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteGroupWithResponse(String groupId) {
        return this.serviceClient.deleteGroupWithResponseAsync(groupId);
    }

    /**
     * Deletes a device group.
     *
     * @param groupId Group identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteGroup(String groupId) {
        return this.serviceClient.deleteGroupAsync(groupId);
    }

    /**
     * Get group update compliance information such as how many devices are on their latest update, how many need new
     * updates, and how many are in progress on receiving a new update.
     *
     * @param groupId Group identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return group update compliance information such as how many devices are on their latest update, how many need
     *     new updates, and how many are in progress on receiving a new update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<UpdateCompliance>> getGroupUpdateComplianceWithResponse(String groupId) {
        return this.serviceClient.getGroupUpdateComplianceWithResponseAsync(groupId);
    }

    /**
     * Get group update compliance information such as how many devices are on their latest update, how many need new
     * updates, and how many are in progress on receiving a new update.
     *
     * @param groupId Group identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return group update compliance information such as how many devices are on their latest update, how many need
     *     new updates, and how many are in progress on receiving a new update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<UpdateCompliance> getGroupUpdateCompliance(String groupId) {
        return this.serviceClient.getGroupUpdateComplianceAsync(groupId);
    }

    /**
     * Get the best available updates for a group and a count of how many devices need each update.
     *
     * @param groupId Group identifier.
     * @param filter Restricts the set of bestUpdates returned. You can filter on update Provider, Name and Version
     *     property.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the best available updates for a group and a count of how many devices need each update.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<UpdatableDevices>> getGroupBestUpdatesSinglePage(String groupId, String filter) {
        return this.serviceClient.getGroupBestUpdatesSinglePageAsync(groupId, filter);
    }

    /**
     * Get the best available updates for a group and a count of how many devices need each update.
     *
     * @param groupId Group identifier.
     * @param filter Restricts the set of bestUpdates returned. You can filter on update Provider, Name and Version
     *     property.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the best available updates for a group and a count of how many devices need each update.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<UpdatableDevices> getGroupBestUpdates(String groupId, String filter) {
        return this.serviceClient.getGroupBestUpdatesAsync(groupId, filter);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of device classes.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<DeviceClass>> getAllDeviceClassesNextSinglePage(String nextLink) {
        return this.serviceClient.getAllDeviceClassesNextSinglePageAsync(nextLink);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of strings with server paging support.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<String>> getDeviceClassDeviceIdsNextSinglePage(String nextLink) {
        return this.serviceClient.getDeviceClassDeviceIdsNextSinglePageAsync(nextLink);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of update identities.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<UpdateId>> getDeviceClassInstallableUpdatesNextSinglePage(String nextLink) {
        return this.serviceClient.getDeviceClassInstallableUpdatesNextSinglePageAsync(nextLink);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of devices.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<Device>> getAllDevicesNextSinglePage(String nextLink) {
        return this.serviceClient.getAllDevicesNextSinglePageAsync(nextLink);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of device tags.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<DeviceTag>> getAllDeviceTagsNextSinglePage(String nextLink) {
        return this.serviceClient.getAllDeviceTagsNextSinglePageAsync(nextLink);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of groups.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<Group>> getAllGroupsNextSinglePage(String nextLink) {
        return this.serviceClient.getAllGroupsNextSinglePageAsync(nextLink);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of updatable devices.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<UpdatableDevices>> getGroupBestUpdatesNextSinglePage(String nextLink) {
        return this.serviceClient.getGroupBestUpdatesNextSinglePageAsync(nextLink);
    }
}