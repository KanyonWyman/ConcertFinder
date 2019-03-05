package cnm.edu.deepdive.concertfinder.model.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import cnm.edu.deepdive.concertfinder.model.entity.Event;
import java.util.List;

@Dao
public interface EventDao {

  @Insert(onConflict = OnConflictStrategy.IGNORE)
  List<Long> insert(Event... events);

  @Delete
  int delete(Event... events);
}
