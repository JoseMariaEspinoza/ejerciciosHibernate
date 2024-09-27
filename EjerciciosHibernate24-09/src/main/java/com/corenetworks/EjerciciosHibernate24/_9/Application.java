package com.corenetworks.EjerciciosHibernate24._9;

import com.corenetworks.EjerciciosHibernate24._9.modelo.*;
import com.corenetworks.EjerciciosHibernate24._9.servicio.impl.ServicioEscuderia;
import com.corenetworks.EjerciciosHibernate24._9.servicio.impl.ServicioPiloto;
import com.corenetworks.EjerciciosHibernate24._9.servicio.impl.ServicioTelefono;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.corenetworks.EjerciciosHibernate24._9.repositorio")
public class Application implements CommandLineRunner {

	@Autowired
	private ServicioEscuderia servicioEscuderia;

	@Autowired
	private ServicioPiloto servicioPiloto;

	@Autowired
	private ServicioTelefono servicioTelefono;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Escuderia e1 = new Escuderia("Ferrari","Italia");
		Escuderia e2 = new Escuderia("Peugeot","Francia");
		Escuderia e3 = new Escuderia("Seat","España");

		Facturacion f1 = new Facturacion(15000,3);
		Facturacion f2 = new Facturacion(1500,1);
		Facturacion f3 = new Facturacion(10000,2);

		Telefono te1 = new Telefono(656437891);
		Telefono te2 = new Telefono(651236478);
		Telefono te3 = new Telefono(671597841);
		Telefono te4 = new Telefono(641567128);

		Temporada t1 = new Temporada(2020,2021);
		Temporada t2 = new Temporada(2021,2022);
		Temporada t3 = new Temporada(2022,2023);
		Temporada t4 = new Temporada(2023,2024);
		Temporada t5 = new Temporada(2024,2025);

		Nif n1 = new Nif('A',12345678);
		Nif n2 = new Nif('B',12345678);
		Nif n3 = new Nif('C',12345678);

		Piloto p1 = new Piloto("Fernando Alonso",45,f1,n1,e1);
		Piloto p2 = new Piloto("Pepito Juanes",22,f2,n2,e2);
		Piloto p3 = new Piloto("Jose Espinoza",26,f3,n3,e3);

		p1.setTelefonos(te1);
		p1.setTelefonos(te2);
		p2.setTelefonos(te3);
		p3.setTelefonos(te4);

		p1.setTemporadas(t1);
		p1.setTemporadas(t2);
		p1.setTemporadas(t3);
		p1.setTemporadas(t4);
		p2.setTemporadas(t3);
		p2.setTemporadas(t4);
		p3.setTemporadas(t2);
		p3.setTemporadas(t4);
		p3.setTemporadas(t5);

		f1.setPiloto(p1);
		f2.setPiloto(p2);
		f3.setPiloto(p3);

		te1.setPiloto(p1);
		te2.setPiloto(p1);
		te3.setPiloto(p2);
		te4.setPiloto(p3);

		t1.setPilotos(p1);
		t2.setPilotos(p1);
		t3.setPilotos(p1);
		t4.setPilotos(p1);

		t3.setPilotos(p2);
		t4.setPilotos(p2);

		t2.setPilotos(p3);
		t4.setPilotos(p3);
		t5.setPilotos(p3);

		e1.setPilotos(p1);
		e2.setPilotos(p2);
		e3.setPilotos(p3);

//		servicioEscuderia.registrar(e1);
//		servicioEscuderia.registrar(e2);
//		servicioEscuderia.registrar(e3);

		System.out.println("------------");
		servicioPiloto.findPilotosByIdEscuderia((long)1)
				.stream()
				.forEach(System.out::println);
		System.out.println("------------");
		servicioPiloto.findPilotosByPaisNotLike("Italia")
				.stream()
				.forEach(System.out::println);
		System.out.println("------------");
		servicioPiloto.findPilotosByIdTemporada((long)1)
				.stream()
				.forEach(System.out::println);
		System.out.println("------------");
		servicioPiloto.findPilotosBySueldoGreaterThan(1500)
				.stream()
				.forEach(System.out::println);
		System.out.println("------------");
		servicioPiloto.findPilotosBySueldoBetween(1600,16000)
				.stream()
				.forEach(System.out::println);
		System.out.println("------------");
		servicioTelefono.findTelefonosByNombre("Fernando Alonso")
				.stream()
				.forEach(System.out::println);
	}
}
