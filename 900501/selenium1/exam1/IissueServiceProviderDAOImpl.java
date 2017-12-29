package selenium1.exam1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class IissueServiceProviderDAOImpl implements IissueServiceProviderDAO {

	public IissueServiceProviderDAOImpl() {
		super();
	}

	@Override
	public boolean insertIssue(Issue issue) throws SQLException {
		Connection con = DBConnector.getConnection();
		CallableStatement cstmt = con.prepareCall("{?=call INSERTISSUE(?,?,?,?)}");
		cstmt.registerOutParameter(1, java.sql.Types.INTEGER);
		cstmt.setInt(2, issue.getIssueId());
		cstmt.setString(3, issue.getIssueDescription());
		cstmt.setString(4, issue.getIssueCategory());
		cstmt.setDate(5, issue.getIssueGeneratedDate());

		cstmt.execute();
		int flag = cstmt.getInt(1);
		if (flag == 1)
			return true;
		else
			return false;
	}

	@Override
	public boolean deleteIssue(int issueId) throws SQLException {
		Connection con = DBConnector.getConnection();
		CallableStatement cstmt = con.prepareCall("{?=call DELETEISSUE(?)}");
		cstmt.registerOutParameter(1, Types.BOOLEAN);
		cstmt.setInt(2, issueId);
		cstmt.execute();
		if (cstmt.getBoolean(1)) {
			return true;
		} else
			return false;
	}

	@Override
	public boolean updateIssue(int issueId, Issue updatedIssue) throws SQLException {
		Connection con = DBConnector.getConnection();
		CallableStatement cstmt = con.prepareCall("{?=call UPDATEISSUE(?,?,?,?)}");
		cstmt.registerOutParameter(1, Types.BOOLEAN);
		cstmt.setInt(2, issueId);
		cstmt.setString(3, updatedIssue.getIssueDescription());
		cstmt.setString(4, updatedIssue.getIssueCategory());
		cstmt.setDate(5, updatedIssue.getIssueGeneratedDate());
		cstmt.execute();
		if (cstmt.getBoolean(1)) {
			return true;
		} else
			return false;
	}

	@Override
	public Issue getIssue(int issueId) throws SQLException {
		Connection con = DBConnector.getConnection();
		CallableStatement cstmt = con.prepareCall("{call READISSUE(?)}");
		cstmt.setInt(1, issueId);
		
		ResultSet rs = cstmt.executeQuery();
		return (Issue)rs.getObject(0);
	}

}
