package ru.ulizina.lab4_todolist.data

import android.content.Context
import android.content.res.Resources
import ru.ulizina.lab4_todolist.R
import ru.ulizina.lab4_todolist.model.Task

class Datasource {
    fun loadTasks(): List<Task>{
        return listOf<Task>(
            Task(R.string.task1),
            Task(R.string.task2),
            Task(R.string.task3),
            Task(R.string.task4),
            Task(R.string.task5),
            Task(R.string.task6),
            Task(R.string.task7),
            Task(R.string.task8),
            Task(R.string.task9),
            Task(R.string.task10),
            Task(R.string.task11),
            Task(R.string.task12),
            Task(R.string.task13),
            Task(R.string.task14),
            Task(R.string.task15),
            Task(R.string.task16),
            Task(R.string.task17),
            Task(R.string.task18),
            Task(R.string.task19),
            Task(R.string.task20),
            Task(R.string.task21),
            Task(R.string.task22),
            Task(R.string.task23),
            Task(R.string.task24)
        )
    }



}