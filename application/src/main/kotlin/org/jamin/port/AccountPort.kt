package org.jamin.port

import org.jamin.models.account.Account
import org.jamin.models.account.enums.Provider

interface AccountPort {
    suspend fun findByEmailAndProvider(email: String, provider: Provider): Account?

    suspend fun save(account: Account): Account
}
