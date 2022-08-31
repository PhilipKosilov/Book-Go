package com.example.bookgo.core.utils.livedata

// Use this to fire LiveData change only once
class Event<out T>(value: T) {
    private var _value: T? = value

    fun get(): T? = _value.also { _value = null }
}