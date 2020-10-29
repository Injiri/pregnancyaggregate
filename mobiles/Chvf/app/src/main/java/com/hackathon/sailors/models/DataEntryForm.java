package com.hackathon.sailors.models;

public class DataEntryForm {
    private String name,phoneNumber,village,age,edd,linkFacility,linkCu,ContactCHV,district;

    public DataEntryForm() {
    }

    public DataEntryForm(String name, String phoneNumber, String village, String age, String edd, String linkFacility, String linkCu, String contactCHV, String district) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.village = village;
        this.age = age;
        this.edd = edd;
        this.linkFacility = linkFacility;
        this.linkCu = linkCu;
        ContactCHV = contactCHV;
        this.district = district;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEdd() {
        return edd;
    }

    public void setEdd(String edd) {
        this.edd = edd;
    }

    public String getLinkFacility() {
        return linkFacility;
    }

    public void setLinkFacility(String linkFacility) {
        this.linkFacility = linkFacility;
    }

    public String getLinkCu() {
        return linkCu;
    }

    public void setLinkCu(String linkCu) {
        this.linkCu = linkCu;
    }

    public String getContactCHV() {
        return ContactCHV;
    }

    public void setContactCHV(String contactCHV) {
        ContactCHV = contactCHV;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}
