package dev.shoulongli.slack;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;
import dev.shoulongli.slack.model.Member;

public class UserProfileActivity extends AppCompatActivity {

    public static final String USER_PROFILE_KEY = "USER_PROFILE_KEY";

    @BindView(R.id.user_name) public TextView userName;
    @BindView(R.id.user_real_name) public TextView userRealName;
    @BindView(R.id.user_job) public TextView userJob;
    @BindView(R.id.user_image) public ImageView userImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
        ButterKnife.bind(this);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String userGson = extras.getString(USER_PROFILE_KEY);
            Gson gson = new Gson();
            Member member = gson.fromJson(userGson, Member.class);
            Glide.with(this).load(member.getProfile().getImage192()).into(userImage);
            userName.setText(member.getName());
            userRealName.setText(member.getRealName());
            userJob.setText(member.getProfile().getTitle());
        }

    }
}
