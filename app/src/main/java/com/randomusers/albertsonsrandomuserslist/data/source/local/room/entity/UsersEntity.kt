package com.randomusers.albertsonsrandomuserslist.data.source.local.room.entityimport androidx.room.Entityimport androidx.room.PrimaryKey@Entitydata class UsersEntity(    @PrimaryKey    val fullName: String,    val gender: String,    val country: String,    val email: String,    val picture: String,)