class Hotel {
    private Storey[] storeys;


    Hotel(int cstoreys, int flat){
        storeys=new Storey[cstoreys];
        for (int i=0;i<storeys.length;i++){
            storeys[i]=new Storey(flat);
        }
    }
    public void addPeople(int storey,int flat, int people){
        storeys[storey].addPeople(flat,people);

    }
    void printPeople(){
        for (int i=0;i< storeys.length;i++){
            System.out.println("Storey: "+i);
            storeys[i].printPeople();
            System.out.println("\n");
        }
    }








}
