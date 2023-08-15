package org.tech.SpringRegisterMvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tech.SpringRegisterMvc.Model.Register;
import org.tech.SpringRegisterMvc.repository.RegisterRepository;

@Service("RegisterService")
public class RegisterImplService  implements RegisterService{

	@Autowired
	RegisterRepository registerRepository;
	
	public boolean isAddEmployee(Register register) {
		 
		boolean b=registerRepository.isAddEmployee(register);
		return b;
	}

}
