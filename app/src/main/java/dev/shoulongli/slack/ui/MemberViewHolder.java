package dev.shoulongli.slack.ui;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import dev.shoulongli.slack.R;

/**
 * Created by shoulongli on 7/12/16.
 */
public class MemberViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.user_image) public ImageView imageView;
    @BindView(R.id.user_name) public TextView textView;
    public MemberViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
