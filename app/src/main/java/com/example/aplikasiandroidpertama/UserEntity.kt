package com.example.aplikasiandroidpertama

import android.provider.ContactsContract
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "user")
data class UserEntity(
    @PrimaryKey(autoGenerate = true)
    val id:Int= 0,

    @ColumnInfo(name = "first_name")
    val namaDepan: String,

    @ColumnInfo(name = "last_name")
    val namaBelakang: String,

    val username: String,

    val email: String
)