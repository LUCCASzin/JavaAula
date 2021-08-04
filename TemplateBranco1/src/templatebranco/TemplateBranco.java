// programa.teste.olamundo

package templatebranco;

/**
 *
 * @author lucas.deus
 */
public class TemplateBranco {
        int a = 6;
        int b = 7;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TemplateBranco Val = new TemplateBranco();
        String strl = "ola mundo  ";
        String str2 = "ola mundo \n";
        int[] ListNum = {1, 2, 3, 4, 6, 8, 10};
        int resp = 11;
      
        
        System.out.println(strl);
        System.out.println(str2);
        System.out.print(str2 + strl);
        System.out.printf("Soma da variveis a e b = %d \n", (Val.a + Val.b));
         if(ListNum[0] + ListNum[6] == resp){
             System.out.printf("primeiro numero eh %d ",ListNum[6]);
             System.out.printf("segundo numero eh %d  ",ListNum[0]);
              System.out.printf("A resposta eh %d ",resp);
        }
        else{
        System.out.print("resposta incorreta");
    }
    
         
    }
}