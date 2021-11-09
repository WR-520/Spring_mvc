package cn.edu.lingnan.pojo2;

import java.util.*;

public class StudentNew {
    private String name;
    private String []telephone;
    private List<String> friends;
    private Map<String,String> address;
    private Set<String> game;
    private Properties informations;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getTelephone() {
        return telephone;
    }

    public void setTelephone(String[] telephone) {
        this.telephone = telephone;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Map<String, String> getAddress() {
        return address;
    }

    public void setAddress(Map<String, String> address) {
        this.address = address;
    }

    public Set<String> getGame() {
        return game;
    }

    public void setGame(Set<String> game) {
        this.game = game;
    }

    public Properties getInformations() {
        return informations;
    }

    public void setInformations(Properties informations) {
        this.informations = informations;
    }

    @Override
    public String toString() {
        return "StudentNew{" +
                "name='" + name + '\'' +
                ", telephone=" + Arrays.toString(telephone) +
                ", friends=" + friends +
                ", address=" + address +
                ", game=" + game +
                ", informations=" + informations +
                '}';
    }

    private StudentNew(){

    }

    public StudentNew(String name, String[] telephone, List<String> friends, Map<String, String> address, Set<String> game, Properties informations) {
        this.name = name;
        this.telephone = telephone;
        this.friends = friends;
        this.address = address;
        this.game = game;
        this.informations = informations;
    }
}
