package covenant.hexagonal.bank.application.service;

import covenant.hexagonal.bank.application.domain.BankAccount;
import covenant.hexagonal.bank.application.port.in.DepositUseCase;
import covenant.hexagonal.bank.application.port.in.WithdrawUseCase;
import covenant.hexagonal.bank.application.port.out.LoadAccountPort;
import covenant.hexagonal.bank.application.port.out.SaveAccountPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class BankAccountService implements DepositUseCase, WithdrawUseCase {

    private final LoadAccountPort loadAccountPort;
    private final SaveAccountPort saveAccountPort;

    @Override
    public void deposit(Long id, BigDecimal amount) {
        BankAccount account = loadAccountPort.load(id);

        account.deposit(amount);

        saveAccountPort.save(account);
    }

    @Override
    public boolean withdraw(Long id, BigDecimal amount) {
        BankAccount account = loadAccountPort.load(id);

        boolean hasWithdrawn = account.withdraw(amount);

        if(hasWithdrawn) {
            saveAccountPort.save(account);
        }

        return hasWithdrawn;
    }
}
