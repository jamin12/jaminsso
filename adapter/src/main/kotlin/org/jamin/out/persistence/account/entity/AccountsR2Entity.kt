package org.jamin.out.persistence.account.entity

import org.jamin.models.account.enums.Provider
import org.jamin.out.persistence.common.MutableBasicR2Entity
import org.springframework.data.relational.core.mapping.Table

@Table("accounts")
class AccountsR2Entity(
    val email: String,
    val password: String?,
    val provider: Provider,
    val providerAccountId: String?,
) : MutableBasicR2Entity()