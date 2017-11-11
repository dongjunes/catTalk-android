package cattalk.depromeet.dongjune.cattalk_android.network.service;

import cattalk.depromeet.dongjune.cattalk_android.network.vo.ChattingVo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by dongjune on 2017-11-12.
 */

public interface ChattingService {
    @GET("/api/go/{message}")
    Call<ChattingVo> getAnswers(@Path("message") String Message);


}
