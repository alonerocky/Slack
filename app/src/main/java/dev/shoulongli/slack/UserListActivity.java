package dev.shoulongli.slack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import dev.shoulongli.slack.api.SlackApi;
import dev.shoulongli.slack.model.UserListResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UserListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);
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
                System.out.println(response.body());
            }

            @Override
            public void onFailure(Call<UserListResponse> call, Throwable t) {

            }
        });
    }
}
