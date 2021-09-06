package jpabook.jpashop.domain;

import javax.persistence.*;

@Entity
public class Delivery {
    @Id @GeneratedValue
    @Column(name="DELEVERY_ID")
    private Long id;

    private String city;
    private String street;
    private String zipcode;
    @Enumerated
    private DeliveryStatus status;

}
