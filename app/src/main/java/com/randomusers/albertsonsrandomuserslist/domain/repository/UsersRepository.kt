package com.randomusers.albertsonsrandomuserslist.domain.repositoryimport kotlinx.coroutines.flow.Flowimport com.randomusers.albertsonsrandomuserslist.data.model.UsersModelinterface UsersRepository {    fun getAllUser(): Flow<List<UsersModel>>}