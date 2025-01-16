package org.jamin.out.persistence.account.repository

import org.jamin.out.persistence.account.entity.AccountsR2Entity
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface AccountR2Repository : ReactiveCrudRepository<AccountsR2Entity, Long> {

}