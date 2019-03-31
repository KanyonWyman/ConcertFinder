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


public class ShowsFragment extends Fragment {

  /**
   * This is the fragment where a list view of saved shows will be shown to the user.
   * @param inflater
   * @param container
   * @param savedInstanceState
   * @return
   */

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_shows, container, false);
  }

}
