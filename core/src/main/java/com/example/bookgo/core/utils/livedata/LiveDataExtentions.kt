package com.example.bookgo.core.utils.livedata

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

// Use this to get non-nullable value from LiveData
fun <T> LiveData<T>.requireValue(): T {
    return this.value ?: throw IllegalStateException("LiveData value is empty")
}

// type aliases for live-data instances which contain events
typealias MutableLiveEvent<T> = MutableLiveData<Event<T>>
typealias LiveEvent<T> = LiveData<Event<T>>
typealias EventListener<T> = (T) -> Unit

/**
 * Convert mutable live-data into non-mutable live-data.
 */
fun <T> MutableLiveData<T>.toLiveEvent(): LiveData<T> = this

fun <T> MutableLiveEvent<T>.publishEvent(value: T) {
    this.value = Event(value)
}

// Use this instead regular observe when dealing with Event
fun <T> LiveEvent<T>.observeEvent(lifecycleOwner: LifecycleOwner, listener: EventListener<T>) {
    this.observe(lifecycleOwner) {
        it?.get()?.let { value ->
            listener(value)
        }
    }
}

// Unit events for when you don't need to return values
typealias MutableUnitLiveEvent = MutableLiveEvent<Unit>
typealias UnitLiveEvent = LiveEvent<Unit>
typealias UnitEventListener = () -> Unit

fun MutableUnitLiveEvent.publishEvent() = publishEvent(Unit)
fun UnitLiveEvent.observeEvent(lifecycleOwner: LifecycleOwner, listener: UnitEventListener) {
    observeEvent(lifecycleOwner) { _ ->
        listener()
    }
}