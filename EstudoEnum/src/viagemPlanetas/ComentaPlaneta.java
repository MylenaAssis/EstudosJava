package viagemPlanetas;

public class ComentaPlaneta {
    EnumPlanetas planeta;

    /*criando método construtor: um método LeituraPlaneta com o parâmetro planeta que será fornecido pelo usuário.
    this.planeta se refere a enumeração criada acima. Ela receberá um valor String planeta.
    O método valueOf converte o valor da String para a Enum.
     */
    ComentaPlaneta(String planeta) {
        this.planeta = EnumPlanetas.valueOf(planeta);
    }

    /*criando método genérico - void é usado por não retornar nada.
     */
    public void viajarPlaneta() {
        //usando switch para verificar qual planeta foi digitado pelo usuário
        switch (this.planeta) {
            case MERCÚRIO:
                System.out.println("Calor escaldante.");
                break;
            case TERRA:
                System.out.println("Estamos nele.");
                break;
            case URANO:
                System.out.println("Inclinado e longe demais.");
                break;
            case JÚPITER:
                System.out.println("Gigante.");
                break;
            default:
                System.out.println("Não temos passagem.");
                break;
        }
    }

}
