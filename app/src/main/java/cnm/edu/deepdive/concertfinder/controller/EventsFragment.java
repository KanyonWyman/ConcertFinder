/**
 * @author Kanyon Wyman
 * @version 1.0
 */
package cnm.edu.deepdive.concertfinder.controller;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import cnm.edu.deepdive.concertfinder.R;


public class EventsFragment extends Fragment {

  /**
   *
   * @param inflater
   * @param container
   * @param savedInstanceState
   * @return
   */



  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_events, container, false);
  }

}
