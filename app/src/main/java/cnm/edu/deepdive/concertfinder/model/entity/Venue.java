/**
 * @author Kanyon Wyman
 * @version 1.0
 */
package cnm.edu.deepdive.concertfinder.model.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity
public class Venue {

  @PrimaryKey
  @NonNull
  String _name;
  String _location;

  public Venue() {
  }

  public Venue(String _name, String _location) {
    this._name = _name;
    this._location = _location;
  }

  public String get_name() {
    return _name;
  }

  public void set_name(String _name) {
    this._name = _name;
  }

  public String get_location() {
    return _location;
  }

  public void set_location(String _location) {
    this._location = _location;
  }
}

