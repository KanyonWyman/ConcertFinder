package cnm.edu.deepdive.concertfinder.service.holdmyticket;

import cnm.edu.deepdive.concertfinder.service.holdmyticket.models.EventsResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface HoldMyTicketService {
  // /public/events/nearby?search=<query>
  @GET("public/events/nearby")
  Call<EventsResponse> getEventsNearby(@Query("search") String search);
}
