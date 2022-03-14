package com.jkdajacs.englishlearning.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.jkdajacs.englishlearning.LearnedWordsActivity
import com.jkdajacs.englishlearning.MyIntentConstance
import com.jkdajacs.englishlearning.R
import com.jkdajacs.englishlearning.database.worddb.LearnedWords
import kotlinx.android.synthetic.main.item_view.view.ivCloseEyeLearnedRandom
import kotlinx.android.synthetic.main.item_view.view.ivOpenEyeLearnedRandom
import kotlinx.android.synthetic.main.item_view.view.tvTranslateRandom
import kotlinx.android.synthetic.main.item_view.view.tvWordRandom
import kotlinx.android.synthetic.main.learned_item_view.view.*

class LearnedWordsAdapter(
    val contextA: Context,
    val callback: ViewHolder.ItemCallback
) : ListAdapter<LearnedWords, LearnedWordsAdapter.ViewHolder>(LearnedWordsDiffCallback()){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(contextA).inflate(R.layout.learned_item_view, parent, false), contextA)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setData(currentList[position])
        holder.englishWord?.text = currentList[position].englishWord
        holder.translateWord?.text = currentList[position].translateWord
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
        return currentList.size
    }



    class ViewHolder(itemView : View, contextV: Context)  : RecyclerView.ViewHolder(itemView){

        val context = contextV
        var englishWord: TextView? = null
        var translateWord: TextView? = null
        var deleteItem : ImageView? = null
        var openItem : ImageView? = null
        var closeItem : ImageView? = null

        init{
            englishWord = itemView.tvWordRandom
            translateWord = itemView.tvTranslateRandom
            deleteItem = itemView.ivTwoDelRandom
            openItem = itemView.ivOpenEyeLearnedRandom
            closeItem = itemView.ivCloseEyeLearnedRandom
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