package cnm.edu.deepdive.concertfinder.model.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity
public class Event {

 @PrimaryKey
 @NonNull
  String _time;
  String _date;
  String _location;

  public Event() {
  }

  public Event(String _date, String _time, String _location) {
    this._date = _date;
    this._time = _time;
    this._location = _location;
  }

  public String get_time() {
    return _time;
  }

  public void set_time(String _time) {
    this._time = _time;
  }

  public String get_date() {
    return _date;
  }

  public void set_date(String _date) {
    this._date = _date;
  }

  public String get_location() {
    return _location;
  }

  public void set_location(String _location) {
    this._location = _location;
  }
}
