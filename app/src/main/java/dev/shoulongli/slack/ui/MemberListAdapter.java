package dev.shoulongli.slack.ui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import dev.shoulongli.slack.R;
import dev.shoulongli.slack.model.Member;

/**
 * Created by shoulongli on 7/12/16.
 */
public class MemberListAdapter extends RecyclerView.Adapter<MemberViewHolder> {
    private List<Member> values;
    private Context context;

    public MemberListAdapter(Context context, @NonNull List<Member> values) {
        this.values = values;
        this.context = context;
    }

    public MemberListAdapter(Context context) {
        this(context, new ArrayList<Member>());
    }

    @Override
    public MemberViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_list_item, parent, false);
        MemberViewHolder viewHolder = new MemberViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MemberViewHolder holder, int position) {
        Member member = values.get(position);
        holder.textView.setText(member.getProfile().getRealNameNormalized());
        Glide.with(context).load(member.getProfile().getImage48()).into(holder.imageView);

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
