package com.deepaliverma.roomdatabasedemo

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(user: User)

    @Query("Select * from users_table order by id ASC")
    fun getAllUser(): LiveData<List<User>>
}