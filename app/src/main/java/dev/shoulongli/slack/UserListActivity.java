package dev.shoulongli.slack;

import android.app.Activity;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import dev.shoulongli.slack.api.SlackApi;
import dev.shoulongli.slack.model.UserListResponse;
import dev.shoulongli.slack.ui.MemberListAdapter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UserListActivity extends AppCompatActivity {

    @BindView(R.id.recyclerView) public RecyclerView recyclerView;
    public MemberListAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);

        ButterKnife.bind(this);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                super.getItemOffsets(outRect, view, parent, state);
                outRect.bottom = outRect.top = outRect.left = outRect.right = 10;
            }
        });
        adapter = new MemberListAdapter();
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onResume() {
        super.onResume();
        fetchUserList();
    }

    private void fetchUserList() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(SlackApi.SLACK_API_ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        SlackApi slackApi = retrofit.create(SlackApi.class);

        Call<UserListResponse> call = slackApi.getUserList(SlackApi.SLACK_API_TOKEN);
        call.enqueue(new Callback<UserListResponse>() {
            @Override
            public void onResponse(Call<UserListResponse> call, Response<UserListResponse> response) {
                if (response.isSuccessful()) {
                    adapter.setValues(response.body().getMembers());
                } else {
                    Toast.makeText(UserListActivity.this, "response is not successfull", Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<UserListResponse> call, Throwable t) {
                Toast.makeText(UserListActivity.this, "fetch user list failed", Toast.LENGTH_LONG).show();
            }
        });
    }
}
