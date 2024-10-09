package com.jsp.standalonecollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee
{
    private List<String> vehicle;
    private Set<String> email;
    private Map<String ,String> name;
    private Properties dbProp;

    public List<String> getVehicle() {
        return vehicle;
    }

    public void setVehicle(List<String> vehicle) {
        this.vehicle = vehicle;
    }

    public Map<String, String> getName() {
        return name;
    }

    public Properties getDbProp() {
        return dbProp;
    }

    public void setDbProp(Properties dbProp) {
        this.dbProp = dbProp;
    }

    public void setName(Map<String, String> name) {
        this.name = name;
    }

    public Set<String> getEmail() {
        return email;
    }

    public void setEmail(Set<String> email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "vehicle=" + vehicle +
                ", email=" + email +
                ", name=" + name +
                ", dbProp=" + dbProp +
                '}';
    }
}
