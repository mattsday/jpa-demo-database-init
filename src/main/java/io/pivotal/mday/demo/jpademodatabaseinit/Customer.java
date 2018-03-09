package io.pivotal.mday.demo.jpademodatabaseinit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Customer {
	@GeneratedValue
	@Id
	private Long id;
	@NonNull
	private String customerName;
	@NonNull
	private String accountNumber;
}