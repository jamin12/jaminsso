package org.jamin.out.persistence.common

import org.springframework.data.annotation.CreatedDate
import java.time.LocalDateTime

open class BasicR2Entity(
    @CreatedDate
    val createdAt: LocalDateTime? = null,

)