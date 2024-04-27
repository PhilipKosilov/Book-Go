package com.example.bookgo.core.domain.validation.state

data class ValidationState(val isError: Boolean = false, val errorMessageId: Int? = null)