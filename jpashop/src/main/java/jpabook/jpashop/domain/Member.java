package jpabook.jpashop.domain;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Member {
    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;
    private String city;
    private String name;
    private String street;
    private String zipcode;

    @OneToMany(mappedBy = "member")
    private List<Order> orders=new ArrayList<>();
    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems = new ArrayList<>();

    public Member() {}
    public String getName() {
        return name;
    }
    public void setName(String name) {this.name = name;}
    public Long getId() {return id;}
    public void setId(Long id) {id = id;}
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getZipcode() {
        return zipcode;
    }
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
