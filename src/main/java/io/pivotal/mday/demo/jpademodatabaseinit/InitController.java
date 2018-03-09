package io.pivotal.mday.demo.jpademodatabaseinit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.javafaker.Faker;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class InitController {

	@NonNull
	private CustomerRepo repo;
	private Faker faker = new Faker();

	@GetMapping("/")
	public String create(@RequestParam(name = "count", defaultValue = "100", required = true) int count) {
		for (int i = 0; i < count; i++) {
			String customerName = faker.name().fullName();
			String accountNumber = faker.finance().iban();
			Customer c = new Customer(customerName, accountNumber);
			repo.save(c);
		}
		return "Created " + count + " database entries";
	}
}
