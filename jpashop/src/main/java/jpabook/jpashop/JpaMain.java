package jpabook.jpashop;

import jpabook.jpashop.domain.Member;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpashop");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        try {
            Member member = new Member();
            member.setName("name1");
            member.setCity("SEOUL");
            member.setStreet("월드컵로");
            member.setZipcode("5115");
            em.persist(member);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        }finally {
            emf.close();
        }
    }
}
