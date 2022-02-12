package com.jkdajac.englishlearning.adapters

import androidx.recyclerview.widget.DiffUtil
import com.jkdajac.englishlearning.database.worddb.LearnedWords

class LearnedWordsDiffCallback : DiffUtil.ItemCallback<LearnedWords>() {
    override fun areItemsTheSame(oldItem: LearnedWords, newItem: LearnedWords): Boolean {
        return  oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: LearnedWords, newItem: LearnedWords): Boolean {
        return oldItem == newItem
    }
}