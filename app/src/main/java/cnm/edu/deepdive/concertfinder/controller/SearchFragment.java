package cnm.edu.deepdive.concertfinder.controller;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import cnm.edu.deepdive.concertfinder.R;
import cnm.edu.deepdive.concertfinder.service.holdmyticket.HoldMyTicketService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class SearchFragment extends Fragment implements TextWatcher {
  HoldMyTicketService service;
  ListView search_shows;
  ArrayAdapter<String> adapter;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_search, container, false);

  }

  @Override
  public void onActivityCreated(@Nullable Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);

    View view = getView();
    EditText txtSearch = view.findViewById(R.id.txtSearch);
    txtSearch.addTextChangedListener(this);
  }

  private void setupService() {
    Gson gson = new GsonBuilder()
        .create();
    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl("https://holdmyticket.com/api/")
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build();
    service = retrofit.create(HoldMyTicketService.class);
  }

  @Override
  public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

  }

  @Override
  public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

  }

  @Override
  public void afterTextChanged(Editable editable) {

  }
}
