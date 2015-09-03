import java.util.*;

public class Desarrolladores {
	private Set<String> java;
	private Set<String> web;
	private Set<String> celular;
	private Factory<String> tipo;
	
	public Desarrolladores(int Seleccion){
		tipo = new Factory<String>();
		java = tipo.Set(Seleccion);
		web = tipo.Set(Seleccion);
		celular = tipo.Set(Seleccion);
	}
	
	public Set<String> getJava()     {return java;}
	public Set<String> getWeb()      {return web;}
	public Set<String> getCelular()  {return celular;}
	
	public void agregrDesarrollador(String nombre, int j, int w, int c){
		if(j==1)
			java.add(nombre);
		if(w==1)
			web.add(nombre);
		if(c==1)
			celular.add(nombre);
	}
	
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
	
	public void mayorDesordenado(){
		Iterator<String> Lista = conjuntoMayor().iterator();
		while(Lista.hasNext()){
			System.out.println(Lista.next());
		}
	}
	
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
