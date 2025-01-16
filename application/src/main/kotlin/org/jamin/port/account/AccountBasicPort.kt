package org.jamin.port.account

import org.jamin.models.account.Accounts

interface AccountBasicPort {
    suspend fun save(accounts: Accounts): Accounts
}
