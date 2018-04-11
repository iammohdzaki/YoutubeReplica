package zaphlabs.com.youtubelayout;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_trending:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_subscriptions:
                    mTextMessage.setText(R.string.title_subscriptions);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_activity);
                    return true;
                case R.id.navigation_library:
                    mTextMessage.setText(R.string.title_library);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.icons8playbutton48);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        BottomNavigationViewHelper.disableShiftMode(navigation);
       navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflator=getMenuInflater();
        inflator.inflate(R.menu.topicons,menu);
        return super.onCreateOptionsMenu(menu);

    }

}
