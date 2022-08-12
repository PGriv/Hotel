 class Storey {

   private Flat[] flats;

     public Storey(int cFlats) {
         flats=new Flat[cFlats];
         for (int i=0; i<flats.length; i++){
             flats[i]=new Flat();
         }


     }


     public void addPeople(int flat,int people){

         flats[flat].addPeople(people);
     }

     void printPeople(){
         for(int i =0; i<flats.length; i++){
             System.out.print("flat: "+i+" has "+flats[i].getPeople()+" people");
             System.out.print("   ");
         }
     }
 }
