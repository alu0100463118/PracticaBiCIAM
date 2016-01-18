package local_search.acceptation_type;

import java.util.List;

import metaheurictics.strategy.Strategy;

import problem.definition.State;

public class AcceptNotDominatedTabu extends AcceptableCandidate {

	@Override
	public Boolean acceptCandidate(State stateCurrent, State stateCandidate) {
		List<State> list = Strategy.getStrategy().listRefPoblacFinal;
		
		Dominance dominance = new Dominance();
		if(list.size() == 0){
			list.add(stateCurrent.clone());
		}
		//Verificando si la solucion candidata domina a alguna de las soluciones de la lista de soluciones no dominadas
		//De ser asi se eliminan de la lista y se adiciona la nueva solucion en la lista
		//De lo contrario no se adiciona la solucion candidata a la lista
		//Si fue insertada en la lista entonces la solucion candidata se convierte en solucion actual
		dominance.ListDominance(stateCandidate, list);
		return true;
	}
}
