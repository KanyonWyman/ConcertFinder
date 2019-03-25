package cnm.edu.deepdive.concertfinder.service.holdmyticket.models;

import java.util.List;

public class EventsResponse {

  List<Event> events = null;

  class Event {
    String id;
    String repeating_parent_id;
    String title;
    String start;
    String sold_out;
    String doors;
    String description;
    String ticket_price_display;
    String tickets_at_door;
    String venue_name;
    String venue_address1;
    String venue_city;
    String venue_state;
    String venue_zip;
    String venue_phone;
    String label;
    String ticket_url;
  }
}
