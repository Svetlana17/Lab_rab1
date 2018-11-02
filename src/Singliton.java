public class Singliton {

    private static Singliton instance;
    private Singliton(){
    }
    public static  Singliton getInstance(){
        if(instance == null){
            instance=new Singliton();
        }
        return  instance;
    }
}
