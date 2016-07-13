package dev.shoulongli.slack.ui;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import dev.shoulongli.slack.R;
import dev.shoulongli.slack.model.Member;

/**
 * Created by shoulongli on 7/12/16.
 */
public class MemberListAdapter extends RecyclerView.Adapter<MemberViewHolder> {
    private List<Member> values;

    public MemberListAdapter(@NonNull List<Member> values) {
        this.values = values;
    }

    public MemberListAdapter() {
        this(new ArrayList<Member>());
    }

    @Override
    public MemberViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_list_item, parent, false);
        MemberViewHolder viewHolder = new MemberViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MemberViewHolder holder, int position) {
        holder.textView.setText("Test " + position);
    }

    @Override
    public int getItemCount() {
        return values.size();
    }

    public void setValues(@NonNull List<Member> members) {
        this.values = members;
        notifyDataSetChanged();
    }
}
