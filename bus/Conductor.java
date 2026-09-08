class Conductor {
    void  collect(Money m)
    {
        System.out.println("money is collected by conducter");
        
    }
    Ticket give(){
        Ticket t= new Ticket();
        System.out.println("ticket is given by conducter");
        return t;
    }
}
