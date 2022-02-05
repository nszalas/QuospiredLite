package com.nszalas.quospiredlite.ViewModel

import androidx.lifecycle.*

import com.nszalas.quospiredlite.Model.Quote
import com.nszalas.quospiredlite.Model.QuoteRepository
import kotlinx.coroutines.launch

class QuoteViewModel(): ViewModel() {

    private val readAllQuotes: MutableLiveData<List<Quote>> = MutableLiveData()

    val all:LiveData<List<Quote>>
    get() {
        return readAllQuotes
    }


    fun postAll(){

        viewModelScope.launch {
            val quotes=QuoteRepository.getAll()

            if (quotes!=null)
                readAllQuotes.value=quotes!!
        }

    }
}