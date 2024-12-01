package com.example.homemate.Profile.Bookings;
public class Model {
    String userEmail;
    String uniqueOrderId;
    String serviceDate;
    String instructions;
    String servicePrice;
    String serviceName;

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUniqueOrderId() {
        return uniqueOrderId;
    }

    public void setUniqueOrderId(String uniqueOrderId) {
        this.uniqueOrderId = uniqueOrderId;
    }

    public String getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(String serviceDate) {
        this.serviceDate = serviceDate;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(String servicePrice) {
        this.servicePrice = servicePrice;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceProviderContact() {
        return serviceProviderContact;
    }

    public void setServiceProviderContact(String serviceProviderContact) {
        this.serviceProviderContact = serviceProviderContact;
    }

    public String getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public String getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(String serviceTime) {
        this.serviceTime = serviceTime;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    String serviceProviderContact;
    String serviceProvider;
    String serviceTime;
    String userAddress;
}
