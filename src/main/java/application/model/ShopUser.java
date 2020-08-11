package application.model;

import java.io.Serializable;


public class ShopUser implements Serializable{
    private static final long serialVersionUID = 1L;

    int id;
    String email;
    String name;
    String password;
    String username;
    int zip;
    String address;
    Boolean isAdmin;

    public ShopUser(){};

    public ShopUser(int id, String email, String name, String password, String username, int zip, String address) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.password = password;
        this.username = username;
        this.zip = zip;
        this.address = address;
    }

	public ShopUser(String email, String name, String password, String username, int zip, String address) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.username = username;
        this.zip = zip;
        this.address = address;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
