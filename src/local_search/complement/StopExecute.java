package local_search.complement;


public class StopExecute {
		
	public static Boolean stopIterations(int countIterationsCurrent, int countmaxIterations) {
		if (countIterationsCurrent < countmaxIterations) {
			return false;
		} else {
			return true;
		}
	}
}
