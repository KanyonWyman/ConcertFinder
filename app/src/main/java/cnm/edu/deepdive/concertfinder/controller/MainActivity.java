/**
 * @author Kanyon Wyman
 * @version 1.0
 */
package cnm.edu.deepdive.concertfinder.controller;

import android.content.Intent;
import android.os.Bundle;
import android.preference.TwoStatePreference;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import cnm.edu.deepdive.concertfinder.R;
import cnm.edu.deepdive.concertfinder.service.GoogleSignInService;

public class MainActivity extends AppCompatActivity
    implements NavigationView.OnNavigationItemSelectedListener {

  /**
   * The main class of the navigation view
   */
  private TwoStatePreference menuItem;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);

    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

    ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
        this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
    drawer.addDrawerListener(toggle);
    toggle.syncState();

    NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
    navigationView.setNavigationItemSelectedListener(this);

    if (savedInstanceState == null) {
    }

    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_layout, new SearchFragment()).commit();

    }




  @Override
  public void onBackPressed() {
    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
    if (drawer.isDrawerOpen(GravityCompat.START)) {
      drawer.closeDrawer(GravityCompat.START);
    } else {
      super.onBackPressed();
    }
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    boolean handled = true;
    int id = item.getItemId();
    if (id == R.id.sign_out) {
      signOut();
      return handled;
    }

    return super.onOptionsItemSelected(item);
  }

  @SuppressWarnings("StatementWithEmptyBody")
  @Override
  public boolean onNavigationItemSelected(@NonNull MenuItem item) {
    switch (item.getItemId()) {
      case R.id.nav_search:
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_layout, new SearchFragment()).commit();
        break;
      case R.id.nav_gallery:
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_layout, new ShowsFragment()).commit();
        break;
      case R.id.nav_event:
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_layout, new EventsFragment()).commit();
        break;
      case R.id.nav_share:
        Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show();
        break;
      case R.id.nav_manage:
        //TODO jump to manage
        break;
  }
    item.setChecked(true);
    setTitle(item.getTitle());
    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
    drawer.closeDrawer(GravityCompat.START);
    return true;
  }

  private void signOut() {
    GoogleSignInService.getInstance().getClient()
        .signOut()
        .addOnCompleteListener(this, (task) -> {
      GoogleSignInService.getInstance().setAccount(null);
          Intent intent = new Intent(this, LoginActivity.class);
          intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
          startActivity(intent);
          /**
           * This method serves as a button on the main screen to sign out of the app.
           */
    });
  }
}
