package com.clean.simplenote.mapper

interface Mapper<T, V> {
    fun toUiModel(from: T): V
}