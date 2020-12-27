package com.example.domain.usecase

import com.example.domain.repository.NoteRepository

// load note list data, detail data
class NoteUseCase(private val repository: NoteRepository) {
    fun loadNoteList() {
        return repository.loadNoteList()
    }

    fun loadNoteDetail() {
        return repository.loadNoteDetail()
    }
}