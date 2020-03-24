package dk.au.orbitlab.database_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;

import java.util.UUID;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final DBEntityDatabase db = Room.databaseBuilder(this, DBEntityDatabase.class, "dbEntityDatabase").build();

        DBEntityDatabase.dbExecutor.execute(new Runnable() {
            @Override
            public void run() {
                db.dbEntityDao().getEntities();
            }
        });

        DBEntityDatabase.dbExecutor.execute(new Runnable() {
            @Override
            public void run() {
                db.dbEntityDao().insert(new DBEntity(UUID.randomUUID().toString()));
            }
        });
    }
}
