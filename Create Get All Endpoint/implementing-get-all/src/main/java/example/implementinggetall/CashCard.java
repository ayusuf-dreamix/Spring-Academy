package example.implementinggetall;

import org.springframework.data.annotation.Id;

public record CashCard(@Id Long id, Double amount) {
}