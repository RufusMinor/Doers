package com.example.youdoclone.Data

import androidx.lifecycle.ViewModel
import com.example.youdoclone.DataJob
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class DataBase:ViewModel() {

lateinit var mDatabase: DatabaseReference

    fun requestDataBaseJob(){

        mDatabase=FirebaseDatabase.getInstance().getReference("job")

        mDatabase.addValueEventListener(object: ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                val data=snapshot.getValue(DataJob::class.java)

            }

            override fun onCancelled(error: DatabaseError) {

            }

        })
    }

}


