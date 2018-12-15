package com.example.zein.zeinyt2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.jawnnypoo.physicslayout.Physics;
import com.jawnnypoo.physicslayout.PhysicsLinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PhysicsLinearLayout physicsLinearLayout = (PhysicsLinearLayout) findViewById(R.id.physics_layout_body);
        physicsLinearLayout.getPhysics().enableFling();
        physicsLinearLayout.getPhysics().setOnCollisionListener(new Physics.OnCollisionListener() {
            @Override
            public void onCollisionEntered(int viewIdA, int viewIdB) {
                //Log.d("DEBUG" , viewIdA + " collided with " + viewIdB);
                if(viewIdA == R.id.image1 && viewIdB == R.id.image2){
                    Toast.makeText(getBaseContext(), "Cinta Sejati Ditemukan",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onCollisionExited(int viewIdA, int viewIdB) {

            }
        });
    }
}
