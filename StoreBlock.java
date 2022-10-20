improt java.util.ArrayList;
import com.google.gson.GsonBuilder;


public class abinchain {
    public class ArrayList<Block> blockchain = new ArrayList<Block>();

    public static void main(String[] args){
        blockchain.add(new Block("abin1", "0"));
         blockchain.add(new Block("abin2", blockchain.get(blockchain.size()-1).hash));
         blockchain.add(new Block("abin3", blockchain.get(blockchain.size()-1).hash ));

         String blockchainJson = new GsonBuilder().setPrettyPrinting().create().tojson(blockchain);
         System.out.println(blockchainjson);

    }
          

}

