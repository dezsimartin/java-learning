package hu.flowacademy;

import hu.flowacademy.Address;

import java.util.Arrays;

public class JSON {

    private Long id;
    private String name;
    private boolean permanent;
    private Address address;
    private int[] phoneNumbers;
    private String role;
    private String[] cities;
    private Properties properties;

    JSON(){
    }

    public JSON(Long id, String name, boolean permanent, Address address, int[] phoneNumbers, String role, String[] cities, Properties properties) {
        this.id = id;
        this.name = name;
        this.permanent = permanent;
        this.address = address;
        this.phoneNumbers = phoneNumbers;
        this.role = role;
        this.cities = cities;
        this.properties = properties;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPermanent() {
        return permanent;
    }

    public void setPermanent(boolean permanent) {
        this.permanent = permanent;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int[] getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(int[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String[] getCities() {
        return cities;
    }

    public void setCities(String[] cities) {
        this.cities = cities;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "JSON{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", permanent=" + permanent +
                ", address=" + address +
                ", phoneNumbers=" + Arrays.toString(phoneNumbers) +
                ", role='" + role + '\'' +
                ", cities=" + Arrays.toString(cities) +
                ", properties=" + properties +
                '}';
    }
}
