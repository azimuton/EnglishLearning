package com.jkdajac.englishlearning.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jkdajac.englishlearning.LearnedWordsActivity
import com.jkdajac.englishlearning.MyIntentConstance
import com.jkdajac.englishlearning.R
import com.jkdajac.englishlearning.database.worddb.LearnedWords
import kotlinx.android.synthetic.main.item_view.view.ivCloseEyeLearned
import kotlinx.android.synthetic.main.item_view.view.ivOpenEyeLearned
import kotlinx.android.synthetic.main.item_view.view.tvTranslate
import kotlinx.android.synthetic.main.item_view.view.tvWord
import kotlinx.android.synthetic.main.learned_item_view.view.*

class LearnedWordsAdapter(
    val contextA: Context,
    val wordListtwo: List<LearnedWords>,
    val callback: ViewHolder.ItemCallback
) : RecyclerView.Adapter<LearnedWordsAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(contextA).inflate(R.layout.learned_item_view, parent, false), contextA)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setData(wordListtwo[position])
        holder.englishWord?.text = wordListtwo[position].englishWord
        holder.translateWord?.text = wordListtwo[position].translateWord
        holder.closeItem?.setOnClickListener {
            holder.translateWord?.visibility = View.GONE
        }
        holder.openItem?.setOnClickListener {
            holder.translateWord?.visibility = View.VISIBLE
        }
        holder.deleteItem?.setOnClickListener {
            callback.deleteItem(position)

        }

    }

    override fun getItemCount(): Int {
        return wordListtwo.size
    }

    class ViewHolder(itemView : View, contextV: Context)  : RecyclerView.ViewHolder(itemView){

        val context = contextV
        var englishWord: TextView? = null
        var translateWord: TextView? = null
        var deleteItem : ImageView? = null
        var openItem : ImageView? = null
        var closeItem : ImageView? = null

        init{
            englishWord = itemView.tvWord
            translateWord = itemView.tvTranslate
            deleteItem = itemView.ivTwoDel
            openItem = itemView.ivOpenEyeLearned
            closeItem = itemView.ivCloseEyeLearned
        }
        fun setData(item : LearnedWords){
            itemView.setOnClickListener {
                val intent = Intent(context, LearnedWordsActivity :: class.java).apply {
                    putExtra(MyIntentConstance.I_WORDL_KEY, item.englishWord)
                    putExtra(MyIntentConstance.I_TRANSLATEL_KEY, item.translateWord)
                }
                context.startActivity(intent)
            }
        }

        interface ItemCallback {
            fun deleteItem(index: Int)
            fun openItem(index : Int)
            fun closeItem(index : Int)
        }
    }
}