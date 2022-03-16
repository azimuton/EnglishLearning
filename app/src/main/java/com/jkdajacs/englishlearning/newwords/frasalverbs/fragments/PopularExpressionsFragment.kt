package com.jkdajacs.englishlearning.newwords.frasalverbs.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.jkdajacs.englishlearning.R
import com.jkdajacs.englishlearning.database.worddb.AppDatabase
import com.jkdajacs.englishlearning.database.worddb.Word
import kotlinx.android.synthetic.main.fragment_frasal_verbs.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [PopularExpressionsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PopularExpressionsFragment : Fragment() {
    lateinit var wordDatabase: AppDatabase
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
        wordDatabase = context?.let { AppDatabase.getDatabase(it) }!!
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_popular_expressions, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ivF1.setOnClickListener {
            val english : String = tvE1.text.toString()
            val translate : String = tvT1.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF2.setOnClickListener {
            val english : String = tvE2.text.toString()
            val translate : String = tvT2.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF3.setOnClickListener {
            val english : String = tvE3.text.toString()
            val translate : String = tvT3.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF4.setOnClickListener {
            val english : String = tvE4.text.toString()
            val translate : String = tvT4.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF5.setOnClickListener {
            val english : String = tvE5.text.toString()
            val translate : String = tvT5.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF6.setOnClickListener {
            val english : String = tvE6.text.toString()
            val translate : String = tvT6.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF7.setOnClickListener {
            val english : String = tvE7.text.toString()
            val translate : String = tvT7.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF8.setOnClickListener {
            val english : String = tvE8.text.toString()
            val translate : String = tvT8.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF9.setOnClickListener {
            val english : String = tvE9.text.toString()
            val translate : String = tvT9.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF10.setOnClickListener {
            val english : String = tvE10.text.toString()
            val translate : String = tvT10.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF11.setOnClickListener {
            val english : String = tvE11.text.toString()
            val translate : String = tvT11.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF12.setOnClickListener {
            val english : String = tvE12.text.toString()
            val translate : String = tvT12.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF13.setOnClickListener {
            val english : String = tvE13.text.toString()
            val translate : String = tvT13.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF14.setOnClickListener {
            val english : String = tvE14.text.toString()
            val translate : String = tvT14.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF15.setOnClickListener {
            val english : String = tvE15.text.toString()
            val translate : String = tvT15.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF16.setOnClickListener {
            val english : String = tvE16.text.toString()
            val translate : String = tvT16.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF17.setOnClickListener {
            val english : String = tvE17.text.toString()
            val translate : String = tvT17.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF18.setOnClickListener {
            val english : String = tvE18.text.toString()
            val translate : String = tvT18.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF19.setOnClickListener {
            val english : String = tvE19.text.toString()
            val translate : String = tvT19.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF20.setOnClickListener {
            val english : String = tvE20.text.toString()
            val translate : String = tvT20.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF21.setOnClickListener {
            val english : String = tvE21.text.toString()
            val translate : String = tvT21.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF22.setOnClickListener {
            val english : String = tvE22.text.toString()
            val translate : String = tvT22.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF23.setOnClickListener {
            val english : String = tvE23.text.toString()
            val translate : String = tvT23.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF24.setOnClickListener {
            val english : String = tvE24.text.toString()
            val translate : String = tvT24.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF25.setOnClickListener {
            val english : String = tvE25.text.toString()
            val translate : String = tvT25.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF26.setOnClickListener {
            val english : String = tvE26.text.toString()
            val translate : String = tvT26.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF27.setOnClickListener {
            val english : String = tvE27.text.toString()
            val translate : String = tvT27.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF28.setOnClickListener {
            val english : String = tvE28.text.toString()
            val translate : String = tvT28.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF29.setOnClickListener {
            val english : String = tvE29.text.toString()
            val translate : String = tvT29.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF30.setOnClickListener {
            val english : String = tvE30.text.toString()
            val translate : String = tvT30.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF31.setOnClickListener {
            val english : String = tvE31.text.toString()
            val translate : String = tvT31.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF32.setOnClickListener {
            val english : String = tvE32.text.toString()
            val translate : String = tvT32.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF33.setOnClickListener {
            val english : String = tvE33.text.toString()
            val translate : String = tvT33.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF34.setOnClickListener {
            val english : String = tvE34.text.toString()
            val translate : String = tvT34.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF35.setOnClickListener {
            val english : String = tvE35.text.toString()
            val translate : String = tvT35.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF36.setOnClickListener {
            val english : String = tvE36.text.toString()
            val translate : String = tvT36.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF37.setOnClickListener {
            val english : String = tvE37.text.toString()
            val translate : String = tvT37.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF38.setOnClickListener {
            val english : String = tvE38.text.toString()
            val translate : String = tvT38.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF39.setOnClickListener {
            val english : String = tvE39.text.toString()
            val translate : String = tvT39.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF40.setOnClickListener {
            val english : String = tvE40.text.toString()
            val translate : String = tvT40.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF41.setOnClickListener {
            val english : String = tvE41.text.toString()
            val translate : String = tvT41.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF42.setOnClickListener {
            val english : String = tvE42.text.toString()
            val translate : String = tvT42.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF43.setOnClickListener {
            val english : String = tvE43.text.toString()
            val translate : String = tvT43.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF44.setOnClickListener {
            val english : String = tvE44.text.toString()
            val translate : String = tvT44.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF45.setOnClickListener {
            val english : String = tvE45.text.toString()
            val translate : String = tvT45.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF46.setOnClickListener {
            val english : String = tvE46.text.toString()
            val translate : String = tvT46.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF47.setOnClickListener {
            val english : String = tvE47.text.toString()
            val translate : String = tvT47.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF48.setOnClickListener {
            val english : String = tvE48.text.toString()
            val translate : String = tvT48.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF49.setOnClickListener {
            val english : String = tvE49.text.toString()
            val translate : String = tvT49.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF50.setOnClickListener {
            val english : String = tvE50.text.toString()
            val translate : String = tvT50.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF51.setOnClickListener {
            val english : String = tvE51.text.toString()
            val translate : String = tvT51.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF52.setOnClickListener {
            val english : String = tvE52.text.toString()
            val translate : String = tvT52.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF53.setOnClickListener {
            val english : String = tvE53.text.toString()
            val translate : String = tvT53.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF54.setOnClickListener {
            val english : String = tvE54.text.toString()
            val translate : String = tvT54.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF55.setOnClickListener {
            val english : String = tvE55.text.toString()
            val translate : String = tvT55.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF56.setOnClickListener {
            val english : String = tvE56.text.toString()
            val translate : String = tvT56.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF57.setOnClickListener {
            val english : String = tvE57.text.toString()
            val translate : String = tvT57.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF58.setOnClickListener {
            val english : String = tvE58.text.toString()
            val translate : String = tvT58.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF59.setOnClickListener {
            val english : String = tvE59.text.toString()
            val translate : String = tvT59.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF60.setOnClickListener {
            val english : String = tvE60.text.toString()
            val translate : String = tvT60.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF61.setOnClickListener {
            val english : String = tvE61.text.toString()
            val translate : String = tvT61.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF62.setOnClickListener {
            val english : String = tvE62.text.toString()
            val translate : String = tvT62.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF63.setOnClickListener {
            val english : String = tvE63.text.toString()
            val translate : String = tvT63.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF64.setOnClickListener {
            val english : String = tvE64.text.toString()
            val translate : String = tvT64.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF65.setOnClickListener {
            val english : String = tvE65.text.toString()
            val translate : String = tvT65.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF66.setOnClickListener {
            val english : String = tvE66.text.toString()
            val translate : String = tvT66.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF67.setOnClickListener {
            val english : String = tvE67.text.toString()
            val translate : String = tvT67.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF68.setOnClickListener {
            val english : String = tvE68.text.toString()
            val translate : String = tvT68.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF69.setOnClickListener {
            val english : String = tvE69.text.toString()
            val translate : String = tvT69.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF70.setOnClickListener {
            val english : String = tvE70.text.toString()
            val translate : String = tvT70.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF71.setOnClickListener {
            val english : String = tvE71.text.toString()
            val translate : String = tvT71.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF72.setOnClickListener {
            val english : String = tvE72.text.toString()
            val translate : String = tvT72.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF73.setOnClickListener {
            val english : String = tvE73.text.toString()
            val translate : String = tvT73.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF74.setOnClickListener {
            val english : String = tvE74.text.toString()
            val translate : String = tvT74.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF75.setOnClickListener {
            val english : String = tvE75.text.toString()
            val translate : String = tvT75.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF76.setOnClickListener {
            val english : String = tvE76.text.toString()
            val translate : String = tvT76.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF77.setOnClickListener {
            val english : String = tvE77.text.toString()
            val translate : String = tvT77.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF78.setOnClickListener {
            val english : String = tvE78.text.toString()
            val translate : String = tvT78.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF79.setOnClickListener {
            val english : String = tvE79.text.toString()
            val translate : String = tvT79.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF80.setOnClickListener {
            val english : String = tvE80.text.toString()
            val translate : String = tvT80.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF81.setOnClickListener {
            val english : String = tvE81.text.toString()
            val translate : String = tvT81.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF82.setOnClickListener {
            val english : String = tvE82.text.toString()
            val translate : String = tvT82.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF83.setOnClickListener {
            val english : String = tvE83.text.toString()
            val translate : String = tvT83.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF84.setOnClickListener {
            val english : String = tvE84.text.toString()
            val translate : String = tvT84.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF85.setOnClickListener {
            val english : String = tvE85.text.toString()
            val translate : String = tvT85.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF86.setOnClickListener {
            val english : String = tvE86.text.toString()
            val translate : String = tvT86.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF87.setOnClickListener {
            val english : String = tvE87.text.toString()
            val translate : String = tvT87.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF88.setOnClickListener {
            val english : String = tvE88.text.toString()
            val translate : String = tvT88.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF89.setOnClickListener {
            val english : String = tvE89.text.toString()
            val translate : String = tvT89.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF90.setOnClickListener {
            val english : String = tvE90.text.toString()
            val translate : String = tvT90.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF91.setOnClickListener {
            val english : String = tvE91.text.toString()
            val translate : String = tvT91.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF92.setOnClickListener {
            val english : String = tvE92.text.toString()
            val translate : String = tvT92.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF93.setOnClickListener {
            val english : String = tvE93.text.toString()
            val translate : String = tvT93.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF94.setOnClickListener {
            val english : String = tvE94.text.toString()
            val translate : String = tvT94.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF95.setOnClickListener {
            val english : String = tvE95.text.toString()
            val translate : String = tvT95.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF96.setOnClickListener {
            val english : String = tvE96.text.toString()
            val translate : String = tvT96.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF97.setOnClickListener {
            val english : String = tvE97.text.toString()
            val translate : String = tvT97.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF98.setOnClickListener {
            val english : String = tvE98.text.toString()
            val translate : String = tvT98.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF99.setOnClickListener {
            val english : String = tvE99.text.toString()
            val translate : String = tvT99.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF100.setOnClickListener {
            val english : String = tvE100.text.toString()
            val translate : String = tvT100.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF101.setOnClickListener {
            val english : String = tvE101.text.toString()
            val translate : String = tvT101.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF102.setOnClickListener {
            val english : String = tvE102.text.toString()
            val translate : String = tvT102.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF103.setOnClickListener {
            val english : String = tvE103.text.toString()
            val translate : String = tvT103.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF104.setOnClickListener {
            val english : String = tvE104.text.toString()
            val translate : String = tvT104.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF105.setOnClickListener {
            val english : String = tvE105.text.toString()
            val translate : String = tvT105.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF106.setOnClickListener {
            val english : String = tvE106.text.toString()
            val translate : String = tvT106.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF107.setOnClickListener {
            val english : String = tvE107.text.toString()
            val translate : String = tvT107.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF108.setOnClickListener {
            val english : String = tvE108.text.toString()
            val translate : String = tvT108.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF109.setOnClickListener {
            val english : String = tvE109.text.toString()
            val translate : String = tvT109.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF110.setOnClickListener {
            val english : String = tvE110.text.toString()
            val translate : String = tvT110.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF111.setOnClickListener {
            val english : String = tvE111.text.toString()
            val translate : String = tvT111.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        ivF112.setOnClickListener {
            val english : String = tvE112.text.toString()
            val translate : String = tvT112.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            wordDatabase.wordDao().insertWord(word)
            Toast.makeText(context, "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment PopularExpressionsFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            PopularExpressionsFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}