package ca1;


/**
 *
 * @author eduar
 */
public class country {
   
         private static  String Code;
         private static String Name;
         private static  String Continent;
         private static float SurfaceArea;
         private  static String HeadOfState;
         
         
         public country( String Code, String Name, String  Continent,float SurfaceArea,String HeadOfState)
                 
         {
             
             this.Code= Code;
             this.Name=Name;
             this.Continent= Continent;
             this.SurfaceArea= SurfaceArea;
             this.HeadOfState = HeadOfState;
             
             

 
    
}
            public String getCode() {
        return Code;
    }

    public String getName() {
        return Name;
    }

    public String getContinent() {
        return Continent;
    }

    public float getSurfaceArea() {
        return SurfaceArea;
    }

    public String getHeadOfState() {
        return HeadOfState;
    }
    

    public void setCode(String Code) {
        this.Code = Code;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setContinent(String Continent) {
        this.Continent = Continent;
    }

    public void setSurfaceArea(float SurfaceArea) {
        this.SurfaceArea = SurfaceArea;
    }

    public void setHeadOfState(String HeadOfState) {
        this.HeadOfState = HeadOfState;
    }
 // ALl the continents enum requested 
   public enum continents {
       
        Asia("Asia"),
        Europe("Europe"),
        North_America("North America"),
        Africa("Africa"),
        Oceania("Oceania"),
        Antarctica("Antarctica"),
        SouthAmerica("South America");

        private final String Continent;

        continents(String Continent) {
            this.Continent = Continent;
        }

        public static continents fromString(String Continent) 
        {
            for (continents c : continents.values()) 
            {
                if (c.getContinent().equals(Continent)) {
                    return c;
                }
            }
            return Europe;
        }

        // Here we can  return the name of the continent
        
        
        public String getContinent() {
            return Continent;
        }
        
        
        
        @Override
        
        public  String toString(){
        
            
        return  Code + Name + Continent + HeadOfState;
        }
}}