package org.jamin.out.persistence.common

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import java.time.LocalDateTime

open class BasicR2Entity(
    @Id
    var entityId: Long? = null,
    @CreatedDate
    var createdAt: LocalDateTime? = null,
)