package repository;

import org.eclipse.tags.shaded.org.apache.xalan.lib.sql.ConnectionPool;
import repository.utils.ConnectionWrapper;

public interface Repository {
    default ConnectionWrapper getConnectionWrapper() throws Exception {
        return ConnectionPool.getInstance().getConnectionWrapper();
    }
}
