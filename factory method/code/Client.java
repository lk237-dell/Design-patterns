public class Client {

     public static void main(String[] args){

    System.out.println("bonjour le monde");

    FabriqueProduit fabriqueProduit=new FabriqueProduit();
    Produit produit=null;
    produit=fabriqueProduit.createProduit(fabriqueProduit.typeA);
    produit.methodeproduit();
    produit=fabriqueProduit.createProduit(fabriqueProduit.typeB);
    produit.methodeproduit();
    produit=fabriqueProduit.createProduit(fabriqueProduit.typeC);
    produit.methodeproduit();
    produit=fabriqueProduit.createProduit(fabriqueProduit.typeD);
    produit.methodeproduit();
    String d="D";
    produit=fabriqueProduit.createProduit(d);
    produit.methodeproduit();  
    
     }
}