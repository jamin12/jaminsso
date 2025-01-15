package org.jamin.models.account

import org.jamin.models.account.enums.Provider

class Account(
    val email: String,
    val password: String?,
    val provider: Provider,
    val providerAccountId: String?,
) {
}