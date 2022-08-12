 class Flat {
   private int people;
    Flat(){
        people=0;
    }

     public int getPeople() {
         return people;
     }

     public void setPeople(int people) {
         this.people = people;
     }

     void addPeople(int people){
        this.people+=people;
     }
 }
