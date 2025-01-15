package org.jamin.out.persistence.account.entity

import org.jamin.models.account.enums.Provider
import org.jamin.out.persistence.common.MutableBasicR2Entity
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("accounts")
class AccountR2Entity(
    @Id
    val id: Long? = null,
    val email: String,
    val password: String,
    val provider: Provider,
    val providerAccountId: Provider,
) : MutableBasicR2Entity()