//  작업 목록 객체 RecyclerView
package com.example.jikgong.view.main.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.jikgong.R

//<> 사이 "나중에 작업목록 데이터 리스트 엔티티 추가 해야함"
class JobListRVAdapter(val context: Context, val dataSet: List<>) :
    RecyclerView.Adapter<JobListRVAdapter.ViewHolder>() {
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }

    //  새로운 뷰 홀더가 필요할 때마다 RecyclerView 에 의해 호출
    //  이 메소드에서 새로운 뷰 생성후 해당 뷰를 관리할 ViewHolder 를 생성하여 반환
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.main_job_info, parent, false)
        return ViewHolder(view)
    }

    //  뷰 홀더가 데이터와 바인딩될 때마다 RecyclerView 에 의해 호출됨
    //  position 매개 변수를 이용 데이터 셋에서 적절한 데이터를 찾아 뷰 홀더에 바인딩
    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    //  RecyclerView 에서 데이터 셋의 크기를 조회할 때 호출
    //  이 메소드는 데이터 셋의 전체 항목 수를 반환해야 함
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        return dataSet.size
    }
}