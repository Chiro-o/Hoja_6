import java.util.*;
public class Factory<E>{
	public Set<E> Set(int Seleccion){
		if(Seleccion == 1)
			return new HashSet<E>();
		else if (Seleccion == 2)
			return new LinkedHashSet<E>();
		else
			return new TreeSet<E>();
	}
}
