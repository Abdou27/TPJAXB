package DVDLibrary;

import java.io.*;
import java.util.*;

import javax.xml.bind.*;


public class FilmTest {
	public static void main(String[] args) {
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(DVDLibrary.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			InputStream inStream = new FileInputStream("documents/dvd.xml");
			DVDLibrary dl = (DVDLibrary) unmarshaller.unmarshal(inStream);
			
			// Liste des films
			List<Film> films = getFilms(dl);
			
			// Liste des films loués
			List<Film> rentedFilms = getRentedFilms(dl);
			
			// Louer un film
			Film f = films.get(0);
			Person p = new Person();
			FirstName firstName = new FirstName();
			firstName.setContent("Yannick");
			p.setFirstName(firstName);
			LastName lastName = new LastName();
			lastName.setContent("Devon");
			p.setLastName(lastName);
			Address address = new Address();
			address.setContent("Île-de-France, France");
			p.setAddress(address);
			String d = "06/04/2021";
			louerFilm(dl, f, p, d);
			
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty("jaxb.encoding", "UTF-8");
			marshaller.setProperty("jaxb.formatted.output", true);
			marshaller.marshal(dl, new File("documents/dvd2.xml"));
			
			System.out.print("Modifications sauvegardés dans dvd2.xml");
		} catch (JAXBException | FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static List<Film> getFilms(DVDLibrary dl) {
		List<DVD> listDVD = dl.getDVD();
		List<Film> films = new ArrayList<Film>();
		for(int i = 0; i < listDVD.size(); i++) {
			DVD dvd = listDVD.get(i);
			films.add(dvd.getFilm());
		}
		return films;
	}
	
	public static List<Film> getRentedFilms(DVDLibrary dl) {
		List<DVD> listDVD = dl.getDVD();
		List<Film> films = new ArrayList<Film>();
		for(int i = 0; i < listDVD.size(); i++) {
			DVD dvd = listDVD.get(i);
			if(dvd.getRent() != null) {
				films.add(dvd.getFilm());	
			}
		}
		return films;
	}
	
	public static void louerFilm(DVDLibrary dl, Film f, Person p, String d) {
		Rent rent = new Rent();
		rent.setDate(d);
		rent.setPerson(p);
		List<DVD> listDVD = dl.getDVD();
		for(int i = 0; i < listDVD.size(); i++) {
			DVD dvd = listDVD.get(i);
			if(dvd.getFilm().getTitle().getContent().equals(f.getTitle().getContent())) {
				dvd.setRent(rent);
				break;
			}
		}
	}
}
