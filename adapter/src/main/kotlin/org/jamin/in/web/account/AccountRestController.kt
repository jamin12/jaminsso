package org.jamin.`in`.web.account

import io.swagger.v3.oas.annotations.tags.Tag
import org.jamin.`in`.web.account.dto.request.AccountsCreateRequest
import org.jamin.`in`.web.account.dto.response.AccountsCreateResponse
import org.jamin.usecase.account.AccountBasicUseCase
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/accounts"])
@Tag(name = "회원 관리 api")
class AccountRestController(
    private val accountBasicUseCase: AccountBasicUseCase,
) {
    @PostMapping
    suspend fun saveAccount(@RequestBody account: AccountsCreateRequest): ResponseEntity<AccountsCreateResponse> {
        val savedAccount = accountBasicUseCase.save(account.toDomain())
        return ResponseEntity.status(HttpStatus.CREATED)
            .body(savedAccount?.let { AccountsCreateResponse.toResponse(it) })
    }
}