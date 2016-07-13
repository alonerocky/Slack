package dev.shoulongli.slack.api;

import dev.shoulongli.slack.model.UserListResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by shoulongli on 7/12/16.
 */
public interface SlackApi {

    public static final String SLACK_API_ENDPOINT = "https://slack.com/api/";
    public static final String SLACK_API_TOKEN = "xoxp-5048173296-5048487710-19045732087-b5427e3b46";

    @GET("users.list")
    Call<UserListResponse> getUserList(@Query("token") String token);
}
