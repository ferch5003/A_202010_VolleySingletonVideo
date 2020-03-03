package com.uninorte.a_202010_volleysingletonvideo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONArray
import org.json.JSONObject

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: RandomUserViewModel
    private var userList = mutableListOf<RandomUser>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(RandomUserViewModel::class.java)

        /*
        viewModel.getUsers().observe(this, Observer { users ->
            run {
                userList = users as MutableList<RandomUser>
                Log.d("VideoVolleyLiveData","userList size ${userList.size}")
            }
        })

         */

        button.setOnClickListener {
            // VolleySingleton.getInstance(this).addToRequestQueue(getJsonObjectRequest())
            //viewModel.addUser()
        }
    }
}
