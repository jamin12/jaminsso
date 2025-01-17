package org.jamin.models.account

import org.jamin.models.account.enums.Provider

data class Accounts(
    val id: Long?,
    val email: String,
    val password: String?,
    val provider: Provider,
    val providerAccountId: String?,
)