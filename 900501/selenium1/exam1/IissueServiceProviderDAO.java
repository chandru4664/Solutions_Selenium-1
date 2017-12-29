package selenium1.exam1;

import java.sql.SQLException;

public interface IissueServiceProviderDAO {
	public boolean insertIssue(Issue issue) throws SQLException;
	public boolean deleteIssue(int issueId)throws SQLException;
	public boolean updateIssue(int issueId,Issue updatedMobile)throws SQLException;
	public Issue getIssue(int issueId)throws SQLException;
}
