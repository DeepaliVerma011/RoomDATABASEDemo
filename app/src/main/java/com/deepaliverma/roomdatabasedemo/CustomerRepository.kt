package com.deepaliverma.roomdatabasedemo

import androidx.lifecycle.LiveData

class CustomerRepository(private val userDao: UserDao) {
    val allCustomers : LiveData<List<User>> = userDao.getAllUser()

    suspend fun insert(user: User){
        userDao.insert(user)
    }
}