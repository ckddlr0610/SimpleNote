package com.clean.simplenote.domain.usecase

import com.clean.simplenote.domain.repository.NoteRepository

// load note list data, detail data
class NoteUseCase(private val repository: com.clean.simplenote.domain.repository.NoteRepository) {
    fun loadNoteList() {
        return repository.loadNoteList()
    }

    fun loadNoteDetail() {
        return repository.loadNoteDetail()
    }
}