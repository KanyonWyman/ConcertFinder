package cnm.edu.deepdive.concertfinder.model.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity
public class Ticket {

  @PrimaryKey
  @NonNull
  String _price;
  String _time;
  String _band;

  public Ticket() {
  }

  public Ticket(String _price, String _time, String _band) {
    this._price = _price;
    this._time = _time;
    this._band = _band;
  }

  public String get_price() {
    return _price;
  }

  public void set_price(String _price) {
    this._price = _price;
  }

  public String get_time() {
    return _time;
  }

  public void set_time(String _time) {
    this._time = _time;
  }

  public String get_band() {
    return _band;
  }

  public void set_band(String _band) {
    this._band = _band;
  }
}

