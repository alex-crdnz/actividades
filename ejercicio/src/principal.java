public class principal {
    public static void main(String[] args){
        suma sumar =new suma();
        System.out.println(sumar.get_suma());
        sumar.set_suma(15,10);
        System.out.println(sumar.get_suma());
    }
}
