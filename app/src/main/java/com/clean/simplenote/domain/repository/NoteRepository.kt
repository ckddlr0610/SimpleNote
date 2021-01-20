package com.clean.simplenote.domain.repository

interface NoteRepository {
    fun loadNoteList()
    fun loadNoteDetail()
}