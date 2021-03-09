package com.clean.simplenote.view.model

import java.util.*

data class Memo(
    val id: Int,
    val title: String,
    val content: String,
    val createdAt: Date
)