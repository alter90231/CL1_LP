package Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Empleado;
import interfacesservice.EmpleadoService;
import Interfaz.Interfaz;

@Service
public class EmpleadoServices implements EmpleadoService {
	
	@Autowired
	private Interfaz data;

	@Override
	public List<Empleado> listar() {

		return (List<Empleado>)data.findAll();
	}

	@Override
	public Optional<Empleado> listarId(String idEmpleado) {

		return data.findById(idEmpleado);
	}

	@Override
	public int save(Empleado e) {
		int res=0;
		Empleado empleado=data.save(e);
		if(!empleado.equals(null)) {
			res=1;
		}
		return res;
	}


	

	

	

}
