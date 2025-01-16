package org.jamin.`in`.web.account.dto.response

import org.jamin.models.account.Accounts
import org.jamin.models.account.enums.Provider

data class AccountsCreateResponse(
    val email: String,
    val provider: Provider,
) {
    companion object {
        fun toResponse(accounts: Accounts): AccountsCreateResponse {
            return AccountsCreateResponse(
                email = accounts.email,
                provider = accounts.provider,
            )
        }
    }

}