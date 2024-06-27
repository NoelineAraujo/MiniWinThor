public class Produto {
    
    private int codigo;
    private String descricao;
    private double compra;
    private double venda;

    public void setcodigo(int codigo){ 
        this.codigo = codigo;
    }

    public int getcodigo(){ 
        return this.codigo;
    }

    public void setdescricao(String descricao){
        this.descricao = descricao;
    }

    public String getdescricao(){
        return this.descricao;
    }

    public void setcompra(double compra){
        this.compra = compra;
    }
    public double getcompra(){
        return this.compra;
    }  
    
    public void setvenda(double venda){
        this.venda = venda;
    }
    public double getvenda(){
        return this.venda;
    }


}
