package com.kraker.examplekoin.feature

import android.content.Context
import android.widget.Toast
import com.kraker.examplekoin.R

class ExampleRepository(private val mContext: Context) : IExampleRepository {

    /**
     * Showing a toast to prove that the android mContext is successfully injected
     */
    override fun showMessage() {
        Toast.makeText(mContext, mContext.getString(R.string.context_injected), Toast.LENGTH_LONG).show()
    }
}