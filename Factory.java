import java.util.*;
/**
 * Universidad del valle de Guatemala
 * Factory
 * @author Christopher Chiroy, 14411
 * @param <E>
 */
public class Factory<E>{
	/**
	 * @param Seleccion
	 * @return Tipo de implementacion que se desea utilizar
	 */
	public Set<E> Set(int Seleccion){
		if(Seleccion == 1)
			return new HashSet<E>();
		else if (Seleccion == 2)
			return new LinkedHashSet<E>();
		else
			return new TreeSet<E>();
	}
}
