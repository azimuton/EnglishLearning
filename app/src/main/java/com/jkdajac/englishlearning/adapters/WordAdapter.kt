package com.jkdajac.englishlearning.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jkdajac.englishlearning.MainActivity
import com.jkdajac.englishlearning.MyIntentConstance
import com.jkdajac.englishlearning.R
import com.jkdajac.englishlearning.database.worddb.Word
import kotlinx.android.synthetic.main.item_view.view.*

class WordAdapter (val contextA: Context,
                   val wordList: List<Word>,
                   val callback: ViewHolder.ItemCallback
): RecyclerView.Adapter<WordAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(contextA).inflate(R.layout.item_view, parent, false), contextA
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setData(wordList[position])
        holder.englishWord?.text = wordList[position].englishWord
        holder.translateWord?.text = wordList[position].translateWord
        holder.closeItem?.setOnClickListener {
            callback.closeItem(position)
            holder.translateWord?.visibility = View.GONE
        }
        holder.openItem?.setOnClickListener {
            callback.openItem(position)
            holder.translateWord?.visibility = View.VISIBLE
        }
        holder.deleteItem?.setOnClickListener {
            callback.deleteItem(position)
        }
    }

    override fun getItemCount(): Int {
        return wordList.size
    }


    class ViewHolder(itemView: View, contextV: Context) : RecyclerView.ViewHolder(itemView) {
        val context = contextV
        var englishWord: TextView? = null
        var translateWord: TextView? = null
        var deleteItem: ImageView? = null
        var openItem: ImageView? = null
        var closeItem: ImageView? = null


        init {
            englishWord = itemView.tvWord
            translateWord = itemView.tvTranslate
            deleteItem = itemView.ivDelete
            openItem = itemView.ivOpenEyeLearned
            closeItem = itemView.ivCloseEyeLearned
        }

        interface ItemCallback {
            fun deleteItem(index: Int)
            fun openItem(index: Int)
            fun closeItem(index: Int)
        }

        fun setData(item: Word) {
            itemView.setOnClickListener {
                val intent = Intent(context, MainActivity::class.java).apply {
                    putExtra(MyIntentConstance.I_WORD_KEY, item.englishWord)
                    putExtra(MyIntentConstance.I_TRANSLATE_KEY, item.translateWord)
                }
                context.startActivity(intent)
            }
        }
    }
}
