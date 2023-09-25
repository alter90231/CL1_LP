package Interfaz;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.Empleado;

@Repository
public interface Interfaz extends CrudRepository<Empleado, String> {

}
