package org.jamin.out.persistence.common

import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime

open class MutableBasicR2Entity(
    @LastModifiedDate
    val updatedAt: LocalDateTime? = null,
) : BasicR2Entity()