package interfacesservice;

import java.util.List;
import java.util.Optional;

import model.Empleado;

public interface EmpleadoService {
	
	public List<Empleado>listar();
    public Optional<Empleado>listarId(String id);
    public int save(Empleado e);
}