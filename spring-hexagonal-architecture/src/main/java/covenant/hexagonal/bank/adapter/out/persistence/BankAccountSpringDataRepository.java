package covenant.hexagonal.bank.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountSpringDataRepository extends JpaRepository<BankAccountEntity, Long> {
}
