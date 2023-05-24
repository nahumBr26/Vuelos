package telcel.curos.coleciones.proyectovuelos.dominio;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class ProyectoVuelos {

	public static void main(String[] args) throws Exception {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		
		List<Vuelo> llegadas = new ArrayList<>();
		
		llegadas.add(new Vuelo("AAL933","NewYork", "México", df.parse("2022-08-25 05:39"), 62));
		llegadas.add(new Vuelo("LAT55","SaoPaulo", "México", df.parse("2022-08-31 04:45"), 47));
		llegadas.add(new Vuelo("SKU621","Rio de Janeiro", "México", df.parse("2022-08-30 16:45"), 52));
		llegadas.add(new Vuelo("DAL147","Atlanta", "México", df.parse("2022-08-29 13:22"), 59));
		llegadas.add(new Vuelo("AVA241","Bogota", "México", df.parse("2022-08-30 14:05"), 25));
		llegadas.add(new Vuelo("AMX10","Hermosillo", "México", df.parse("2022-08-31 05:20"), 29));
		llegadas.add(new Vuelo("IBE6433","Londres", "México", df.parse("2022-08-31 08:45"), 55));
		
		
		llegadas.sort((v1,v2) -> v2.getFechayHoraLlegada().compareTo(v1.getFechayHoraLlegada()));
		
		llegadas.forEach(System.out::println);
		
		Vuelo ultimoVuelo = llegadas.get(0);
		System.out.println("El ultimo vuelo en llegar es: " + ultimoVuelo.getNombre() + " : " + ultimoVuelo.getOrigen() + "  aterriza " + ultimoVuelo.getFechayHoraLlegada());
		
		llegadas.sort((v1,v2) -> Integer.valueOf(v2.getNumeroPasajeros()).compareTo(v1.getNumeroPasajeros()));
		
		Vuelo vueloMenorNumero = new LinkedList<>(llegadas).peekLast();
		System.out.println("El ultimo con menor número de pasajeros es: " + vueloMenorNumero.getNombre() + " : " + vueloMenorNumero.getOrigen() + ", con " + vueloMenorNumero.getNumeroPasajeros());
		
		

	}

}
