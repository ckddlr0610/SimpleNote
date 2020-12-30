package com.clean.domain.usecase

import com.clean.domain.repository.NoteRepository

// load note list data, detail data
class NoteUseCase(private val repository: NoteRepository) {
    fun loadNoteList() {
        return repository.loadNoteList()
    }

    fun loadNoteDetail() {
        return repository.loadNoteDetail()
    }
}