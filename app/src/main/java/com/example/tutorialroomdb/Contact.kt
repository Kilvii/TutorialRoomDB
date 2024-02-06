package com.example.tutorialroomdb

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Contact(
    val firstName: String,
    val lastName: String,
    val phoneNumber: String,
    val description: String,

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)