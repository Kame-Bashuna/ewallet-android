package com.example.ewallet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class OverallSpendingAdapter (var spending:List<Spend>):RecyclerView.Adapter<OverallViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OverallViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.spending_list_items,parent,false)
        return OverallViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: OverallViewHolder, position: Int) {
    val monthSpending=spending[position]
    holder.etdate.text=monthSpending.date
    holder.rvSalary.text=monthSpending.about
    holder.tvMoney.text=monthSpending.totalSum
    }
    override fun getItemCount(): Int {
      return spending.size
    }
    }


class OverallViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
var etdate=itemView.findViewById<TextView>(R.id.etdate)
var rvSalary=itemView.findViewById<TextView>(R.id.rvSalary)
var tvMoney=itemView.findViewById<TextView>(R.id.tvMoney)
}