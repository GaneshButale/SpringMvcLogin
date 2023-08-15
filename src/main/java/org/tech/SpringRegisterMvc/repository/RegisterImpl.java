package org.tech.SpringRegisterMvc.repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;
import org.tech.SpringRegisterMvc.Model.Register;

@Repository("RegisterRepository")
public class RegisterImpl implements RegisterRepository {

	@Autowired
	JdbcTemplate template;
	List<Register> list;

	public boolean isAddEmployee(final Register register) {

		int val = template.update("insert into Regis values('0',?,?,?)", new PreparedStatementSetter() {

			public void setValues(PreparedStatement ps) throws SQLException {

				ps.setString(1, register.getName());
				ps.setString(2, register.getEmail());
				 
				 
				ps.setString(3, register.getPassword());
			}

		});
		if (val > 0) {
			return true;
		} else {
			return false;
		}
	}

}
