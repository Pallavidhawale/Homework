package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class DEMO {



@Id
@GeneratedValue

private int gid;
private String city;
public int getGid() {
return gid;
}
public void setGid(int gid) {
this.gid = gid;
}
public String getCity() {
return city;
}
public void setCity(String city) {
this.city = city;
}
public DEMO(int gid, String city) {
super();
this.gid = gid;
this.city = city;
}
public DEMO() {
super();
// TODO Auto-generated constructor stub
}
@Override
public String toString() {
return "DEMO [gid=" + gid + ", city=" + city + "]";
}

}