package covenant.hexagonal.bank.application.port.out;

import covenant.hexagonal.bank.application.domain.BankAccount;

public interface SaveAccountPort {
    void save(BankAccount bankAccount);
}
