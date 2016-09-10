package shadownetinc.themidlandsmeander;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
// Talk about using Glide https://github.com/bumptech/glide
public class PlacesDetailActivity extends AppCompatActivity
{

    public static final String EXTRA_NAME = "place_name";

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        final String placeName = intent.getStringExtra(EXTRA_NAME);

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle(placeName);

        loadBackdrop();
    }

    private void loadBackdrop()
    {
        final ImageView imageView = (ImageView) findViewById(R.id.backdrop);
        Glide.with(this).load(PlacesActivity.getRandomPlacesDrawable()).centerCrop().into(imageView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        return true;
    }
}
