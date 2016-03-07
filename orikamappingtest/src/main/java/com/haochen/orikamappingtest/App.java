package com.haochen.orikamappingtest;

import java.util.ArrayList;
import java.util.List;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        mapperFactory.classMap(Zoo.class, ZooForExport.class).byDefault().register();
        mapperFactory.classMap(Animal.class, AnimalForExport.class).byDefault().register();
        mapperFactory.classMap(Dog.class, DogForExport.class).byDefault().register();
        mapperFactory.classMap(Cat.class, CatForExport.class).byDefault().register();
       MapperFacade  mapper = mapperFactory.getMapperFacade();
        List<Animal> animalList=new ArrayList<Animal>();
        animalList.add(new Dog("amy", "foo", "red", "poo"));
        animalList.add(new Cat("kitty", "foo", "red", "poo"));
        List<AnimalForExport> animalForExportList=new  ArrayList<AnimalForExport>();
        for(Animal animal:animalList)
        {
        	AnimalForExport animalForExport=mapper.map(animal, AnimalForExport.class);
        	System.out.println(animalForExport);
        	animalForExportList.add(animalForExport);
        }
        animalList.remove(0);
        animalList.remove(0);
        animalList.add(new Dog("amy2", "fooxxx", "yellow", "pooxxx"));
        animalList.add(new Cat("kitty2", "fooxxx", "yellow", "pooxxx"));
        for(int i=0;i<2;i++)
        {
        	Animal animal=animalList.get(i);
        	AnimalForExport animalForExport=animalForExportList.get(i);
        	mapper.map(animalForExport, animal);
        	System.out.println(animal);
        }       
        Zoo zoo=new Zoo(animalList);
        ZooForExport zooForExport=mapper.map(zoo, ZooForExport.class);
        System.out.println(zooForExport);
        
        
    }
}
