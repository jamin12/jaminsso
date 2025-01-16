package org.jamin.out.persistence.account.adapter

import kotlinx.coroutines.reactive.awaitFirst
import org.jamin.models.account.Accounts
import org.jamin.out.persistence.account.mapper.AccountsR2Mapper
import org.jamin.out.persistence.account.repository.AccountR2Repository
import org.jamin.port.account.AccountBasicPort
import org.springframework.stereotype.Service


@Service
class AccountBasicAdapter(
    private val accountR2Repository: AccountR2Repository,
    private val accountsR2Mapper: AccountsR2Mapper,
) : AccountBasicPort {
    override suspend fun save(accounts: Accounts): Accounts {
        return accountR2Repository.save(accountsR2Mapper.toEntity(accounts))
            .map { accountsR2Mapper.toDomain(it) }
            .awaitFirst()
    }
}