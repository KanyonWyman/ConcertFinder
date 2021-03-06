/**
 * @author Kanyon Wyman
 * @version 1.0
 */
package cnm.edu.deepdive.concertfinder.model.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity
public class User {

  @PrimaryKey
  @NonNull
  int _id;
  String _name;
  String _phone_number;
  String _email;

  public User() {
  }

  public User(int _id, String _name, String _email, String _phone_number) {
    this._id = _id;
    this._email = _email;
    this._name = _name;
    this._phone_number = _phone_number;
  }

  public User(String _name, String _email, String _phone_number) {
    this._email = _email;
    this._name = _name;
    this._phone_number = _phone_number;
  }

  public int get_id() {
    return _id;
  }

  public void set_id(int _id) {
    this._id = _id;
  }

  public String get_name() {
    return _name;
  }

  public void set_name(String _name) {
    this._name = _name;
  }

  public String get_phone_number() {
    return _phone_number;
  }

  public void set_phone_number(String _phone_number) {
    this._phone_number = _phone_number;
  }

  public String get_email() {
    return _email;
  }

  public void set_email(String _email) {
    this._email = _email;
  }
}
