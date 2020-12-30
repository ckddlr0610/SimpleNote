package com.clean.domain.repository

interface NoteRepository {
    fun loadNoteList()
    fun loadNoteDetail()
}