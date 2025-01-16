package org.jamin.out.persistence.common

import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.annotation.Transient
import org.springframework.data.domain.Persistable
import java.time.LocalDateTime

open class MutableBasicR2Entity(
    @LastModifiedDate
    var updatedAt: LocalDateTime? = null,
) : BasicR2Entity(), Persistable<Long> {
    @Transient
    private var _isNew: Boolean = (entityId == null)

    override fun getId(): Long? = entityId

    override fun isNew(): Boolean = _isNew
}