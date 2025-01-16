package org.jamin.service

import org.jamin.models.account.Accounts
import org.jamin.port.account.AccountBasicPort
import org.jamin.usecase.account.AccountBasicUseCase
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class AccountBasicService(
    private val accountBasicPort: AccountBasicPort,
) : AccountBasicUseCase {
    override suspend fun save(accounts: Accounts): Accounts? {
        return accountBasicPort.save(accounts);
    }
}