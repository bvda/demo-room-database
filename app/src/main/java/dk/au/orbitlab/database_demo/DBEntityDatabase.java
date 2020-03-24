package dk.au.orbitlab.database_demo;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {DBEntity.class}, version = 1, exportSchema = false)
public abstract class DBEntityDatabase extends RoomDatabase {

    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService dbExecutor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    public abstract DBEntityDAO dbEntityDao();
}
