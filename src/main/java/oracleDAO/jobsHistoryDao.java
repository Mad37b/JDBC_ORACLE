package oracleDAO;

import java.util.List;

import oracleDBA.DaoInterface;
import oracleDBA.Jobs_history;
import oracleDBA.*;
public class jobsHistoryDao extends Jobs_history implements DaoInterface<Jobs_history>{

	@Override
	public Jobs_history get(Jobs_history table) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Jobs_history> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Jobs_history save(Jobs_history table) {
		Jobs_history jobsH = new Jobs_history();
		return jobsH;
		// TODO Auto-generated method stub
		
	}

	@Override
	public Jobs_history update(Jobs_history table, String[] params) {
		return table;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Jobs_history table) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Jobs_history get_name(Jobs_history t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Jobs_history get_id(Jobs_history t) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
