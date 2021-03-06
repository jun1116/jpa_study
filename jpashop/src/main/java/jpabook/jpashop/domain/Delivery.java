package jpabook.jpashop.domain;

import javax.persistence.*;

@Entity
public class Delivery {
    @Id @GeneratedValue
    @Column(name="DELIVERY_ID")
    private Long id;

    private String city;
    private String street;
    private String zipcode;
    @Enumerated
    private DeliveryStatus status;

    @OneToOne(mappedBy = "delivery")//1:1양방향
    private Order order;
}
