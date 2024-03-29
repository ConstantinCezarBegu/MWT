package com.example.mwt.util

import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.mwt.db.MWTDatabase
import com.example.mwt.fragments.bmi.BMIViewModel
import com.example.mwt.fragments.drinkingstatistics.DrinkingStatisticsViewModel
import com.example.mwt.fragments.goals.GoalsViewModel
import com.example.mwt.fragments.trackerLog.log.DrinkingLogViewModel
import com.example.mwt.fragments.trackerLog.tracker.TrackerViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.koin.android.ext.koin.androidContext
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val MWTModule = module {
    single {
        Room.databaseBuilder(androidContext(), MWTDatabase::class.java, "MyWaterTrackerDatabase.db")
                .addCallback(object : RoomDatabase.Callback() {
                    override fun onCreate(db: SupportSQLiteDatabase) {
                        GlobalScope.launch {
                            get<MWTDatabase>().containerDao().saveAll(MWTDatabase.CONTAINERS)
                        }
                    }
                })
                .build()
    }

    single {
        get<MWTDatabase>().containerDao()
    }

    single {
        get<MWTDatabase>().dateProgressDao()
    }

    single {
        get<MWTDatabase>().dailyLogDao()
    }

    single {
        get<MWTDatabase>().achievementsDao()
    }

    single {
        get<MWTDatabase>().bmiRecordDao()
    }

    viewModel {
        TrackerViewModel(get())
    }

    viewModel {
        DrinkingStatisticsViewModel(get())
    }

    viewModel {
        DrinkingLogViewModel(get())
    }

    viewModel {
        GoalsViewModel(get())
    }

    viewModel {
        BMIViewModel(get())
    }
}
