package org.jamin.out.persistence.account.mapper

import org.jamin.models.account.Accounts
import org.jamin.out.persistence.account.entity.AccountsR2Entity
import org.mapstruct.Mapper
import org.mapstruct.Mapping

@Mapper(componentModel = "spring")
interface AccountsR2Mapper {
    @Mapping(source = "entityId", target = "id")
    fun toDomain(entity: AccountsR2Entity): Accounts

    @Mapping(source = "id", target = "entityId")
    fun toEntity(domain: Accounts): AccountsR2Entity
}