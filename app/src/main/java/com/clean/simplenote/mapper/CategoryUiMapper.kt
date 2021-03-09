package com.clean.simplenote.mapper

import com.clean.simplenote.domain.model.Category
import com.clean.simplenote.model.CategoryUiModel

class CategoryUiMapper : Mapper<List<Category>, List<CategoryUiModel>> {
    override fun toUiModel(from: List<Category>): List<CategoryUiModel> =
        from.map { category ->
            CategoryUiModel(
                category.tagId,
                category.imageUrl,
                category.title
            )
        }
}
