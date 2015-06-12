class createOxygen extends Thread 
//thread 1
{
	public void run()
{
	 int weight = 16; //sets objects weight
		String name = "Oxygen Atom"; // sets object name
		OxygenAtom OxygenAtoms = new OxygenAtom();
		OxygenAtoms.start();
		System.out.println("creating an oxygen molecule");
		System.out.println(name + " Weight " +weight);
		System.out.println(" ");
	}
}

class createHydrogen extends Thread
//thread 2
{	

	public void run()
	{
		int weight = 1; //sets objects weight
         for(int i  = 1; i < 3; i++)  // loop creating hydrogen molecule objects
         {
			String name2 = "Hydrogen Atom"; // sets objects name
			HydrogenAtom HydrogenAtoms = new HydrogenAtom();
			HydrogenAtoms.start();
			System.out.println("creating a hydrogen molecule");
			System.out.println(name2 + i + " Weight: "+ weight);
			System.out.println(" ");
         }
     
	}
}


class HydrogenAtom
{ 

	String name =" ";
	void start(){
	// loop creating two hydrogen atoms
		for( int i = 1; i < 2; i++)
		{   
			String name = "Proton";
			HydrogenAtom proton = new HydrogenAtom();
			System.out.println(name + ": " + i + " ");
		}
			for(int j = 1; j < 2; j++)
			{
				String name1 = "electron";
				HydrogenAtom electron = new HydrogenAtom();
				System.out.println(name1 + ": " + j + " ");
			}
		
		

	}
}



class OxygenAtom
{
// loop creating the appropriate amount of protons, neutrons, electrons.
	void start(){
	
	for(int i = 0; i < 8 ; i++)
	{
	  String name = "proton";
	  OxygenAtom proton = new OxygenAtom();
	  System.out.println(name + ":" + (i + 1));
	};
	for(int j = 0; j < 8; j++ )
	{
		String name = "Neutron";
		OxygenAtom neutron = new OxygenAtom();
		System.out.println(name+":" + (j + 1));
		  
		
	}
	
	for(int k = 0; k < 6; k++ )
	{
		String name = "Electron";
		OxygenAtom electron = new OxygenAtom();
		System.out.println(name+":" + ( k + 1));
	}
}
}



public class Oxygen {
	
	
	public static void main(String[] args)
	{
	
	    System.out.println("H2O has an automic mass of 18");
	    System.out.println("The components of H20are broken into: ");
            System.out.println("");
		
		//start of both threads
		createOxygen oxygenMolecule = new createOxygen();
		oxygenMolecule.start();
		createHydrogen hydrogenMolecule = new createHydrogen();
		hydrogenMolecule.start();
	}
}
