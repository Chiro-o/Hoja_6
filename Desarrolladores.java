import java.util.*;

/**
 * Universidad del valle de Guatemala
 * @author Christopher Chiroy, 14411
 * Desarrolladores, contiene los metodos que organizan a los tres tipos de desarrolladores
 */
public class Desarrolladores {
	private Set<String> java;
	private Set<String> web;
	private Set<String> celular;
	private Factory<String> tipo;
	
	/**
	 * @param Seleccion
	 * Constructor
	 */
	public Desarrolladores(int Seleccion){
		tipo = new Factory<String>();
		java = tipo.Set(Seleccion);
		web = tipo.Set(Seleccion);
		celular = tipo.Set(Seleccion);
	}
	
	/**
	 * @return java
	 */
	public Set<String> getJava()     {return java;}
	public Set<String> getWeb()      {return web;}
	public Set<String> getCelular()  {return celular;}
	
	/**
	 * @param nombre
	 * @param j
	 * @param w
	 * @param c
	 * Agrega un desarrollador a al grupo correspondiente
	 */
	public void agregrDesarrollador(String nombre, int j, int w, int c){
		if(j==1)
			java.add(nombre);
		if(w==1)
			web.add(nombre);
		if(c==1)
			celular.add(nombre);
	}
	
	/**
	 * Muestra el listado de las personas que son desarrolladores java, web y celulares
	 */
	public void JWC(){
		Iterator<String> condicion = java.iterator();
		Set<String> cumplen = new HashSet<String>();
		while(condicion.hasNext()){
			String valor = condicion.next();
			if(web.contains(valor)&&celular.contains(valor)){
				cumplen.add(valor);
			}
		}
		System.out.println("Las personas con experiencia en java, web y celulares son:");
		Iterator<String> Lista = cumplen.iterator();
		while(Lista.hasNext()){
			System.out.println(Lista.next());
		}
	}
	
	/**
	 * Muestra el listado de las personas que son desarrolladores web pero no java
	 */
	public void JnoW(){
		Iterator<String> condicion = java.iterator();
		Set<String> cumplen = new HashSet<String>();
		while(condicion.hasNext()){
			String valor = condicion.next();
			if(!web.contains(valor)){
				cumplen.add(valor);
			}
		}
		System.out.println("Las personas con experiencia en web pero no en Java son:");
		Iterator<String> Lista = cumplen.iterator();
		while(Lista.hasNext()){
			System.out.println(Lista.next());
		}
	}
	
	/**
	 * Muestra el listado de las personas que son desarrolladores web y celular pero no java
	 */
	public void WyCnoJ(){
		Iterator<String> condicion = java.iterator();
		Set<String> cumplen = new HashSet<String>();
		while(condicion.hasNext()){
			String valor = condicion.next();
			if(!web.contains(valor) && !celular.contains(valor)){
				cumplen.add(valor);
			}
		}
		System.out.println("Las personas con experiencia en web y celulares pero no en Java son:");
		Iterator<String> Lista = cumplen.iterator();
		while(Lista.hasNext()){
			System.out.println(Lista.next());
		}
	}
	
	/**
	 * Muestra el listado de las personas que son desarrolladores web o celular pero no java
	 */
	public void WoC(){
		Iterator<String> condicion = java.iterator();
		Set<String> cumplen = new HashSet<String>();
		while(condicion.hasNext()){
			String valor = condicion.next();
			if(!web.contains(valor) || !celular.contains(valor)){
				cumplen.add(valor);
			}
		}
		System.out.println("Las personas con experiencia en web o celulares pero no en Java son:");
		Iterator<String> Lista = cumplen.iterator();
		while(Lista.hasNext()){
			System.out.println(Lista.next());
		}
	}
	
	/**
	 * Verifica si el conjunto de desarrolladores java es un subconjunto de desarrolladores web
	 */
	public void javaSubWeb(){
		Iterator<String> condicion = java.iterator();
		Set<String> cumplen = new HashSet<String>();
		while(condicion.hasNext()){
			String valor = condicion.next();
			if(web.contains(valor)){
				cumplen.add(valor);
			}
		}
		if(cumplen.size()==java.size() && web.size()>=java.size())
			System.out.println("Los desarrolladores de Java SI son un subConjunto de los desarrolladores web");
		else
			System.out.println("Los desarrolladores de Java NO son un subConjunto de los desarrolladores web");
	}
	
	/**
	 * @return El Conjunto con mayor cantidad de desarrolladores
	 */
	public Set<String> conjuntoMayor(){
		if(java.size()>web.size() && java.size()>celular.size()){
			System.out.println("El conjunto con mayor cantidad de desarrolladores es Java y los integrantes son:");
			return java;
		}
		else if(web.size()>java.size() && web.size()>celular.size()){
			System.out.println("El conjunto con mayor cantidad de desarrolladores es Web y los integrantes son:");
			return web;
		}
		else{
			System.out.println("El conjunto con mayor cantidad de desarrolladores es celulares y los integrantes son:");
			return celular;
		}
	}
	
	/**
	 * Devuelve el conjunto con mayor cantidad de desarrolladores desordenado
	 */
	public void mayorDesordenado(){
		Iterator<String> Lista = conjuntoMayor().iterator();
		while(Lista.hasNext()){
			System.out.println(Lista.next());
		}
	}
	
	/**
	 * Devuelve el conjunto con mayor cantidad de desarrolladores oedenado
	 */
	public void mayorOrdenado(){
		Iterator<String> desorden = conjuntoMayor().iterator();
		Set<String> orden = new TreeSet<String>();
		while(desorden.hasNext()){
			String valor = desorden.next();
			orden.add(valor);
			}
		
		Iterator<String> Lista = orden.iterator();
		while(Lista.hasNext()){
			System.out.println(Lista.next());
		
		}
	}
	
}
