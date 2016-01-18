import static org.junit.Assert.*;

import org.junit.Test;
//import local_search.candidate_type.*;
import local_search.complement.StopExecute;

public class pruebas {

	@Test
	public void test1() {
		int numeroActualIteraciones = 4;
		int numeroMaximoIteraciones = 4;
		boolean salir = StopExecute.stopIterations(numeroActualIteraciones, numeroMaximoIteraciones);
		assertTrue(salir);
	}

	@Test
	public void test2() {
		int numeroActualIteraciones = 2;
		int numeroMaximoIteraciones = 4;
		boolean salir = StopExecute.stopIterations(numeroActualIteraciones, numeroMaximoIteraciones);
		assertFalse(salir);
	}
	
}
