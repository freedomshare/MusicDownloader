package com.andreacioccarelli.musicdownloader.data.checklist

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query


/**
 * Designed and Developed by Andrea Cioccarelli
 */

@Dao
interface ChecklistDao {
    @Insert(onConflict = REPLACE)
    fun add(entry: ChecklistEntry)

    @Query("SELECT * FROM checklist")
    fun getAll(): List<ChecklistEntry>

    @Query("SELECT * FROM checklist WHERE link LIKE :link")
    fun _find(link: String): List<ChecklistEntry>

    @Query("DELETE from checklist WHERE link LIKE :link")
    fun _remove(link: String)

    @Delete
    fun remove(entry: ChecklistEntry)
}