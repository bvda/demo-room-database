package dk.au.orbitlab.database_demo;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface DBEntityDAO {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(DBEntity entity);

    @Query("DELETE FROM db_table")
    void deleteAll();

    @Query("SELECT * from db_table")
    List<DBEntity> getEntities();
}
