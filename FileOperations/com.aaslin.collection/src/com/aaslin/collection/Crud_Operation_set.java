package com.aaslin.collection;

import java.util.HashSet;
import java.util.Set;
  
public class Crud_Operation_set {

	public static void main(String[] args) {
       Set<String>  playlist = new HashSet<String>();
       playlist.add("telugu play list");
       playlist.add("hind play list");
       playlist.add("hind play list");
       playlist.add("bengali play list");
       playlist.add("telugu play list");
       //read
       for(String i : playlist)
		   System.out.println(i + " ");
       //remove
       playlist.remove("bengali play list");
       System.out.println("after removing bengali the set has" + playlist);

       

	}

}

