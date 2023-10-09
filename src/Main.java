import Model.IphoneModel;

public class Main {
    public static void main(String[] args) {
        IphoneModel ip = new IphoneModel(5789, 111204, "Bruno");
        System.out.println("========== Informações do Usuário ===========");
        System.out.println("Nome: " + ip.getNomeUsuario() + "\nCódigo do Aparelho: " + ip.getCodigo());
        System.out.println("========== = = = = = = = = = = = ============");

        System.out.println();

        System.out.println("====== Funções de Aparelho Telefônico =======");
        ip.ligar("(11)94002-8922");
        System.out.println();
        ip.atender("Haruo da DIO");
        System.out.println();
        ip.iniciarCorreioVoz("(11)97054-6266");
        System.out.println("========== = = = = = = = = = = = ============");
        
    }
}
