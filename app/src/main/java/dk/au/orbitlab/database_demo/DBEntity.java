package dk.au.orbitlab.database_demo;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "db_table")
public class DBEntity {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "dbEntity")
    public String mText;

    public DBEntity(String text) {
        mText = text;
    }

    public String getWord() {
        return mText;
    }
}
