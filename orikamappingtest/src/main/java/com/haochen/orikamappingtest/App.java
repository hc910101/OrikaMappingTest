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
        mapperFactory.classMap(Dog.class, DogForExport.class).byDefault().register();
       MapperFacade  mapper = mapperFactory.getMapperFacade();
        List<Animal> animalList=new ArrayList<Animal>();
        animalList.add(new Dog("amy", "foo", "red", "poo"));
        List<AnimalForExport> animalForExportList=new  ArrayList<AnimalForExport>();
        for(Animal animal:animalList)
        {
        }
    }
}
