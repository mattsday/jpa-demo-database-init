package io.pivotal.mday.demo.jpademodatabaseinit;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long> {

}
