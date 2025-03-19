import java.util.HashMap;

public class CadastroProduto {

    private HashMap<Integer, Produto> produtos;

    public CadastroProduto() {
        produtos = new HashMap<>();
    }


    public void cadastrarProduto(int codigo, String nome, double preco) {
        Produto produto = new Produto(codigo, nome, preco);
        produtos.put(codigo, produto);
        System.out.println("Produto cadastrado com sucesso!");
    }


    public void buscarProdutoPorCodigo(int codigo) {
        if (produtos.containsKey(codigo)) {
            Produto produto = produtos.get(codigo);
            System.out.println("Produto encontrado: " + produto);
        } else {
            System.out.println("Produto não encontrado com o código informado.");
        }
    }
}
