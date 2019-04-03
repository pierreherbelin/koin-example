package com.kraker.examplekoin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kraker.examplekoin.feature.ExampleRepository
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val mExampleRepository: ExampleRepository by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        injectButton.setOnClickListener {
            mExampleRepository.showMessage()
        }
    }
}
