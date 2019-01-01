package com.example.mwt.fragments.drinkingstatistics

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mwt.R
import com.github.mikephil.charting.data.Entry
import kotlinx.android.synthetic.main.drinking_statistics_fragment.view.*
import org.koin.android.viewmodel.ext.android.getViewModel
import com.example.mwt.db.dateprogressdb.DateProgressEntity
import com.example.mwt.recyclerview.StatisticsRecyclerViewAdapter
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import kotlinx.android.synthetic.main.drinking_statistics_fragment.*

class DrinkingStatisticsFragment : Fragment() {

    private lateinit var viewModel: DrinkingStatisticsViewModel
    private lateinit var statisticsRecyclerViewAdapter: StatisticsRecyclerViewAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.drinking_statistics_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.recyclerStatisticsView.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = getViewModel()

        statisticsRecyclerViewAdapter = StatisticsRecyclerViewAdapter().also(recyclerStatisticsView::setAdapter)

//        viewModel.getAllPosts().observe(viewLifecycleOwner, Observer (statisticsRecyclerViewAdapter::submitList))

        viewModel.getAllPosts().observe(viewLifecycleOwner, Observer {
            val dataSet = LineData(LineDataSet(entryCreator(it), "Daily"))
            view?.chart_daily?.data = dataSet

            statisticsRecyclerViewAdapter.submitList(it)

            //Log.d("TEST4", it.size.toString())
            Log.d("TEST4", statisticsRecyclerViewAdapter.itemCount.toString())
        })
    }

    private fun entryCreator(dataObjects : List<DateProgressEntity>): java.util.ArrayList<Entry>{
        val entries: java.util.ArrayList<Entry> = ArrayList()

        for (data in dataObjects) {
           // turn your data into Entry objects
           entries.add(Entry(data.id.toFloat(), data.progress.toFloat()))
        }

        return entries
    }


}

