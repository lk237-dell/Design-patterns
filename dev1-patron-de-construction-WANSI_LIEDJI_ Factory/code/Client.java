public class Client{
     
    public static void main(String[] args){
        System.out.println("...................Methode 2: Abstract Factory.......");
        ProduitFactory produitfactoryA=new ProduitFactoryA();
        ProduitFactory produitfactoryB=new ProduitFactoryB();
        ProduitFactory produitfactoryC=new ProduitFactoryC();
        ProduitFactory produitfactoryD=new ProduitFactoryD();
        Produit produit=null;
        produit=produitfactoryA.getProduit();
        produit.methodeproduit();
        produit=produitfactoryB.getProduit();
        produit.methodeproduit();
        produit=produitfactoryC.getProduit();
        produit.methodeproduit();
        produit=produitfactoryD.getProduit();
        produit.methodeproduit();

    }
}

