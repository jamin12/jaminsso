package org.jamin.`in`.web.account.dto.request

import org.jamin.models.account.Accounts
import org.jamin.models.account.enums.Provider

data class AccountsCreateRequest(
    val email: String,
    val password: String?,
    val provider: Provider,
    val providerAccountId: String?,
) {
    fun toDomain(): Accounts{
        return Accounts(
            id = null,
            email = email,
            password = password,
            provider = provider,
            providerAccountId = providerAccountId,
        )
    }

}