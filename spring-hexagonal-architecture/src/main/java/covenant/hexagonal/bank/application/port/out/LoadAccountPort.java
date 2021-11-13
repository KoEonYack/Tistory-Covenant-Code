package covenant.hexagonal.bank.application.port.out;

import covenant.hexagonal.bank.domain.BankAccount;

public interface LoadAccountPort {
    BankAccount load(Long id);
}
