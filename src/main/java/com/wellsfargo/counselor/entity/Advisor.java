package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

import java.lang.reflect.GenericArrayType;
import java.util.List;

@Entity
public class Advisor {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long advisorId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;


    @Column(nullable = false)
    private String email;

    @OneToMany(mappedBy = "advisor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Client> clients;


    protected Advisor() {

    }

    public Advisor(long advisorId, String firstName, String lastName, String address, String phone, String email, List<Client> clients) {
        this.advisorId = advisorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.clients = clients;
    }

    public long getAdvisorId() {
        return advisorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setAdvisorId(long advisorId) {
        this.advisorId = advisorId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
