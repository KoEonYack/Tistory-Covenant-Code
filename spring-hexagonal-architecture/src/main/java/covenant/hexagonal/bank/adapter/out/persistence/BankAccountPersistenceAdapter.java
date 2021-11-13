package covenant.hexagonal.bank.adapter.out.persistence;

import covenant.hexagonal.bank.application.port.out.LoadAccountPort;
import covenant.hexagonal.bank.application.port.out.SaveAccountPort;
import covenant.hexagonal.bank.application.domain.BankAccount;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.NoSuchElementException;

@Repository
@RequiredArgsConstructor
public class BankAccountPersistenceAdapter implements LoadAccountPort, SaveAccountPort {

    private final BankAccountMapper bankAccountMapper;
    private final BankAccountSpringDataRepository repository;

    @Override
    public BankAccount load(Long id) {
        BankAccountEntity entity = repository.findById(id).orElseThrow(NoSuchElementException::new);
        return bankAccountMapper.toDomain(entity);
    }

    @Override
    public void save(BankAccount bankAccount) {
        BankAccountEntity entity = bankAccountMapper.toEntity(bankAccount);
        repository.save(entity);
    }
}
