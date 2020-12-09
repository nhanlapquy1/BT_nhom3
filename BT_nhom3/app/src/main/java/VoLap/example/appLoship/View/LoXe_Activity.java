package VoLap.example.appLoship.View;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.example.circleview.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class LoXe_Activity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lo_xe);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(16.077036, 108.2125183);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Trường ĐH Sư Phạm Kỹ Thuật"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney,19));
    }
}