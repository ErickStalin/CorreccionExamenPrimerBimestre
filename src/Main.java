public class Main {
    public static void main(String[] args) {
        try{
            Menus m1 = new Menus();
            int op = -1;
            while(op != 0){
                op = m1.opcion();
                switch (op){
                    case 1:
                    {
                        m1.ejer1();
                    }
                    break;
                    case 2:
                    {
                        m1.ejer2();
                    }
                    break;
                    case 3:
                    {
                        m1.ejer3();
                    }
                    break;
                }
            }

        } catch (Exception ex){
            System.out.println("Error: " +ex.getMessage());
        }
    }
}