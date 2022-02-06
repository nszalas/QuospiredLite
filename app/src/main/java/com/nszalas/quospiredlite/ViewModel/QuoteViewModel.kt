package com.nszalas.quospiredlite.ViewModel

import androidx.lifecycle.*

import com.nszalas.quospiredlite.Model.Quote
import com.nszalas.quospiredlite.Model.QuoteRepository
import kotlinx.coroutines.launch

class QuoteViewModel(): ViewModel() {

    val readAllQuotes: MutableLiveData<List<Quote>> = MutableLiveData()

    val all:LiveData<List<Quote>>

    get() {
        return readAllQuotes
    }

    var allAll = all

    fun postAll(){

        viewModelScope.launch {
            val quotes=QuoteRepository.getAll()

            if (quotes!=null)
                readAllQuotes.value=quotes!!
        }

    }

    fun setDataQuotes(quote: LiveData<List<Quote>>){

        this.allAll = quote

    }
}