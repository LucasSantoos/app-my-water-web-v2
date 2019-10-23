
package Controller;

import Model.Pessoa;
import java.util.List;

public class PessoaDAO extends DAO<Pessoa>{
    public List<Pessoa> getAll(){
        return super.getAll(
        "select a from pessoa a order by a.nome");
    }
    public List<Pessoa> getAll(String filtro){
        return super.getAll(
        "select a from pessoa a where a.nome like ?1 "
      + "order by a.nome","%"
      +filtro.toUpperCase()+"%");        
    }
}