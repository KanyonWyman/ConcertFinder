package cnm.edu.deepdive.concertfinder.controller;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import cnm.edu.deepdive.concertfinder.R;


public class SearchFragment extends Fragment {

  ListView search_shows;
  ArrayAdapter<String> adapter;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_search, container, false);

  }

}
