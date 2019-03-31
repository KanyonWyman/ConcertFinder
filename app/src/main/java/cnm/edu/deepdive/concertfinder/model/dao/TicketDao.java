/**
 * @author Kanyon Wyman
 * @version 1.0
 */
package cnm.edu.deepdive.concertfinder.model.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import cnm.edu.deepdive.concertfinder.model.entity.Ticket;
import java.util.List;

@Dao
public interface TicketDao {

  @Insert(onConflict = OnConflictStrategy.IGNORE)
  List<Long> insert(Ticket... tickets);

  @Delete
  int delete(Ticket... tickets);
}

