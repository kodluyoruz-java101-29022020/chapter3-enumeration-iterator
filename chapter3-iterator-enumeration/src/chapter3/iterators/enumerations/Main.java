package chapter3.iterators.enumerations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		
		
		runIteratorSample();
		
		runEnumerationSample();
	}
	
	public static void runEnumerationSample() {
		
		List<ElectricCar> electricalCars = new ArrayList<ElectricCar>();
		electricalCars.add(new ElectricCar("BMW", "34 AL 377", 100));
		electricalCars.add(new ElectricCar("Mercedes", "35 Aa 547", 200));
		electricalCars.add(new ElectricCar("BMW", "45 AB 547", 200));
		
		Enumeration<ElectricCar> enumerationObject = Collections.enumeration(electricalCars);
		
		while(enumerationObject.hasMoreElements()) 
		{	
			ElectricCar electricCar = enumerationObject.nextElement();
			electricCar.showInfo();
		}
		
		Vector<ElectricCar> electricCarVector = new Vector<ElectricCar>();
		electricCarVector.add(new ElectricCar("BMW", "34 AL 377", 100));
		electricCarVector.add(new ElectricCar("Mercedes", "35 Aa 547", 200));
		electricCarVector.add(new ElectricCar("BMW", "45 AB 547", 200));
		
		// Vector veri yapısında "elements" isimli fonksiyon Enumeration tipinde bir nesneyi oluşturup döndürür.
		Enumeration<ElectricCar> enumerationObject1 = electricCarVector.elements();
		
		// Ya da Collections sınıfı içindeki static "enumeration" fonksiyonu ile Enumeration nesnesi oluşturabiliriz.
		Enumeration<ElectricCar> enumerationObject2 = Collections.enumeration(electricCarVector);
		
		
		while(enumerationObject1.hasMoreElements()) 
		{	
			ElectricCar electricCar = enumerationObject1.nextElement();
			electricCar.showInfo();
		}
	}
	
	public static void runIteratorSample() {
		
		List<ElectricCar> electricalCars = new ArrayList<ElectricCar>();
		electricalCars.add(new ElectricCar("BMW", "34 AL 377", 100));
		electricalCars.add(new ElectricCar("Mercedes", "35 Aa 547", 200));
		electricalCars.add(new ElectricCar("BMW", "45 AB 547", 200));
	
		
		Iterator<ElectricCar> iteratorObject = electricalCars.iterator();
		
		while(iteratorObject.hasNext()) 
		{	
			ElectricCar electricCar = iteratorObject.next();
			
			if(electricCar.getBrand().equals("BMW")) {
				iteratorObject.remove();
			}
		}
		
		Iterator<ElectricCar> iteratorObject2 = electricalCars.iterator();
		
		// Iterator nesnesi oluşturulduktan sonra veri kümesine ekleme yapılamaz.
		// electricalCars.add(new ElectricCar("BMW", "45 AB 547", 200));
		
		while(iteratorObject2.hasNext()) 
		{	
			ElectricCar electricCar = iteratorObject2.next();
			electricCar.showInfo();
		}
		
	}

}
