package com.example.imworkstation.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MapFragment extends Fragment implements OnMapReadyCallback {

    GoogleMap mGoogleMap;
    MapView mMapView;
    View mView;

    public MapFragment(){

    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.activity_mapfragment, container, false);
    return mView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mMapView = (MapView)mView.findViewById(R.id.mapFragment);
        if (mMapView !=null){

            mMapView.onCreate(null);
            mMapView.onResume();
            mMapView.getMapAsync(this);
        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        MapsInitializer.initialize(getContext());

        mGoogleMap = googleMap;
        googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

        googleMap.getUiSettings().setZoomGesturesEnabled(true);
        googleMap.getUiSettings().setRotateGesturesEnabled(true);

        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(39.744678, 37.011712),10));

        googleMap.addMarker(new MarkerOptions().position(new LatLng(39.744678, 37.011712)).title("Sivas Devlet Hastanesi").snippet("İletişim: 0(346)221-7036").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(39.750956, 37.015145)).title("Valilik").snippet("İletişim: 0(346)224-4545").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(39.750818, 37.016260)).title("Belediye").snippet("İletişim: 0(346)221-0110").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(39.748111, 37.012035)).title("İl Afet ve Acil Durum Müdürlüğü").snippet("İletişim: 0(346)221-2917").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(39.741644, 37.028639)).title("Medicana Sivas Hastanesi").snippet("İletişim:0(346)215-0555").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(39.740462, 37.029833)).title("Emniyet Müdürlüğü").snippet("İletişim: 0(346)215-1100").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(39.740854, 37.040157)).title("Numune Hastanesi").snippet("İletişim: 0(346)224-2664").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

    }
}
