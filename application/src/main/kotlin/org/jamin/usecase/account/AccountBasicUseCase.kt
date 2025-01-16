package org.jamin.usecase.account

import org.jamin.models.account.Accounts

interface AccountBasicUseCase {
    suspend fun save(accounts: Accounts): Accounts?
}