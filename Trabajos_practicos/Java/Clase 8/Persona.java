Persona personal2 = new Persona("Maria", 85.000, true);
        
    
        System.out.println("--- Datos iniciales de personal2 ---");
        System.out.println("Nombre inicial: " + personal2.getNombre());
        System.out.println("Sueldo inicial: " + personal2.getSueldo());
        System.out.println("Booleano inicial: " + personal2.isEliminado()); // (o el nombre de tu método booleano)
        
   
        personal2.setNombre("Carla Gomez");
        personal2.setSueldo(120.000);
        personal2.setEliminado(false);
        
      
        System.out.println("--- Datos modificados de personal2 ---");
        System.out.println("Nombre modificado: " + personal2.getNombre());
        System.out.println("Sueldo modificado: " + personal2.getSueldo());
        System.out.println("Booleano modificado: " + personal2.isEliminado());
        